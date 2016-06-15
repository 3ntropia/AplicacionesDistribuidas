package dao;

import entities.ProyectoBean;
import hbt.HibernateUtil;
import org.hibernate.classic.Session;

import java.util.List;

/**
 * Created by martinh on 10/6/2016.
 */
public class ProyectoDao {
    private static ProyectoDao instancia;

    public static ProyectoDao getInstancia(){
        if(instancia == null)
            instancia =  new ProyectoDao();
        return instancia;
    }

    public List<ProyectoBean> listaProyectos(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        return s.createQuery("from ProyectoBean").list();
    }


}
