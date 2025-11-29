package com.mycompany.batalla_naval.main.bombas;

import com.mycompany.batalla_naval.main.archivos.AccionesDelJugador;
import com.mycompany.batalla_naval.main.barcos.Barco;
import com.mycompany.batalla_naval.main.tablero.Casilla;
import com.mycompany.batalla_naval.main.tablero.Tablero;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Normal extends Bomba {
    
    public Normal() {
        tipoDeBomba = "Normal";
    }
    
    @Override
    public void explotarBomba(Casilla[][] casillas, int filaBomba, int columnaBomba, Tablero tablero) {
        AccionesDelJugador acciones = new AccionesDelJugador();
        Barco[] barcos = tablero.mandarTropa();
        boolean explotoAlgunObjetivo = false;
        int aumento = 0;
        
        if ("B3".equals(casillas[filaBomba][columnaBomba].obtenerCasillaOculta()) || "B2".equals(casillas[filaBomba][columnaBomba].obtenerCasillaOculta()) || "B1".equals(casillas[filaBomba][columnaBomba].obtenerCasillaOculta())) {
            String barcoEncontrado = casillas[filaBomba][columnaBomba].obtenerCasillaOculta();
            casillas[filaBomba][columnaBomba].setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/batalla_naval/main/controlDelJuego/" + barcoEncontrado + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
            casillas[filaBomba][columnaBomba].setBackground(Color.WHITE);
            casillas[filaBomba][columnaBomba].marcarCasillaDescubierta();
            casillas[filaBomba][columnaBomba].casillaLevantada();
            
            for (int i = 0; i < barcos.length; i++) {
                if (barcos[i] != null) {
                    if (barcos[i].obtenerFila() == filaBomba && barcos[i].obtenerColumna() == columnaBomba) {
                        aumento = barcos[i].sumarPuntaje();
                        barcos[i] = null;
                    }
                }
            }
            explotoAlgunObjetivo = true;
            tablero.mandarMensajeDeBarcoEncontrado(barcoEncontrado);
            tablero.recibirAumento(aumento);
            acciones.guardarAccionesDelJugador(nombreDelJugador, "Derribo de Barco " + barcoEncontrado + " en la casilla", filaBomba, columnaBomba);
        } else {
            explotoAlgunObjetivo = super.verificarRecorridoDeLaBomba(casillas, filaBomba, columnaBomba, tablero);
        }
        
        if (!explotoAlgunObjetivo) {
            acciones.guardarAccionesDelJugador(nombreDelJugador, "Bomba Colocada en la Casilla", filaBomba, columnaBomba);
        }
    }
}
