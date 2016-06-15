package negocio;

import java.util.List;

/**
 * Created by Martin on 05/06/2016.
 */
public class Plato {
    private Integer idPlato;
    private String descripcion;
    private String rubro;
    private Float precio;
    private List<Componente> componenteList;

    public Plato(Integer idPlato, String descripcion, String rubro, Float precio, List<Componente> componenteList) {
        this.idPlato = idPlato;
        this.descripcion = descripcion;
        this.rubro = rubro;
        this.precio = precio;
        this.componenteList = componenteList;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "idPlato=" + idPlato +
                ", descripcion='" + descripcion + '\'' +
                ", rubro='" + rubro + '\'' +
                ", precio=" + precio +
                ", componenteList=" + componenteList +
                '}';
    }

    public Integer getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(Integer idPlato) {
        this.idPlato = idPlato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public List<Componente> getComponenteList() {
        return componenteList;
    }

    public void setComponenteList(List<Componente> componenteList) {
        this.componenteList = componenteList;
    }
}
