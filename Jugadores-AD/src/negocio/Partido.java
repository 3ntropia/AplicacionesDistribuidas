package negocio;

/**
 * Created by martinh on 2/6/2016.
 */
public class Partido {
    private Integer numeroPartido;
    private Integer numeroFecha;
    private Integer nroZona;
    private Club clubLocal;
    private Club clubVisitante;
    private Integer golesL;
    private Integer golesV;

    @Override
    public String toString() {
        return "Partido{" +
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

    public Integer getNroZona() {
        return nroZona;
    }

    public void setNroZona(Integer nroZona) {
        this.nroZona = nroZona;
    }

    public Club getClubLocal() {
        return clubLocal;
    }

    public void setClubLocal(Club clubLocal) {
        this.clubLocal = clubLocal;
    }

    public Club getClubVisitante() {
        return clubVisitante;
    }

    public void setClubVisitante(Club clubVisitante) {
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

    public Integer getNumeroFecha() {
        return numeroFecha;
    }

    public void setNumeroFecha(Integer numeroFecha) {
        this.numeroFecha = numeroFecha;
    }

    public Partido(Integer numeroPartido, Integer numeroFecha, Integer nroZona, Club clubLocal, Club clubVisitante, Integer golesL, Integer golesV) {
        this.numeroPartido = numeroPartido;
        this.numeroFecha = numeroFecha;
        this.nroZona = nroZona;
        this.clubLocal = clubLocal;
        this.clubVisitante = clubVisitante;
        this.golesL = golesL;
        this.golesV = golesV;
    }
}
