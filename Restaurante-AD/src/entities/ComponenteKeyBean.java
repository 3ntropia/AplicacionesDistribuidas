package entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Martin on 05/06/2016.
 */
@Embeddable
public class ComponenteKeyBean implements Serializable {
    private Integer IdPlato;
    private Integer IdIngrediente;
}
