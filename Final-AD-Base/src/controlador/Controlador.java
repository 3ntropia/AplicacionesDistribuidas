package controlador;

import dao.ClubDao;
import dto.ClubDto;
import negocio.Club;
import negocio.Jugador;
import negocio.Partido;
import util.UtilJugadores;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martinh on 12/6/2016.
 */
public class Controlador {
    private List<Jugador> jugadorList;
    private List<Partido> partidoList;
    private List<Club> clubList;



    public Controlador(List<Jugador> jugadorList, List<Partido> partidoList, List<Club> clubList) {
        this.jugadorList = jugadorList;
        this.partidoList = partidoList;
        this.clubList = clubList;
    }

    public Controlador(){
        jugadorList = new ArrayList<Jugador>();
        partidoList = new ArrayList<Partido>();
        clubList = new ArrayList<Club>();
    }

    public List <ClubDto> clubDtoList(){
        return UtilJugadores.clubBeanToClubDto(ClubDao.getInstancia().getClubes());
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }

    public List<Partido> getPartidoList() {
        return partidoList;
    }

    public void setPartidoList(List<Partido> partidoList) {
        this.partidoList = partidoList;
    }

    public List<Club> getClubList() {
        return clubList;
    }

    public void setClubList(List<Club> clubList) {
        this.clubList = clubList;
    }

    public List<ClubDto> clubDtoPorZona(String zona) {
        return UtilJugadores.clubBeanToClubDto(ClubDao.getInstancia().clubesPorZona(zona));
    }
}
