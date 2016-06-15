package dao;

import entities.PlatoBean;
import hbt.HibernateUtil;
import org.hibernate.classic.Session;

import java.util.List;

/**
 * Created by martinh on 6/6/2016.
 */
public class PlatoDao {
    private static PlatoDao instancia;

    public static PlatoDao getInstancia(){
        if(instancia == null)
            return instancia = new PlatoDao();
        return instancia;
    }

    public List<PlatoBean> platoBeanList (){
        Session s = HibernateUtil.getSessionFactory().openSession();
        return s.createQuery("from PlatoBean").list();
    }

}
