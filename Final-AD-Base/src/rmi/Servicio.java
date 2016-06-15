package rmi;

import controlador.Controlador;
import dto.ClubDto;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by martinh on 13/6/2016.
 */
public class Servicio implements IServicio {

    private Controlador instancia;

    public Servicio(){
        instancia = new Controlador();
    }

    @Override
    public List<ClubDto> clubDtoList() throws RemoteException{
        return instancia.clubDtoList();
    }

    @Override
    public List<ClubDto> clubDtoPorZona(String zona) throws RemoteException {
        return instancia.clubDtoPorZona(zona);
    }
}
