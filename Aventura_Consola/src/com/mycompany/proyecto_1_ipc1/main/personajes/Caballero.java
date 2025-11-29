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
public class Caballero extends Personaje {
    
    public Caballero() {
        nombre = "Caballero";
        letra = " C";
        daño = 45;
        vida = 300;
        movilidad = 1;
        porcentajeDeEfectividad = 0.75;
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
                        System.out.println(ANSI_GREEN + "-----------------------------------------------" + ANSI_RESET);
                        if (comando.equals("a")) {
                            casillaActual = tablero[fila][columna - distancia];
                            tablero[fila][columna - distancia] = letra;
                            columna -= distancia;
                            System.out.println("    * El Caballero se Movio a la Izquierda");
                        } else if (comando.equals("d")) {
                            casillaActual = tablero[fila][columna + distancia];
                            tablero[fila][columna + distancia] = letra;
                            columna += distancia;
                            System.out.println("    * El Caballero se Movio a la Derecha");
                        } else if (comando.equals("w")) {
                            casillaActual = tablero[fila - distancia][columna];
                            tablero[fila - distancia][columna] = letra;
                            fila -= distancia;
                            System.out.println("    * El Caballero se Movio hacia Arriba");
                        } else if (comando.equals("s")) {
                            casillaActual = tablero[fila + distancia][columna];
                            tablero[fila + distancia][columna] = letra;
                            fila += distancia;
                            System.out.println("    * El Caballero se Movio hacia Abajo");
                        }    
                        System.out.println(ANSI_GREEN + "-----------------------------------------------" + ANSI_RESET);
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
    
    public void atacarPersonaje(String[][] tablero, Arbol[] arboles, Personaje[] enemigos, int x, int y, int indice) {
        boolean uno = true, dos = true, tres = true, cuatro = true, cinco = true, seis = true, siete = true, ocho = true, encontroAlgo = false;
        int[][] enemigosDetectados = new int[8][2]; 
        enemigosDetectados[0][0] = enemigosDetectados[0][1] = 100; enemigosDetectados[1][0] = enemigosDetectados[1][1] = 100; enemigosDetectados[2][0] = enemigosDetectados[2][1] = 100; enemigosDetectados[3][0] = enemigosDetectados[3][1] = 100; enemigosDetectados[4][0] = enemigosDetectados[4][1] = 100; enemigosDetectados[5][0] = enemigosDetectados[5][1] = 100; enemigosDetectados[6][0] = enemigosDetectados[6][1] = 100; enemigosDetectados[7][0] = enemigosDetectados[7][1] = 100;
        
        if (fila == 1 && columna == 1) {
            uno = dos = tres = cuatro = seis = false;
        } else if (fila == 1 && columna != 1 && columna != y - 1) {
            uno = dos = tres = false;
        } else if (fila == 1 && columna == y - 1) {
            uno = dos = tres = cinco = ocho = false;
        } else if (columna == 1 && fila != 1 && fila != x - 1) {
            uno = cuatro = seis = false;
        } else if (columna == y - 1 && fila != 1 && fila != x - 1) {
            tres = cinco = ocho = false;
        } else if (fila == x - 1 && columna == 1) {
            uno = cuatro = seis = siete = ocho = false;
        } else if (fila == x - 1 && columna != 1 && columna != y - 1) {
            seis = siete = ocho = false;
        } else if (fila == x - 1 && columna == y - 1) {
            tres = cinco = seis = siete = ocho = false;
        }
        
        if (uno) {
            if (" O".equals(tablero[fila - 1][columna - 1]) || " g".equals(tablero[fila - 1][columna - 1]) || " B".equals(tablero[fila - 1][columna - 1]) || " c".equals(tablero[fila - 1][columna - 1]) || " F".equals(tablero[fila - 1][columna - 1]) || " A".equals(tablero[fila - 1][columna - 1])) {
                enemigosDetectados[0][0] = fila - 1;
                enemigosDetectados[0][1] = columna - 1;
            }
        }
        if (dos) {
            if (" O".equals(tablero[fila - 1][columna]) || " g".equals(tablero[fila - 1][columna]) || " B".equals(tablero[fila - 1][columna]) || " c".equals(tablero[fila - 1][columna]) || " F".equals(tablero[fila - 1][columna]) || " A".equals(tablero[fila - 1][columna])) {
                enemigosDetectados[1][0] = fila - 1;
                enemigosDetectados[1][1] = columna;
            }
        }
        if (tres) {
            if (" O".equals(tablero[fila - 1][columna + 1]) || " g".equals(tablero[fila - 1][columna + 1]) || " B".equals(tablero[fila - 1][columna + 1]) || " c".equals(tablero[fila - 1][columna + 1]) || " F".equals(tablero[fila - 1][columna + 1]) || " A".equals(tablero[fila - 1][columna + 1])) {
                enemigosDetectados[2][0] = fila - 1;
                enemigosDetectados[2][1] = columna + 1;
            }
        }
        if (cuatro) {
            if (" O".equals(tablero[fila][columna - 1]) || " g".equals(tablero[fila][columna - 1]) || " B".equals(tablero[fila][columna - 1]) || " c".equals(tablero[fila][columna - 1]) || " F".equals(tablero[fila][columna - 1]) || " A".equals(tablero[fila][columna - 1])) {
                enemigosDetectados[3][0] = fila;
                enemigosDetectados[3][1] = columna - 1;
            }
        }
        if (cinco) {
            if (" O".equals(tablero[fila][columna + 1]) || " g".equals(tablero[fila][columna + 1]) || " B".equals(tablero[fila][columna + 1]) || " c".equals(tablero[fila][columna + 1]) || " F".equals(tablero[fila][columna + 1]) || " A".equals(tablero[fila][columna + 1])) {
                enemigosDetectados[4][0] = fila;
                enemigosDetectados[4][1] = columna + 1;
            }
        }
        if (seis) {
            if (" O".equals(tablero[fila + 1][columna - 1]) || " g".equals(tablero[fila + 1][columna - 1]) || " B".equals(tablero[fila + 1][columna - 1]) || " c".equals(tablero[fila + 1][columna - 1]) || " F".equals(tablero[fila + 1][columna - 1]) ||" A".equals(tablero[fila + 1][columna - 1])) {
                enemigosDetectados[5][0] = fila + 1;
                enemigosDetectados[5][1] = columna - 1;
            }
        }
        if (siete) {
            if (" O".equals(tablero[fila + 1][columna]) || " g".equals(tablero[fila + 1][columna]) || " B".equals(tablero[fila + 1][columna]) || " c".equals(tablero[fila + 1][columna]) || " F".equals(tablero[fila + 1][columna]) || " A".equals(tablero[fila + 1][columna])) {
                enemigosDetectados[6][0] = fila + 1;
                enemigosDetectados[6][1] = columna;
            }
        }
        if (ocho) {
            if (" O".equals(tablero[fila + 1][columna + 1]) || " g".equals(tablero[fila + 1][columna + 1]) || " B".equals(tablero[fila + 1][columna + 1]) || " c".equals(tablero[fila + 1][columna + 1]) || " F".equals(tablero[fila + 1][columna + 1]) || " A".equals(tablero[fila + 1][columna + 1])) {
                enemigosDetectados[7][0] = fila + 1;
                enemigosDetectados[7][1] = columna + 1;
            }
        }
        double random = Math.random();
        
        if (random < porcentajeDeEfectividad) {
            System.out.println();
            System.out.println(ANSI_GREEN + "   Información del Jugador:" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "----------------------------------------------------------------" + ANSI_RESET);
            for (int i = 0; i < 5; i++) {
                if (arboles[i] != null) {
                    for (int j = 0; j < 8; j++) {
                        if (arboles[i].getFila() == enemigosDetectados[j][0] && arboles[i].getColumna() == enemigosDetectados[j][1]) {
                            arboles[i].setVida(daño);

                            if (arboles[i].getVida() == 0) {
                                tablero[arboles[i].getFila()][arboles[i].getColumna()] = " .";
                                arboles[i] = null;
                                System.out.println("    * Caballero destruyó un Árbol");
                            } else {
                                System.out.println("    * Caballero hizó un daño de " + daño + " al Árbol pero sigue de Pie");
                            }
                            encontroAlgo = true;
                            break;
                        }
                    }
                }
            }
            for (int i = 0; i < 5; i++) {
                if (enemigos[i] != null) {
                    for (int j = 0; j < 8; j++) {
                        if (enemigos[i].getFila() == enemigosDetectados[j][0] && enemigos[i].getColumna() == enemigosDetectados[j][1]) {
                            enemigos[i].aumentarOQuitarVida(-daño);

                            if (enemigos[i].obtenerVida() == 0) {
                                tablero[enemigos[i].getFila()][enemigos[i].getColumna()] = enemigos[i].getCasillaActual();
                                System.out.println("    * Caballero dejo fuera de Combate a " + enemigos[i].mandarNombre()); 
                                enemigos[i] = null;
                            } else {
                                System.out.println("    * Caballero atacó a " + enemigos[i].mandarNombre() + " dejandoló con " + enemigos[i].obtenerVida() + " de vida");
                            }
                            encontroAlgo = true;
                            break;
                        }
                    }
                }
            }
            if (!encontroAlgo) {
                System.out.println("    * Caballero realizó su Ataque pero no habia Objetivos Cerca");
            }
                System.out.println(ANSI_GREEN + "----------------------------------------------------------------" + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + "   Información del Jugador:" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "-------------------------------------------------------" + ANSI_RESET);
            System.out.println("    * El Caballero falló en el Ataque");
            System.out.println(ANSI_GREEN + "-------------------------------------------------------" + ANSI_RESET);
        }
    }
}
