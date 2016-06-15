package dao;

import entities.ContratoBean;
import hbt.HibernateUtil;
import org.hibernate.classic.Session;

import java.util.List;

/**
 * Created by martinh on 12/6/2016.
 */
public class ContratoDao {

    private static ContratoDao instancia;

    public static ContratoDao getInstancia(){
        if(instancia == null)
            instancia = new ContratoDao();
        return instancia;
    }

    //Determinar el Convenio de mayor monto existente entre los contratos suscriptos únicamente por Desarrolladores,
    // indicando el nombre del Proyecto, el nombre del Integrante y el monto correspondiente.
    //El proceso debe resolverse accediendo a la base de datos y ejecutando una consulta en HQL.

    public List<ContratoBean> mayorMonto() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        String sentencia = "select con from ContratoBean con join con.integrante inte " +
        "where (con.convenio.horas * con.convenio.valorHora) = (select max(c.convenio.horas * c.convenio.valorHora) from ContratoBean c " +
        "join c.integrante i where i.class = Desarrollador) " +
        "and inte.class = Desarrollador";
        return s.createQuery(sentencia).list();
    }
}
