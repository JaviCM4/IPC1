package com.mycompany.aventura.main.objetos;

import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.personajes.*;
import javax.swing.JOptionPane;

public class SemillaDeLaVida extends Objeto {
    
    public SemillaDeLaVida() {
        nombre = "Semilla de la Vida";
        habilidad = "Resucita a un Personaje caido en Batalla";
        precio = 50;
    }
    
    public void resucitarPersonaje(ListaElementos<Personaje> personajesEnBatalla, int indice, ListaElementos<Personaje> personajesJugador, int indice_1, int indice_2) {
        int indicePersonajeEncontrado = 0;
        
        try {
            if (personajesJugador.obtenerContenido(indice_1).obtenerNombre().equals(personajesEnBatalla.obtenerContenido(indice).obtenerNombre())) {
                indicePersonajeEncontrado = indice_2;
            } else {
                indicePersonajeEncontrado = indice_1;
            }
            
            Personaje revivido = null;

            if ("caballero".equals(personajesJugador.obtenerContenido(indicePersonajeEncontrado).obtenerTipo())) {
                revivido = new Caballero(personajesJugador.obtenerContenido(indicePersonajeEncontrado).obtenerNombre());
            } else if ("arquero".equals(personajesJugador.obtenerContenido(indicePersonajeEncontrado).obtenerTipo())) {
                revivido = new Arquero(personajesJugador.obtenerContenido(indicePersonajeEncontrado).obtenerNombre());
            } else if ("mago".equals(personajesJugador.obtenerContenido(indicePersonajeEncontrado).obtenerTipo())) {
                revivido = new Mago(personajesJugador.obtenerContenido(indicePersonajeEncontrado).obtenerNombre());
            } else if ("gigante".equals(personajesJugador.obtenerContenido(indicePersonajeEncontrado).obtenerTipo())) {
                revivido = new Gigante(personajesJugador.obtenerContenido(indicePersonajeEncontrado).obtenerNombre());
            } else if ("dragon".equals(personajesJugador.obtenerContenido(indicePersonajeEncontrado).obtenerTipo())) {
                revivido = new Dragon(personajesJugador.obtenerContenido(indicePersonajeEncontrado).obtenerNombre());
            }
            revivido.establecerVida(personajesJugador.obtenerContenido(indicePersonajeEncontrado).obtenerVida());
            personajesEnBatalla.agregarALaLista(revivido);       
            JOptionPane.showMessageDialog(null,"Has recuperado a tu Otro Personaje","Semilla de la Vida",JOptionPane.INFORMATION_MESSAGE);
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }
}
 