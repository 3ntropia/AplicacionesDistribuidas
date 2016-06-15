package main;
import controlador.Controlador;
import dao.ProyectoDao;
import entities.ProyectoBean;
import negocio.Contrato;

import java.util.List;

/**
 * Created by Martin on 07/06/2016.
 */
public class Main {
    public static void main(String[] args) {
        List<ProyectoBean> list = ProyectoDao.getInstancia().listaProyectos();
        for (ProyectoBean proyectoBean : list) {
            System.out.println(proyectoBean.toString());
        }

        Controlador controlador = new Controlador();
        List <Contrato> contratoList = controlador.mayorMonto();

        for (Contrato c : contratoList) {
            System.out.println(c.toString());
        }

    }
}
