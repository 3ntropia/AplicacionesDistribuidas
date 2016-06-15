package dao;

import entities.ClubBean;
import entities.PartidoBean;
import hbt.HibernateUtil;
import negocio.Club;
import org.hibernate.classic.Session;

import java.util.List;

/**
 * Created by martinh on 3/6/2016.
 */
public class PartidoDao {
    private static PartidoDao instancia;

    public static PartidoDao getInstancia(){
        if(instancia == null)
            instancia = new PartidoDao();
        return instancia;
    }

    public Long cantidadPartidosGanados(Club club) {
        Long resultadoL,resultadoV;
        Session s = HibernateUtil.getSessionFactory().openSession();
        resultadoL =  (Long) s.createQuery("select count(*) from PartidoBean p where p.golesL > p.golesV and p.clubLocal.idClub = " + club.getIdClub()).uniqueResult();
        resultadoV =  (Long) s.createQuery("select count(*) from PartidoBean p where p.golesV > p.golesL and p.clubVisitante.idClub = " + club.getIdClub()).uniqueResult();
        return resultadoL + resultadoV;
    }

    public List<ClubBean> obtenerGanadoresPorFecha(int numeroFecha) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List <ClubBean> clubBeanList = s.createQuery("Select p.clubLocal from PartidoBean p where p.numeroFecha = " + numeroFecha + " and p.golesL > p.golesV").list();
        clubBeanList.addAll(s.createQuery("Select p.clubVisitante from PartidoBean p where p.numeroFecha = " + numeroFecha + " and p.golesV > p.golesL").list());
        return clubBeanList;
    }

    public List <PartidoBean> obtenerPartidosPorClub(Club club,Integer categoria, String localidad){
        Session s = HibernateUtil.getSessionFactory().openSession();
        List <PartidoBean> partidoBeanList = null;
        if(localidad.equals("visitante")){
            partidoBeanList  = s.createQuery(
                    "Select * from PartidoBean p join ClubBean c where p.clubVisitante =" + club.getIdClub() + "and c.categoria = " + categoria).list();
        }else{
            partidoBeanList  = s.createQuery(
                    "Select * from PartidoBean p join ClubBean c where p.clubLocal =" + club.getIdClub() + "and c.categoria = " + categoria).list();
        }
        return partidoBeanList;
    }
}
