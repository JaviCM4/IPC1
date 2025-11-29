package com.mycompany.aventura.main.mejoras;

import javax.swing.JOptionPane;

public class Mejora {
    String nombre;
    int aumento, precio;
    
    public int getAumento() {
        JOptionPane.showMessageDialog(null,"Se le aumentado " + aumento + " de " + nombre + " al Personaje, se Realizo la Compra","Seleccionar",JOptionPane.INFORMATION_MESSAGE);
        return aumento;
    }
    
    public int getPrecio() {
        return precio;
    }
}
