/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego.comidas;

/**
 *
 * @author DELL
 */
public class Pera extends Comida {
    
    public int activarEfecto(int vida) {
        int vida1 = vida;
        vida1 += 2;
        System.out.println("    +2 de Vida");
        return vida1;
    }
    
    public int activarEfecto1(int daño) {
        int daño1 = daño;
        daño1 += 2;
        System.out.println("    +2 de Daño");        
        return daño1;  
    }    
}
