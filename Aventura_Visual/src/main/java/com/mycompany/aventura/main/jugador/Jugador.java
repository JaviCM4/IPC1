package com.mycompany.aventura.main.jugador;


import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.objetos.*;
import com.mycompany.aventura.main.personajes.*;
import java.io.File;

public class Jugador {
    
    private ListaElementos<Personaje> personajesJugador = new ListaElementos<>();
    private ListaElementos<Objeto> objetosJugador = new ListaElementos<>();
    private ListaElementos<String> partidasGuardadas = new ListaElementos<>();
    private String nombre;
    private int oro = 0, punteoJugador = 0;
    
    public ListaElementos<Personaje> obtenerListaPersonajes() {
        return personajesJugador;
    }
    
    public void guardarListaPersonaejes(ListaElementos<Personaje> personajesJugador) {
        this.personajesJugador = personajesJugador;
    }
    
    public ListaElementos<Objeto> obtenerListaObjetos() {
        return objetosJugador;
    }
    
    public void guardarListaObjetos(ListaElementos<Objeto> objetosJugador) {
        this.objetosJugador = objetosJugador;
    }
    
    // Punteo
    public void guardarPunteo(int punteoJugador) {
        this.punteoJugador = punteoJugador;
    }
    
    public void aumentarPunteo(int aumento) {
        this.punteoJugador += aumento;
    }
    
    public int obtenerPunteoJugador() {
        return punteoJugador;
    }
    
    // Nombre
    public void guardarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    // Oro
    public void guardarOro(int oro) {
        this.oro = oro;
    }
    
    public void aumentarOro(int aumento){ 
        oro += aumento;
    }
    public int obtenerOro() {
        return oro;
    }
    
    // Partida Guardadas
    
    public boolean guardarNombreDeLaPartidaGuardada(String nombre) {
        for (int i = 1; i <= partidasGuardadas.getLongitud(); i++) {
            try {
                if (nombre.equals(partidasGuardadas.obtenerContenido(i))) {
                    return false;
                }
            } catch (ListaElementosExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        partidasGuardadas.agregarALaLista(nombre);
        return true;
    }
    
    public void eliminarPartidaGuardada(String nombre) {
        for (int i = 1; i <= partidasGuardadas.getLongitud(); i++) {
            try {
                if (nombre.equals(partidasGuardadas.obtenerContenido(i))) {
                    partidasGuardadas.eliminar(i);
                    break;
                }
            } catch (ListaElementosExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        File file = new File(nombre + ".dat");
        file.delete();
    }
    
    public ListaElementos<String> obtenerPartidaGuardadas() {
        return partidasGuardadas;
    }
}
