package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Materiales")
public class MateriaPrimaBean {
	@Id
	@Column(name = "codMaterial", columnDefinition = "int")
	private String codigo;
	private String descripcion;
	@OneToOne
	@JoinColumn(name = "uniCompra", insertable = false, updatable = false)
	private UnidadBean unidadCompra;
	@OneToOne
	@JoinColumn(name = "uniUso", insertable = false, updatable = false)
	private UnidadBean unidadUso;
	
	@Override
	public String toString() {
		return "MateriaPrimaBean [codigo=" + codigo + ", descripcion=" + descripcion + ", unidadCompra=" + unidadCompra
				+ ", unidadUso=" + unidadUso + "]";
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public UnidadBean getUnidadCompra() {
		return unidadCompra;
	}
	public void setUnidadCompra(UnidadBean unidadCompra) {
		this.unidadCompra = unidadCompra;
	}
	public UnidadBean getUnidadUso() {
		return unidadUso;
	}
	public void setUnidadUso(UnidadBean unidadUso) {
		this.unidadUso = unidadUso;
	}

	
}
