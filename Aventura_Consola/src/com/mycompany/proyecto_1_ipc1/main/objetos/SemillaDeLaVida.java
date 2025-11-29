/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_ipc1.main.objetos;

import com.mycompany.proyecto_1_ipc1.main.personajes.*;


/**
 *
 * @author DELL
 */
public class SemillaDeLaVida extends Objeto {
    
    public SemillaDeLaVida() {
        nombre = "Semilla de la Vida";
        habilidad = "Resucita a un Personaje caido en Batalla";
        precio = 50;
    }
    
    public void resucitarPersonaje(Personaje[] jugador, Personaje copia_1, Personaje copia_2, int vida_1, int vida_2) {   
        if (jugador[0] == null) {
            jugador[0] = copia_1;
            jugador[0].restablecerVida(vida_1);
            System.out.println("----------------------------");
            System.out.println(jugador[0].mandarNombre() + " a vuelto a la Vida");  
            System.out.println("----------------------------");
        } else {
            jugador[1] = copia_2;
            jugador[1].restablecerVida(vida_2);
            System.out.println("----------------------------");
            System.out.println(jugador[1].mandarNombre() + " a vuelto a la Vida");  
            System.out.println("----------------------------");
        } 
    }
}
 