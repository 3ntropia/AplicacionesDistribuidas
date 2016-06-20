package rmi;

import controlador.Controlador;
import dto.ClubDto;

import java.rmi.RemoteException;
import java.util.ArrayList;
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
    public List<ClubDto> clubDtoList(){
        return instancia.clubDtoList();
    }

    @Override
    public List<ClubDto> clubDtoPorZona(String zona) {
    	List <ClubDto> clubes = new ArrayList <ClubDto>();
    	for(int i = 0;i<50;i++){
    		ClubDto c = new ClubDto ();
    		c.setIdClub(1);
    		c.setNombre(String.valueOf(i));
    		clubes.add(c);
    	}
    	return clubes;
//    	return instancia.clubDtoPorZona(zona);
    }
}
