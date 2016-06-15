package main;
import dao.PlatoDao;
import entities.PlatoBean;

/**
 * Created by Martin on 05/06/2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("ALGOOOOOOOOO");
        for (PlatoBean p : PlatoDao.getInstancia().platoBeanList()) {
            System.out.println(p.toString());
        }
    }
}
