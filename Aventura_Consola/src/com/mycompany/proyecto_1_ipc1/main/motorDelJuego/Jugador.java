/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_ipc1.main.motorDelJuego;

import com.mycompany.proyecto_1_ipc1.main.objetos.*;
import com.mycompany.proyecto_1_ipc1.main.personajes.*;

/**
 *
 * @author DELL
 */
public class Jugador {
    
    private String nombre;
    private int oro = 0;
    private Personaje[] equipoJugador;
    private Objeto[] objetosJugador;
    
    public void guardarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String mandarNombre() {
        return nombre;
    }
    
    public void guardarOro(int oro) {
        this.oro = oro;
    }
    
    public int mandarOro() {
        return oro;
    }
    
    public void guardarEquipoJugador(Personaje[] equipoJugador) {
        this.equipoJugador = equipoJugador;
    }
    
    public Personaje[] mandarEquipoJugador() {
        return equipoJugador;
    }
      
    public void guardarObjetosJugador(Objeto[] objetosJugador) {
        this.objetosJugador = objetosJugador;
    }
    
    public Objeto[] mandarObjetosJugador() {
        return objetosJugador;
    }
}
