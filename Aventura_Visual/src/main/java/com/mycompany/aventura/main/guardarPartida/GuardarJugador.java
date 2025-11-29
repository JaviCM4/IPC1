package com.mycompany.aventura.main.guardarPartida;

import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.objetos.Objeto;
import com.mycompany.aventura.main.personajes.Personaje;
import java.io.Serializable;

public class GuardarJugador implements Serializable {
 
    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private int oro, puntuacion;
    private ListaElementos<Personaje> personajesJugador;
    private ListaElementos<Objeto> objetosJugador;
    private ListaElementos<String> partidaGuardadas = new ListaElementos<>();
    
    public GuardarJugador(String nombre, int oro, int puntuacion, ListaElementos<Personaje> personajesJugador, ListaElementos<Objeto> objetosJugador, ListaElementos<String> partidaGuardadas) {
        this.nombre = nombre;
        this.oro = oro;
        this.puntuacion = puntuacion;
        this.personajesJugador = personajesJugador;
        this.objetosJugador = objetosJugador;
        this.partidaGuardadas = partidaGuardadas;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerOro() {
        return oro;
    }

    public int obtenerPuntuacion() {
        return puntuacion;
    }

    public ListaElementos<Personaje> obtenerPersonajesJugador() {
        return personajesJugador;
    }

    public ListaElementos<Objeto> obtenerObjetosJugador() {
        return objetosJugador;
    }
    
    public ListaElementos<String> obtenerPartidasGuardadas() {
        return partidaGuardadas;
    }
}
