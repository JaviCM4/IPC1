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
public class Ogro extends Personaje {
 
    public Ogro() {
        nombre = "Ogro";
        letra = " O";
        daño = 50;
        vida = 300;
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
                        System.out.println("    * El Ogro se Movio a la Izquierda");
                    } else if (comando.equals("d")) {
                        casillaActual = tablero[fila][columna + distancia];
                        tablero[fila][columna + distancia] = letra;
                        columna += distancia;
                        System.out.println("    * El Ogro se Movio a la Derecha");
                    } else if (comando.equals("w")) {
                        casillaActual = tablero[fila - distancia][columna];
                        tablero[fila - distancia][columna] = letra;
                        fila -= distancia;
                        System.out.println("    * El Ogro se Movio hacia Arriba");
                    } else if (comando.equals("s")) {
                        casillaActual = tablero[fila + distancia][columna];
                        tablero[fila + distancia][columna] = letra;
                        fila += distancia;
                        System.out.println("    * El Ogro se Movio hacia Abajo");
                    }     
                    paso = true; 
                }
            }
        }
    }

    @Override
    public void atacarPersonaje(String[][] tablero, Arbol[] arboles, Personaje[] enemigos, int x, int y, int indice) {
        boolean uno = true, dos = true, tres = true, cuatro = true, cinco = true, seis = true, siete = true, ocho = true, encontroAlgo = false;
        int filaAtacada = 100, columnaAtacada = 100;
        
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
        
        boolean casillaSeleccionada = false;
        
        int numero = 1;

        if (numero == 1) {
            if (uno) {
                if (" C".equals(tablero[fila - 1][columna - 1]) || " Q".equals(tablero[fila - 1][columna - 1]) || " M".equals(tablero[fila - 1][columna - 1]) || " G".equals(tablero[fila - 1][columna - 1]) || " D".equals(tablero[fila - 1][columna - 1]) || " A".equals(tablero[fila - 1][columna - 1])) {
                    filaAtacada = fila - 1;
                    columnaAtacada = columna - 1;
                } else {
                    numero = 2;
                }
            } else {
                numero = 2;
            }
        }
        if (numero == 2) {
            if (dos) {
                if (" C".equals(tablero[fila - 1][columna]) || " Q".equals(tablero[fila - 1][columna]) || " M".equals(tablero[fila - 1][columna]) || " G".equals(tablero[fila - 1][columna]) || " D".equals(tablero[fila - 1][columna]) || " A".equals(tablero[fila - 1][columna])) {
                    filaAtacada = fila - 1;
                    columnaAtacada = columna;
                } else {
                    numero = 3;
                }
            } else {
                numero = 3;
            }
        }
        if (numero == 3) {
            if (tres) {
                if (" C".equals(tablero[fila - 1][columna + 1]) || " Q".equals(tablero[fila - 1][columna + 1]) || " M".equals(tablero[fila - 1][columna + 1]) || " G".equals(tablero[fila - 1][columna + 1]) || " D".equals(tablero[fila - 1][columna + 1]) || " A".equals(tablero[fila - 1][columna + 1])) {
                    filaAtacada = fila - 1;
                    columnaAtacada = columna + 1;
                } else {
                    numero = 4;
                }
            } else {
                numero = 4;
            }
        }
        if (numero == 4) {
            if (cuatro) {
                if (" C".equals(tablero[fila][columna - 1]) || " Q".equals(tablero[fila][columna - 1]) || " M".equals(tablero[fila][columna - 1]) || " G".equals(tablero[fila][columna - 1]) || " D".equals(tablero[fila][columna - 1]) || " A".equals(tablero[fila][columna - 1])) {
                    filaAtacada = fila;
                    columnaAtacada = columna - 1;
                } else {
                    numero = 5;
                }
            } else {
                numero = 5;
            }
        }
        if (numero == 5) {
            if (cinco) {
                if (" C".equals(tablero[fila][columna + 1]) || " Q".equals(tablero[fila][columna + 1]) || " M".equals(tablero[fila][columna + 1]) || " G".equals(tablero[fila][columna + 1]) || " D".equals(tablero[fila][columna + 1]) || " A".equals(tablero[fila][columna + 1])) {
                    filaAtacada = fila;
                    columnaAtacada = columna + 1;
                } else {
                    numero = 6;
                }
            } else {
                numero = 6;
            }
        }
        if (numero == 6) {
            if (seis) {
                if (" C".equals(tablero[fila + 1][columna - 1]) || " Q".equals(tablero[fila + 1][columna - 1]) || " M".equals(tablero[fila + 1][columna - 1]) || " G".equals(tablero[fila + 1][columna - 1]) || " D".equals(tablero[fila + 1][columna - 1]) ||" A".equals(tablero[fila + 1][columna - 1])) {
                    filaAtacada = fila + 1;
                    columnaAtacada = columna - 1;
                } else {
                    numero = 7;
                }
            } else {
                numero = 7;
            }
        }
        if (numero == 7) {
            if (siete) {
                if (" C".equals(tablero[fila + 1][columna]) || " Q".equals(tablero[fila + 1][columna]) || " M".equals(tablero[fila + 1][columna]) || " G".equals(tablero[fila + 1][columna]) || " D".equals(tablero[fila + 1][columna]) || " A".equals(tablero[fila + 1][columna])) {
                    filaAtacada = fila + 1;
                    columnaAtacada = columna;
                } else {
                    numero = 8;
                }
            } else {
                numero = 8;
            }
        }
        if (numero == 8) {
            if (ocho) {
                if (" C".equals(tablero[fila + 1][columna + 1]) || " Q".equals(tablero[fila + 1][columna + 1]) || " M".equals(tablero[fila + 1][columna + 1]) || " G".equals(tablero[fila + 1][columna + 1]) || " D".equals(tablero[fila + 1][columna + 1]) || " A".equals(tablero[fila + 1][columna + 1])) {
                    filaAtacada = fila + 1;
                    columnaAtacada = columna + 1;
                } else {
                    numero = 9;
                }
            } else {
                numero = 9;
            }
        }
        if (numero == 9) {   
            while (!casillaSeleccionada) {
                double random = Math.random();
                
                if (random < 0.125) {
                    if (uno) {
                        if (" C".equals(tablero[fila - 1][columna - 1]) || " Q".equals(tablero[fila - 1][columna - 1]) || " M".equals(tablero[fila - 1][columna - 1]) || " G".equals(tablero[fila - 1][columna - 1]) || " D".equals(tablero[fila - 1][columna - 1]) || " A".equals(tablero[fila - 1][columna - 1])) {
                            filaAtacada = fila - 1;
                            columnaAtacada = columna - 1;
                        }
                        casillaSeleccionada = true;
                    }
                } else if (random >= 0.125 && random < 0.25) {
                    if (dos) {
                        if (" C".equals(tablero[fila - 1][columna]) || " Q".equals(tablero[fila - 1][columna]) || " M".equals(tablero[fila - 1][columna]) || " G".equals(tablero[fila - 1][columna]) || " D".equals(tablero[fila - 1][columna]) || " A".equals(tablero[fila - 1][columna])) {
                            filaAtacada = fila - 1;
                            columnaAtacada = columna;
                        }
                        casillaSeleccionada = true;
                    }
                } else if (random >= 0.25 && random < 0.375) {
                    if (tres) {
                        if (" C".equals(tablero[fila - 1][columna + 1]) || " Q".equals(tablero[fila - 1][columna + 1]) || " M".equals(tablero[fila - 1][columna + 1]) || " G".equals(tablero[fila - 1][columna + 1]) || " D".equals(tablero[fila - 1][columna + 1]) || " A".equals(tablero[fila - 1][columna + 1])) {
                            filaAtacada = fila - 1;
                            columnaAtacada = columna + 1;
                        }
                        casillaSeleccionada = true;
                    }
                } else if (random >= 0.375 && random < 0.50) {
                    if (cuatro) {
                        if (" C".equals(tablero[fila][columna - 1]) || " Q".equals(tablero[fila][columna - 1]) || " M".equals(tablero[fila][columna - 1]) || " G".equals(tablero[fila][columna - 1]) || " D".equals(tablero[fila][columna - 1]) || " A".equals(tablero[fila][columna - 1])) {
                            filaAtacada = fila;
                            columnaAtacada = columna - 1;
                        }
                        casillaSeleccionada = true;
                    }
                } else if (random >= 0.50 && random < 0.625) {
                    if (cinco) {
                        if (" C".equals(tablero[fila][columna + 1]) || " Q".equals(tablero[fila][columna + 1]) || " M".equals(tablero[fila][columna + 1]) || " G".equals(tablero[fila][columna + 1]) || " D".equals(tablero[fila][columna + 1]) || " A".equals(tablero[fila][columna + 1])) {
                            filaAtacada = fila;
                            columnaAtacada = columna + 1;
                        }
                        casillaSeleccionada = true;
                    }
                } else if (random >= 0.625 && random < 0.75) {
                    if (seis) {
                        if (" C".equals(tablero[fila + 1][columna - 1]) || " Q".equals(tablero[fila + 1][columna - 1]) || " M".equals(tablero[fila + 1][columna - 1]) || " G".equals(tablero[fila + 1][columna - 1]) || " D".equals(tablero[fila + 1][columna - 1]) ||" A".equals(tablero[fila + 1][columna - 1])) {
                            filaAtacada = fila + 1;
                            columnaAtacada = columna - 1;
                        }
                        casillaSeleccionada = true;
                    }
                } else if (random >= 0.75 && random < 0.875) {
                    if (siete) {
                        if (" C".equals(tablero[fila + 1][columna]) || " Q".equals(tablero[fila + 1][columna]) || " M".equals(tablero[fila + 1][columna]) || " G".equals(tablero[fila + 1][columna]) || " D".equals(tablero[fila + 1][columna]) || " A".equals(tablero[fila + 1][columna])) {
                            filaAtacada = fila + 1;
                            columnaAtacada = columna;
                        }
                        casillaSeleccionada = true;
                    }
                } else if (random >= 0.875 && random < 1) { 
                    if (ocho) {
                        if (" C".equals(tablero[fila + 1][columna + 1]) || " Q".equals(tablero[fila + 1][columna + 1]) || " M".equals(tablero[fila + 1][columna + 1]) || " G".equals(tablero[fila + 1][columna + 1]) || " D".equals(tablero[fila + 1][columna + 1]) || " A".equals(tablero[fila + 1][columna + 1])) {
                            filaAtacada = fila + 1;
                            columnaAtacada = columna + 1;
                        }
                        casillaSeleccionada = true;
                    }
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            if (arboles[i] != null) {
                if (arboles[i].getFila() == filaAtacada && arboles[i].getColumna() == columnaAtacada) {
                    arboles[i].setVida(daño);

                    if (arboles[i].getVida() == 0) {
                        tablero[arboles[i].getFila()][arboles[i].getColumna()] = " .";
                        arboles[i] = null;
                        System.out.println("    * Ogro destruyó un Árbol");
                    } else {
                        System.out.println("    * Ogro hizo un daño de " + daño + " al Arbol pero sigue de Pie");
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
                    System.out.println("    * Ogro dejo fuera de Combate a " + enemigos[indice].mandarNombre()); 
                    enemigos[indice] = null;
                } else {
                    System.out.println("    * Ogro atacó a " + enemigos[indice].mandarNombre() + " dejandoló con " + enemigos[indice].obtenerVida() + " de vida");
                }
                encontroAlgo = true;
            }
        }
        if (!encontroAlgo) {
            System.out.println("    * Ogro realizó su Ataque pero no habia Objetivos Cerca");
        }
    }
}
