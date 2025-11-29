package com.mycompany.batalla_naval.main.barcos;

public class Barco {
    
    protected String nombre;
    protected int punteo;
    protected int fila;
    protected int columna;
    
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public int sumarPuntaje() {
        return punteo;
    }
    
    public void recibirCoordenada(int fila1, int columna1) {
        this.fila = fila1;
        this.columna = columna1;
    }
    
    public int obtenerFila() {
        return fila;
    }
    
    public int obtenerColumna() {
        return columna;
    }
}
