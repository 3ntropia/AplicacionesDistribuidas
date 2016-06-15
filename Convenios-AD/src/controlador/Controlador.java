package controlador;

import Util.UtilConvenios;
import dao.ContratoDao;
import negocio.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martinh on 10/6/2016.
 */
public class Controlador {
    private List <Contrato> contratoList;
    private List <Proyecto> proyectoList;
    private List <Convenio> convenioList;
    private List <Integrante> integranteList;
    private List <Funcion> funcionList;

    @Override
    public String toString() {
        return "Controlador{" +
                "contratoList=" + contratoList +
                ", proyectoList=" + proyectoList +
                ", convenioList=" + convenioList +
                ", integranteList=" + integranteList +
                ", funcionList=" + funcionList +
                '}';
    }

    public List<Contrato> getContratoList() {
        return contratoList;
    }

    public void setContratoList(List<Contrato> contratoList) {
        this.contratoList = contratoList;
    }

    public List<Proyecto> getProyectoList() {
        return proyectoList;
    }

    public void setProyectoList(List<Proyecto> proyectoList) {
        this.proyectoList = proyectoList;
    }

    public List<Convenio> getConvenioList() {
        return convenioList;
    }

    public void setConvenioList(List<Convenio> convenioList) {
        this.convenioList = convenioList;
    }

    public List<Integrante> getIntegranteList() {
        return integranteList;
    }

    public void setIntegranteList(List<Integrante> integranteList) {
        this.integranteList = integranteList;
    }

    public List<Funcion> getFuncionList() {
        return funcionList;
    }

    public void setFuncionList(List<Funcion> funcionList) {
        this.funcionList = funcionList;
    }

    public Controlador(List<Contrato> contratoList, List<Proyecto> proyectoList, List<Convenio> convenioList, List<Integrante> integranteList, List<Funcion> funcionList) {

        this.contratoList = contratoList;
        this.proyectoList = proyectoList;
        this.convenioList = convenioList;
        this.integranteList = integranteList;
        this.funcionList = funcionList;
    }

    public Controlador(){
        this.contratoList = new ArrayList<Contrato>();
        this.proyectoList = new ArrayList<Proyecto>();
        this.convenioList = new ArrayList<Convenio>();
        this.integranteList = new ArrayList<Integrante>();
        this.funcionList = new ArrayList<Funcion>();
    }

    public List <Contrato> mayorMonto (){
        return UtilConvenios.contratoBeanToContrato(ContratoDao.getInstancia().mayorMonto());
    }

    //El valor retornado debe publicarse para ser accedido remotamente por el ClienteRMI.
    //Identificar a los Coordinadores de sexo femenino integrantes de Proyectos que posean definidas las funciones de
    // “Implementación” y “Control”.


}
