package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Martin on 05/06/2016.
 */
@Entity
@Table(name = "Unidades")
public class UnidadBean {
    @Id
    @Column(name = "IdUnidad")
    private Integer codigo;
    private String descripcion;

    @Override
    public String toString() {
        return "Unidad{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public UnidadBean(Integer codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
}
