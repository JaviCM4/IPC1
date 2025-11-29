package com.mycompany.aventura.main.tienda;


import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.mejoras.*;
import com.mycompany.aventura.main.objetos.*;
import com.mycompany.aventura.main.personajes.*;
import javax.swing.JOptionPane;

public class Tienda {
    
    public void comprarObjetos(int numeroDeCompra, ListaElementos<Objeto> objetosJugador) {   
        Objeto nuevoObjeto = null;

        if (numeroDeCompra == 1) {
            nuevoObjeto = new SemillaDeLaVida();
        } else if (numeroDeCompra == 2) {
            nuevoObjeto = new ElixirVerde();
        } else if (numeroDeCompra == 3) {
            nuevoObjeto = new CapaDeMovilidad();
        }
        
        objetosJugador.agregarALaLista(nuevoObjeto);
        JOptionPane.showMessageDialog(null, nuevoObjeto.getNombre() + " se agregó a tu Inventario, se Realizo la Compra", "Compra Efetuada", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void comprarPersonajes(int numeroDeCompra, String apodo, ListaElementos<Personaje> personajesJugador) {
        Personaje nuevoPersonaje = null;       
        
        if (numeroDeCompra == 1) {
            nuevoPersonaje = new Caballero(apodo);
        } else if (numeroDeCompra == 2) {
            nuevoPersonaje = new Arquero(apodo);
        } else if (numeroDeCompra == 3) {
            nuevoPersonaje = new Mago(apodo);
        } else if (numeroDeCompra == 4){
            nuevoPersonaje = new Gigante(apodo);
        } else if (numeroDeCompra == 5){
            nuevoPersonaje = new Dragon(apodo);
        }

        personajesJugador.agregarALaLista(nuevoPersonaje);
        JOptionPane.showMessageDialog(null, nuevoPersonaje.obtenerTipo()+ " se unió a tu Equipo, se Realizo la Compra", "Compra Efetuada", JOptionPane.INFORMATION_MESSAGE);          
    }
    
    public void comprarMejoras(int numeroDeCompra, ListaElementos<Personaje> personajesJugador) {
        Mejora nuevaMejora = new Mejora();       
        
        if (numeroDeCompra == 1) {
            nuevaMejora = new Vida();
        } else if (numeroDeCompra == 2) {
            nuevaMejora = new Daño();
        } else if (numeroDeCompra == 3) {
            nuevaMejora = new Movilidad();
        }
     
        boolean salir = false;

        while (!salir) {
            Personaje contenido = null;
            String[] options = new String[personajesJugador.getLongitud()];
            for (int i = 0; i < options.length; i++) {
                try {
                    options[i] = personajesJugador.obtenerContenido(i + 1).obtenerNombre();
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione El Personaje que desea Mejorar", "Mejora", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            
            if (seleccion != -1) { 
                seleccion++;

                try {
                    contenido = personajesJugador.obtenerContenido(seleccion);
                    if (numeroDeCompra == 1) {
                        contenido.aumentarOQuitarVida(nuevaMejora.getAumento());
                    } else if (numeroDeCompra == 2) {
                        contenido.aumentarDaño(nuevaMejora.getAumento());
                    } else {
                        contenido.setMovilidad(nuevaMejora.getAumento());
                    }
                    salir = true;
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }         
            } else {
                JOptionPane.showMessageDialog(null, "Debes Seleccionar un Personaje para Mejorarlo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}