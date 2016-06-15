package negocio;

/**
 * Created by Martin on 07/06/2016.
 */
public class Integrante extends PersistentObject{
    protected String nombre;
    protected String sexo;

    @Override
    public String toString() {
        return "Integrante{" +
                "nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integrante(String nombre, String sexo) {

        this.nombre = nombre;
        this.sexo = sexo;
    }
}
