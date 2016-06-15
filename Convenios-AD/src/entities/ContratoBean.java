package entities;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by Martin on 07/06/2016.
 */
 @Entity
 @Table(name = "Contratos")
public class ContratoBean extends PersistentObjectBean {
    @Embedded
    private ConvenioBean convenio;
    @OneToOne
    @JoinColumn(name = "idIntegrante")
    private IntegranteBean integrante;
    @OneToOne
    @JoinColumn(name = "idProyecto")
    private ProyectoBean proyecto;
    private Calendar fecha;

    @Override
    public String toString() {
        return "Contrato{" +
                "convenio=" + convenio +
                ", integrante=" + integrante +
                ", proyecto=" + proyecto +
                ", fecha=" + fecha +
                '}';
    }

    public ConvenioBean getConvenio() {
        return convenio;
    }

    public void setConvenio(ConvenioBean convenio) {
        this.convenio = convenio;
    }

    public IntegranteBean getIntegrante() {
        return integrante;
    }

    public void setIntegrante(IntegranteBean integrante) {
        this.integrante = integrante;
    }

    public ProyectoBean getProyecto() {
        return proyecto;
    }

    public void setProyecto(ProyectoBean proyecto) {
        this.proyecto = proyecto;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

}
