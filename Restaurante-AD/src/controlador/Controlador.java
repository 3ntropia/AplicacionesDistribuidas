package controlador;

import negocio.Componente;
import negocio.Ingrediente;
import negocio.Plato;
import negocio.Unidad;

import java.util.List;

/**
 * Created by Martin on 05/06/2016.
 */
public class Controlador {
    private List<Componente> componenteList;
    private List<Ingrediente> ingredienteList;
    private List<Unidad> unidadList;
    private List<Plato> platoList;
 
    public List <Ingrediente> obtenerIngredientes(Plato plato){
        return null;
    }

    public Ingrediente cantidadIngredientes(Unidad unidad){
        return null;
    }

    public List <Ingrediente> ingredientesMismaUnidad(Unidad unidad){
        return null;
    }

    @Override
    public String toString() {
        return "Controlador{" +
                "componenteList=" + componenteList +
                ", ingredienteList=" + ingredienteList +
                ", unidadList=" + unidadList +
                ", platoList=" + platoList +
                '}';
    }

    public List<Componente> getComponenteList() {
        return componenteList;
    }

    public void setComponenteList(List<Componente> componenteList) {
        this.componenteList = componenteList;
    }

    public List<Ingrediente> getIngredienteList() {
        return ingredienteList;
    }

    public void setIngredienteList(List<Ingrediente> ingredienteList) {
        this.ingredienteList = ingredienteList;
    }

    public List<Unidad> getUnidadList() {
        return unidadList;
    }

    public void setUnidadList(List<Unidad> unidadList) {
        this.unidadList = unidadList;
    }

    public List<Plato> getPlatoList() {
        return platoList;
    }

    public void setPlatoList(List<Plato> platoList) {
        this.platoList = platoList;
    }

    public Controlador(List<Componente> componenteList, List<Ingrediente> ingredienteList, List<Unidad> unidadList, List<Plato> platoList) {

        this.componenteList = componenteList;
        this.ingredienteList = ingredienteList;
        this.unidadList = unidadList;
        this.platoList = platoList;
    }
}
