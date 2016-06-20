package dao;

import java.util.List;

import org.hibernate.classic.Session;

import entities.ProductoBean;
import entities.SemiElaboradoBean;
import hbt.HibernateUtil;

public class SemiElaboradoDao {
	
	private static SemiElaboradoDao instancia;
	
	public List <SemiElaboradoBean> semiElaboradosProductos(){
		Session s = HibernateUtil.getSessionFactory().openSession();
		return s.createQuery("from SemiElaboradoBean").list();
	}

	public static SemiElaboradoDao getInstancia() {
		if(instancia == null)
			instancia = new SemiElaboradoDao();
		return instancia;
	}
}
