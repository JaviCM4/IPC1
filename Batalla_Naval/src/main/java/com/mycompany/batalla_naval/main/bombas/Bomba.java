package com.mycompany.batalla_naval.main.bombas;

import com.mycompany.batalla_naval.main.archivos.AccionesDelJugador;
import com.mycompany.batalla_naval.main.tablero.Casilla;
import com.mycompany.batalla_naval.main.tablero.Tablero;
import java.awt.Color;
import javax.swing.ImageIcon;

public abstract class Bomba {
    
    protected String tipoDeBomba = "Bomba";
    protected String nombreDelJugador = "";
    
    public abstract void explotarBomba(Casilla[][] casillas, int filaBomba, int columnaBomba, Tablero tablero);
    
    public String verTipoDeBomba() {
        return tipoDeBomba;
    }
    
    public boolean verificarRecorridoDeLaBomba(Casilla[][] casillas, int filaBomba, int columnaBomba, Tablero tablero) {
        AccionesDelJugador acciones = new AccionesDelJugador();
        boolean explotoAlgunObjetivo = false;
        
        if ("I".equals(casillas[filaBomba][columnaBomba].obtenerCasillaOculta()) || "T".equals(casillas[filaBomba ][columnaBomba].obtenerCasillaOculta()) || "O".equals(casillas[filaBomba ][columnaBomba].obtenerCasillaOculta())) {
            String bombaEncontrado = casillas[filaBomba][columnaBomba].obtenerCasillaOculta();           
            casillas[filaBomba][columnaBomba].marcarCasillaDescubierta();
            casillas[filaBomba][columnaBomba].casillaLevantada();            
            explotoAlgunObjetivo = true;
        
            if ("I".equals(bombaEncontrado)) {
                casillas[filaBomba][columnaBomba].setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/batalla_naval/main/controlDelJuego/misil.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                casillas[filaBomba][columnaBomba].setBackground(Color.WHITE);
                tablero.mandarMensajeDeBombaEncontrada(bombaEncontrado);
                Misil misilEncontrado = new Misil();
                misilEncontrado.recibirNombreDelJugador(nombreDelJugador);
                acciones.guardarAccionesDelJugador(nombreDelJugador, "Bomba Misil Encontrada en la Casilla", filaBomba, columnaBomba);
                misilEncontrado.explotarBomba(casillas, filaBomba, columnaBomba, tablero);
            } else if ("T".equals(bombaEncontrado)) {
                casillas[filaBomba][columnaBomba].setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/batalla_naval/main/controlDelJuego/torpedo.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                casillas[filaBomba][columnaBomba].setBackground(Color.WHITE);
                tablero.mandarMensajeDeBombaEncontrada(bombaEncontrado);
                Torpedo torpedoEncontrado = new Torpedo();
                torpedoEncontrado.recibirNombreDelJugador(nombreDelJugador);
                acciones.guardarAccionesDelJugador(nombreDelJugador, "Bomba Torpedo Encontrada en la Casilla", filaBomba, columnaBomba);
                torpedoEncontrado.explotarBomba(casillas, filaBomba, columnaBomba, tablero);
            } else {
                casillas[filaBomba][columnaBomba].setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/batalla_naval/main/controlDelJuego/hecatombe.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                casillas[filaBomba][columnaBomba].setBackground(Color.WHITE);
                tablero.mandarMensajeDeBombaEncontrada(bombaEncontrado);
                Hecatombe hecatombeEncontrado = new Hecatombe();
                hecatombeEncontrado.recibirNombreDelJugador(nombreDelJugador);
                acciones.guardarAccionesDelJugador(nombreDelJugador, "Bomba Hecatombe Encontrada en la Casilla", filaBomba, columnaBomba);
                hecatombeEncontrado.explotarBomba(casillas, filaBomba, columnaBomba, tablero);
            }
        } else if ("~".equals(casillas[filaBomba][columnaBomba].obtenerCasillaOculta())) {
            casillas[filaBomba][columnaBomba].casillaLevantada();
            casillas[filaBomba][columnaBomba].setBackground(Color.WHITE);
        }       
        return explotoAlgunObjetivo;
    }
    
    public void recibirNombreDelJugador(String nombreDelJugador) {
        this.nombreDelJugador = nombreDelJugador;
    }   
}
