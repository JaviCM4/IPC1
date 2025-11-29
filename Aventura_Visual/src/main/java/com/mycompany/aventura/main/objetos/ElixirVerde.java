package com.mycompany.aventura.main.objetos;

import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.personajes.Personaje;
import javax.swing.JOptionPane;

public class ElixirVerde extends Objeto {
    
    private int recuperarVida = 50;
    
    public ElixirVerde() {
        nombre = "Elixir Verde";
        habilidad = "Cura 50 de Vida en Batalla";
        precio = 25;
    }
    
    public void recuperarVida(ListaElementos<Personaje> personajesEnBatalla, int indice, ListaElementos<Personaje> personajesJugador, int indice_1, int indice_2) {         
        int indicePersonajeEncontrado = 0;
        
        try {
            if (personajesJugador.obtenerContenido(indice_1).obtenerNombre().equals(personajesEnBatalla.obtenerContenido(indice).obtenerNombre())) {
                indicePersonajeEncontrado = indice_1;
            } else {
                indicePersonajeEncontrado = indice_2;
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            int vidaMaxima = personajesJugador.obtenerContenido(indicePersonajeEncontrado).obtenerVida();
            int vidaActual = personajesEnBatalla.obtenerContenido(indice).obtenerVida();
            int vidaPerdida = vidaMaxima - vidaActual;

            if (vidaPerdida > 50) {
                JOptionPane.showMessageDialog(null,"recupero 50 de vida","Elixir Verde",JOptionPane.INFORMATION_MESSAGE);
                personajesEnBatalla.obtenerContenido(indice).aumentarOQuitarVida(recuperarVida);
            } else {
                JOptionPane.showMessageDialog(null,"recupero su Máxima Vida","Elixir Verde",JOptionPane.INFORMATION_MESSAGE);
                personajesEnBatalla.obtenerContenido(indice).aumentarOQuitarVida(vidaPerdida);
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }
}
