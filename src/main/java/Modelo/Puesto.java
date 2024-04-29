package Modelo;

import java.util.List;

public class Puesto {
    String id;
    String nombre;
    String descripcion;
    double sueldo;
    List<Filtro> filtros;
    
    public Puesto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public List<Filtro> getFiltros() {
        return filtros;
    }

    public void setFiltros(List<Filtro> filtros) {
        this.filtros = filtros;
    }
    
    public void addFiltro(Filtro filtro) {
        filtros.add(filtro);
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
