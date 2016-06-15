package Util;

import entities.ContratoBean;
import entities.ConvenioBean;
import entities.IntegranteBean;
import entities.ProyectoBean;
import negocio.Contrato;
import negocio.Convenio;
import negocio.Integrante;
import negocio.Proyecto;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by martinh on 12/6/2016.
 */
public abstract class UtilConvenios {
    public static List <Proyecto> proyectoBeanToProyecto (List <ProyectoBean> proyectoBeanList){
        return proyectoBeanList.stream().map(proyectoBean ->
                new Proyecto(proyectoBean.getNombre(),proyectoBean.getAnio(),null)).collect(Collectors.<Proyecto>toList());
    }

    public static List <Contrato> contratoBeanToContrato(List<ContratoBean> contratoBeanList){
        return contratoBeanList.stream().map(c ->
                new Contrato(convenioBeanToConvenio(c.getConvenio()),integranteBeanToIntegrante(c.getIntegrante()),
                        proyectoBeanToProyecto(c.getProyecto()),c.getFecha())).collect(Collectors.<Contrato>toList());
    }

    public static Convenio convenioBeanToConvenio (ConvenioBean convenioBean){
        return new Convenio(convenioBean.getValorHora(),convenioBean.getHoras());
    }

    public static Integrante integranteBeanToIntegrante (IntegranteBean integranteBean){
        return new Integrante(integranteBean.getNombre(),integranteBean.getSexo());
    }

    public static Proyecto proyectoBeanToProyecto (ProyectoBean proyectoBean){
        return new Proyecto(proyectoBean.getNombre(),proyectoBean.getAnio(),null);
    }
}
