package negocio;

/**
 * Created by Martin on 07/06/2016.
 */
public class Coordinador extends Integrante {
    private Boolean interino;

    @Override
    public String toString() {
        return "Coordinador{" +
                "interino=" + interino +
                '}';
    }

    public Boolean getInterino() {
        return interino;
    }

    public void setInterino(Boolean interino) {
        this.interino = interino;
    }

    public Coordinador(String nombre, String sexo, Boolean interino) {
        super(nombre, sexo);
        this.interino = interino;
    }
}
