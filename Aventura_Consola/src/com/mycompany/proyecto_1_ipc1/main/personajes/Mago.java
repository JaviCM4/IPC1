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
public class Mago extends Personaje {

    public Mago() {
        nombre = "Mago";
        letra = " M";
        daño = 60;
        vida = 100;
        porcentajeDeEfectividad = 0.75;
        movilidad = 2;
        puedeVolar = true;
    }

    @Override
    public void moverPersonaje(String[][] tablero, String casillaAnterior, int x, int y) {
        Scanner scanner = new Scanner(System.in);
        boolean paso = false;
        int filasDelTablero = x, columnasDelTablero = y;
        
        while (!paso) {
            int fila_1 = fila, columna_1 = columna, contador = 0, espaciosLibres = 0, distancia = 0;
            boolean hayObstaculos = true, seMovio = true;

            System.out.println("Escriba una letra a,d,w,s para moverse en esa Dirección:");
            String comando = scanner.next();
            System.out.println("Escriba el Número de Espacios que desea moverse entre el rango de 1 a " + movilidad);
            distancia = Integer.parseInt(scanner.next());
            System.out.println();
            
            if (comando.equals("a") || comando.equals("d") || comando.equals("w") || comando.equals("s")) {           
                if (distancia > 0 && distancia <= movilidad) {   
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
                    } else if (comando.equals("s")){
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

                                if (tablero[fila][columna - i].equals(" .") || tablero[fila][columna - i].equals(" L") || tablero[fila][columna - i].equals(" A") || tablero[fila][columna - i].equals(" a")) {
                                    espaciosLibres++;
                                    hayObstaculos = false;
                                } else {
                                    break;
                                }
                            }
                        } else if (comando.equals("d")) {
                            for (int i = 1; i <= distancia; i++) {

                                if (tablero[fila][columna + i].equals(" .") || tablero[fila][columna + i].equals(" L") || tablero[fila][columna + i].equals(" A") || tablero[fila][columna + i].equals(" a")) {
                                    espaciosLibres++;
                                    hayObstaculos = false;
                                } else {
                                    break;
                                }
                            }               
                        } else if (comando.equals("w")) {
                            for (int i = 1; i <= distancia; i++) {

                                if (tablero[fila - i][columna].equals(" .") || tablero[fila - i][columna].equals(" L") || tablero[fila - i][columna].equals(" A") || tablero[fila - i][columna].equals(" a")) {
                                    espaciosLibres++;
                                    hayObstaculos = false;
                                } else {
                                    break;
                                }
                            }                
                        } else if (comando.equals("s")) {
                            for (int i = 1; i <= distancia; i++) {

                                if (tablero[fila + i][columna].equals(" .") || tablero[fila + i][columna].equals(" L") || tablero[fila + i][columna].equals(" A") || tablero[fila + i][columna].equals(" a")) {
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
                            System.out.println(ANSI_GREEN + "    Información del Jugador:" + ANSI_RESET);
                            System.out.println(ANSI_GREEN + "------------------------------------------" + ANSI_RESET);
                            if (comando.equals("a")) {
                                casillaActual = tablero[fila][columna - distancia];
                                tablero[fila][columna - distancia] = letra;
                                columna -= distancia;
                                System.out.println("    * El Mago se Movio a la Izquierda");
                            } else if (comando.equals("d")) {
                                casillaActual = tablero[fila][columna + distancia];
                                tablero[fila][columna + distancia] = letra;
                                columna += distancia;
                                System.out.println("    * El Mago se Movio a la Derecha");
                            } else if (comando.equals("w")) {
                                casillaActual = tablero[fila - distancia][columna];
                                tablero[fila - distancia][columna] = letra;
                                fila -= distancia;
                                System.out.println("    * El Mago se Movio hacia Arriba");
                            } else if (comando.equals("s")) {
                                casillaActual = tablero[fila + distancia][columna];
                                tablero[fila + distancia][columna] = letra;
                                fila += distancia;
                                System.out.println("    * El Mago se Movio hacia Abajo");
                            }     
                            System.out.println(ANSI_GREEN + "------------------------------------------" + ANSI_RESET);
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
                    System.out.println("---------------------------------------");
                    System.out.println("Número Incorrecto, Intentelo Nuevamente");
                    System.out.println("---------------------------------------");
                    System.out.println();
                }
            } else {
                System.out.println("--------------------------------------");
                System.out.println("Letra Incorrecto, Intentelo Nuevamente");
                System.out.println("--------------------------------------");
                
                if (distancia <= 0 || distancia > movilidad) {
                    System.out.println();
                    System.out.println("---------------------------------------");
                    System.out.println("Número Incorrecto, Intentelo Nuevamente");
                    System.out.println("---------------------------------------");
                }
                System.out.println();
            }
        }
    }

    @Override
    public void atacarPersonaje(String[][] tablero, Arbol[] arboles, Personaje[] enemigos, int x, int y, int indice) {
        Scanner scanner = new Scanner(System.in);
        int filaAtacada = 100, columnaAtacada = 100, distancia = 0;
        boolean direccionCorrecta = false, encontroAlgo = false;
        String comando = null;
        
        while (!direccionCorrecta) {
            boolean paso = true;         
            distancia = 0;
            System.out.println("Escriba una letra a,d,w,s para atacar en esa Dirección:");
            comando = scanner.next();
            System.out.println();
            
            if ("a".equals(comando)) {
                distancia = columna - 1;
            } else if ("d".equals(comando)) {
                distancia = (y - 1) - columna;
            } else if ("w".equals(comando)) {
                distancia = fila - 1;
            } else if ("s".equals(comando)) {
                distancia = (x - 1) - fila;
            } else {
                System.out.println("--------------------------------------");
                System.out.println("Letra Incorrecta, Intentalo Nuevamente");
                System.out.println("--------------------------------------");
                System.out.println();
                paso = false;
            }
            
            if (paso) {
                if (distancia == 0) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Pared, selecciona otra Dirección para el Ataque");
                    System.out.println("-----------------------------------------------");
                    System.out.println();
                    direccionCorrecta = false;
                } else {
                    direccionCorrecta = true;
                }
            }
        }
    
        for (int i = 1; i <= distancia; i++) {       
            if ("a".equals(comando)) {
                if (" O".equals(tablero[fila][columna - i]) || " g".equals(tablero[fila][columna - i]) || " B".equals(tablero[fila][columna - i]) || " c".equals(tablero[fila][columna - i]) || " F".equals(tablero[fila][columna - i]) || " A".equals(tablero[fila][columna - i])) {
                    filaAtacada = fila;
                    columnaAtacada = columna - i;
                    break;
                }
            } else if ("d".equals(comando)) {
                if (" O".equals(tablero[fila][columna + i]) || " g".equals(tablero[fila][columna + i]) || " B".equals(tablero[fila][columna + i]) || " c".equals(tablero[fila][columna + i]) || " F".equals(tablero[fila][columna + i]) || " A".equals(tablero[fila][columna + i])) {
                    filaAtacada = fila;
                    columnaAtacada = columna + i;
                    break;
                }
            } else if ("w".equals(comando)) {
                if (" O".equals(tablero[fila - i][columna ]) || " g".equals(tablero[fila - i][columna]) || " B".equals(tablero[fila - i][columna]) || " c".equals(tablero[fila - i][columna]) || " F".equals(tablero[fila - i][columna]) || " A".equals(tablero[fila - i][columna])) {
                    filaAtacada = fila - i;
                    columnaAtacada = columna;
                    break;
                }
            } else {
                if (" O".equals(tablero[fila + i][columna ]) || " g".equals(tablero[fila + i][columna]) || " B".equals(tablero[fila + i][columna]) || " c".equals(tablero[fila + i][columna]) || " F".equals(tablero[fila + i][columna]) || " A".equals(tablero[fila + i][columna])) {
                    filaAtacada = fila + i;
                    columnaAtacada = columna;
                    break;
                }
            }
        }   
        double random = Math.random();
        
        if (random < porcentajeDeEfectividad) {
            System.out.println();
            System.out.println(ANSI_GREEN + "   Información del Jugador:" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "-----------------------------------------------------------" + ANSI_RESET);
            for (int i = 0; i < 5; i++) {
                if (arboles[i] != null) {
                    if (arboles[i].getFila() == filaAtacada && arboles[i].getColumna() == columnaAtacada) {
                        arboles[i].setVida(daño);

                        if (arboles[i].getVida() == 0) {
                            tablero[filaAtacada][columnaAtacada] = " .";
                            arboles[i] = null;
                            System.out.println("    * Mago destruyo un Árbol");
                        } else {
                            System.out.println("    * Mago hizo un daño de " + daño + " al Árbol pero sigue de Pie");
                        }
                        encontroAlgo = true;
                        break;
                    }
                }
            }
            for (int i = 0; i < 5; i++) {
                if (enemigos[i] != null) {
                    if (enemigos[i].getFila() == filaAtacada && enemigos[i].getColumna() == columnaAtacada) {
                        enemigos[i].aumentarOQuitarVida(-daño);

                        if (enemigos[i].obtenerVida() == 0) {
                            tablero[filaAtacada][columnaAtacada] = enemigos[i].getCasillaActual();
                            System.out.println("    * Mago dejo fuera de Combate a " + enemigos[i].mandarNombre()); 
                            enemigos[i] = null;
                        } else {
                            System.out.println("    * Mago atacó a " + enemigos[i].mandarNombre() + " dejandoló con " + enemigos[i].obtenerVida() + " de vida");
                        }
                        encontroAlgo = true;
                        break;
                    }
                }
            }
            if (!encontroAlgo) {
                System.out.println("    * Mago realizó su Ataque pero no habia Objetivos Cerca");
            }
            System.out.println(ANSI_GREEN + "-----------------------------------------------------------" + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + "   Información del Jugador:" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "-------------------------------------------------------" + ANSI_RESET);
            System.out.println("    * El Mago falló en el Ataque");
            System.out.println(ANSI_GREEN + "-------------------------------------------------------" + ANSI_RESET);
        }
    }
}
