package com.mycompany.batalla_naval.main.tablero;

import com.mycompany.batalla_naval.main.barcos.Barco;
import com.mycompany.batalla_naval.main.bombas.Bomba;
import com.mycompany.batalla_naval.main.controlDelJuego.Batalla;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class Tablero {
    
    private Batalla batalla;
    private Casilla[][] casillas;
    private Bomba bombaSeleccionada;
    private Barco[] barcosEnElTablero;
    
    public Casilla[][] crearTablero(int filas, int columnas, String[][] signos, int alturaTablero, int anchoTablero) {
        casillas = new Casilla[filas][columnas];
        
        int ancho = anchoTablero/columnas;
        int altura = alturaTablero/filas;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                casillas[i][j] = new Casilla(this, signos[i][j], i ,j);
                casillas[i][j].setPreferredSize(new Dimension(ancho, altura));  
            }
        }
        return casillas;
    }
    
    public void recibirTropa(Barco[] barcosEnElTablero) {
        this.barcosEnElTablero = barcosEnElTablero;
    }
    
    public Barco[] mandarTropa() {
        return barcosEnElTablero;
    }
    
    public void recibirAumento(int aumento) {
        batalla.aumentarPunteo(aumento);
    }
    
    public void mandarMensajeDeBarcoEncontrado(String barcoEncontrado) {
        if ("B1".equals(barcoEncontrado)) {
            JOptionPane.showMessageDialog(batalla,"La bomba Impacto en un Pailebon, Obtuviste 100 Puntos","Destrucción de Barco",JOptionPane.INFORMATION_MESSAGE);
        } else if ("B2".equals(barcoEncontrado)) {
            JOptionPane.showMessageDialog(batalla,"La bomba Impacto en un Bergantín, Obtuviste 40 Puntos","Destrucción de Barco",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(batalla,"La bomba Impacto en un Navio, Obtuviste 25 Puntos","Destrucción de Barco",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void mandarMensajeDeBombaEncontrada(String bombaEncontrada) {
        if ("I".equals(bombaEncontrada)) {
            JOptionPane.showMessageDialog(batalla,"Bomba tipo Misil Encontrada","Bomba",JOptionPane.INFORMATION_MESSAGE);
        } else if ("T".equals(bombaEncontrada)) {
            JOptionPane.showMessageDialog(batalla,"Bomba tipo Torpedo Encontrada","Bomba",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(batalla,"Bomba tipo Hecatombe Encontrada","Bomba",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void registrarClick() {
        int contadorDeBarcosRestantes = 0;   
       
        for (int i = 0; i < barcosEnElTablero.length; i++) {
            if (barcosEnElTablero[i] != null) {
                contadorDeBarcosRestantes++;
            }
        }
        
        if (contadorDeBarcosRestantes == 0) {
            batalla.cerrar(0);
        } else {
            if (batalla.verificarCantidadDeBombas()) {
                batalla.abrirOCerrarAccesosALasBombas(true);
                JOptionPane.showMessageDialog(null,"Barcos Restantes por Destruír:  " + contadorDeBarcosRestantes,"Barcos Restantes",JOptionPane.ERROR_MESSAGE);
            } else {
                batalla.cerrar(1);
            }
        }
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[0].length; j++) {
                casillas[i][j].setEnabled(false);
            }
        }
    }
    
    public void verSiHayObjetos(int filaDeReferencia, int columnaDeReferencia) {
        bombaSeleccionada.recibirNombreDelJugador(batalla.obtenerNombreDelJugador());
        bombaSeleccionada.explotarBomba(casillas, filaDeReferencia, columnaDeReferencia, this);
    }
    
    public void recibirBombaSeleccionada(Bomba bombaSeleccionada) {
        this.bombaSeleccionada = bombaSeleccionada;
    }
    
    public void recibirFrame(Batalla batalla) {
        this.batalla = batalla;
    }
}
