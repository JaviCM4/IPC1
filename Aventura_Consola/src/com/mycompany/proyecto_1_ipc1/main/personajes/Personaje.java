/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_ipc1.main.personajes;

import com.mycompany.proyecto_1_ipc1.main.casillas.Arbol;


/**
 *
 * @author DELL
 */
public abstract class Personaje {
    
    protected String ANSI_GREEN = "\u001B[32m", ANSI_RESET = "\u001B[0m";
    protected String nombre,letra,casillaActual = " .";
    protected int daño,vida,movilidad,fila,columna;
    protected double porcentajeDeEfectividad;
    protected boolean puedeVolar;
    
    public String mandarNombre() {
        return nombre;
    }
    
    public String obtenerLetra() {
        return letra;
    }
    
    public void aumentarDaño(int aumento) {
        daño += aumento;
    }

    public int obtenerDaño() {
        return daño;
    }
    
    public void restablecerVida(int vida) {
        this.vida = vida;
    }
    
    public void aumentarOQuitarVida(int aumento) {
        vida += aumento;
    }
    
    public int obtenerVida() {
        
        if (vida > 0) {
            return vida;
        } else {
            return 0;
        }
    }

    public void setMovilidad(int aumento) {
        movilidad += aumento;
    }
    
    public int getMovilidad() {
        return movilidad;
    }
    
    public int getFila() {
        return fila;
    }
    
    public void recibirFila(int fila) {
        this.fila = fila;
    }
    
    public int getColumna() {
        return columna;
    }
    
    public void recibirColumna(int columna) {
        this.columna = columna;
    }
    
    public String getCasillaActual() {
        return casillaActual;
    }
    
    public void recibirCasillaActual(String casilla) {
        casillaActual = casilla;
    }
    
    public boolean saberSiPuedeVolar() {
        return puedeVolar;
    }
    
    public abstract void moverPersonaje(String[][] tablero, String casillaAnterior, int x, int y);
    
    public abstract void atacarPersonaje(String[][] tablero, Arbol[] arboles, Personaje[] enemigos, int x, int y, int indice);
}
