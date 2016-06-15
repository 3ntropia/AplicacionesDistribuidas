package entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by martinh on 2/6/2016.
 */
@Embeddable
public class JugadorId implements Serializable{
    @Column(name = "Tipodoc", columnDefinition = "CHAR")
    private String tipo;
    @Column(name = "Nrodoc")
    private Integer numero;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
