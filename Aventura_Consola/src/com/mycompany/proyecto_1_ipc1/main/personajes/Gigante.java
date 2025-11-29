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
public class Gigante extends Personaje {
    
    public Gigante() {
        nombre = "Gigante";
        letra = " G";
        daño = 56;
        vida = 350;
        porcentajeDeEfectividad = 0.75;
        movilidad = 1;
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
                            System.out.println("    * El Gigante se Movio a la Izquierda");
                        } else if (comando.equals("d")) {
                            casillaActual = tablero[fila][columna + distancia];
                            tablero[fila][columna + distancia] = letra;
                            columna += distancia;
                            System.out.println("    * El Gigante se Movio a la Derecha");
                        } else if (comando.equals("w")) {
                            casillaActual = tablero[fila - distancia][columna];
                            tablero[fila - distancia][columna] = letra;
                            fila -= distancia;
                            System.out.println("    * El Gigante se Movio hacia Arriba");
                        } else if (comando.equals("s")) {
                            casillaActual = tablero[fila + distancia][columna];
                            tablero[fila + distancia][columna] = letra;                                                                                                                                              
                            fila += distancia;
                            System.out.println("    * El Gigante se Movio hacia Abajo");
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
        int distanciaColumna = 0, distanciaFila = 0;
        boolean direccionCorrecta = false, encontroAlgo = false;
        String comando = null;
        
        while (!direccionCorrecta) {
            boolean paso = true;  
            distanciaFila = 0; distanciaColumna = 0;
            System.out.println("Escriba una letra a,d,w,s para atacar en esa Dirección:");
            comando = scanner.next();
            System.out.println();
            
            if ("a".equals(comando)) {
                distanciaColumna = columna - 3;
                distanciaFila = fila;
                
                while (distanciaColumna <= 0) {
                    distanciaColumna++;
                }
            } else if ("d".equals(comando)) {
                distanciaColumna = columna + 3;
                distanciaFila = fila;
                
                while (distanciaColumna >= y) {
                    distanciaColumna--;
                }
            } else if ("w".equals(comando)) {
                distanciaFila = fila - 3;
                distanciaColumna = columna;
                
                while (distanciaFila <= 0) {
                    distanciaFila++;
                }
            } else if ("s".equals(comando)) {
                distanciaFila = fila + 3;
                distanciaColumna = columna;
                
                while (distanciaFila >= x) {
                    distanciaFila--;
                }
            } else {
                System.out.println("--------------------------------------");
                System.out.println("Letra Incorrecta, Intentalo Nuevamente");
                System.out.println("--------------------------------------");
                System.out.println();
                paso = false;
            }
            
            if (paso) {
                if (distanciaColumna == columna && distanciaFila == fila) {
                    System.out.println("-------------------------------------------------------");
                    System.out.println("No puede atacar en esta Direccion, Intentalo Nuevamente");
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                    direccionCorrecta = false;
                } else {
                    direccionCorrecta = true;
                }
            }
        }
        
        int espaciosDisponibles;
        
        if ("a".equals(comando)) {
            espaciosDisponibles = columna - distanciaColumna;
        } else if ("d".equals(comando)) {
            espaciosDisponibles = distanciaColumna - columna;
        } else if ("w".equals(comando)) {
            espaciosDisponibles = fila - distanciaFila;
        } else {
            espaciosDisponibles = distanciaFila - fila;
        }
        double random = Math.random();
        
        if (random < porcentajeDeEfectividad) {
            System.out.println();
            System.out.println(ANSI_GREEN + "   Información del Jugador:" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "--------------------------------------------------------------" + ANSI_RESET);
            for (int i = 1; i <= espaciosDisponibles; i++) {
                int filaAtacada = 100;
                int columnaAtacada = 100;

                if ("a".equals(comando)) {
                    if (" O".equals(tablero[fila][columna - i]) || " g".equals(tablero[fila][columna - i]) || " B".equals(tablero[fila][columna - i]) || " c".equals(tablero[fila][columna - i]) || " F".equals(tablero[fila][columna - i]) || " A".equals(tablero[fila][columna - i])) {
                        filaAtacada = fila;
                        columnaAtacada = columna - i;
                    }
                } else if ("d".equals(comando)) {
                    if (" O".equals(tablero[fila][columna + i]) || " g".equals(tablero[fila][columna + i]) || " B".equals(tablero[fila][columna + i]) || " c".equals(tablero[fila][columna + i]) || " F".equals(tablero[fila][columna + i]) || " A".equals(tablero[fila][columna + i])) {
                        filaAtacada = fila;
                        columnaAtacada = columna + i;
                    }
                } else if ("w".equals(comando)) {
                    if (" O".equals(tablero[fila - i][columna ]) || " g".equals(tablero[fila - i][columna]) || " B".equals(tablero[fila - i][columna]) || " c".equals(tablero[fila - i][columna]) || " F".equals(tablero[fila - i][columna]) || " A".equals(tablero[fila - i][columna])) {
                        filaAtacada = fila - i;
                        columnaAtacada = columna;
                    }
                } else {
                    if (" O".equals(tablero[fila + i][columna ]) || " g".equals(tablero[fila + i][columna]) || " B".equals(tablero[fila + i][columna]) || " c".equals(tablero[fila + i][columna]) || " F".equals(tablero[fila + i][columna]) || " A".equals(tablero[fila + i][columna])) {
                        filaAtacada = fila + i;
                        columnaAtacada = columna;
                    }
                }

                for (int j = 0; j < 5; j++) {
                    if (arboles[j] != null) {
                        if (arboles[j].getFila() == filaAtacada && arboles[j].getColumna() == columnaAtacada) {
                            arboles[j].setVida(daño);

                            if (arboles[j].getVida() == 0) {
                                tablero[filaAtacada][columnaAtacada] = " .";
                                arboles[j] = null;
                                System.out.println("    * Gigante destruyó un Árbol");
                            } else {
                                System.out.println("    * Gigante hizó un daño de " + daño + " al Árbol pero sigue de Pie");
                            }
                            encontroAlgo = true;
                            break;
                        }
                    }
                }
                for (int j = 0; j < 5; j++) {
                    if (enemigos[j] != null) {
                        if (enemigos[j].getFila() == filaAtacada && enemigos[j].getColumna() == columnaAtacada) {
                            enemigos[j].aumentarOQuitarVida(-daño);

                            if (enemigos[j].obtenerVida() == 0) {
                                tablero[filaAtacada][columnaAtacada] = enemigos[j].getCasillaActual();
                                System.out.println("    * Gigante dejo fuera de Combate a " + enemigos[j].mandarNombre()); 
                                enemigos[j] = null;
                            } else {
                                System.out.println("    * Gigante atacó a " + enemigos[j].mandarNombre() + " dejandoló con " + enemigos[j].obtenerVida() + " de vida");
                            }
                            encontroAlgo = true;
                            break;
                        }
                    }
                }
            }
            if (!encontroAlgo) {
                System.out.println("    * Gigante realizó su Ataque pero no habia Objetivos Cerca");
            }
            System.out.println(ANSI_GREEN + "--------------------------------------------------------------" + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + "   Información del Jugador:" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "-------------------------------------------------------------" + ANSI_RESET);
            System.out.println("    * El Gigante falló en el Ataque");
            System.out.println(ANSI_GREEN + "-------------------------------------------------------------" + ANSI_RESET);
        }
    }
}
