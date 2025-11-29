/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego.comidas;

/**
 *
 * @author DELL
 */
public class Manzana extends Comida{
                                        
    public int activarEfecto(int vida) {
        int vida1 = vida;
        vida1 += 1;
        System.out.println("    +1 de Vida");
        return vida1;
    }
    
    public int activarEfecto1(int daño) {
        int daño1 = daño;
        daño1 += 1;
        System.out.println("    +1 de Daño");        
        return daño1;  
    }
}
