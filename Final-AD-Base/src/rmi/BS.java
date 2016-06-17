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
        	//propieda para enlazar un archivo de texto "java.policy" con la propiedad de java. 
        	IServicio servicio = new Servicio();
    		System.setProperty("java.security.policy", "java.policy");
    		//
    		System.setProperty("java.rmi.server.codebase", IServicio.class.getProtectionDomain().getCodeSource().getLocation().toString());
    		if(System.getSecurityManager() == null) {
    			//Establece un sistema de seguridad. 
//                System.setSecurityManager(new SecurityManager());
            }
            IServicio stub = (IServicio) UnicastRemoteObject.exportObject(servicio, 0);
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Naming.rebind("ServicioJugadores", stub);
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
            Naming.unbind("ServicioJugadores");
        } catch (Exception e) {
        } finally {
            System.exit(0);
        }
    }
}
