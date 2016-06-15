package negocio;

import java.util.Calendar;

/**
 * Created by Martin on 07/06/2016.
 */
public class Contrato {
    private Convenio convenio;
    private Integrante integrante;

    @Override
    public String toString() {
        return "Contrato{" +
                "convenio=" + convenio +
                ", integrante=" + integrante +
                ", proyecto=" + proyecto +
                ", fecha=" + fecha +
                '}';
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Contrato(Convenio convenio, Integrante integrante, Proyecto proyecto, Calendar fecha) {

        this.convenio = convenio;
        this.integrante = integrante;
        this.proyecto = proyecto;
        this.fecha = fecha;
    }

    private Proyecto proyecto;
    private Calendar fecha;
}
