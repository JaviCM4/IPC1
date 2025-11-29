/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_ipc1.main.personajes;

import com.mycompany.proyecto_1_ipc1.main.casillas.Arbol;
import java.util.Random;

/**
 *
 * @author DELL
 */
public class Bruja extends Personaje {

    public Bruja() {
        nombre = "Bruja";
        letra = " B";
        daño = 45;
        vida = 150;
        movilidad = 1;
        puedeVolar = true;
    }

    @Override
    public void moverPersonaje(String[][] tablero, String casillaAnterior, int x, int y) {
        boolean paso = false;
        int filasDelTablero = x, columnasDelTablero = y;
        
        while (!paso) {
            int fila_1 = fila, columna_1 = columna, contador = 0, espaciosLibres = 0;
            boolean hayObstaculos = true, seMovio = true;
            double direccion = Math.random();
            int rango = 2;
            String comando;

            if (direccion < 0.25) {
                comando = "a";
                rango = columna - 1;
            } else if (direccion >= 0.25 && direccion < 0.50) {
                comando = "d";
                rango = (columnasDelTablero - 1) - columna;
            } else if (direccion >= 0.50 && direccion < 0.75) {
                comando = "w";
                rango = fila - 1;
            } else {
                comando = "s";
                rango = (filasDelTablero - 1) - fila;
            }
            if (rango <= 0) {
                rango = 2;
            }
            
            Random rand = new Random();
            int distancia = (rand.nextInt(rango) + 1);
            
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

                    if (comando.equals("a")) {
                        casillaActual = tablero[fila][columna - distancia];
                        tablero[fila][columna - distancia] = letra;
                        columna -= distancia;
                        System.out.println("    * La Bruja se Movio a la Izquierda " + distancia + " espacios");
                    } else if (comando.equals("d")) {
                        casillaActual = tablero[fila][columna + distancia];
                        tablero[fila][columna + distancia] = letra;
                        columna += distancia;
                        System.out.println("    * La Bruja se Movio a la Derecha " + distancia + " espacios");
                    } else if (comando.equals("w")) {
                        casillaActual = tablero[fila - distancia][columna];
                        tablero[fila - distancia][columna] = letra;
                        fila -= distancia;
                        System.out.println("    * La Bruja se Movio hacia Arriba " + distancia + " espacios");
                    } else if (comando.equals("s")) {
                        casillaActual = tablero[fila + distancia][columna];
                        tablero[fila + distancia][columna] = letra;
                        fila += distancia;
                        System.out.println("    * La Bruja se Movio hacia Abajo " + distancia + " espacios");
                    }
                    paso = true;
                }
            }
        }
    }

    @Override
    public void atacarPersonaje(String[][] tablero, Arbol[] arboles, Personaje[] enemigos, int x, int y, int indice) {
        int filaAtacada = 100, columnaAtacada = 100, distancia = 0, direccionDelAtaque = 1;
        boolean letraCorrecta = false, encontroAlgo = false;
        String comando = null;

        while (!letraCorrecta) {
            boolean encontroAlJugador = false;
            distancia = 0;
            
            if (direccionDelAtaque == 1) {
                distancia = columna - 1; 
                for (int i = 1; i <= distancia; i++) {
                    if (" C".equals(tablero[fila][columna - i]) || " Q".equals(tablero[fila][columna - i]) || " M".equals(tablero[fila][columna - i]) || " G".equals(tablero[fila][columna - i]) || " D".equals(tablero[fila][columna - i])) {
                        comando = "a";
                        encontroAlJugador = true;
                        break;
                    }
                }
                if (!encontroAlJugador) {
                    direccionDelAtaque = 2;
                }
            }
            if (direccionDelAtaque == 2) {
                distancia = (y - 1) - columna;
                for (int i = 1; i <= distancia; i++) {
                    if (" C".equals(tablero[fila][columna + i]) || " Q".equals(tablero[fila][columna + i]) || " M".equals(tablero[fila][columna + i]) || " G".equals(tablero[fila][columna + i]) || " D".equals(tablero[fila][columna + i])) {
                        comando = "d";
                        encontroAlJugador = true;
                        break;
                    }
                }
                if (!encontroAlJugador) {
                    direccionDelAtaque = 3;
                }
            }
            if (direccionDelAtaque == 3) {
                distancia = fila - 1;
                for (int i = 1; i <= distancia; i++) {
                    if (" C".equals(tablero[fila - i][columna]) || " Q".equals(tablero[fila - i][columna]) || " M".equals(tablero[fila - i][columna]) || " G".equals(tablero[fila - i][columna]) || " D".equals(tablero[fila - i][columna])) {
                        comando = "w";
                        encontroAlJugador = true;
                        break;
                    }
                }
                if (!encontroAlJugador) {
                    direccionDelAtaque = 4;
                }
            }
            if (direccionDelAtaque == 4) {
                distancia = (x - 1) - fila;
                for (int i = 1; i <= distancia; i++) {
                    if (" C".equals(tablero[fila + i][columna]) || " Q".equals(tablero[fila + i][columna]) || " M".equals(tablero[fila + i][columna]) || " G".equals(tablero[fila + i][columna]) || " D".equals(tablero[fila + i][columna])) {
                        comando = "s";
                        encontroAlJugador = true;
                        break;
                    }
                }
                if (!encontroAlJugador) {
                    direccionDelAtaque = 5;
                }
            }
            if (direccionDelAtaque == 5) {
                double direccion = Math.random();
                
                if (direccion < 0.25) {
                    comando = "a";
                } else if (direccion >= 0.25 && direccion < 0.50) {
                    comando = "d";
                } else if (direccion >= 0.50 && direccion < 0.75) {
                    comando = "w";
                } else {
                    comando = "s";
                }
            }

            if ("a".equals(comando)) {
                distancia = columna - 1;
                letraCorrecta = true;
            } else if ("d".equals(comando)) {
                distancia = (y - 1) - columna;
                letraCorrecta = true;
            } else if ("w".equals(comando)) {
                distancia = fila - 1;
                letraCorrecta = true;
            } else if ("s".equals(comando)) {
                distancia = (x - 1) - fila;
                letraCorrecta = true;
            }

            if (distancia == 0) {
                letraCorrecta = false;
            }
        }

        for (int i = 1; i <= distancia; i++) {
            if ("a".equals(comando)) {
                if (" C".equals(tablero[fila][columna - i]) || " Q".equals(tablero[fila][columna - i]) || " M".equals(tablero[fila][columna - i]) || " G".equals(tablero[fila][columna - i]) || " D".equals(tablero[fila][columna - i]) || " A".equals(tablero[fila][columna - i])) {
                    filaAtacada = fila;
                    columnaAtacada = columna - i;
                    break;
                }
            } else if ("d".equals(comando)) {
                if (" C".equals(tablero[fila][columna + i]) || " Q".equals(tablero[fila][columna + i]) || " M".equals(tablero[fila][columna + i]) || " G".equals(tablero[fila][columna + i]) || " D".equals(tablero[fila][columna + i]) || " A".equals(tablero[fila][columna + i])) {
                    filaAtacada = fila;
                    columnaAtacada = columna + i;
                    break;
                }
            } else if ("w".equals(comando)) {
                if (" C".equals(tablero[fila - i][columna]) || " Q".equals(tablero[fila - i][columna]) || " M".equals(tablero[fila - i][columna]) || " G".equals(tablero[fila - i][columna]) || " D".equals(tablero[fila - i][columna]) || " A".equals(tablero[fila - i][columna])) {
                    filaAtacada = fila - i;
                    columnaAtacada = columna;
                    break;
                }
            } else {
                if (" C".equals(tablero[fila + i][columna]) || " Q".equals(tablero[fila + i][columna]) || " M".equals(tablero[fila + i][columna]) || " G".equals(tablero[fila + i][columna]) || " D".equals(tablero[fila + i][columna]) || " A".equals(tablero[fila + i][columna])) {
                    filaAtacada = fila + i;
                    columnaAtacada = columna;
                    break;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            if (arboles[i] != null) {
                if (arboles[i].getFila() == filaAtacada && arboles[i].getColumna() == columnaAtacada) {
                    arboles[i].setVida(daño);

                    if (arboles[i].getVida() == 0) {
                        tablero[filaAtacada][columnaAtacada] = " .";
                        arboles[i] = null;
                        System.out.println("    * Bruja destruyó un Árbol");
                    } else {
                        System.out.println("    * Bruja hizó un daño de " + daño + " al Árbol pero sigue de Pie");
                    }
                    encontroAlgo = true;
                    break;
                }
            }
        }
        if (enemigos[indice] != null) {
            if (enemigos[indice].getFila() == filaAtacada && enemigos[indice].getColumna() == columnaAtacada) {
                enemigos[indice].aumentarOQuitarVida(-daño);

                if (enemigos[indice].obtenerVida() == 0) {
                    tablero[filaAtacada][columnaAtacada] = enemigos[indice].getCasillaActual();
                    System.out.println("    * Bruja dejó fuera de Combate a " + enemigos[indice].mandarNombre());
                    enemigos[indice] = null;
                } else {
                    System.out.println("    * Bruja atacó a " + enemigos[indice].mandarNombre() + " dejandoló con " + enemigos[indice].obtenerVida() + " de vida");
                }
                encontroAlgo = true;
            }
        }
        if (!encontroAlgo) {
            System.out.println("    * Bruja realizó su Ataque pero no habia Objetivos Cerca");
        }
    }
}
