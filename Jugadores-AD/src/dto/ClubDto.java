package dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by martinh on 13/6/2016.
 */
public class ClubDto implements Serializable {
    private Integer idClub;
    private String nombre;
    private Integer nroZona;
    private List <JugadorDto> jugadorList;
    private List <PartidoDto> localesList;
    private List <PartidoDto> visitantesList;

    public ClubDto(Integer idClub, String nombre, Integer nroZona, List<JugadorDto> jugadorList, List<PartidoDto> localesList, List<PartidoDto> visitantesList) {
        this.idClub = idClub;
        this.nombre = nombre;
        this.nroZona = nroZona;
        this.jugadorList = jugadorList;
        this.localesList = localesList;
        this.visitantesList = visitantesList;
    }

    @Override
    public String toString() {
        return "ClubDto{" +
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

    public List<JugadorDto> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<JugadorDto> jugadorList) {
        this.jugadorList = jugadorList;
    }

    public List<PartidoDto> getLocalesList() {
        return localesList;
    }

    public void setLocalesList(List<PartidoDto> localesList) {
        this.localesList = localesList;
    }

    public List<PartidoDto> getVisitantesList() {
        return visitantesList;
    }

    public void setVisitantesList(List<PartidoDto> visitantesList) {
        this.visitantesList = visitantesList;
    }
}
