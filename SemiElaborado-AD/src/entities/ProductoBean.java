package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
@Table (name = "Productos")
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public class ProductoBean {
	@Id
	@Column(name = "codProducto")
	private Integer numero;
	private String descripcion;
	
	@Override
	public String toString() {
		return "Producto [numero=" + numero + ", descripcion=" + descripcion + "]";
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}
