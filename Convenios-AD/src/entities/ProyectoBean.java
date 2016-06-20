package entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Martin on 07/06/2016.
 */
@Entity
@Table(name = "proyectos")
public class ProyectoBean extends PersistentObjectBean {
    private String nombre;
    @Column(name = "año", columnDefinition = "smallint")
    private Integer anio;
    @ManyToMany
    @JoinTable(name="asignaciones",
            joinColumns=@JoinColumn(name="idProyecto")	,
            inverseJoinColumns=@JoinColumn(name="IdFuncion"))
    private List <FuncionBean> funcionList;

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

    public List<FuncionBean> getFuncionList() {
        return funcionList;
    }

    public void setFuncionList(List<FuncionBean> funcionList) {
        this.funcionList = funcionList;
    }

}
