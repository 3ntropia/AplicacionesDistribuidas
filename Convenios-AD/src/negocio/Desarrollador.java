package negocio;

/**
 * Created by Martin on 07/06/2016.
 */
public class Desarrollador extends Integrante {
    private String especialidad;

    @Override
    public String toString() {
        return "Desarrollador{" +
                "especialidad='" + especialidad + '\'' +
                '}';
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Desarrollador(String nombre, String sexo, String especialidad) {
        super(nombre, sexo);
        this.especialidad = especialidad;
    }
}
