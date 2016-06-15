package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by martinh on 13/6/2016.
 */
public class BD {
    public static IServicio obtenerServicioJugadores(){
        try {
            return (IServicio) Naming.lookup("ServicioJugadores");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return null;
    }
}
