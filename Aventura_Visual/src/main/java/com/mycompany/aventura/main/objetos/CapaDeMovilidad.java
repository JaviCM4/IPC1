package com.mycompany.aventura.main.objetos;

import com.mycompany.aventura.main.frameDelJuego.ActivarCapaDeMovilidad;
import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.tablero.Casilla;

public class CapaDeMovilidad extends Objeto {
    
    private int filaNueva = 0, columnaNueva = 0;
    private String casillaAnteriorNueva = null;
    
    public CapaDeMovilidad() {
        nombre = "Capa de Movilidad";
        habilidad = "Mueve al Personaje una Casilla a su Alrededor";
        precio = 75;
    }
    
    public void activarCapa(ListaElementos<Casilla> tablero, int fila, int columna, int filasDelTablero, int columnasDelTablero, String casillaAnterior, String nombre, boolean puedeVolar) {
        boolean uno = true, dos = true, tres = true, cuatro = true, cinco = true, seis = true, siete = true, ocho = true;
        ListaElementos<Casilla> vistaDelTablero = new ListaElementos<>();
        
        if (fila == 1 && columna == 1) {
            uno = dos = tres = cuatro = seis = false;
        } else if (fila == 1 && columna != 1 && columna != columnasDelTablero) {
            uno = dos = tres = false;
        } else if (fila == 1 && columna == columnasDelTablero) {
            uno = dos = tres = cinco = ocho = false;
        } else if (columna == 1 && fila != 1 && fila != filasDelTablero) {
            uno = cuatro = seis = false;
        } else if (columna == columnasDelTablero && fila != 1 && fila != filasDelTablero) {
            tres = cinco = ocho = false;
        } else if (fila == filasDelTablero && columna == 1) {
            uno = cuatro = seis = siete = ocho = false;
        } else if (fila == filasDelTablero && columna != 1 && columna != columnasDelTablero) {
            seis = siete = ocho = false;
        } else if (fila == filasDelTablero && columna == columnasDelTablero) {
            tres = cinco = seis = siete = ocho = false;
        }
        
        for (int i = 0; i < 9; i++) {
            vistaDelTablero.agregarALaLista(new Casilla(i, i, "pared"));
        }
        
        try {
            vistaDelTablero.obtenerContenido(5).cambiarTipoDeCasilla(nombre);

            if (puedeVolar) {
                if (uno) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "rio".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(1).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                uno = false;
                            }
                        }
                    }
                }
                if (dos) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == columna) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "rio".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(2).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                dos = false;
                            }
                        }
                    }
                }
                if (tres) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "rio".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(3).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                tres = false;
                            }
                        }
                    }
                }
                if (cuatro) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "rio".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(4).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                cuatro = false;
                            }
                        }
                    }
                }
                if (cinco) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "rio".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(6).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                cinco = false;
                            }
                        }
                    }
                }
                if (seis) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "rio".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(7).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                seis = false;
                            }
                        }
                    }
                }
                if (siete) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == columna) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "rio".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(8).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                siete = false;
                            }
                        }
                    }
                }
                if (ocho) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "rio".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(9).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                ocho = false;
                            }
                        }
                    }
                }
            } else {
                if (uno) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(1).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                uno = false;
                            }
                        }
                    }
                }
                if (dos) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == columna) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(2).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                dos = false;
                            }
                        }
                    }
                }
                if (tres) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(3).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                tres = false;
                            }
                        }
                    }
                }
                if (cuatro) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(4).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                cuatro = false;
                            }
                        }
                    }
                }
                if (cinco) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(6).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                cinco = false;
                            }
                        }
                    }
                }
                if (seis) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(7).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                seis = false;
                            }
                        }
                    }
                }
                if (siete) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == columna) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(8).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                siete = false;
                            }
                        }
                    }
                }
                if (ocho) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {
                            if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                vistaDelTablero.obtenerContenido(9).cambiarTipoDeCasilla(tablero.obtenerContenido(i).obtenerTipoDeCasilla());
                            } else {
                                ocho = false;
                            }
                        }
                    }
                }
            }
            
            ActivarCapaDeMovilidad activar = new ActivarCapaDeMovilidad(null, vistaDelTablero, tablero, fila, columna, casillaAnterior, nombre);
            activar.setVisible(true);
            filaNueva = activar.obtenerFilaNueva();
            columnaNueva = activar.obtenerColumnaNueva();
            casillaAnteriorNueva = activar.obtenerCasillaAnterior();
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public int obtenerFilaNueva() {
        return filaNueva;
    }
    
    public int obtenerColumnaNueva() {
        return columnaNueva;
    }
    
    public String obtenerCasillaAnterior() {
        return casillaAnteriorNueva;
    }
}
