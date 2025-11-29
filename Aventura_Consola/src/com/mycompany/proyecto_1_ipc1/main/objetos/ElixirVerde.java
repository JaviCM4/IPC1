/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_ipc1.main.objetos;


import com.mycompany.proyecto_1_ipc1.main.personajes.*;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ElixirVerde extends Objeto {
    
    private int recuperarVida = 50;
    
    public ElixirVerde() {
        nombre = "Elixir Verde";
        habilidad = "Cura 50 de Vida en Batalla";
        precio = 25;
    }
    
    public void recuperarVida(Personaje jugador, int vidaMaxima) {  
        int vidaActual = jugador.obtenerVida();
        int vidaPerdida = vidaMaxima - vidaActual;
        
        if (vidaPerdida > 50) {
            System.out.println("--------------------------------");
            System.out.println(jugador.mandarNombre() + " recupero 50 de vida");
            System.out.println("--------------------------------");
            jugador.aumentarOQuitarVida(recuperarVida);
        } else {
            System.out.println("---------------------------------");
            System.out.println(jugador.mandarNombre() + " recupero su Máxima Vida");
            System.out.println("---------------------------------");
            jugador.aumentarOQuitarVida(vidaPerdida);
        }
    }
}
