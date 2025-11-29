package com.mycompany.aventura.main.tablero;

import java.io.Serializable;

public class Arbol implements Serializable {
    
    private double vida = 75;
    private int fila = 0, columna = 0;
    private boolean arbolActivo = true, arbolRevisado = false;
    
    public Arbol(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    
    public int obtenerFila() {
        return fila;
    }
    
    public int obtenerColumna() {
        return columna;
    }
    
    public double obtenerVida() {
        if (vida > 0) {
            return vida;
        } else {
            return 0;
        }
    }
    
    public void quitarVida(int cantidad) {
        this.vida -= cantidad; 
    }
    
    public void cambiarEstadoDeLaRevisionDelArbol(boolean arbolRevisado) {
        this.arbolRevisado = arbolRevisado;
    }
    
    public boolean obtenerSiElArbolFueRevisado() {
        return arbolRevisado;
    }
    
    public void cambiarElEstadoDelArbol(boolean arbolActivo) {
        this.arbolActivo = arbolActivo;
    }
    
    public boolean obtenerSiElArbolEstaActivo() {
        return arbolActivo;
    }
}
