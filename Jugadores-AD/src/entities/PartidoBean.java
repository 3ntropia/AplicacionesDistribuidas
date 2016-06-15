package entities;

import negocio.Partido;

import javax.persistence.*;

/**
 * Created by martinh on 2/6/2016.
 */
@Entity
@Table(name = "Partidos")
public class PartidoBean {
    @Id
    @Column(name = "id_Partido", columnDefinition = "smallint")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer numeroPartido;
    @Column(name = "nroFecha", columnDefinition = "tinyint")
    private Integer numeroFecha;
    @Column(columnDefinition = "tinyint")
    private Integer nroZona;
    @OneToOne
    @JoinColumn(name = "id_ClubL")
    private ClubBean clubLocal;
    @OneToOne
    @JoinColumn(name = "id_ClubV")
    private ClubBean clubVisitante;
    @Column(columnDefinition = "smallint")
    private Integer golesL;
    @Column(columnDefinition = "smallint")
    private Integer golesV;

    public PartidoBean(){

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

    public ClubBean getClubLocal() {
        return clubLocal;
    }

    public void setClubLocal(ClubBean clubLocal) {
        this.clubLocal = clubLocal;
    }

    public ClubBean getClubVisitante() {
        return clubVisitante;
    }

    public void setClubVisitante(ClubBean clubVisitante) {
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

    public PartidoBean(Integer numeroPartido, Integer nroZona, ClubBean clubLocal, ClubBean clubVisitante, Integer golesL, Integer golesV) {

        this.numeroPartido = numeroPartido;
        this.nroZona = nroZona;
        this.clubLocal = clubLocal;
        this.clubVisitante = clubVisitante;
        this.golesL = golesL;
        this.golesV = golesV;
    }

    public Partido partidoBeanToPartido(){
        return new Partido(this.numeroPartido,this.numeroFecha,this.nroZona,this.clubLocal.clubBeanToClub(),this.clubVisitante.clubBeanToClub(),this.golesL,this.golesV);
    }


    public Integer getNumeroFecha() {
        return numeroFecha;
    }

    public void setNumeroFecha(Integer numeroFecha) {
        this.numeroFecha = numeroFecha;
    }
}
