/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_ipc1.main.motorDelJuego;

import com.mycompany.proyecto_1_ipc1.main.casillas.Arbol;
import java.util.Random;



/**
 *
 * @author DELL
 */
public class Tablero {
    
    private String[][] tablero;
    private String nombreDelTablero;
    private double generacionDelArbol;
    private double generacionDelAgua;
    private double generacionDeLaLava;
    private int filasDelTablero, columnasDelTablero;
    
    public Tablero(String[][] tablero, String nombreDelTablero, double generacionDelArbol, double generacionDelAgua, double generacionDeLaLava, int x, int y) {
        this.tablero = tablero;
        this.nombreDelTablero = nombreDelTablero;
        this.generacionDelArbol = generacionDelArbol;
        this.generacionDelAgua = generacionDelAgua;
        this.generacionDeLaLava = generacionDeLaLava;
        this.filasDelTablero = x;
        this.columnasDelTablero = y;
    }

    public void generarTablero(Arbol[] arboles) {
        arboles[0] = new Arbol(); arboles[1] = new Arbol(); arboles[2] = new Arbol(); arboles[3] = new Arbol(); arboles[4] = new Arbol();
        double arbol = generacionDelArbol / 100, agua = generacionDelAgua / 100, lava = generacionDeLaLava / 100;
        boolean ponerArboles = false, ponerAgua = false, ponerLava = false;
        
        for (int i = 0; i < 3; i++) {
            double random = Math.random();
            
            switch (i) {
                case 0 -> ponerArboles = random <= arbol;
                case 1 -> ponerAgua = random <= agua;
                default -> ponerLava = random <= lava;
            }
        }
        
        if (ponerAgua) {
            Random rand = new Random();
            int numeroDeRios = (rand.nextInt(2) + 1), contador = 0, casillas;
            double numeroDeCasillas = Math.random();
            
            if (numeroDeCasillas <= 0.50) {
                casillas = 3;
            } else {
                casillas = 4;
            }
            
            while (contador < numeroDeRios) {
                
                if (contador == 0) {
                    boolean puedeSalir = false;
                    
                    while (!puedeSalir) {
                        Random rand_1 = new Random();
                        int columna = rand_1.nextInt(columnasDelTablero);

                        if (tablero[1][columna].equals(" .")) {

                            for (int i = 1; i <= casillas; i++) {
                                tablero[i][columna] = " a";
                            }
                            puedeSalir = true;
                        }
                    }      
                    puedeSalir = false;
                    
                    while (!puedeSalir) {
                        Random rand_1 = new Random();
                        int fila = rand_1.nextInt(filasDelTablero);
                        
                        if (tablero[fila][columnasDelTablero - 1].equals(" .") && tablero[fila][columnasDelTablero - 2].equals(" .") && tablero[fila][columnasDelTablero - 3].equals(" .") && tablero[fila][columnasDelTablero - 4].equals(" .")) {
                            
                            for (int i = 1; i <= casillas; i++) {
                                tablero[fila][columnasDelTablero - i] = " a";
                            }
                            puedeSalir = true;
                        }
                    }
                    contador++;
                } else if (contador == 1) {
                    boolean puedeSalir = false;
                    
                    while (!puedeSalir) {
                        Random rand_1 = new Random();
                        int fila = rand_1.nextInt(filasDelTablero);

                        if (tablero[fila][1].equals(" .") && tablero[fila][2].equals(" .") && tablero[fila][3].equals(" .") && tablero[fila][4].equals(" .")) {

                            for (int i = 1; i <= casillas; i++) {
                                tablero[fila][i] = " a";
                            }
                            puedeSalir = true;
                        }
                    }
                    
                    puedeSalir = false;
                    
                    while (!puedeSalir) {
                        Random rand_1 = new Random();
                        int columna = rand_1.nextInt(columnasDelTablero);

                        if (tablero[filasDelTablero - 1][columna].equals(" .") || tablero[filasDelTablero - 1][columna].equals(" a")) {

                            for (int i = 1; i <= casillas; i++) {
                                tablero[filasDelTablero - i][columna] = " a";
                            }
                            puedeSalir = true;
                        }
                    }
                    contador++;
                }
            }
        }        
        
        if (ponerArboles) {
            Random rand = new Random();
            int numeroDeArboles = (rand.nextInt(5) + 1), contador = 0;
            
            while (contador < numeroDeArboles) { 
                Random rand_1 = new Random();
                int fila = rand_1.nextInt(filasDelTablero);
                Random rand_2 = new Random();
                int columna = rand_2.nextInt(columnasDelTablero);
                
                if (tablero[fila][columna].equals(" .")) {
                    tablero[fila][columna] = " A";
                    arboles[contador].setFila(fila);
                    arboles[contador].setColumna(columna);
                    contador++;
                } 
            }
        }

        if (ponerLava) {
            Random rand = new Random();
            int numeroDeLava = (rand.nextInt(4) + 1), contador = 0;
            
            while (contador < numeroDeLava) {
                Random rand_1 = new Random();
                int fila = rand_1.nextInt(filasDelTablero);
                Random rand_2 = new Random();
                int columna = rand_2.nextInt(columnasDelTablero);
                
                if (tablero[fila][columna].equals(" .")) {
                    tablero[fila][columna] = " L";
                    contador++;
                } 
            }
        }
    }
    
    public String getNombreDelTablero() {
        return nombreDelTablero;
    }

    public int getX() {
        return filasDelTablero;
    }
    
    public int getY() {
        return columnasDelTablero;
    }
    
    public String[][] getTablero() {
        return tablero;
    }
}
