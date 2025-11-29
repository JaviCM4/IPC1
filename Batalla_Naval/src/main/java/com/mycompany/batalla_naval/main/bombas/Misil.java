package com.mycompany.batalla_naval.main.bombas;

import com.mycompany.batalla_naval.main.archivos.AccionesDelJugador;
import com.mycompany.batalla_naval.main.barcos.Barco;
import com.mycompany.batalla_naval.main.tablero.Casilla;
import com.mycompany.batalla_naval.main.tablero.Tablero;
import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;

public class Misil extends Bomba {
    
    private boolean uno = true, dos = true, tres = true, cuatro = true;
    
    public Misil() {
        tipoDeBomba = "Misil";
    }

    @Override
    public void explotarBomba(Casilla[][] casillas, int filaBomba, int columnaBomba, Tablero tablero) {
        AccionesDelJugador acciones = new AccionesDelJugador();
        Barco[] barcos = tablero.mandarTropa();
        int aumento = 0, random = 0, distancia = 0, filaInicial = filaBomba, columnaInicial = columnaBomba; 
        boolean paso = false, explotoAlgunObjetivo = false;
        
        while (!paso) {
            random = obtenerRandom();

            if (random == 1) {
                distancia = filaBomba;
            } else if (random == 2) {
                distancia = (casillas[0].length - 1) - columnaBomba;
            } else if (random == 3) {
                distancia = (casillas.length - 1) - filaBomba;
            } else {
                distancia = columnaBomba;
            }
            
            if (distancia != 0) {               
                if (verificarTrayectoria(casillas, random, filaBomba, columnaBomba, distancia)) {
                    paso = true;
                } else {
                    if (uno == false && dos == false && tres == false && cuatro == false) {
                        paso = true;
                    } else {
                        if (random == 1) {
                            uno = false;
                        } else if (random == 2) {
                            dos = false;
                        } else if (random == 3) {
                            tres = false;
                        } else if (random == 4) {
                            cuatro = false;
                        }
                    }
                }
            } else {
                if (random == 1) {
                    uno = false;
                } else if (random == 2) {
                    dos = false;
                } else if (random == 3) {
                    tres = false;
                } else if (random == 4) {
                    cuatro = false;
                }
            }
        }
        
        if (random == 1) {
            filaBomba++;
        } else if (random == 2) {
            columnaBomba--;
        } else if (random == 3) {
            filaBomba--;
        } else {
            columnaBomba++;
        }
                                
        for (int i = 0; i <= distancia; i++) {
            if (random == 1) {
                filaBomba --;
            } else if (random == 2) {
                columnaBomba++;
            } else if (random == 3) {
                filaBomba++;
            } else {
                columnaBomba--;
            }
            
            if ("B3".equals(casillas[filaBomba][columnaBomba].obtenerCasillaOculta()) || "B2".equals(casillas[filaBomba][columnaBomba].obtenerCasillaOculta()) || "B1".equals(casillas[filaBomba][columnaBomba].obtenerCasillaOculta())) {
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
                explotoAlgunObjetivo = true;
                tablero.mandarMensajeDeBarcoEncontrado(barcoEncontrado);
                tablero.recibirAumento(aumento);
                acciones.guardarAccionesDelJugador(nombreDelJugador, "Derribo de Barco " + barcoEncontrado + " en la casilla", filaBomba, columnaBomba);
                break;
            } else {
                boolean respuesta = super.verificarRecorridoDeLaBomba(casillas, filaBomba, columnaBomba, tablero);
                
                if (respuesta) {
                    break;
                }
                if (!explotoAlgunObjetivo) {
                    explotoAlgunObjetivo = respuesta;
                }
            }
        }
        
        if (!explotoAlgunObjetivo) {
            acciones.guardarAccionesDelJugador(nombreDelJugador, "Bomba Colocada en la Casilla", filaInicial, columnaInicial);
        }
    }
    
    public boolean verificarTrayectoria(Casilla[][] casillas, int random, int fila, int columna, int distancia) {        
        for (int i = 0; i < distancia; i++) {
            if (random == 1) {
                fila --;
            } else if (random == 2) {
                columna++;
            } else if (random == 3) {
                fila++;
            } else {
                columna--;
            }
            if (!casillas[fila][columna].obtenerSiLaCasillaFueRevelada()) {
                return true;
            }
        }
        return false;
    }
    
    public int obtenerRandom() {
        Random rand = new Random();
        int numeroRandom = (rand.nextInt(4) + 1);
        return numeroRandom;
    }
}
