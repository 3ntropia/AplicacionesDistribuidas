package negocio;

/**
 * Created by Martin on 07/06/2016.
 */
public class Convenio {
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

    public Convenio(Float valorHora, Integer horas) {

        this.valorHora = valorHora;
        this.horas = horas;
    }
}
