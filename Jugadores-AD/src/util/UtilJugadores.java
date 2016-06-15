package util;

import dto.ClubDto;
import dto.JugadorDto;
import entities.ClubBean;
import entities.JugadorBean;
import entities.PartidoBean;
import negocio.Club;
import negocio.Jugador;
import negocio.Partido;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Martin on 04/06/2016.
 */
public class UtilJugadores {

    public static List<Jugador> jugadorBeantoJugador(List<JugadorBean> listaJugadores){
        return  listaJugadores.stream().map(j ->
                new Jugador(j.getJugadorId().getTipo(),j.getJugadorId().getNumero(),j.getNombre(),j.getCategoria(),j.getFechaNacimiento(),null))
                .collect(Collectors.<Jugador>toList());
    }

    public static List <Partido> partidoBeanToPartido(List <PartidoBean> listaPartidos){
        return listaPartidos.stream().map(p ->
                new Partido(p.getNumeroPartido(),p.getNumeroFecha(),p.getNroZona(),null,null,p.getGolesL(),p.getGolesV()))
                .collect(Collectors.<Partido>toList());
    }

    public static List<Club> clubBeanToClub(List<ClubBean> listaClubes) {
        return listaClubes.stream().map(c ->
                new Club(c.getIdClub(),c.getNombre(),c.getNroZona(),null,null,null))
                .collect(Collectors.<Club>toList());
    }

    public static List<ClubDto> clubBeanToClubDto(List<ClubBean> clubBeanaList){
        return clubBeanaList.stream().map(c ->
                new ClubDto(c.getIdClub(),c.getNombre(),c.getNroZona(),jugadorBeanToJugadorDto(c.getJugadorList()),null,null))
                .collect(Collectors.<ClubDto>toList());
    }

    public static List<JugadorDto> jugadorBeanToJugadorDto(List<JugadorBean> jugadorBeanList){
        return jugadorBeanList.stream().map(j ->
                new JugadorDto(j.getJugadorId().getTipo(),j.getJugadorId().getNumero(),j.getNombre(),j.getCategoria(),j.getFechaNacimiento(),null))
                .collect(Collectors.<JugadorDto>toList());
    }
}
