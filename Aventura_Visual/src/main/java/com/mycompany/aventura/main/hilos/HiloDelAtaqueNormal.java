package com.mycompany.aventura.main.hilos;

import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.tablero.Casilla;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class HiloDelAtaqueNormal extends Thread {
    
    private ListaElementos<Casilla> tablero = new ListaElementos<>();
    private int distancia = 0, fila = 0, columna = 0;
    private String direccion = null;
            
    public HiloDelAtaqueNormal(ListaElementos<Casilla> tablero, int distancia, int fila, int columna, String direccion) {
        this.tablero = tablero;
        this.distancia = distancia;
        this.fila = fila;
        this.columna = columna;
        this.direccion = direccion;
    }
    
    @Override
    public void run() {
        int contador = 0;
        
        for (int i = 1; i <= distancia; i++) {
            try {
                try {
                    if ("a".equals(direccion)) {
                        for (int j = 1; j <= tablero.getLongitud(); j++) {
                            if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna - contador)) {
                                tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                            }
                        }
                        for (int j = 1; j <= tablero.getLongitud(); j++) {
                            if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna - i)) {
                                tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/fuego.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                            }
                        }
                    } else if ("d".equals(direccion)) {
                        for (int j = 1; j <= tablero.getLongitud(); j++) {
                            if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna + contador)) {
                                tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                            }
                        }
                        for (int j = 1; j <= tablero.getLongitud(); j++) {
                            if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna + i)) {
                                tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/fuego.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                            }
                        }
                    } else if ("w".equals(direccion)) {
                        for (int j = 1; j <= tablero.getLongitud(); j++) {
                            if (tablero.obtenerContenido(j).obtenerFila() == (fila - contador) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                                tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                            }
                        }
                        for (int j = 1; j <= tablero.getLongitud(); j++) {
                            if (tablero.obtenerContenido(j).obtenerFila() == (fila - i) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                                tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/fuego.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                            }
                        }
                    } else if ("s".equals(direccion)) {
                        for (int j = 1; j <= tablero.getLongitud(); j++) {
                            if (tablero.obtenerContenido(j).obtenerFila() == (fila + contador) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                                tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                            }
                        }
                        for (int j = 1; j <= tablero.getLongitud(); j++) {
                            if (tablero.obtenerContenido(j).obtenerFila() == (fila + i) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                                tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/fuego.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                            }
                        }
                    }
                } catch (ListaElementosExcepcion ex) {
                    Logger.getLogger(HiloDelAtaqueNormal.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                contador++;
                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        try {
            if ("a".equals(direccion)) {
                for (int j = 1; j <= tablero.getLongitud(); j++) {
                    if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna - distancia)) {
                        tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                    }
                }
            } else if ("d".equals(direccion)) {
                for (int j = 1; j <= tablero.getLongitud(); j++) {
                    if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna + distancia)) {
                        tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                    }
                }
            } else if ("w".equals(direccion)) {
                for (int j = 1; j <= tablero.getLongitud(); j++) {
                    if (tablero.obtenerContenido(j).obtenerFila() == (fila - distancia) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                        tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                    }
                }
            } else if ("s".equals(direccion)) {
                for (int j = 1; j <= tablero.getLongitud(); j++) {
                    if (tablero.obtenerContenido(j).obtenerFila() == (fila + distancia) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                        tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                    }
                }
            }
        } catch (ListaElementosExcepcion ex) {
            Logger.getLogger(HiloDelAtaqueNormal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
