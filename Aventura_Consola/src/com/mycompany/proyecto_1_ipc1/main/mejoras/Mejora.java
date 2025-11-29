/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_ipc1.main.mejoras;

/**
 *
 * @author DELL
 */
public class Mejora {
    String nombre;
    int aumento, precio;
    
    public int getAumento() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Se le aumentado " + aumento + " de " + nombre + " al Personaje, se Realizo la Compra");
        System.out.println("-----------------------------------------------------------------");
        return aumento;
    }
    
    public int getPrecio() {
        return precio;
    }
}
