package negocio;

/**
 * Created by Martin on 07/06/2016.
 */
public class Rubro {
    private Integer idRubro;
    private String descripcion;

    @Override
    public String toString() {
        return "Rubro{" +
                "idRubro=" + idRubro +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public Integer getIdRubro() {
        return idRubro;
    }

    public void setIdRubro(Integer idRubro) {
        this.idRubro = idRubro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Rubro(Integer idRubro, String descripcion) {

        this.idRubro = idRubro;
        this.descripcion = descripcion;
    }
}
