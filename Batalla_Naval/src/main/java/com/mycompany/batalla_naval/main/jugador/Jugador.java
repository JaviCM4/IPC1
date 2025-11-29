package com.mycompany.batalla_naval.main.jugador;

import com.mycompany.batalla_naval.main.bombas.Bomba;

public class Jugador {
    
    private String nombre;
    private Bomba[] bombas;
    
    public Jugador(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public Bomba[] obtenerBomba() {
        return bombas;
    }
    
    public void recibirInventario(Bomba[] bombas) {
        this.bombas = bombas;
    }
}
