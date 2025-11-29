/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego.comidas;

/**
 *
 * @author DELL
 */
public class Chocolate extends Comida {

    public int activarEfecto(int experiencia) {
        int experiencia1 = experiencia;
        experiencia1 += 1;
        System.out.println("    +1 de Experiencia");        
        return experiencia1;
    }    
}
