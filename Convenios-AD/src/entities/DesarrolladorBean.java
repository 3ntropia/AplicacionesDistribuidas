package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Martin on 07/06/2016.
 */
@Entity
@Table(name = "desarrolladores")
public class DesarrolladorBean extends IntegranteBean {
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

}
