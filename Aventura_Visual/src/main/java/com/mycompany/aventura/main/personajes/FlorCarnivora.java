package com.mycompany.aventura.main.personajes;

import com.mycompany.aventura.main.hilos.HiloDelAtaqueNormal;
import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.tablero.Arbol;
import com.mycompany.aventura.main.tablero.Casilla;
import java.util.Random;
import javax.swing.ImageIcon;

public class FlorCarnivora extends Personaje {
    
    public FlorCarnivora(String nombre) {
        super.nombre = nombre;
        tipo = "florCarnivora";
        daño = 30;
        vida = 250;
        movilidad = 1;
        punteo = 75;
        porcentajeDeEfectividad = 0.60;
        puedeVolar = false;
    }

    @Override
    public void moverPersonaje(ListaElementos<Casilla> tablero, String casillaAnterior, String direccionNoUtilizada, ListaElementos<String> accionesEnemigos) {
        // Es Personaje no se Puede Mover
    }

    @Override
    public void atacarPersonaje(ListaElementos<Casilla> tablero, ListaElementos<Arbol> arboles, ListaElementos<Personaje> personajesEnemigos, ListaElementos<String> casillasAnteriores, String direccion, ListaElementos<String> accionesEnemigos) {
        int distancia = 3, contador = 0;
        boolean paso = false, encontroAlgo = false;
        String comando = super.obtenerDireccionNormal(tablero, 3);
        String accion = null;
                
        while (!paso) {
            int fila_1 = fila, columna_1 = columna;
            contador = 0;           
            
            if ("j".equals(comando)) {
                Random random = new Random();
                int movimiento = (random.nextInt(4) + 1);
                
                if (movimiento == 1) {
                    comando = "a";
                } else if (movimiento == 2) {
                    comando = "d";
                } else if (movimiento == 3) {
                    comando = "w";
                } else {
                    comando = "s";
                }
            }        
            
            if ("a".equals(comando)) {
                columna_1 -= distancia;
                
                while (columna_1 < 1) {
                    columna_1++;
                    contador++;
                }
            } else if ("d".equals(comando)) {
                columna_1 += distancia;
                
                while (columna_1 > columnasDelTablero) {
                    columna_1--;
                    contador++;
                }
            } else if ("w".equals(comando)) {
                fila_1 -= distancia;
                
                while (fila_1 < 1) {
                    fila_1++;
                    contador++;
                }
            } else if ("s".equals(comando)) {
                fila_1 += distancia;
                
                while (fila_1 > filasDelTablero) {
                    fila_1--;
                    contador++;
                }
            }
            if (fila_1 != fila || columna_1 != columna) {
                paso = true;
            } else {
                comando = "j";
            }
        }
        
        distancia -= contador;
        double random = Math.random();
        
        if (random < porcentajeDeEfectividad) {
            
            for (int i = 1; i <= distancia; i++) {       
                int filaAtacada = 0;
                int columnaAtacada = 0;

                if ("a".equals(comando)) {
                    filaAtacada = fila;
                    columnaAtacada = columna - i;
                } else if ("d".equals(comando)) {
                    filaAtacada = fila;
                    columnaAtacada = columna + i;                                       
                } else if ("w".equals(comando)) {
                    filaAtacada = fila - i;
                    columnaAtacada = columna;
                } else {
                    filaAtacada = fila + i;
                    columnaAtacada = columna;
                }

                if (!arboles.estaVacia()) {
                    for (int j = 1; j <= arboles.getLongitud(); j++) {
                        try {
                            if (arboles.obtenerContenido(j).obtenerFila() == filaAtacada && arboles.obtenerContenido(j).obtenerColumna() == columnaAtacada) {
                                if (arboles.obtenerContenido(j).obtenerSiElArbolEstaActivo()) {
                                    arboles.obtenerContenido(j).quitarVida(daño);

                                    if (arboles.obtenerContenido(j).obtenerVida() == 0) {
                                        for (int k = 1; k <= tablero.getLongitud(); k++) {
                                            if (tablero.obtenerContenido(k).obtenerFila() == filaAtacada && tablero.obtenerContenido(k).obtenerColumna() == columnaAtacada) {
                                                tablero.obtenerContenido(k).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/planicie.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                                tablero.obtenerContenido(k).cambiarTipoDeCasilla("planicie");
                                            }
                                        }
                                        arboles.eliminar(j);
                                        accion = "La Flor Carnivora (" + fila + "," + columna + ") destruyó un Árbol";
                                    } else {
                                        accion = "La Flor Carnivora (" + fila + "," + columna + ") hizó un daño de " + daño + " a un Árbol";
                                    }
                                    encontroAlgo = true;
                                    break;
                                }
                            }
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                }

                if (!personajesEnemigos.estaVacia()) {
                    for (int j = 1; j <= personajesEnemigos.getLongitud(); j++) {
                        try {
                            if (personajesEnemigos.obtenerContenido(j).obtenerFilaDelJugador() == filaAtacada && personajesEnemigos.obtenerContenido(j).obtenerColumnaDelJugador() == columnaAtacada) {
                                if (i == 1) {
                                    for (int k = 1; k <= tablero.getLongitud(); k++) {
                                        if (tablero.obtenerContenido(k).obtenerFila() == filaAtacada && tablero.obtenerContenido(k).obtenerColumna() == columnaAtacada) {
                                            tablero.obtenerContenido(k).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + personajesEnemigos.obtenerContenido(j).getCasillaActual() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                            tablero.obtenerContenido(k).cambiarTipoDeCasilla(personajesEnemigos.obtenerContenido(j).getCasillaActual());
                                        }
                                    }
                                    accion = "La Flor Carnivora (" + fila + "," + columna + ") devoró a " + personajesEnemigos.obtenerContenido(j).obtenerNombre();
                                    personajesEnemigos.eliminar(j);
                                    encontroAlgo = true;
                                } else {
                                    personajesEnemigos.obtenerContenido(j).aumentarOQuitarVida(-daño);

                                    if (personajesEnemigos.obtenerContenido(j).obtenerVida() == 0) {
                                        for (int k = 1; k <= tablero.getLongitud(); k++) {
                                            if (tablero.obtenerContenido(k).obtenerFila() == filaAtacada && tablero.obtenerContenido(k).obtenerColumna() == columnaAtacada) {
                                                tablero.obtenerContenido(k).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + personajesEnemigos.obtenerContenido(j).getCasillaActual() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                                tablero.obtenerContenido(k).cambiarTipoDeCasilla(personajesEnemigos.obtenerContenido(j).getCasillaActual());
                                            }
                                        }
                                        accion = "La Flor Carnivora (" + fila + "," + columna + ") dejó fuera de Combate a " + personajesEnemigos.obtenerContenido(j).obtenerNombre();
                                        personajesEnemigos.eliminar(j);
                                    } else {
                                        accion = "La Flor Carnivora (" + fila + "," + columna + ") atacó a " + personajesEnemigos.obtenerContenido(j).obtenerNombre() + " dejandoló con " + personajesEnemigos.obtenerContenido(j).obtenerVida() + " de vida";
                                    }
                                    encontroAlgo = true;
                                    break;
                                }
                            }
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                }
            }   
            if (!encontroAlgo) {
                accion = "La Flor Carnivora (" + fila + "," + columna + ") atacó pero no habia Objetivos Cerca";
            }
            
            HiloDelAtaqueNormal iniciar = new HiloDelAtaqueNormal(tablero, distancia, fila, columna, comando);
            iniciar.start();
        } else {
            accion = "La Flor Carnivora (" + fila + "," + columna + ") falló el Ataque";
        }
        accionesEnemigos.agregarALaLista(accion);
    }
}
