package com.mycompany.batalla_naval.main.bombas;

import com.mycompany.batalla_naval.main.archivos.AccionesDelJugador;
import com.mycompany.batalla_naval.main.barcos.Barco;
import com.mycompany.batalla_naval.main.tablero.Casilla;
import com.mycompany.batalla_naval.main.tablero.Tablero;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Hecatombe extends Bomba {
    
    private boolean explotoAlgunObjetivo = false;
    
    public Hecatombe() {
        tipoDeBomba = "Hecatombe";
    }

    @Override
    public void explotarBomba(Casilla[][] casillas, int filaBomba, int columnaBomba, Tablero tablero) {
        boolean uno = true, dos = true, tres = true, cuatro = true, cinco = true, seis = true, siete = true, ocho = true;
        boolean respuesta;        
        
        if (filaBomba == 0 && columnaBomba == 0) {
            uno = dos = tres = cuatro = seis = false;
        } else if (filaBomba == 0 && columnaBomba != 0 && columnaBomba != (casillas[0].length - 1)) {
            uno = dos = tres = false;
        } else if (filaBomba == 0 && columnaBomba == (casillas[0].length - 1)) {
            uno = dos = tres = cinco = ocho = false;
        } else if (columnaBomba == 0 && filaBomba != 0 && filaBomba != (casillas.length - 1)) {
            uno = cuatro = seis = false;
        } else if (columnaBomba == (casillas[0].length - 1) && filaBomba != 0 && filaBomba != (casillas.length - 1)) {
            tres = cinco = ocho = false;
        } else if (filaBomba == (casillas.length - 1) && columnaBomba == 0) {
            uno = cuatro = seis = siete = ocho = false;
        } else if (filaBomba == (casillas.length - 1) && columnaBomba != 0 && columnaBomba != (casillas[0].length - 1)) {
            seis = siete = ocho = false;
        } else if (filaBomba == (casillas.length - 1) && columnaBomba == (casillas[0].length - 1)) {
            tres = cinco = seis = siete = ocho = false;
        }
        
        explosionAlrededor(casillas, filaBomba, columnaBomba, tablero);
        if (uno) {
            respuesta = explosionAlrededor(casillas, filaBomba - 1, columnaBomba - 1, tablero);
            verificarSiLaBombaExplotoUnObjeto(respuesta);
        }
        if (dos) {
            respuesta = explosionAlrededor(casillas, filaBomba - 1, columnaBomba, tablero);
            verificarSiLaBombaExplotoUnObjeto(respuesta);
        }
        if (tres) {
            respuesta = explosionAlrededor(casillas, filaBomba - 1, columnaBomba + 1, tablero);
            verificarSiLaBombaExplotoUnObjeto(respuesta);
        }
        if (cuatro) {
            respuesta = explosionAlrededor(casillas, filaBomba, columnaBomba - 1, tablero);
            verificarSiLaBombaExplotoUnObjeto(respuesta);
        }
        if (cinco) {
            respuesta = explosionAlrededor(casillas, filaBomba, columnaBomba + 1, tablero);
            verificarSiLaBombaExplotoUnObjeto(respuesta);
        }
        if (seis) {
            respuesta = explosionAlrededor(casillas, filaBomba + 1, columnaBomba - 1, tablero);
            verificarSiLaBombaExplotoUnObjeto(respuesta);
        }
        if (siete) {
            respuesta = explosionAlrededor(casillas, filaBomba + 1, columnaBomba, tablero);
            verificarSiLaBombaExplotoUnObjeto(respuesta);
        }
        if (ocho) {
            respuesta = explosionAlrededor(casillas, filaBomba + 1, columnaBomba + 1, tablero);
            verificarSiLaBombaExplotoUnObjeto(respuesta);
        }
        
        if (!explotoAlgunObjetivo) {
            AccionesDelJugador acciones = new AccionesDelJugador();
            acciones.guardarAccionesDelJugador(nombreDelJugador, "Bomba Colocada en la Casilla", filaBomba, columnaBomba);
        }
    }   
    
    public void verificarSiLaBombaExplotoUnObjeto(boolean respuesta) {
        if (!explotoAlgunObjetivo) {
            explotoAlgunObjetivo = respuesta;
        }
    }
    
    public boolean explosionAlrededor(Casilla[][] casillas, int filaBomba, int columnaBomba, Tablero tablero) {
        Barco[] barcos = tablero.mandarTropa();
        boolean explotoAlgunObjetivo = false;
        int aumento = 0;
        
        if ("B3".equals(casillas[filaBomba ][columnaBomba].obtenerCasillaOculta()) || "B2".equals(casillas[filaBomba][columnaBomba].obtenerCasillaOculta()) || "B1".equals(casillas[filaBomba][columnaBomba].obtenerCasillaOculta())) {
            String barcoEncontrado = casillas[filaBomba][columnaBomba].obtenerCasillaOculta();
            casillas[filaBomba][columnaBomba].setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/batalla_naval/main/controlDelJuego/" + barcoEncontrado + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
            casillas[filaBomba][columnaBomba].setBackground(Color.WHITE);
            casillas[filaBomba][columnaBomba].marcarCasillaDescubierta();
            casillas[filaBomba][columnaBomba].casillaLevantada();
            
            for (int j = 0; j < barcos.length; j++) {
                if (barcos[j] != null) {
                    if (barcos[j].obtenerFila() == filaBomba && barcos[j].obtenerColumna() == columnaBomba) {
                        aumento = barcos[j].sumarPuntaje();
                        barcos[j] = null;
                    }
                }
            }
            tablero.mandarMensajeDeBarcoEncontrado(barcoEncontrado);
            tablero.recibirAumento(aumento);
            AccionesDelJugador acciones = new AccionesDelJugador();
            acciones.guardarAccionesDelJugador(nombreDelJugador, "Derribo de Barco " + barcoEncontrado + " en la casilla", filaBomba, columnaBomba);
        } else {
            explotoAlgunObjetivo = super.verificarRecorridoDeLaBomba(casillas, filaBomba, columnaBomba, tablero);
        }
        
        return explotoAlgunObjetivo;
    }
}
