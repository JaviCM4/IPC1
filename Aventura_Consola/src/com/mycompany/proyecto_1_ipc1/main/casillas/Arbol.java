/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_ipc1.main.casillas;

/**
 *
 * @author DELL
 */
public class Arbol {
    
    private int fila = 0,columna = 0;
    private double vida = 75;
    
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    public double getVida() {
        if (vida > 0) {
            return vida;
        } else {
            return 0;
        }
    }
    
    public void setVida(int cantidad) {
        this.vida -= cantidad; 
    }
}
