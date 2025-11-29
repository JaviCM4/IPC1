package com.mycompany.batalla_naval.main.bombas;

import com.mycompany.batalla_naval.main.archivos.AccionesDelJugador;
import com.mycompany.batalla_naval.main.barcos.Barco;
import com.mycompany.batalla_naval.main.tablero.Casilla;
import com.mycompany.batalla_naval.main.tablero.Tablero;
import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;

public class Torpedo extends Bomba {
    
    private boolean uno = true, dos = true, tres = true, cuatro = true;
    
    public Torpedo() {
        tipoDeBomba = "Torpedo";
    }

    @Override
    public void explotarBomba(Casilla[][] casillas, int filaBomba, int columnaBomba, Tablero tablero) {
        AccionesDelJugador acciones = new AccionesDelJugador();
        Barco[] barcos = tablero.mandarTropa();
        int aumento = 0, random = 0, distanciaFila = 0, distanciaColumna = 0, distancia = 0, filaInicial = filaBomba, columnaInicial = columnaBomba;  
        boolean paso = false, explotoAlgunObjetivo = false;
        
        while (!paso) {
            random = obtenerRandom();

            if (random == 1) {
                distanciaFila = filaBomba; 
                distanciaColumna = (casillas[0].length - 1) - columnaBomba;
            } else if (random == 2) {
                distanciaFila = (casillas.length - 1) - filaBomba;
                distanciaColumna = (casillas[0].length - 1) - columnaBomba;
            } else if (random == 3) {
                distanciaFila = (casillas.length - 1) - filaBomba;
                distanciaColumna = columnaBomba;
            } else {
                distanciaFila = filaBomba; 
                distanciaColumna = columnaBomba;
            }
            
            if (distanciaFila != 0 && distanciaColumna != 0) {
                if (verificarTrayectoria(casillas, random, filaBomba, columnaBomba, distanciaFila, distanciaColumna)) {
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
            columnaBomba--;
        } else if (random == 2) {
            filaBomba--;
            columnaBomba--;
        } else if (random == 3) {
            filaBomba--;
            columnaBomba++;
        } else {
            filaBomba++;
            columnaBomba++;
        }
        
        if (distanciaFila > distanciaColumna) {
            distancia = distanciaColumna;
        } else if (distanciaColumna > distanciaFila) {
            distancia = distanciaFila;
        } else if (distanciaFila == distanciaColumna) {
            distancia = distanciaFila;
        }
        
        for (int i = 0; i <= distancia; i++) {
            if (random == 1) {
                filaBomba --;
                columnaBomba++;
            } else if (random == 2) {
                filaBomba++;
                columnaBomba++;
            } else if (random == 3) {
                filaBomba++;
                columnaBomba--;
            } else {
                filaBomba--;
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
    
    public boolean verificarTrayectoria(Casilla[][] casillas, int random, int fila, int columna, int distanciaFila, int distanciaColumna) {
        int distancia = 0;
        
        if (distanciaFila > distanciaColumna) {
            distancia = distanciaColumna;
        } else if (distanciaColumna > distanciaFila) {
            distancia = distanciaFila;
        } else if (distanciaFila == distanciaColumna) {
            distancia = distanciaFila;
        }
        
        for (int i = 0; i < distancia; i++) {
            if (random == 1) {
                fila --;
                columna++;
            } else if (random == 2) {
                fila++;
                columna++;
            } else if (random == 3) {
                fila++;
                columna--;
            } else {
                fila--;
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
