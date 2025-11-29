
package com.mycompany.main.jugador;

public class Jugador {
    
    private int fila, columna, oroRecolectado, oroNecesarioparaGanar;
    private char[][] mapaUtilizado;
    
    public Jugador(char[][] mapaUtilizado, int fila, int columna, int oroNecesarioparaGanar) {
        this.mapaUtilizado = mapaUtilizado;
        this.fila = fila;
        this.columna = columna;
        this.oroNecesarioparaGanar = oroNecesarioparaGanar;
        oroRecolectado = 0;
    }
    
    public int analizarMovilidadJugador(int fila, int columna) {
        int permiso = 0;
        
        switch (mapaUtilizado[fila][columna]) {
            case '#' -> permiso = 0;
            case 'O', 'G' -> permiso = 1;
            case 'S' -> permiso = 2;
            case 'B' -> permiso = 3;
            default -> {
            }
        }
        return permiso;
    }
    
    public void mirarMapaJugador() {
        System.out.println();
        System.out.print(mapaUtilizado[fila - 2][columna - 2]); System.out.print(mapaUtilizado[fila - 2][columna - 1]); System.out.print(mapaUtilizado[fila - 2][columna]); System.out.print(mapaUtilizado[fila - 2][columna + 1]); System.out.println(mapaUtilizado[fila - 2][columna + 2]);
        System.out.print(mapaUtilizado[fila - 1][columna - 2]); System.out.print(mapaUtilizado[fila - 1][columna - 1]); System.out.print(mapaUtilizado[fila - 1][columna]); System.out.print(mapaUtilizado[fila - 1][columna + 1]); System.out.println(mapaUtilizado[fila - 1][columna + 2]);
        System.out.print(mapaUtilizado[fila][columna - 2]);     System.out.print(mapaUtilizado[fila][columna - 1]);     System.out.print(mapaUtilizado[fila][columna]);     System.out.print(mapaUtilizado[fila][columna + 1]);     System.out.println(mapaUtilizado[fila][columna + 2]);
        System.out.print(mapaUtilizado[fila + 1][columna - 2]); System.out.print(mapaUtilizado[fila + 1][columna - 1]); System.out.print(mapaUtilizado[fila + 1][columna]); System.out.print(mapaUtilizado[fila + 1][columna + 1]); System.out.println(mapaUtilizado[fila + 1][columna + 2]);
        System.out.print(mapaUtilizado[fila + 2][columna - 2]); System.out.print(mapaUtilizado[fila + 2][columna - 1]); System.out.print(mapaUtilizado[fila + 2][columna]); System.out.print(mapaUtilizado[fila + 2][columna + 1]); System.out.println(mapaUtilizado[fila + 2][columna + 2]);
        System.out.println();
    }
    
    public void verOroRecolectado() {
        System.out.println("\n----------------------");
        System.out.println("Tienes " + oroRecolectado + " de Oro");
        System.out.println("----------------------\n");
    }
    
    public boolean verificarOro() {
        if (oroRecolectado >= oroNecesarioparaGanar) {
            return true;
        } else {
            System.out.println("\n-----------------------------------");
            System.out.println("No tienes Suficiente Oro para Salir");
            System.out.println("-----------------------------------\n");
            return false;
        }
    }
    
    public void cambiarFilaYColumna(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    
    public void aumentarOroRecolectado() {
        oroRecolectado++;
    }
    
    public int obtenerOroRecolectado() {
        return oroRecolectado;
    }
}
