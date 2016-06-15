package entities;

import javax.persistence.*;

/**
 * Created by Martin on 05/06/2016.
 */
@Entity
@Table(name = "Ingredientes")
public class IngredienteBean {
    @Id
    @Column(name = "idIngrediente")
    private Integer numeroIngrediente;
    private String descripcion;
    @Column(name = "precComp")
    private Float precioCompra;
    @Column(name = "precUso")
    private Float precioUso;
    @OneToOne
    @JoinColumn(name = "cUniCompra", insertable = false, updatable = false)
    private UnidadBean unidadCompra;
    @OneToOne
    @JoinColumn(name = "cUniUso", insertable = false, updatable = false)
    private UnidadBean unidadUso;

    @Override
    public String toString() {
        return "Ingrediente{" +
                "numeroIngrediente=" + numeroIngrediente +
                ", descripcion='" + descripcion + '\'' +
                ", precioCompra=" + precioCompra +
                ", precioUso=" + precioUso +
                ", unidadCompra=" + unidadCompra +
                ", unidadUso=" + unidadUso +
                '}';
    }

    public Integer getNumeroIngrediente() {
        return numeroIngrediente;
    }

    public void setNumeroIngrediente(Integer numeroIngrediente) {
        this.numeroIngrediente = numeroIngrediente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Float getPrecioUso() {
        return precioUso;
    }

    public void setPrecioUso(Float precioUso) {
        this.precioUso = precioUso;
    }

    public UnidadBean getUnidadCompra() {
        return unidadCompra;
    }

    public void setUnidadCompra(UnidadBean unidadCompra) {
        this.unidadCompra = unidadCompra;
    }

    public UnidadBean getUnidadUso() {
        return unidadUso;
    }

    public void setUnidadUso(UnidadBean unidadUso) {
        this.unidadUso = unidadUso;
    }

    public IngredienteBean(Integer numeroIngrediente, String descripcion, Float precioCompra, Float precioUso, UnidadBean unidadCompra, UnidadBean unidadUso) {
        this.numeroIngrediente = numeroIngrediente;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioUso = precioUso;
        this.unidadCompra = unidadCompra;
        this.unidadUso = unidadUso;
    }
}
