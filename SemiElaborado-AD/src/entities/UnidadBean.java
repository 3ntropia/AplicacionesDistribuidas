package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "unidades")
public class UnidadBean {
	@Id
	@Column(name ="codUnidad")
	private Integer codigo;
	private String descripcion;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "UnidadBean [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	} 
	
}
