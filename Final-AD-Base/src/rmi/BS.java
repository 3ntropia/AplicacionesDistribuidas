package rmi;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by martinh on 13/6/2016.
 */
public class BS {
    public void publicarServicio() {

        try {
            IServicio servicio = new Servicio();
            IServicio stub = (IServicio) UnicastRemoteObject.exportObject(servicio, 0);
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Naming.rebind("//localhost/ServicioJugadores", stub);
            verVinculos();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    public void verVinculos() {
        try {
            String[] vinculos = Naming.list( "" );
            System.out.println(InetAddress.getLocalHost().getHostAddress());
            for ( int i = 0; i < vinculos.length; i++ ){
                System.out.println( "\n"+vinculos[i] );
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cerrar() {
        try {
            Naming.unbind("GestionUsuarios");
        } catch (Exception e) {
        } finally {
            System.exit(0);
        }
    }
}
