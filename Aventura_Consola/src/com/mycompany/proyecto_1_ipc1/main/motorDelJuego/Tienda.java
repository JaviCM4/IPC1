/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_ipc1.main.motorDelJuego;

import com.mycompany.proyecto_1_ipc1.main.mejoras.*;
import com.mycompany.proyecto_1_ipc1.main.objetos.*;
import com.mycompany.proyecto_1_ipc1.main.personajes.*;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Tienda {
    
    private int copias = 0;
    
    public int comprarObjetos(int oro, int numeroDeCompra, Objeto[] objetosJugador) {   
        Objeto nuevoObjeto = null;
        
        if (numeroDeCompra == 1) {
            nuevoObjeto = new SemillaDeLaVida();
        } else if (numeroDeCompra == 2) {
            nuevoObjeto = new ElixirVerde();
        } else if (numeroDeCompra == 3) {
            nuevoObjeto = new CapaDeMovilidad();
        }
        boolean tieneOro = verificarOro(oro,nuevoObjeto.getPrecio(),1);
        
        if (tieneOro) {
            boolean seRealizoLaCompra = agregarAlInventario(nuevoObjeto,objetosJugador);
            
            if (seRealizoLaCompra) {
                System.out.println("-----------------------------------------------------------------");
                System.out.println(nuevoObjeto.getNombre() + " se agrego a tu Inventario, se Realizo la Compra");
                System.out.println("-----------------------------------------------------------------");               
                oro -= nuevoObjeto.getPrecio();
            } else {
                System.out.println("-----------------------------------------------------------");
                System.out.println("No tienes Espacio en tu Inventario, No se realizo la Compra");
                System.out.println("-----------------------------------------------------------");
            }
        }
        return oro;
    }
    
    public int comprarPersonajes(int oro, int numeroDeCompra, Personaje[] equipoJugador) {
        Personaje nuevoPersonaje = null;       
        boolean tieneOro = verificarOro(oro,200,2);
        
        if (tieneOro) {
            if (numeroDeCompra == 1) {
                nuevoPersonaje = new Caballero();
            } else if (numeroDeCompra == 2) {
                nuevoPersonaje = new Arquero();
            } else if (numeroDeCompra == 3) {
                nuevoPersonaje = new Mago();
            } else if (numeroDeCompra == 4){
                nuevoPersonaje = new Gigante();
            } else if (numeroDeCompra == 5){
                nuevoPersonaje = new Dragón();
            }
            boolean seRealizoLaCompra = agregarAlEquipo(nuevoPersonaje,equipoJugador);
            
            if (seRealizoLaCompra) {
                System.out.println("---------------------------------------------------");
                System.out.println(nuevoPersonaje.mandarNombre() + " se unió a tu Equipo, se Realizo la Compra");
                System.out.println("---------------------------------------------------");
                oro -= 200;
            } else {
                if (copias == 0) {
                    System.out.println("-------------------------------------------------------");
                    System.out.println("No tienes Espacio en tu Equipo, No se realizo la Compra");
                    System.out.println("-------------------------------------------------------");
                } else {
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Ya tienes a este Personaje en tu Equipo, No se realizo la Compra");
                    System.out.println("----------------------------------------------------------------");
                    copias = 0;
                }
            }
        }
        return oro;
    }
    
    public int[] comprarMejoras(int oro, int numeroDeCompra, Personaje[] equipoJugador) {
        Scanner scanner =  new Scanner(System.in);
        int[] flujoDelPrograma = new int[2];
        flujoDelPrograma[0] = oro;flujoDelPrograma[1] = 0;
        Mejora nuevaMejora = new Mejora();       
        
        if (numeroDeCompra == 1) {
            nuevaMejora = new Vida();
        } else if (numeroDeCompra == 2) {
            nuevaMejora = new Daño();
        } else if (numeroDeCompra == 3) {
            nuevaMejora = new Movilidad();
        }
        boolean tieneOro = verificarOro(oro,nuevaMejora.getPrecio(),3);
        
        if (tieneOro) {      
            boolean paso = false;
            
            while (!paso) {
                System.out.println();
                System.out.println("Escriba el Número del Personaje que Desea Mejorar:");
                for (int i = 0; i < 5; i++) {
                    if (equipoJugador[i] == null) {
                        System.out.println("    " + (i + 1) + ". --------");
                    } else {
                        System.out.println("    " + (i + 1) + ". " + equipoJugador[i].mandarNombre());
                    }
                }
                System.out.println("    6. Regresar al Menú de las Mejoras");
                int opcion = Integer.parseInt(scanner.nextLine());
                System.out.println();

                if (opcion > 0 && opcion < 7) {
                    if (opcion != 6) {
                        if (equipoJugador[opcion - 1] != null) {              
                            if (numeroDeCompra == 1) {
                                equipoJugador[opcion - 1].aumentarOQuitarVida(nuevaMejora.getAumento());
                                paso = true;
                                oro -= nuevaMejora.getPrecio();
                            } else if (numeroDeCompra == 2) {
                                equipoJugador[opcion - 1].aumentarDaño(nuevaMejora.getAumento());
                                paso = true;
                                oro -= nuevaMejora.getPrecio();
                            } else {
                                equipoJugador[opcion - 1].setMovilidad(nuevaMejora.getAumento());
                                paso = true;
                                oro -= nuevaMejora.getPrecio();
                            }
                            flujoDelPrograma[0] = oro;
                        } else {
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("No hay Ningún Personaje en esta Casilla, No se Realizo la Mejora");
                            System.out.println("----------------------------------------------------------------");
                        }
                    } else {
                        flujoDelPrograma[0] = oro;
                        flujoDelPrograma[1] = 1;
                        paso = true;
                    }
                } else {
                    System.out.println("---------------------------------------");
                    System.out.println("Número Incorrecto, Intentelo Nuevamente");
                    System.out.println("---------------------------------------");
                }
            }
        }
        return flujoDelPrograma;
    }
    
    private boolean verificarOro(int oro, int oroMinimoRequerido, int indice) {
        boolean tieneOro = false;
        String contenido = "Mejoras";
        
        if (oro >= oroMinimoRequerido) {
            tieneOro = true;
        } else {
            if (indice == 1) {
                contenido = "Objetos";
            } else if (indice == 2) {
                contenido = "Personajes";
            }
            System.out.println("------------------------------------------------");
            System.out.println("No tienes Oro suficiente para Comprar " + contenido);
            System.out.println("------------------------------------------------");
        }
        return tieneOro;
    }
    
    private boolean agregarAlInventario(Objeto nuevoObjeto, Objeto[] objetosJugador) {
        int contador = 0;
        boolean compra = true;
        
        for (int i = 0; i < 10; i++) {
            if (objetosJugador[i] == null) {
                objetosJugador[i] = nuevoObjeto;
                contador++;
                break;
            }
        }
        if (contador == 0) {
            compra = false;
        }
        return compra;
    }
    
    private boolean agregarAlEquipo(Personaje nuevoPersonaje, Personaje[] equipoJugador) {
        int contador = 0;
        boolean compra = true;
        
        for (int i = 0; i < 5; i++) {          
            if (equipoJugador[i] == null) {
                for (int j = 0; j < 5; j++) {
                    String aComparar = "-------";
                    
                    if (equipoJugador[j] != null) {
                        aComparar = equipoJugador[j].mandarNombre();
                    }
                    if (aComparar.equals(nuevoPersonaje.mandarNombre())) {
                        copias++;
                        break;
                    }
                }
                if (copias == 0) {
                    equipoJugador[i] = nuevoPersonaje;
                    contador++;
                }
                break;
            }
        }
        if (contador == 0) {
            compra = false;
        }
        return compra;
    }
}
