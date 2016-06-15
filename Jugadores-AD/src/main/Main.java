package main;
import controlador.Controlador;
import negocio.Club;
import negocio.Jugador;

/**
 * Created by martinh on 2/6/2016.
 */
public class
Main {
    public static void main(String[] args) {
        Controlador instancia = new Controlador();
        System.out.print("algoooooooo");
//        instancia.setClubList(ClubDao.getInstancia().getClubes());
//        for (ClubBean clubBean : instancia.getClubList()) {
//            System.out.println(clubBean.toString());
//        }

        Club a = new Club();
        a.setIdClub(1);
        for (Jugador j: instancia.obtenerJugadores(a,84)) {
            System.out.println(j.toString());
        }

        System.out.println("Cantidad de partidos ganados: " + instancia.cantidadPartidosGanados(a));


        for (Club c: instancia.obtenerGanadoresPorFecha(1)) {
            System.out.println(c.toString());
        }
    }
}
