/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_ipc1.main.personajes;

import com.mycompany.proyecto_1_ipc1.main.casillas.Arbol;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Arquero extends Personaje {
    
    public Arquero() {
        nombre =  "Arquero";
        letra = " Q";
        daño = 100;
        vida = 150;
        porcentajeDeEfectividad = 0.75;
        movilidad = 3;
        puedeVolar = false;
    }

    @Override
    public void moverPersonaje(String[][] tablero, String casillaAnterior, int x, int y) {
        Scanner scanner = new Scanner(System.in);
        boolean paso = false;
        int filasDelTablero = x, columnasDelTablero = y;
        
        while (!paso) {
            int fila_1 = fila, columna_1 = columna, contador = 0, espaciosLibres = 0, distancia = movilidad;
            boolean hayObstaculos = true, seMovio = true;
            
            System.out.println("Escriba una letra a,d,w,s para moverse en esa Dirección:");
            String comando = scanner.next();
            System.out.println();
            
            if (comando.equals("a") || comando.equals("d") || comando.equals("w") || comando.equals("s")) {   

                if (comando.equals("a")) {
                    columna_1 -= distancia;
                    
                    if (columna_1 <= 0) {
                        while (columna_1 <= 0) {
                            columna_1++;
                            contador++;
                        }
                    }
                } else if (comando.equals("d")) {
                    columna_1 += distancia;
                    
                    if (columna_1 >= columnasDelTablero) {
                        while (columna_1 >= columnasDelTablero) {
                            columna_1--;
                            contador++;
                        }
                    }
                } else if (comando.equals("w")) {
                    fila_1 -= distancia;
                    
                    if (fila_1 <= 0) {
                        while (fila_1 <= 0) {
                            fila_1++;
                            contador++;
                        }
                    }
                } else {
                    fila_1 += distancia;
                    
                    if (fila_1 >= filasDelTablero) {
                        while (fila_1 >= filasDelTablero) {
                            fila_1--;
                            contador++;
                        }
                    }
                }
                if (fila_1 == fila && columna_1 == columna) {
                    seMovio = false;
                }
                
                distancia -= contador;
                
                if (seMovio) {              
                    if (comando.equals("a")) {
                        for (int i = 1; i <= distancia; i++) {

                            if (tablero[fila][columna - i].equals(" .") || tablero[fila][columna - i].equals(" L")) {
                                espaciosLibres++;
                                hayObstaculos = false;
                            } else {
                                break;
                            }
                        }
                    } else if (comando.equals("d")) {
                        for (int i = 1; i <= distancia; i++) {

                            if (tablero[fila][columna + i].equals(" .") || tablero[fila][columna + i].equals(" L")) {
                                espaciosLibres++;
                                hayObstaculos = false;
                            } else {
                                break;
                            }
                        }               
                    } else if (comando.equals("w")) {
                        for (int i = 1; i <= distancia; i++) {

                            if (tablero[fila - i][columna].equals(" .") || tablero[fila - i][columna].equals(" L")) {
                                espaciosLibres++;
                                hayObstaculos = false;
                            } else {
                                break;
                            }
                        }                
                    } else if (comando.equals("s")) {
                        for (int i = 1; i <= distancia; i++) {

                            if (tablero[fila + i][columna].equals(" .") || tablero[fila + i][columna].equals(" L")) {
                                espaciosLibres++;
                                hayObstaculos = false;
                            } else {
                                break;
                            }
                        }
                    }

                    if (!hayObstaculos) {
                        tablero[fila][columna] = casillaAnterior;
                        
                        if (distancia != espaciosLibres) {
                            int espaciosARestar = distancia - espaciosLibres;
                            distancia -= espaciosARestar;
                        }
                        
                        System.out.println();
                        System.out.println(ANSI_GREEN + "   Información del Jugador:" + ANSI_RESET);
                        System.out.println(ANSI_GREEN + "---------------------------------------------" + ANSI_RESET);
                        if (comando.equals("a")) {
                            casillaActual = tablero[fila][columna - distancia];
                            tablero[fila][columna - distancia] = letra;
                            columna -= distancia;
                            System.out.println("    * El Arquero se Movio a la Izquierda");
                        } else if (comando.equals("d")) {
                            casillaActual = tablero[fila][columna + distancia];
                            tablero[fila][columna + distancia] = letra;
                            columna += distancia;
                            System.out.println("    * El Arquero se Movio a la Derecha");
                        } else if (comando.equals("w")) {
                            casillaActual = tablero[fila - distancia][columna];
                            tablero[fila - distancia][columna] = letra;
                            fila -= distancia;
                            System.out.println("    * El Arquero se Movio hacia Arriba");
                        } else if (comando.equals("s")) {
                            casillaActual = tablero[fila + distancia][columna];
                            tablero[fila + distancia][columna] = letra;
                            fila += distancia;
                            System.out.println("    * El Arquero se Movio hacia Abajo");
                        }     
                        System.out.println(ANSI_GREEN + "---------------------------------------------" + ANSI_RESET);
                        paso = true; 
                    } else {
                        System.out.println("----------------------------------------------");
                        System.out.println("No puedes pasar por Aquí, Vuelve a Seleccionar");
                        System.out.println("----------------------------------------------");
                        System.out.println();
                    }
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("Pared, selecciona otra Dirección");
                    System.out.println("--------------------------------");
                    System.out.println();
                }
            } else {
                System.out.println("--------------------------------------");
                System.out.println("Letra Incorrecto, Intentelo Nuevamente");
                System.out.println("--------------------------------------");
                System.out.println();
            }
        }
    }

    @Override
    public void atacarPersonaje(String[][] tablero, Arbol[] arboles, Personaje[] enemigos, int x, int y, int indice) {
        Scanner scanner = new Scanner(System.in);
        boolean direccionCorrecta = false;
        int distanciaFila = 0, distanciaColumna = 0;
        
        while(!direccionCorrecta) {
            distanciaFila = 0; distanciaColumna = 0;
            System.out.println("Escriba una letra a,d,w,s para atacar en esa Dirección:");
            String comando = scanner.next();
            System.out.println("Escriba el Número de Espacios a la que desea enviar el Ataque entre el Rango de 1 a 3");
            int distancia = Integer.parseInt(scanner.next());
            System.out.println();

            if ("a".equals(comando) || "d".equals(comando) || "w".equals(comando) || "s".equals(comando)) {
                if (distancia > 0 && distancia < 4) {
                    if ("a".equals(comando)) {
                        distanciaColumna = columna - distancia;
                        distanciaFila = fila;
                        
                        while (distanciaColumna <= 0) {
                            distanciaColumna++;
                        }
                    } else if ("d".equals(comando)) {
                        distanciaColumna = columna + distancia;
                        distanciaFila = fila;

                        while (distanciaColumna >= y) {
                            distanciaColumna--;
                        }
                    } else if ("w".equals(comando)) {
                        distanciaFila = fila - distancia;
                        distanciaColumna = columna;

                        while (distanciaFila <= 0) {
                            distanciaFila++;
                        }
                    } else if ("s".equals(comando)) {
                        distanciaFila = fila + distancia;
                        distanciaColumna = columna;

                        while (distanciaFila >= x) {
                            distanciaFila--;
                        }
                    }
                    direccionCorrecta = true;
                } else {
                    System.out.println("---------------------------------------");
                System.out.println("Número Incorrecto, Intentelo Nuevamente");
                System.out.println("---------------------------------------");
                System.out.println();
                }
            } else {
                System.out.println("--------------------------------------");
                System.out.println("Letra Incorrecta, Intentelo Nuevamente");
                System.out.println("--------------------------------------");
                System.out.println();
                
                if (distancia <= 0 || distancia > movilidad) {
                    System.out.println("---------------------------------------");
                    System.out.println("Número Incorrecto, Intentelo Nuevamente");
                    System.out.println("---------------------------------------");
                    System.out.println();
                }
            }
            
            if (distanciaColumna == columna && distanciaFila == fila) {
                System.out.println("-----------------------------------------------");
                System.out.println("Pared, selecciona otra Dirección para el Ataque");
                System.out.println("-----------------------------------------------");
                System.out.println();
                direccionCorrecta = false;
            }
        }
        
        double random = Math.random();
        
        if (random < porcentajeDeEfectividad) {
            System.out.println();
            System.out.println(ANSI_GREEN + "   Información del Jugador:" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "-----------------------------------------------------------------------" + ANSI_RESET);
            if (" O".equals(tablero[distanciaFila][distanciaColumna]) || " g".equals(tablero[distanciaFila][distanciaColumna]) || " B".equals(tablero[distanciaFila][distanciaColumna]) || " c".equals(tablero[distanciaFila][distanciaColumna]) || " F".equals(tablero[distanciaFila][distanciaColumna]) || " A".equals(tablero[distanciaFila][distanciaColumna])) {

                for (int i = 0; i < 5; i++) {
                    if (arboles[i] != null) {
                        if (arboles[i].getFila() == distanciaFila && arboles[i].getColumna() == distanciaColumna) {
                            arboles[i].setVida(daño);

                            if (arboles[i].getVida() == 0) {
                                tablero[distanciaFila][distanciaColumna] = " .";
                                arboles[i] = null;
                                System.out.println("    * Arquero destruyó un Árbol");
                                break;
                            } else {
                                System.out.println("    * Arquero hizo un daño de " + daño + " al Árbol pero sigue de Pie");
                                break;
                            }
                        }
                    }
                }
                for (int i = 0; i < 5; i++) {
                    if (enemigos[i] != null) {
                        if (enemigos[i].getFila() == distanciaFila && enemigos[i].getColumna() == distanciaColumna) {
                            enemigos[i].aumentarOQuitarVida(-daño);

                            if (enemigos[i].obtenerVida() == 0) {
                                tablero[distanciaFila][distanciaColumna] = enemigos[i].getCasillaActual();
                                System.out.println("    * Arquero dejo fuera de Combate a " + enemigos[i].mandarNombre()); 
                                enemigos[i] = null;
                            } else {
                                System.out.println("    * Arquero atacó a " + enemigos[i].mandarNombre() + " dejandoló con " + enemigos[i].obtenerVida() + " de vida");
                            }
                            break;
                        }
                    }
                }
            } else {
                System.out.println("    * Arquero realizó su Ataque pero no habia Objetivos en esa Casilla");
            }
            System.out.println(ANSI_GREEN + "-----------------------------------------------------------------------" + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + "   Información del Jugador:" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "-------------------------------------------------------" + ANSI_RESET);
            System.out.println("    * El Arquero falló en el Ataque");
            System.out.println(ANSI_GREEN + "-------------------------------------------------------" + ANSI_RESET);
        }
    }
    
}
