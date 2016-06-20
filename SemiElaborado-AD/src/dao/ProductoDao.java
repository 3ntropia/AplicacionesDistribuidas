package dao;

import java.util.List;

import org.hibernate.classic.Session;

import entities.ProductoBean;
import hbt.HibernateUtil;

public class ProductoDao {
	private static ProductoDao instancia;
	
	public static ProductoDao getInstancia(){
		if(instancia == null)
			instancia = new ProductoDao();
		return instancia;
	}
	
}
