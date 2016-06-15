package entities;

import javax.persistence.*;

/**
 * Created by Martin on 05/06/2016.
 */
@Entity
@Table(name = "PlaIng")
public class ComponenteBean {
    @EmbeddedId
    private ComponenteKeyBean componenteKeyBean;
    @Column(name = "cantida")
    private Float cantidad;


    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public ComponenteKeyBean getComponenteKeyBean() {
        return componenteKeyBean;
    }

    public void setComponenteKeyBean(ComponenteKeyBean componenteKeyBean) {
        this.componenteKeyBean = componenteKeyBean;
    }
}
