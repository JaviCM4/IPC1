package com.mycompany.batalla_naval.main.tablero;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Casilla extends JButton {
    
    protected Tablero tablero;
    protected String signo;
    protected int fila;
    protected int columna;
    protected boolean casillaRevelada = false;
    
    public Casilla(Tablero tablero, String signo, int fila, int columna) {
        this.tablero = tablero;
        this.signo = signo;
        this.fila = fila;
        this.columna = columna;
        this.setFont(new Font("Arial", 1, 30));
        activarActionPerformed();
    }
     
    private void activarActionPerformed() {
        this.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                tablero.verSiHayObjetos(fila, columna);
                tablero.registrarClick();
            }
        });
    }
    
    public String obtenerCasillaOculta() {
        return signo;
    }
    
    public void marcarCasillaDescubierta() {
        signo = "~";
    }
    
    public void casillaLevantada() {
        casillaRevelada = true;
    }
    
    public boolean obtenerSiLaCasillaFueRevelada() {
        return casillaRevelada;
    }
}
