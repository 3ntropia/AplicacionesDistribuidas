package negocio;

/**
 * Created by Martin on 07/06/2016.
 */
public class Funcion {
    private String categoria;

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

    public Funcion(String categoria, String nombre) {

        this.categoria = categoria;
        this.nombre = nombre;
    }

    private String nombre;
}
