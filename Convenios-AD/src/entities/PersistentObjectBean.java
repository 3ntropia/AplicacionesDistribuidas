package entities;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by Martin on 07/06/2016.
 */
@MappedSuperclass
public class PersistentObjectBean {
    @Id
    protected Integer id;
}
