package negocio;

/**
 * Created by Martin on 05/06/2016.
 */
public class Componente {
    private Ingrediente ingrediente;
    private Float cantidad;

    @Override
    public String toString() {
        return "Componente{" +
                "ingrediente=" + ingrediente +
                ", cantidad=" + cantidad +
                '}';
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public Componente(Ingrediente ingrediente, Float cantidad) {

        this.ingrediente = ingrediente;
        this.cantidad = cantidad;
    }
}
