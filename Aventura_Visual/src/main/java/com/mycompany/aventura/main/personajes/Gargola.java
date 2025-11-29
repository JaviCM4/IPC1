package com.mycompany.aventura.main.personajes;

import com.mycompany.aventura.main.hilos.HiloDelAtaqueNormal;
import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.tablero.Arbol;
import com.mycompany.aventura.main.tablero.Casilla;
import java.util.Random;
import javax.swing.ImageIcon;

public class Gargola extends Personaje {
    
    public Gargola(String nombre) {
        super.nombre = nombre;
        tipo = "gargola";
        daño = 100;
        vida = 150;
        movilidad = 3;
        punteo = 45;
        porcentajeDeEfectividad = 0.60;
        puedeVolar = true;
    }

    @Override
    public void moverPersonaje(ListaElementos<Casilla> tablero, String casillaAnterior, String direccionNoUtilizada, ListaElementos<String> accionesEnemigos) {
        boolean paso = false, salir = false;
        String casillaAGuardar = null, comando = null, accion = null;
 
        while (!paso) {
            int contador = 0, espaciosLibres = 0, fila_1 = fila, columna_1 = columna;
            boolean hayObstaculos = true, seMovio = true;
            
            Random random = new Random();
            int direccion = (random.nextInt(5) + 1);

            if (direccion == 1) {
                comando = "a";
            } else if (direccion == 2) {
                comando = "d";
            } else if (direccion == 3) {
                comando = "w";
            } else {
                comando = "s";
            }
            
            Random random_1 = new Random();
            int distancia =(random_1.nextInt(movilidad) + 1);

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

            if (fila_1 == fila && columna_1 == columna) {
                seMovio = false;
            }
            
            distancia -= contador;
            
            if (seMovio) {
                if (comando.equals("a")) {
                    for (int i = 1; i <= distancia; i++) {                
                        for (int j = 1; j <= tablero.getLongitud(); j++) {
                            try {
                                if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna - i)) {
                                    if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("planicie") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("lava") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("arbol") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("rio")) {
                                        casillaAGuardar = tablero.obtenerContenido(j).obtenerTipoDeCasilla();
                                        espaciosLibres++;
                                        hayObstaculos = false;
                                    } else {
                                        salir = true;
                                        break;
                                    }
                                }
                            } catch (ListaElementosExcepcion ex) {
                                System.out.println(ex.getMessage());
                            }
                        }
                        if (salir) {
                            break;
                        }
                    }
                } else if (comando.equals("d")) {
                    for (int i = 1; i <= distancia; i++) {
                        for (int j = 1; j <= tablero.getLongitud(); j++) {
                            try {
                                if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna + i)) {
                                    if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("planicie") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("lava") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("arbol") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("rio")) {
                                        casillaAGuardar = tablero.obtenerContenido(j).obtenerTipoDeCasilla();
                                        espaciosLibres++;
                                        hayObstaculos = false;
                                    } else {
                                        salir = true;
                                        break;
                                    }
                                }
                            } catch (ListaElementosExcepcion ex) {
                                System.out.println(ex.getMessage());
                            }
                        }
                        if (salir) {
                            break;
                        }
                    }
                } else if (comando.equals("w")) {
                    for (int i = 1; i <= distancia; i++) {
                        for (int j = 1; j <= tablero.getLongitud(); j++) {
                            try {
                                if (tablero.obtenerContenido(j).obtenerFila() == (fila - i) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                                    if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("planicie") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("lava") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("arbol") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("rio")) {
                                        casillaAGuardar = tablero.obtenerContenido(j).obtenerTipoDeCasilla();
                                        espaciosLibres++;
                                        hayObstaculos = false;
                                    } else {
                                        salir = true;
                                        break;
                                    }
                                }
                            } catch (ListaElementosExcepcion ex) {
                                System.out.println(ex.getMessage());
                            }
                        }
                        if (salir) {
                            break;
                        }
                    } 
                } else if (comando.equals("s")) {
                    for (int i = 1; i <= distancia; i++) {
                        for (int j = 1; j <= tablero.getLongitud(); j++) {
                            try {
                                if (tablero.obtenerContenido(j).obtenerFila() == (fila + i) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                                    if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("planicie") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("lava") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("arbol") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("rio")) {
                                        casillaAGuardar = tablero.obtenerContenido(j).obtenerTipoDeCasilla();
                                        espaciosLibres++;
                                        hayObstaculos = false;
                                    } else {
                                        salir = true;
                                        break;
                                    }
                                }
                            } catch (ListaElementosExcepcion ex) {
                                System.out.println(ex.getMessage());
                            }
                        }
                        if (salir) {
                            break;
                        }
                    }
                }

                if (!hayObstaculos) {
                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        try {
                            if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == columna) {
                                tablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + casillaAnterior + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                tablero.obtenerContenido(i).cambiarTipoDeCasilla(casillaAnterior);
                            }
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    if (distancia != espaciosLibres) {
                        int espaciosARestar = distancia - espaciosLibres;
                        distancia -= espaciosARestar;
                    }

                    int filaACambiar = 0;
                    int columnaACambiar = 0;

                    if (comando.equals("a")) { 
                        filaACambiar = fila;
                        columnaACambiar = columna - distancia;
                        columna -= distancia;
                    } else if (comando.equals("d")) {
                        filaACambiar = fila;
                        columnaACambiar = columna + distancia;
                        columna += distancia;
                    } else if (comando.equals("w")) {
                        filaACambiar = fila - distancia;
                        columnaACambiar = columna;
                        fila -= distancia;
                    } else if (comando.equals("s")) {
                        filaACambiar = fila + distancia;
                        columnaACambiar = columna;
                        fila += distancia;
                    }  

                    for (int i = 1; i <= tablero.getLongitud(); i++) {
                        try {
                            if (tablero.obtenerContenido(i).obtenerFila() == (filaACambiar) && tablero.obtenerContenido(i).obtenerColumna() == columnaACambiar) {
                                tablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tipo + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                tablero.obtenerContenido(i).cambiarTipoDeCasilla(tipo);
                            }
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    
                    if (comando.equals("a")) { 
                        accion = "La Gargola (" + fila + "," + columna + ") se Movio a la Izquierda " + distancia + " Casillas";
                    } else if (comando.equals("d")) { 
                        accion = "La Gargola (" + fila + "," + columna + ") se Movio a la Derecha " + distancia + " Casillas";
                    } else if (comando.equals("w")) { 
                        accion = "La Gargola (" + fila + "," + columna + ") se Movio hacia Arriba " + distancia + " Casillas";
                    } else {
                        accion = "La Gargola (" + fila + "," + columna + ") se Movio hacia Abajo " + distancia + " Casillas";
                    }
                    casillaActual = casillaAGuardar;
                    paso = true;
                }
            }
        }
        accionesEnemigos.agregarALaLista(accion);
    }
    
    @Override
    public void atacarPersonaje(ListaElementos<Casilla> tablero, ListaElementos<Arbol> arboles, ListaElementos<Personaje> personajesEnemigos, ListaElementos<String> casillasAnteriores, String direccion, ListaElementos<String> accionesEnemigos) {
        int distancia = 2, contador = 0, distanciaAEnviar = 0;
        boolean paso = false, encontroAlgo = false;
        String comando = super.obtenerDireccionNormal(tablero, 2);
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
        
        boolean salir = false;
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
                                        accion = "La Gargola (" + fila + "," + columna + ") destruyó un Árbol";
                                    } else {
                                        accion = "La Gargola (" + fila + "," + columna + ") hizó un daño de " + daño + " a un Árbol";
                                    }
                                    encontroAlgo = true;
                                    salir = true;
                                    break;
                                }
                            }
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    if (salir) {
                        break;
                    }
                }

                if (!personajesEnemigos.estaVacia()) {
                    for (int j = 1; j <= personajesEnemigos.getLongitud(); j++) {
                        try {
                            if (personajesEnemigos.obtenerContenido(j).obtenerFilaDelJugador() == filaAtacada && personajesEnemigos.obtenerContenido(j).obtenerColumnaDelJugador() == columnaAtacada) {
                                personajesEnemigos.obtenerContenido(j).aumentarOQuitarVida(-daño);

                                if (personajesEnemigos.obtenerContenido(j).obtenerVida() == 0) {
                                    for (int k = 1; k <= tablero.getLongitud(); k++) {
                                        if (tablero.obtenerContenido(k).obtenerFila() == filaAtacada && tablero.obtenerContenido(k).obtenerColumna() == columnaAtacada) {
                                            tablero.obtenerContenido(k).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + personajesEnemigos.obtenerContenido(j).getCasillaActual() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                            tablero.obtenerContenido(k).cambiarTipoDeCasilla(personajesEnemigos.obtenerContenido(j).getCasillaActual());
                                        }
                                    }
                                    accion = "La Gargola (" + fila + "," + columna + ") dejó fuera de Combate a " + personajesEnemigos.obtenerContenido(j).obtenerNombre();
                                    personajesEnemigos.eliminar(j);
                                } else {
                                    accion = "La Gargola (" + fila + "," + columna + ") atacó a " + personajesEnemigos.obtenerContenido(j).obtenerNombre() + " dejandoló con " + personajesEnemigos.obtenerContenido(j).obtenerVida() + " de vida";
                                }
                                encontroAlgo = true;
                                salir = true;
                                break;
                            }
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    distanciaAEnviar = i;
                    
                    if (salir) {
                        break;
                    }
                }
            }
            if (!encontroAlgo) {
                accion = "La Gargola (" + fila + "," + columna + ") atacó pero no habia Objetivos Cerca";
            }
            
            HiloDelAtaqueNormal iniciar = new HiloDelAtaqueNormal(tablero, distanciaAEnviar, fila, columna, comando);
            iniciar.start();
        } else {
            accion = "La Gargola (" + fila + "," + columna + ") falló el Ataque";
        }
        accionesEnemigos.agregarALaLista(accion);
    }
}
