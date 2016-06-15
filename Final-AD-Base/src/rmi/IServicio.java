package rmi;

import dto.ClubDto;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by martinh on 13/6/2016.
 */
public interface IServicio extends Remote {

    //TEST
    List<ClubDto> clubDtoList() throws RemoteException;

    List<ClubDto> clubDtoPorZona (String zona) throws RemoteException;

}
