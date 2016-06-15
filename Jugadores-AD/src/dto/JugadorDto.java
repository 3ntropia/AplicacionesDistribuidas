package dto;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by martinh on 13/6/2016.
 */
public class JugadorDto implements Serializable {
    private String tipo;
    private Integer numero;
    private String nombre;
    private Integer categoria;
    private Calendar fechaNacimiento;
    private ClubDto club;

    public JugadorDto(String tipo, Integer numero, String nombre, Integer categoria, Calendar fechaNacimiento, ClubDto club) {
        this.tipo = tipo;
        this.numero = numero;
        this.nombre = nombre;
        this.categoria = categoria;
        this.fechaNacimiento = fechaNacimiento;
        this.club = club;
    }

    @Override
    public String toString() {
        return "JugadorDto{" +
                "tipo='" + tipo + '\'' +
                ", numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", fechaNacimiento=" + fechaNacimiento +
                ", club=" + club +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ClubDto getClub() {
        return club;
    }

    public void setClub(ClubDto club) {
        this.club = club;
    }
}
