package dto;

import java.io.Serializable;

/**
 * Created by martinh on 13/6/2016.
 */
public class PartidoDto implements Serializable {
    private Integer numeroPartido;
    private Integer numeroFecha;
    private Integer nroZona;
    private ClubDto clubLocal;
    private ClubDto clubVisitante;
    private Integer golesL;
    private Integer golesV;

    public PartidoDto(Integer numeroPartido, Integer numeroFecha, Integer nroZona, ClubDto clubLocal, ClubDto clubVisitante, Integer golesL, Integer golesV) {
        this.numeroPartido = numeroPartido;
        this.numeroFecha = numeroFecha;
        this.nroZona = nroZona;
        this.clubLocal = clubLocal;
        this.clubVisitante = clubVisitante;
        this.golesL = golesL;
        this.golesV = golesV;
    }

    @Override
    public String toString() {
        return "PartidoDto{" +
                "numeroPartido=" + numeroPartido +
                ", numeroFecha=" + numeroFecha +
                ", nroZona=" + nroZona +
                ", clubLocal=" + clubLocal +
                ", clubVisitante=" + clubVisitante +
                ", golesL=" + golesL +
                ", golesV=" + golesV +
                '}';
    }

    public Integer getNumeroPartido() {
        return numeroPartido;
    }

    public void setNumeroPartido(Integer numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    public Integer getNumeroFecha() {
        return numeroFecha;
    }

    public void setNumeroFecha(Integer numeroFecha) {
        this.numeroFecha = numeroFecha;
    }

    public Integer getNroZona() {
        return nroZona;
    }

    public void setNroZona(Integer nroZona) {
        this.nroZona = nroZona;
    }

    public ClubDto getClubLocal() {
        return clubLocal;
    }

    public void setClubLocal(ClubDto clubLocal) {
        this.clubLocal = clubLocal;
    }

    public ClubDto getClubVisitante() {
        return clubVisitante;
    }

    public void setClubVisitante(ClubDto clubVisitante) {
        this.clubVisitante = clubVisitante;
    }

    public Integer getGolesL() {
        return golesL;
    }

    public void setGolesL(Integer golesL) {
        this.golesL = golesL;
    }

    public Integer getGolesV() {
        return golesV;
    }

    public void setGolesV(Integer golesV) {
        this.golesV = golesV;
    }
}
