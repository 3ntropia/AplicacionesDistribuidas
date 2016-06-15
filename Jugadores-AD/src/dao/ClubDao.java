package dao;

import entities.ClubBean;
import hbt.HibernateUtil;
import org.hibernate.classic.Session;

import java.util.List;

/**
 * Created by martinh on 2/6/2016.
 */
public class ClubDao {
    private static ClubDao instancia;

    public static ClubDao getInstancia(){
        if (instancia == null)
            instancia = new ClubDao();
        return instancia;
    }

    public List getClubes(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        return s.createQuery("from ClubBean").list();
    }


    public List<ClubBean> clubesPorZona(String zona) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        return s.createQuery("from ClubBean c where c.nroZona =" + zona).list();
    }


}
