package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "SemiElaborados")
public class SemiElaboradoBean extends ProductoBean {
	@ManyToMany
	@JoinTable(name = "materialSemi",
		joinColumns = @JoinColumn (name = "codMaterial"),
		inverseJoinColumns = @JoinColumn (name = "codProducto"))
	private List <MateriaPrimaBean> materiales;
	@Column(name="costo", columnDefinition = "int")
	private Double 	costroProduccion;
	@OneToOne
	@JoinColumn (name = "almacenadoComo")
	private UnidadBean unidadAlmacenamiento;
	
	@Override
	public String toString() {
		return "SemiElaboradoBean [materiales=" + null + ", costroProduccion=" + costroProduccion
				+ ", unidadAlmacenamiento=" + unidadAlmacenamiento + "]";
	}
	public List <MateriaPrimaBean> getMateriales() {
		return materiales;
	}
	public void setMateriales(List <MateriaPrimaBean> materiales) {
		this.materiales = materiales;
	}
	public Double getCostroProduccion() {
		return costroProduccion;
	}
	public void setCostroProduccion(Double costroProduccion) {
		this.costroProduccion = costroProduccion;
	}
	public UnidadBean getUnidadAlmacenamiento() {
		return unidadAlmacenamiento;
	}
	public void setUnidadAlmacenamiento(UnidadBean unidadAlmacenamiento) {
		this.unidadAlmacenamiento = unidadAlmacenamiento;
	}

}
