package controlador;

import dao.ClubDao;
import dao.JugadorDao;
import dao.PartidoDao;
import entities.ClubBean;
import negocio.Club;
import negocio.Jugador;
import negocio.Partido;
import util.UtilJugadores;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martinh on 2/6/2016.
 */
public class Controlador {
	
    private List <ClubBean> clubList;

    public List<ClubBean> getClubList() {
        return clubList;
    }

    public void setClubList(List<ClubBean> clubList) {
        this.clubList = clubList;
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

    private List <Jugador> jugadorList;
    private List <Partido> partidoList;

    public Controlador(List<ClubBean> clubList, List<Jugador> jugadorList, List<Partido> partidoList) {
        this.clubList = clubList;
        this.jugadorList = jugadorList;
        this.partidoList = partidoList;
    }

    public Controlador(){
        clubList = new ArrayList<>();
        jugadorList = new ArrayList<>();
        partidoList = new ArrayList<>();
    }

    public List <Jugador> obtenerJugadores(Club club, int categoria){
        return UtilJugadores.jugadorBeantoJugador(JugadorDao.getInstancia().obtenerJugadores(club,categoria));
    }

    public Long cantidadPartidosGanados(Club club){
        return PartidoDao.getInstancia().cantidadPartidosGanados(club);
    }

    public List <Club> obtenerGanadoresPorFecha(int numeroFecha){
        return UtilJugadores.clubBeanToClub(PartidoDao.getInstancia().obtenerGanadoresPorFecha(numeroFecha));
    }
    
    public List <ClubBean> obtenerClubesJugadores(){
    	return ClubDao.getInstancia().clubesYJugadores();
    }

}
