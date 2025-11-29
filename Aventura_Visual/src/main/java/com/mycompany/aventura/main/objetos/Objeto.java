package com.mycompany.aventura.main.objetos;

import java.io.Serializable;

public class Objeto implements Serializable {
    
    protected String nombre, habilidad;
    protected int precio;
    
    public String getNombre() {
        return nombre;
    }
    
    public String getHabilidad() {
        return habilidad;
    }
    
    public int getPrecio() {
        return precio;
    }
}
