package dao;

import entities.ClubBean;
import hbt.HibernateUtil;
import org.hibernate.classic.Session;

import java.util.ArrayList;
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
    
    public List <ClubBean> clubesYJugadores(){
    	Session s = HibernateUtil.getSessionFactory().openSession();
    	List <Object []> listado = s.createQuery("Select c.idClub,c.nombre from ClubBean c").list();
    	List <ClubBean> clubBeansList = new ArrayList <ClubBean>();
    	int i=0;
    	for(Object [] row : listado){
    		ClubBean c = new ClubBean();
    		c.setIdClub((Integer) row[i]);
    		i++;
    		c.setNombre((String) row[i]);
    		i=0;
    		clubBeansList.add(c);
    	}
    	return clubBeansList;
    }


}
