package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Martin on 07/06/2016.
 */
@Entity
@Table(name = "funciones")
public class FuncionBean {
    @Id
    private Integer id;
    private String categoria;
    private String nombre;

    @Override
    public String toString() {
        return "Funcion{" +
                "categoria='" + categoria + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
