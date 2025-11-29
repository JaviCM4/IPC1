package com.mycompany.aventura.main.tablero;

import java.io.Serializable;
import javax.swing.JLabel;

public class Casilla extends JLabel implements Serializable {
    
    private int fila = 0;
    private int columna = 0;
    private String tipoDeImagen;
    
    public Casilla(int fila, int columna, String tipoDeImagen) {
        this.fila = fila;
        this.columna = columna;
        this.tipoDeImagen = tipoDeImagen;
    }
    
    public int obtenerFila() {
        return fila;
    }
    
    public int obtenerColumna() {
        return columna;
    }
    
    public void cambiarTipoDeCasilla(String tipoDeImagen) {
        this.tipoDeImagen = tipoDeImagen;
    }
    
    public String obtenerTipoDeCasilla() {
        return tipoDeImagen;
    }
}
