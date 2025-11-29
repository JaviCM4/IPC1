package com.mycompany.aventura.main.personajes;

import com.mycompany.aventura.main.hilos.HiloDelAtaqueNormal;
import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.tablero.Arbol;
import com.mycompany.aventura.main.tablero.Casilla;
import java.util.Random;
import javax.swing.ImageIcon;

public class Bruja extends Personaje {

    public Bruja(String nombre) {
        super.nombre = nombre;
        tipo = "bruja";
        daño = 45;
        vida = 150;
        movilidad = 1;
        punteo = 100;
        porcentajeDeEfectividad = 0.60;
        puedeVolar = true;
    }

    @Override
    public void moverPersonaje(ListaElementos<Casilla> tablero, String casillaAnterior, String direccionNoUtilizada, ListaElementos<String> accionesEnemigos) {
        boolean paso = false, salir = false;
        String casillaAGuardar = null, comando = null, accion = null;
 
        while (!paso) {
            int espaciosLibres = 0;
            boolean hayObstaculos = true, seMovio = true;
            
            Random random = new Random();
            int direccion = (random.nextInt(5) + 1);

            int distancia_1 = 0;

            if (direccion == 1) {
                comando = "a";
                distancia_1 = columna - 1;
            } else if (direccion == 2) {
                comando = "d";
                distancia_1 = columnasDelTablero - columna;
            } else if (direccion == 3) {
                comando = "w";
                distancia_1 = fila - 1;
            } else {
                comando = "s";
                distancia_1 = filasDelTablero - fila;
            }
            
            if (distancia_1 == 0) {
                seMovio = false;
            }
            
            if (seMovio) {
                Random random_1 = new Random();
                int distancia = (random_1.nextInt(distancia_1) + 1);
            
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
                        accion = "La Bruja (" + fila + "," + columna + ") se Movio a la Izquierda " + distancia + " Casillas";
                    } else if (comando.equals("d")) { 
                        accion = "La Bruja (" + fila + "," + columna + ") se Movio a la Derecha " + distancia + " Casillas";
                    } else if (comando.equals("w")) { 
                        accion = "La Bruja (" + fila + "," + columna + ") se Movio hacia Arriba " + distancia + " Casillas";
                    } else {
                        accion = "La Bruja (" + fila + "," + columna + ") se Movio hacia Abajo " + distancia + " Casillas";
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
        int distancia = 0, distanciaAEnviar = 0, numeroAMandar = 0;
        boolean paso = false, encontroAlgo = false;
        String accion = null;
        
        if (filasDelTablero >= columnasDelTablero) {
            numeroAMandar = filasDelTablero;
        } else {
            numeroAMandar = columnasDelTablero;
        }
        String comando = super.obtenerDireccionNormal(tablero, numeroAMandar);
                
        while (!paso) {           
            
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
                distancia = columna - 1;
            } else if ("d".equals(comando)) {
                distancia = columnasDelTablero - columna;
            } else if ("w".equals(comando)) {
                distancia = fila - 1;
            } else if ("s".equals(comando)) {
                distancia = filasDelTablero - fila;
            }
            if (distancia != 0) {
                paso = true;
            } else {
                comando = "j";
            }
        }
        
        boolean salir = false;        
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

                if (arboles.estaVacia()) {
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
                                        accion = "La Bruja (" + fila + "," + columna + ") destruyó un Árbol";
                                    } else {
                                        accion = "La Bruja (" + fila + "," + columna + ") hizó un daño de " + daño + " a un Árbol";
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
                                    accion = "La Bruja (" + fila + "," + columna + ") dejó fuera de Combate a " + personajesEnemigos.obtenerContenido(j).obtenerNombre();
                                    personajesEnemigos.eliminar(j);
                                } else {
                                    accion = "La Bruja (" + fila + "," + columna + ") atacó a " + personajesEnemigos.obtenerContenido(j).obtenerNombre() + " dejandoló con " + personajesEnemigos.obtenerContenido(j).obtenerVida() + " de vida";
                                }
                                encontroAlgo = true;
                                salir = true;
                                break;
                            }
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    if (salir) {
                        break;
                    }
                }
                distanciaAEnviar = i;
            }   
            if (!encontroAlgo) {
                accion = "La Bruja (" + fila + "," + columna + ") atacó pero no habia Objetivos Cerca";
            }
            
            HiloDelAtaqueNormal iniciar = new HiloDelAtaqueNormal(tablero, distanciaAEnviar, fila, columna, comando);
            iniciar.start();
        } else {
            accion = "La Bruja (" + fila + "," + columna + ") falló el Ataque";
        }
        accionesEnemigos.agregarALaLista(accion);
    }
}
