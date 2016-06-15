package entities;

import negocio.Club;
import util.UtilJugadores;

import javax.persistence.*;
import java.util.List;

/**
 * Created by martinh on 2/6/2016.
 */

@Entity
@Table(name = "Clubes")
public class ClubBean {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_club", columnDefinition = "SMALLINT")
    private Integer idClub;
    @Column(columnDefinition = "CHAR")
    private String nombre;
    @Column(columnDefinition = "TINYINT")
    private Integer nroZona;
    @OneToMany
    @JoinColumn(name = "Id_Club")
    private List <JugadorBean> jugadorList;
    @OneToMany
    @JoinColumn(name = "id_clubL")
    private List <PartidoBean> localesList;
    @OneToMany
    @JoinColumn(name = "id_clubV")
    private List <PartidoBean> visitantesList;

    public ClubBean(){

    }

    @Override
    public String toString() {
        return "Club{" +
                "idClub=" + idClub +
                ", nombre='" + nombre + '\'' +
                ", nroZona=" + nroZona +
                ", jugadorList=" + jugadorList +
                ", localesList=" + localesList +
                ", visitantesList=" + visitantesList +
                '}';
    }

    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNroZona() {
        return nroZona;
    }

    public void setNroZona(Integer nroZona) {
        this.nroZona = nroZona;
    }

    public List<JugadorBean> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<JugadorBean> jugadorList) {
        this.jugadorList = jugadorList;
    }

    public List<PartidoBean> getLocalesList() {
        return localesList;
    }

    public void setLocalesList(List<PartidoBean> localesList) {
        this.localesList = localesList;
    }

    public List<PartidoBean> getVisitantesList() {
        return visitantesList;
    }

    public void setVisitantesList(List<PartidoBean> visitantesList) {
        this.visitantesList = visitantesList;
    }

    public Club clubBeanToClub(){
        return new Club(this.idClub,this.nombre,this.nroZona, UtilJugadores.jugadorBeantoJugador(this.jugadorList),
                UtilJugadores.partidoBeanToPartido(this.localesList), UtilJugadores.partidoBeanToPartido(this.visitantesList));
    }


}
