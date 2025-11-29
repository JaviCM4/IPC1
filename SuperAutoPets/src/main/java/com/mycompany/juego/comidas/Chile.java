/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego.comidas;

/**
 *
 * @author DELL
 */
public class Chile extends Comida {
    
    public int activarEfecto1(int daño) {
        int daño1 = daño;
        daño1 += 5;
        System.out.println("    +5 de Daño");        
        return daño1;  
    }      
}
