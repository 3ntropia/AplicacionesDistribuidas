package entities;

import negocio.Jugador;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by martinh on 2/6/2016.
 */
@Entity
@Table(name = "Jugadores")
public class JugadorBean {
    @EmbeddedId
    private JugadorId jugadorId;
    @Column(columnDefinition = "CHAR")
    private String nombre;
    @Column(columnDefinition = "TINYINT")
    private Integer categoria;
    @Column(name = "Fecha_Nac")
    private Calendar fechaNacimiento;
    @ManyToOne
    @JoinColumn(name = "Id_Club")
    private ClubBean club;

    public JugadorBean(){

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

    public ClubBean getClub() {
        return club;
    }

    public void setClub(ClubBean club) {
        this.club = club;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }

    public void setJugadorId(JugadorId jugadorId) {
        this.jugadorId = jugadorId;
    }

    public Jugador JugadorBeanToJugador (){
        return new Jugador(this.jugadorId.getTipo(),this.jugadorId.getNumero(),this.nombre,this.categoria,this.fechaNacimiento,this.club.clubBeanToClub() );
    }
}
