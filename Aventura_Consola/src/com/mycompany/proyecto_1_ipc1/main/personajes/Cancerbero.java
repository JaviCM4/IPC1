/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_ipc1.main.personajes;

import com.mycompany.proyecto_1_ipc1.main.casillas.Arbol;

/**
 *
 * @author DELL
 */
public class Cancerbero extends Personaje {
    
    public Cancerbero() {
        nombre = "Cancerbero";
        letra = " c";
        daño = 45;
        vida = 400;
        movilidad = 1;
        puedeVolar = false;
    }

    @Override
    public void moverPersonaje(String[][] tablero, String casillaAnterior, int x, int y) {
        boolean paso = false;
        int filasDelTablero = x, columnasDelTablero = y;
        
        while (!paso) {
            int fila_1 = fila, columna_1 = columna, contador = 0, espaciosLibres = 0, distancia = movilidad;
            boolean hayObstaculos = true, seMovio = true;
            double direccion = Math.random();
            String comando;
            
            if (direccion < 0.25) {
                comando = "a";
            } else if (direccion >= 0.25 && direccion < 0.50) {
                comando = "d";
            } else if (direccion >= 0.50 && direccion < 0.75) {
                comando = "w";
            } else {
                comando = "s";
            }
            
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
                    
                    if (comando.equals("a")) {
                        casillaActual = tablero[fila][columna - distancia];
                        tablero[fila][columna - distancia] = letra;
                        columna -= distancia;
                        System.out.println("    * El Cancerbero se Movio a la Izquierda");
                    } else if (comando.equals("d")) {
                        casillaActual = tablero[fila][columna + distancia];
                        tablero[fila][columna + distancia] = letra;
                        columna += distancia;
                        System.out.println("    * El Cancerbero se Movio a la Derecha");
                    } else if (comando.equals("w")) {
                        casillaActual = tablero[fila - distancia][columna];
                        tablero[fila - distancia][columna] = letra;
                        fila -= distancia;
                        System.out.println("    * El Cancerbero se Movio hacia Arriba");
                    } else if (comando.equals("s")) {
                        casillaActual = tablero[fila + distancia][columna];
                        tablero[fila + distancia][columna] = letra;
                        fila += distancia;
                        System.out.println("    * El Cancerbero se Movio hacia Abajo");
                    }    
                    paso = true;  
                }
            }
        }
    }

    @Override
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
            if (" C".equals(tablero[fila - 1][columna - 1]) || " Q".equals(tablero[fila - 1][columna - 1]) || " M".equals(tablero[fila - 1][columna - 1]) || " G".equals(tablero[fila - 1][columna - 1]) || " D".equals(tablero[fila - 1][columna - 1]) || " A".equals(tablero[fila - 1][columna - 1])) {
                enemigosDetectados[0][0] = fila - 1;
                enemigosDetectados[0][1] = columna - 1;
            }
        }
        if (dos) {
            if (" C".equals(tablero[fila - 1][columna]) || " Q".equals(tablero[fila - 1][columna]) || " M".equals(tablero[fila - 1][columna]) || " G".equals(tablero[fila - 1][columna]) || " D".equals(tablero[fila - 1][columna]) || " A".equals(tablero[fila - 1][columna])) {
                enemigosDetectados[1][0] = fila - 1;
                enemigosDetectados[1][1] = columna;
            }
        }
        if (tres) {
            if (" C".equals(tablero[fila - 1][columna + 1]) || " Q".equals(tablero[fila - 1][columna + 1]) || " M".equals(tablero[fila - 1][columna + 1]) || " G".equals(tablero[fila - 1][columna + 1]) || " D".equals(tablero[fila - 1][columna + 1]) || " A".equals(tablero[fila - 1][columna + 1])) {
                enemigosDetectados[2][0] = fila - 1;
                enemigosDetectados[2][1] = columna + 1;
            }
        }
        if (cuatro) {
            if (" C".equals(tablero[fila][columna - 1]) || " Q".equals(tablero[fila][columna - 1]) || " M".equals(tablero[fila][columna - 1]) || " G".equals(tablero[fila][columna - 1]) || " D".equals(tablero[fila][columna - 1]) || " A".equals(tablero[fila][columna - 1])) {
                enemigosDetectados[3][0] = fila;
                enemigosDetectados[3][1] = columna - 1;
            }
        }
        if (cinco) {
            if (" C".equals(tablero[fila][columna + 1]) || " Q".equals(tablero[fila][columna + 1]) || " M".equals(tablero[fila][columna + 1]) || " G".equals(tablero[fila][columna + 1]) || " D".equals(tablero[fila][columna + 1]) || " A".equals(tablero[fila][columna + 1])) {
                enemigosDetectados[4][0] = fila;
                enemigosDetectados[4][1] = columna + 1;
            }
        }
        if (seis) {
            if (" C".equals(tablero[fila + 1][columna - 1]) || " Q".equals(tablero[fila + 1][columna - 1]) || " M".equals(tablero[fila + 1][columna - 1]) || " G".equals(tablero[fila + 1][columna - 1]) || " D".equals(tablero[fila + 1][columna - 1]) ||" A".equals(tablero[fila + 1][columna - 1])) {
                enemigosDetectados[5][0] = fila + 1;
                enemigosDetectados[5][1] = columna - 1;
            }
        }
        if (siete) {
            if (" C".equals(tablero[fila + 1][columna]) || " Q".equals(tablero[fila + 1][columna]) || " M".equals(tablero[fila + 1][columna]) || " G".equals(tablero[fila + 1][columna]) || " D".equals(tablero[fila + 1][columna]) || " A".equals(tablero[fila + 1][columna])) {
                enemigosDetectados[6][0] = fila + 1;
                enemigosDetectados[6][1] = columna;
            }
        }
        if (ocho) {
            if (" C".equals(tablero[fila + 1][columna + 1]) || " Q".equals(tablero[fila + 1][columna + 1]) || " M".equals(tablero[fila + 1][columna + 1]) || " G".equals(tablero[fila + 1][columna + 1]) || " D".equals(tablero[fila + 1][columna + 1]) || " A".equals(tablero[fila + 1][columna + 1])) {
                enemigosDetectados[7][0] = fila + 1;
                enemigosDetectados[7][1] = columna + 1;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (arboles[i] != null) {
                for (int j = 0; j < 8; j++) {
                    if (arboles[i].getFila() == enemigosDetectados[j][0] && arboles[i].getColumna() == enemigosDetectados[j][1]) {
                        arboles[i].setVida(daño);

                        if (arboles[i].getVida() == 0) {
                            tablero[arboles[i].getFila()][arboles[i].getColumna()] = " .";
                            arboles[i] = null;
                            System.out.println("    * Cancerbero destruyó un Árbol");
                        } else {
                            System.out.println("    * Cancerbero hizo un daño de " + daño + " al Árbol pero sigue de Pie");
                        }
                        encontroAlgo = true;
                        break;
                    }
                }
            }
        }
        if (enemigos[indice] != null) {
            for (int j = 0; j < 8; j++) {
                if (enemigos[indice].getFila() == enemigosDetectados[j][0] && enemigos[indice].getColumna() == enemigosDetectados[j][1]) {
                    enemigos[indice].aumentarOQuitarVida(-daño);

                    if (enemigos[indice].obtenerVida() == 0) {
                        tablero[enemigos[indice].getFila()][enemigos[indice].getColumna()] = enemigos[indice].getCasillaActual();
                        System.out.println("    * Cancerbero dejo fuera de Combate a " + enemigos[indice].mandarNombre()); 
                        enemigos[indice] = null;
                    } else {
                        System.out.println("    * Cancerbero atacó a " + enemigos[indice].mandarNombre() + " dejandoló con " + enemigos[indice].obtenerVida() + " de vida");
                    }
                    encontroAlgo = true;
                    break;
                }
            }
        }
        if (!encontroAlgo) {
            System.out.println("    * Cancerbero realizó su Ataque pero no habia Objetivos Cerca");
        }
    }
}
