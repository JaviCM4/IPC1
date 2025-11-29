/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego.comidas;

/**
 *
 * @author DELL
 */
public class Comida {
    int vida;
    private int daño;
    private int tier;
    
    public void Comida(int daño, int vida, int tier) {
        this.daño = daño;
        this.vida = vida;
        this.tier = tier;
    }
}
