package entities;

import javax.persistence.*;

/**
 * Created by Martin on 07/06/2016.
 */
@Entity
@Table(name = "integrantes")
@Inheritance(strategy = InheritanceType.JOINED)
public class IntegranteBean extends PersistentObjectBean {
    protected String nombre;
    @Column(columnDefinition = "char")
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

}
