package com.mycompany.proyecto_1_ipc1.main;

import com.mycompany.proyecto_1_ipc1.main.motorDelJuego.ControlDelJuego;

public class InvocarJuego {

    public static void main(String[] args) {
        ControlDelJuego juego = new ControlDelJuego();
        juego.empezar();   
    }
}
