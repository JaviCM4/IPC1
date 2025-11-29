/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego.comidas;

/**
 *
 * @author DELL
 */
public class Ajo extends Comida {
    
    public int activarEfecto(int vida) {
        int vida1 = vida;
        vida1 += 2;
        System.out.println("    Activando armadura de Ajo");
        return vida1;
    }
}
