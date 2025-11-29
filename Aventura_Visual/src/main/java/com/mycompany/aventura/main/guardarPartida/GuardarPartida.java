package com.mycompany.aventura.main.guardarPartida;

import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.personajes.Personaje;
import com.mycompany.aventura.main.tablero.Arbol;
import com.mycompany.aventura.main.tablero.Casilla;
import java.io.Serializable;

public class GuardarPartida implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private ListaElementos<Casilla> tablero;
    private ListaElementos<String> casillasAnteriores;
    private ListaElementos<Personaje> personajesEnBatalla;
    private ListaElementos<Personaje> personajesEnemigos;
    private ListaElementos<Arbol> arboles;
    private String casillaAnterior;
    private int indiceJugador, fila, columna, indicePersonajeSeleccionado_1, indicePersonajeSeleccionado_2;
    private boolean yaSeLeNotificoPerdida;
    
    public GuardarPartida(ListaElementos<Casilla> tablero, ListaElementos<Personaje> personajesEnBatalla, ListaElementos<Personaje> personajesEnemigos, ListaElementos<Arbol> arboles, String casillaAnterior, ListaElementos<String> casillasAnteriores, int indiceJugador, int fila, int columna, int indicePersonajeSeleccionado_1, int indicePersonajeSeleccionado_2, boolean yaSeLeNotificoPerdida) {
        this.tablero = tablero;
        this.personajesEnBatalla = personajesEnBatalla;
        this.personajesEnemigos = personajesEnemigos;
        this.arboles = arboles;
        this.casillaAnterior = casillaAnterior;
        this.casillasAnteriores = casillasAnteriores;
        this.indiceJugador = indiceJugador;
        this.fila = fila;
        this.columna = columna;
        this.indicePersonajeSeleccionado_1 = indicePersonajeSeleccionado_1;
        this.indicePersonajeSeleccionado_2 = indicePersonajeSeleccionado_2;
        this.yaSeLeNotificoPerdida = yaSeLeNotificoPerdida;
    }

    public ListaElementos<Casilla> obtenerTablero() {
        return tablero;
    }

    public ListaElementos<String> obtenerCasillasAnteriores() {
        return casillasAnteriores;
    }

    public ListaElementos<Personaje> obtenerPersonajesEnBatalla() {
        return personajesEnBatalla;
    }

    public ListaElementos<Personaje> obtenerPersonajesEnemigos() {
        return personajesEnemigos;
    }

    public ListaElementos<Arbol> obtenerArboles() {
        return arboles;
    }

    public String obtenerCasillaAnterior() {
        return casillaAnterior;
    }

    public int obtenerIndiceJugador() {
        return indiceJugador;
    }
    
    public int obtenerFila(){ 
        return fila;
    }
    
    public int obtenerColumna() {
        return columna;
    }
    
    public int obtenerIndicePersonajeSeleccionado_1(){ 
        return indicePersonajeSeleccionado_1;
    }
    
    public int obtenerIndicePersonajeSeleccionado_2() {
        return indicePersonajeSeleccionado_2;
    }
    
    public boolean obtenerSiYaSeLeNotificoPerdida() {
        return yaSeLeNotificoPerdida;
    }
}