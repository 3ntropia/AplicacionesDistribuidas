package main;
import dto.ClubDto;
import rmi.BD;
import rmi.IServicio;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by martinh on 2/6/2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            IServicio servicio = BD.obtenerServicioJugadores();
            List<ClubDto> clubDtoList = servicio.clubDtoList();
            for (ClubDto c : clubDtoList) {
                System.out.println(c.toString());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
