package negocio;

import java.util.Calendar;

/**
 * Created by martinh on 2/6/2016.
 */
public class Jugador {
    private String tipo;
    private Integer numero;
    private String nombre;
    private Integer categoria;
    private Calendar fechaNacimiento;
    private Club club;

    public Jugador(String tipo, Integer numero, String nombre, Integer categoria, Calendar fechaNacimiento, Club club) {
        this.tipo = tipo;
        this.numero = numero;
        this.nombre = nombre;
        this.categoria = categoria;
        this.fechaNacimiento = fechaNacimiento;
        this.club = club;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "tipo='" + tipo + '\'' +
                ", numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", fechaNacimiento=" + fechaNacimiento.getTime() +
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

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
