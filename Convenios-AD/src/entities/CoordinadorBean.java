package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Martin on 07/06/2016.
 */
@Entity
@Table(name = "coordinadores")
public class CoordinadorBean extends IntegranteBean {
    private Boolean interino;

    @Override
    public String toString() {
        return "Coordinador{" +
                "interino=" + interino +
                '}';
    }

    public Boolean getInterino() {
        return interino;
    }

    public void setInterino(Boolean interino) {
        this.interino = interino;
    }

}
