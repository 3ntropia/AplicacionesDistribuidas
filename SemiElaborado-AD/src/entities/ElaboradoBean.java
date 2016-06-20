package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Elaborados")
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public class ElaboradoBean extends ProductoBean{
	@ManyToMany
	@JoinTable(name = "compuestoDe",
			joinColumns = @JoinColumn (name = "codProductoSM"),
			inverseJoinColumns = @JoinColumn (name = "codProductoE"))
	private List <SemiElaboradoBean> componentes;
	@Column (columnDefinition = "int")
	private Float precioVenta;
	private Integer porcentajeGanancia;
	@OneToOne
	@JoinColumn(name = "unidad")
	private UnidadBean unidad;
	
	@Override
	public String toString() {
		return "ElaboradoBean [componentes=" + componentes + ", precioVenta=" + precioVenta + ", porcentajeGanancia="
				+ porcentajeGanancia + ", unidad=" + unidad + "]";
	}
	public List <SemiElaboradoBean> getComponentes() {
		return componentes;
	}
	public void setComponentes(List <SemiElaboradoBean> componentes) {
		this.componentes = componentes;
	}
	public Float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(Float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public Integer getPorcentajeGanancia() {
		return porcentajeGanancia;
	}
	public void setPorcentajeGanancia(Integer porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}
	public UnidadBean getUnidad() {
		return unidad;
	}
	public void setUnidad(UnidadBean unidad) {
		this.unidad = unidad;
	}
}
