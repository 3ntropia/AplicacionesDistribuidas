package entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Martin on 05/06/2016.
 */
@Entity
@Table(name = "Platos")
public class PlatoBean {
    @Id
    private Integer idPlato;
    private String descripcion;
    @OneToOne
    @JoinColumn(name = "idRubro")
    private RubroBean rubro;
    private Float precio;
    @OneToMany
    @JoinColumn(name = "IdPlato")
    private List<ComponenteBean> componenteList;


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

    public RubroBean getRubro() {
        return rubro;
    }

    public void setRubro(RubroBean rubro) {
        this.rubro = rubro;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public List<ComponenteBean> getComponenteList() {
        return componenteList;
    }

    public void setComponenteList(List<ComponenteBean> componenteList) {
        this.componenteList = componenteList;
    }
}
