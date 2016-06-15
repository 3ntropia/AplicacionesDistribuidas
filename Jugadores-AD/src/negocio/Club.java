package negocio;

import java.util.List;
/**
 * Created by martinh on 2/6/2016.
 */
public class Club {
    private Integer idClub;
    private String nombre;
    private Integer nroZona;
    private List <Jugador> jugadorList;
    private List <Partido> localesList;
    private List <Partido> visitantesList;

    public Club(Integer idClub, String nombre, Integer nroZona, List<Jugador> jugadorList, List<Partido> localesList, List<Partido> visitantesList) {
        this.idClub = idClub;
        this.nombre = nombre;
        this.nroZona = nroZona;
        this.jugadorList = jugadorList;
        this.localesList = localesList;
        this.visitantesList = visitantesList;
    }

    public Club() {

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

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }

    public List<Partido> getLocalesList() {
        return localesList;
    }

    public void setLocalesList(List<Partido> localesList) {
        this.localesList = localesList;
    }

    public List<Partido> getVisitantesList() {
        return visitantesList;
    }

    public void setVisitantesList(List<Partido> visitantesList) {
        this.visitantesList = visitantesList;
    }
}
