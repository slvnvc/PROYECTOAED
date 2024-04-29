package Modelo;

import java.util.ArrayList;

public class Filtro {
    String nombre;
    ArrayList<Object> valores;
    
    public Filtro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Object> getValores() {
        return valores;
    }

    public void setValores(ArrayList<Object> valores) {
        this.valores = valores;
    }
    
    public String printValores() {
        String str = "";
        
        for (int i = 0; i < valores.size(); i++) {
            str += valores.get(i);
            
            if (i < valores.size() - 1) str += ", ";
        }
        
        return str;
    }
}
