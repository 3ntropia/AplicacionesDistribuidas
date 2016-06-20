package controlador;

import java.util.ArrayList;
import java.util.List;

import dao.ProductoDao;
import dao.SemiElaboradoDao;
import entities.MateriaPrimaBean;
import entities.ProductoBean;
import entities.SemiElaboradoBean;

public class Controlador {
	private List <ProductoBean> productos;
	private List <MateriaPrimaBean> materiales;
	
	public Controlador(){
		productos = new ArrayList <ProductoBean>();
		materiales = new ArrayList <MateriaPrimaBean>();
	}
	
	public List <SemiElaboradoBean> semiElaboradosProductos(){
		return SemiElaboradoDao.getInstancia().semiElaboradosProductos(); 
	}
}
