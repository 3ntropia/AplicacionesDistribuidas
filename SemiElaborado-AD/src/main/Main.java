package main;

import controlador.Controlador;
import entities.ProductoBean;
import entities.SemiElaboradoBean;

public class Main {

	public static void main(String[] args) {
		Controlador controlado = new Controlador ();
		
		
		for (SemiElaboradoBean p: controlado.semiElaboradosProductos()) {
			System.out.println(p.toString());
		}
	}

}
