package com.mycompany.aventura.main.hilos;

import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.tablero.Casilla;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;

public class HiloDelAtaqueCuadrado extends Thread {
    
    private boolean uno = true, dos = true, tres = true, cuatro = true, cinco = true, seis = true, siete = true, ocho = true;    
    private ListaElementos<Casilla> tablero = new ListaElementos<>();
    private int distancia = 0, fila = 0, columna = 0;
    private String direccion = null;
            
    public HiloDelAtaqueCuadrado(ListaElementos<Casilla> tablero, int fila, int columna, boolean uno, boolean dos, boolean tres, boolean cuatro, boolean cinco, boolean seis, boolean siete, boolean ocho) {
        this.tablero = tablero;
        this.fila = fila;
        this.columna = columna;
        this.uno = uno;
        this.dos = dos;
        this.tres = tres;
        this.cuatro = cuatro;
        this.cinco = cinco;
        this.seis = seis;
        this.siete = siete;
        this.ocho = ocho;
    }
    
    @Override
    public void run() {
        
        for (int i = 1; i <= 2; i++) {
            try {
                try {
                    if (uno) {
                        if (i == 1) {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == (fila - 1) && tablero.obtenerContenido(j).obtenerColumna() == (columna - 1)) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/fuego.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        } else {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == (fila - 1) && tablero.obtenerContenido(j).obtenerColumna() == (columna - 1)) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        }
                    }
                    if (dos) {
                        if (i == 1) {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == (fila - 1) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/fuego.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        } else {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == (fila - 1) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        }
                    }
                    if (tres) {
                        if (i == 1) {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == (fila - 1) && tablero.obtenerContenido(j).obtenerColumna() == (columna + 1)) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/fuego.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        } else {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == (fila - 1) && tablero.obtenerContenido(j).obtenerColumna() == (columna + 1)) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        }
                    }
                    if (cuatro) {
                        if (i == 1) {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna - 1)) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/fuego.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        } else {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna - 1)) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        }
                    }
                    if (cinco) {
                        if (i == 1) {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna + 1)) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/fuego.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        } else {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna + 1)) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        }
                    }
                    if (seis) {
                        if (i == 1) {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == (fila + 1) && tablero.obtenerContenido(j).obtenerColumna() == (columna - 1)) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/fuego.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        } else {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == (fila + 1) && tablero.obtenerContenido(j).obtenerColumna() == (columna - 1)) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        }
                    }
                    if (siete) {
                        if (i == 1) {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == (fila + 1) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/fuego.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        } else {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == (fila + 1) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        }
                    }
                    if (ocho) {
                        if (i == 1) {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == (fila + 1) && tablero.obtenerContenido(j).obtenerColumna() == (columna + 1)) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/fuego.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        } else {
                            for (int j = 1; j <= tablero.getLongitud(); j++) {
                                if (tablero.obtenerContenido(j).obtenerFila() == (fila + 1) && tablero.obtenerContenido(j).obtenerColumna() == (columna + 1)) {
                                    tablero.obtenerContenido(j).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tablero.obtenerContenido(j).obtenerTipoDeCasilla() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                }
                            }
                        }
                    }
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
