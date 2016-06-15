package negocio;

import java.util.List;

/**
 * Created by Martin on 07/06/2016.
 */
public class Proyecto {
    private String nombre;
    private Integer anio;

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", anio=" + anio +
                ", funcionList=" + funcionList +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public List<Funcion> getFuncionList() {
        return funcionList;
    }

    public void setFuncionList(List<Funcion> funcionList) {
        this.funcionList = funcionList;
    }

    public Proyecto(String nombre, Integer anio, List<Funcion> funcionList) {

        this.nombre = nombre;
        this.anio = anio;
        this.funcionList = funcionList;
    }

    private List <Funcion> funcionList;
}
