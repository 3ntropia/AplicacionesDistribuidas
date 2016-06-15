package entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by Martin on 07/06/2016.
 */
@Embeddable
public class ConvenioBean {
    @Column(name = "valHora", columnDefinition = "money")
    private Float valorHora;
    private Integer horas;

    @Override
    public String toString() {
        return "Convenio{" +
                "horas=" + horas +
                ", valorHora=" + valorHora +
                '}';
    }

    public Float getValorHora() {
        return valorHora;
    }

    public void setValorHora(Float valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

}
