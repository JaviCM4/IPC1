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
public class FlorCarnivora extends Personaje {
    
    public FlorCarnivora() {
        nombre = "Flor Carnivora";
        letra = " F";
        daño = 30;
        vida = 250;
        movilidad = 1;
        puedeVolar = false;
    }

    @Override
    public void moverPersonaje(String[][] tablero, String casillaAnterior, int x, int y) {
        // No se Mueve
    }

    @Override
    public void atacarPersonaje(String[][] tablero, Arbol[] arboles, Personaje[] enemigos, int x, int y, int indice) {
        int filaAtacada = 100, columnaAtacada = 100, distancia_y = 0, distancia_x = 0, direccionDelAtaque = 1;
        boolean letraCorrecta = false, encontroAlgo = false;
        String comando = null;
        
        while (!letraCorrecta) {
            boolean paso = false, encontroAlJugador = false;
            distancia_y = 0; distancia_x = 0;
            int distancia = 0;
            
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
                distancia_y = columna - 3;
                distancia_x = fila;
                
                while (!paso) {
                    if (distancia_y < 1) {
                        distancia_y++;
                    } else {
                        letraCorrecta = paso = true;
                    }
                }
            } else if ("d".equals(comando)) {
                distancia_y = columna + 3;
                distancia_x = fila;
                
                while (!paso) {
                    if (distancia_y > (y - 1)) {
                        distancia_y--;
                    } else {
                        letraCorrecta = paso = true;
                    }
                }
            } else if ("w".equals(comando)) {
                distancia_x = fila - 3;
                distancia_y = columna;
                
                while (!paso) {
                    if (distancia_x < 1) {
                        distancia_x++;
                    } else {
                        letraCorrecta = paso = true;
                    }
                }
            } else if ("s".equals(comando)) {
                distancia_x = fila + 3;
                distancia_y = columna;
                
                while (!paso) {
                    if (distancia_x > (x - 1)) {
                        distancia_x--;
                    } else {
                        letraCorrecta = paso = true;
                    }
                } 
            }
            if (distancia_y == columna && distancia_x == fila) {
                letraCorrecta = false;
            }
        }
    
        int espaciosDisponibles;
        
        if ("a".equals(comando)) {
            espaciosDisponibles = columna - distancia_y;
        } else if ("d".equals(comando)) {
            espaciosDisponibles = distancia_y - columna;
        } else if ("w".equals(comando)) {
            espaciosDisponibles = fila - distancia_x;
        } else {
            espaciosDisponibles = distancia_x - fila;
        }
        
        for (int i = 1; i <= espaciosDisponibles; i++) {       
            if ("a".equals(comando)) {
                if (" C".equals(tablero[fila][columna - i]) || " Q".equals(tablero[fila][columna - i]) || " M".equals(tablero[fila][columna - i]) || " G".equals(tablero[fila][columna - i]) || " D".equals(tablero[fila][columna - i]) || " A".equals(tablero[fila][columna - i])) {
                    filaAtacada = fila;
                    columnaAtacada = columna - i;
                }
            } else if ("d".equals(comando)) {
                if (" C".equals(tablero[fila][columna + i]) || " Q".equals(tablero[fila][columna + i]) || " M".equals(tablero[fila][columna + i]) || " G".equals(tablero[fila][columna + i]) || " D".equals(tablero[fila][columna + i]) || " A".equals(tablero[fila][columna + i])) {
                    filaAtacada = fila;
                    columnaAtacada = columna + i;
                }
            } else if ("w".equals(comando)) {
                if (" C".equals(tablero[fila - i][columna ]) || " Q".equals(tablero[fila - i][columna]) || " M".equals(tablero[fila - i][columna]) || " G".equals(tablero[fila - i][columna]) || " D".equals(tablero[fila - i][columna]) || " A".equals(tablero[fila - i][columna])) {
                    filaAtacada = fila - i;
                    columnaAtacada = columna;
                }
            } else {
                if (" C".equals(tablero[fila + i][columna ]) || " Q".equals(tablero[fila + i][columna]) || " M".equals(tablero[fila + i][columna]) || " G".equals(tablero[fila + i][columna]) || " D".equals(tablero[fila + i][columna]) || " A".equals(tablero[fila + i][columna])) {
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
                            System.out.println("    * Flor Carnivora destruyó un Árbol");
                        } else {
                            System.out.println("    * Flor Carnivora hizo un daño de " + daño + " al Árbol pero sigue de Pie");
                        }
                        encontroAlgo = true;
                        break;
                    }
                }
            }
            if (enemigos[indice] != null) {
                if (enemigos[indice].getFila() == filaAtacada && enemigos[indice].getColumna() == columnaAtacada) {
                    enemigos[indice].aumentarOQuitarVida(-daño);

                    if (i == 1) {
                        System.out.println("    * " + enemigos[indice].mandarNombre() + " fue deborado por la Flor Carnivora"); 
                        tablero[filaAtacada][columnaAtacada] = enemigos[indice].getCasillaActual();
                        enemigos[indice] = null;
                        encontroAlgo = true;
                        break;
                    } else {
                        if (enemigos[indice].obtenerVida() == 0) {
                            tablero[filaAtacada][columnaAtacada] = enemigos[indice].getCasillaActual();
                            System.out.println("    * Flor Carnivora dejo fuera de Combate a " + enemigos[indice].mandarNombre()); 
                            enemigos[indice] = null;
                        } else {
                            System.out.println("    * Flor Carnivora atacó a " + enemigos[indice].mandarNombre() + " dejandoló con " + enemigos[indice].obtenerVida() + " de vida");
                        }
                        encontroAlgo = true;
                        break;
                    }
                }
            }
        }   
        if (!encontroAlgo) {
            System.out.println("    * Flor Carnivora realizó su Ataque pero no habia Objetivos Cerca");
        }
    }
}
