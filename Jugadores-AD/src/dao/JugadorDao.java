package dao;

import entities.JugadorBean;
import hbt.HibernateUtil;
import negocio.Club;
import org.hibernate.classic.Session;

import java.util.List;

/**
 * Created by martinh on 3/6/2016.
 */
public class JugadorDao {
    private static JugadorDao instancia;

    public static JugadorDao getInstancia() {
        if(instancia == null)
            instancia = new JugadorDao();
        return instancia;
    }

    public List<JugadorBean> obtenerJugadores(Club club, int categoria) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        return s.createQuery("from JugadorBean j where j.club = " + club.getIdClub() + " and j.categoria = " + categoria).list();
    }
}
