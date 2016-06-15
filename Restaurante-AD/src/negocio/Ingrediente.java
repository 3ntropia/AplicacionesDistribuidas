package negocio;

/**
 * Created by Martin on 05/06/2016.
 */
public class Ingrediente {
    private Integer numeroIngrediente;
    private String descripcion;
    private Float precioCompra;
    private Float precioUso;
    private Unidad unidadCompra;
    private Unidad unidadUso;

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

    public Unidad getUnidadCompra() {
        return unidadCompra;
    }

    public void setUnidadCompra(Unidad unidadCompra) {
        this.unidadCompra = unidadCompra;
    }

    public Unidad getUnidadUso() {
        return unidadUso;
    }

    public void setUnidadUso(Unidad unidadUso) {
        this.unidadUso = unidadUso;
    }

    public Ingrediente(Integer numeroIngrediente, String descripcion, Float precioCompra, Float precioUso, Unidad unidadCompra, Unidad unidadUso) {
        this.numeroIngrediente = numeroIngrediente;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioUso = precioUso;
        this.unidadCompra = unidadCompra;
        this.unidadUso = unidadUso;
    }
}
