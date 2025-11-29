package com.mycompany.proyecto_1_ipc1.main.motorDelJuego;

import com.mycompany.proyecto_1_ipc1.main.casillas.Arbol;
import com.mycompany.proyecto_1_ipc1.main.objetos.*;
import com.mycompany.proyecto_1_ipc1.main.personajes.*;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Batalla {
    
    private int filasDelTablero = 0, columnasDelTablero = 0, indiceJugadorEnJuego, fila, columna, nivel, ganador = 0;
    private Tablero tablero;
    private Personaje[] jugador, enemigos = new Personaje[5];
    private Personaje copiaJugador_1, copiaJugador_2;
    private int copiaVidaJugador_1, copiaVidaJugador_2;
    private Arbol[] arboles = new Arbol[5];
    private String[][] tableroAJugar;
    private String[] casillasActuales = new String[5], casillasAnteriores  = new String[5];
    private String nombreDelJugador, casillaAnterior, casillaActual, color_GREEN = "\u001B[32m", restaurar = "\u001B[0m", color_PURPLE = "\u001B[35m", color_RED = "\u001B[31m",color_BLUE = "\u001B[34m", color_YELOW  = "\u001B[33m";
    private Objeto[] objetos;
    private boolean salirDelJuego = false, notificarPerdidaDePersonaje = false;
    
    public Batalla(Tablero tablero, Personaje[] jugador, Objeto[] objetos, String nombreDelJugador, int nivel) {
        this.tablero = tablero;
        this.jugador = jugador;
        this.objetos = objetos;
        this.nombreDelJugador = nombreDelJugador;
        copiaJugador_1 = jugador[0];
        copiaJugador_2 = jugador[1];
        copiaVidaJugador_1 = jugador[0].obtenerVida();
        copiaVidaJugador_2 = jugador[1].obtenerVida();
        this.nivel = nivel;
    }
    
    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        boolean primeraVuelta = false;
        casillasAnteriores[0] = " ."; casillasAnteriores[1] = " ."; casillasAnteriores[2] = " ."; casillasAnteriores[3] = " ."; casillasAnteriores[4] = " ."; 
        tableroAJugar = tablero.getTablero();
        String[][] copiaDelTablero = new String[tablero.getX()][tablero.getY()];
        filasDelTablero = tablero.getX();
        columnasDelTablero = tablero.getY();
        
        for (int i = 0; i < filasDelTablero; i++) {
            for (int j = 0; j < columnasDelTablero; j++) {
                copiaDelTablero[i][j] = tableroAJugar[i][j];
            }
        }      
        
        tablero.generarTablero(arboles);
        seleccionarJugador();
        seleccionarEnemigos();
                
        System.out.println(color_GREEN + "   BATALLA" + restaurar);
        System.out.println();
        while (!salirDelJuego) {

            if (primeraVuelta) {
                if (jugador[0] != null || jugador[1] != null) {
                    preguntarCambioDePersonaje();
                }
                if (objetos[0] != null || objetos[1] != null || objetos[2] != null || objetos[3] != null || objetos[4] != null || objetos[5] != null || objetos[6] != null || objetos[7] != null || objetos[8] != null || objetos[9] != null) {
                    preguntarUtilizacionDeObjetos();
                } 
            }
            
            boolean paso = false;
            int decision_2 = 0;
            
            while (!paso) {
                imprimirTablero();
                System.out.println();
                System.out.println("--------------------------------------");
                System.out.println(String.format("Nombre: %s, Daño: %s, Vida: %s", color_PURPLE + jugador[indiceJugadorEnJuego].mandarNombre() + restaurar, color_PURPLE + jugador[indiceJugadorEnJuego].obtenerDaño() + restaurar, color_PURPLE + jugador[indiceJugadorEnJuego].obtenerVida() + restaurar));
                System.out.println("--------------------------------------");
                System.out.println();
                System.out.println("Escribe el Número de la acción que deseas Realizar:");
                System.out.println("    1. Mover");
                System.out.println("    2. Atacar");
                System.out.println("    3. Regresar al Menú Principal");
                decision_2 = Integer.parseInt(scanner.nextLine());
                System.out.println();
                
                if (decision_2 == 1) {
                    if (verificarMovimientoJugador()) {
                        jugador[indiceJugadorEnJuego].moverPersonaje(tableroAJugar,casillaAnterior,filasDelTablero,columnasDelTablero);
                        fila = jugador[indiceJugadorEnJuego].getFila();
                        columna = jugador[indiceJugadorEnJuego].getColumna();
                        casillaActual = jugador[indiceJugadorEnJuego].getCasillaActual();
                        casillaAnterior = casillaActual;
                        primeraVuelta = true;
                        paso = true;
                    }
                } else if (decision_2 == 2) {
                    jugador[indiceJugadorEnJuego].atacarPersonaje(tableroAJugar,arboles,enemigos,filasDelTablero,columnasDelTablero,1);

                    if (enemigos[0] == null && enemigos[1] == null && enemigos[2] == null && enemigos[3] == null && enemigos[4] == null) {
                        ganador = 1;
                        salirDelJuego = true;
                    }
                    primeraVuelta = true;
                    paso = true;
                } else if (decision_2 == 3) {
                    boolean deseaSalir = false;
                    
                    while (!deseaSalir) {
                        System.out.println("Si sales del Juego no Obtendras Oro y no recuperarás los Objetos Usados:");
                        System.out.println("    1. Salir de todas Formas");
                        System.out.println("    2. Seguir Jugando");
                        int decision = Integer.parseInt(scanner.nextLine());
                        System.out.println();
                        
                        if (decision == 1) {
                            paso = true;
                            salirDelJuego = true;
                            deseaSalir = true;
                        } else if (decision == 2) {
                            deseaSalir = true;
                        } else {
                            imprimirError();
                            System.out.println();
                        }
                    }
                } else {
                    imprimirError();
                    System.out.println();
                }
            }
            
            if (ganador == 0) {
                if (decision_2 == 1 || decision_2 == 2) {
                    System.out.println();
                    System.out.println(color_GREEN + "  Información del Enemigo:" + restaurar);
                    System.out.println(color_GREEN + "--------------------------------------------------------------------" + restaurar);
                    
                    for (int i = 0; i < 5; i++) {
                        double random = Math.random();

                        if (enemigos[i] != null) {
                            if (!verificarMovimientoEnemigo(i)) {
                                random = 0.75;
                            }
                            if ("Flor Carnivora".equals(enemigos[i].mandarNombre())) {
                                random = 0.75;
                            }
                            if (random < 0.50) {
                                enemigos[i].moverPersonaje(tableroAJugar,casillasAnteriores[i],filasDelTablero,columnasDelTablero);
                                casillasActuales[i] = enemigos[i].getCasillaActual();
                                casillasAnteriores[i] = casillasActuales[i];
                            } else {
                                double random_1 = Math.random();
                                
                                if (random_1 < 0.60) {
                                    enemigos[i].atacarPersonaje(tableroAJugar,arboles,jugador,filasDelTablero,columnasDelTablero,indiceJugadorEnJuego);
                                    
                                    if (jugador[0] == null && jugador[1] == null) {
                                        ganador = 2;
                                        salirDelJuego = true;
                                    }
                                } else {
                                    System.out.println("    * El " + enemigos[i].mandarNombre() + " falló el Ataque");
                                }
                            }
                        }
                    }
                    System.out.println(color_GREEN + "--------------------------------------------------------------------" + restaurar);
                    System.out.println();
                    
                    if (ganador != 2 && " L".equals(casillaAnterior)) {
                        System.out.println(color_YELOW + "  Personaje sobre Lava" + restaurar);
                        System.out.println(color_YELOW + "-----------------------------------------------------------" + restaurar);
                        System.out.println("    * El " + jugador[indiceJugadorEnJuego].mandarNombre() + " esta parado en Lava pierde 5% de Vida");
                        System.out.println(color_YELOW + "-----------------------------------------------------------" + restaurar);
                        int quitarVida = jugador[indiceJugadorEnJuego].obtenerVida();
                        quitarVida = (int) (quitarVida * 0.05);
                        jugador[indiceJugadorEnJuego].aumentarOQuitarVida(-quitarVida);
                    }
                    if (ganador != 2) {
                        int contador = 0;
                        
                        for (int i = 0; i < 5; i++) {
                            if (" L".equals(casillasAnteriores[i])) {
                                contador++;
                            }
                        }
                        
                        if (contador != 0) {
                            System.out.println(color_YELOW + "  Enemigo sobre Lava" + restaurar);
                            for (int i = 0; i < 5; i++) {
                                if (" L".equals(casillasAnteriores[i])) {
                                    System.out.println(color_YELOW + "------------------------------------------------------------" + restaurar);
                                    System.out.println("    * El " + enemigos[i].mandarNombre() + " esta parado en Lava pierde 5% de Vida");
                                    System.out.println(color_YELOW + "------------------------------------------------------------" + restaurar);
                                    int quitarVida = enemigos[i].obtenerVida();
                                    quitarVida = (int) (quitarVida * 0.05);
                                    enemigos[i].aumentarOQuitarVida(-quitarVida);
                                }
                            }
                        }
                    }
                }
            }
        }                        
        for (int i = 0; i < filasDelTablero; i++) {
            for (int j = 0; j < columnasDelTablero; j++) {
                tableroAJugar[i][j] = copiaDelTablero[i][j];
            }
        }
        if (jugador[0] == null) {
            jugador[0] = copiaJugador_1;
            jugador[0].restablecerVida(copiaVidaJugador_1);
        } else {
            jugador[0].restablecerVida(copiaVidaJugador_1);
        }
        if (jugador[1] == null) {
            jugador[1] = copiaJugador_2;
            jugador[1].restablecerVida(copiaVidaJugador_2);
        } else {
            jugador[1].restablecerVida(copiaVidaJugador_2);
        }
    }
    
    private void preguntarUtilizacionDeObjetos() {
        Scanner scanner = new Scanner(System.in);
        boolean paso = false, objetoSeleccionado = false;
        
        while (!paso) {
            System.out.println(nombreDelJugador + " ¿Desea utilizar un Objeto?, Escribe el Número de tu Respuesta");
            System.out.println("    1. Si");
            System.out.println("    2. No");
            int decision_1 = Integer.parseInt(scanner.nextLine());
            System.out.println();

            if (decision_1 == 1) {
                paso = true;
                
                while (!objetoSeleccionado) {
                    System.out.println();
                    System.out.println("Escribe el Número del Objeto que desea Utilizar:");
                    for (int i = 0; i < 10; i++) {
                        if (objetos[i] != null) {
                            System.out.println(String.format("    " + (i + 1) + ". Nombre: %s", objetos[i].getNombre()));
                        } else {
                            System.out.println(String.format("    " + (i + 1) + ". Nombre: %s", "---------"));
                        }
                    }
                    System.out.println("    11. Salir del Menú de Objetos");
                    int numeroDeObjeto = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                    
                    if (numeroDeObjeto > 0 && numeroDeObjeto < 11) {                       
                        if (objetos[numeroDeObjeto - 1] != null) {
                            if ("Semilla de la Vida".equals(objetos[numeroDeObjeto - 1].getNombre())) {
                                if (jugador[0] != null && jugador[1] != null) {
                                    System.out.println("------------------------------------------------------------------");
                                    System.out.println("Ambos Personajes estan vivos, no puedes usar la Semilla de la Vida");
                                    System.out.println("------------------------------------------------------------------");
                                } else {
                                    SemillaDeLaVida invocar = (SemillaDeLaVida) objetos[numeroDeObjeto - 1];
                                    invocar.resucitarPersonaje(jugador, copiaJugador_1, copiaJugador_2, copiaVidaJugador_1, copiaVidaJugador_2);
                                    notificarPerdidaDePersonaje = false;
                                    objetos[numeroDeObjeto - 1] = null;
                                    for (int i = numeroDeObjeto - 1; i < 10; i++) {
                                        if (i != 9) {
                                            objetos[i] = objetos[i + 1];
                                        } else {
                                            objetos[i] = null;
                                        }
                                    }
                                    objetoSeleccionado = true;
                                }
                            } else if ("Elixir Verde".equals(objetos[numeroDeObjeto - 1].getNombre())) {
                                int vidaAComprar = 0;
                                
                                if (indiceJugadorEnJuego == 0) {
                                    vidaAComprar = copiaVidaJugador_1;
                                } else {
                                    vidaAComprar = copiaVidaJugador_2;
                                }
                                
                                if (jugador[indiceJugadorEnJuego].obtenerVida() == vidaAComprar) {
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println(jugador[indiceJugadorEnJuego].mandarNombre() + " tiene la Vida al Máximo, no se puede Recuperar");
                                    System.out.println("--------------------------------------------------------");
                                } else {
                                    ElixirVerde invocar = (ElixirVerde) objetos[numeroDeObjeto - 1];
                                    invocar.recuperarVida(jugador[indiceJugadorEnJuego],vidaAComprar);
                                    objetos[numeroDeObjeto - 1] = null;
                                    objetoSeleccionado = true;
                                    for (int i = numeroDeObjeto - 1; i < 10; i++) {
                                        if (i != 9) {
                                            objetos[i] = objetos[i + 1];
                                        } else {
                                            objetos[i] = null;
                                        }
                                    }
                                    objetoSeleccionado = true;
                                }
                            } else {
                                boolean moverse = false;                               
                                imprimirTablero();
                                CapaDeMovilidad invocar = (CapaDeMovilidad) objetos[numeroDeObjeto - 1];
                                
                                if (jugador[indiceJugadorEnJuego].saberSiPuedeVolar()) {
                                    invocar.activarCapa_2(tableroAJugar,fila,columna,casillaAnterior,tablero.getX(),tablero.getY(),jugador[indiceJugadorEnJuego].obtenerLetra());
                                    moverse = true;
                                } else {
                                    if (invocar.verAlcanceDelaCapa(tableroAJugar,fila,columna,tablero.getX(),tablero.getY())) {
                                        invocar.activarCapa_1(tableroAJugar,fila,columna,casillaAnterior,tablero.getX(),tablero.getY(),jugador[indiceJugadorEnJuego].obtenerLetra());
                                        moverse = true;
                                    } else {
                                        System.out.println();
                                        System.out.println("-------------------------------------------------");
                                        System.out.println("No se puede Activar la Capa, no hay donde Moverse");
                                        System.out.println("-------------------------------------------------");
                                        moverse = false;
                                    }
                                }
                                
                                if (moverse) {
                                    fila = invocar.mandarFilaNueva();
                                    columna = invocar.mandarColumnaNueva();
                                    jugador[indiceJugadorEnJuego].recibirFila(fila);
                                    jugador[indiceJugadorEnJuego].recibirColumna(columna);
                                    casillaActual = invocar.mandarCasillaActual();
                                    casillaAnterior = casillaActual;
                                    objetos[numeroDeObjeto - 1] = null;

                                    for (int i = numeroDeObjeto - 1; i < 10; i++) {
                                        if (i != 9) {
                                            objetos[i] = objetos[i + 1];
                                        } else {
                                            objetos[i] = null;
                                        }
                                    }
                                    objetoSeleccionado = true;
                                }
                            }
                        } else {
                            System.out.println("------------------------------");
                            System.out.println("No hay Objetos en esta Casilla");
                            System.out.println("------------------------------");
                        }
                    } else if (numeroDeObjeto == 11) {
                        objetoSeleccionado = true;
                    } else {
                        imprimirError();
                    }
                }                
            } else if (decision_1 == 2) {
                paso = true;
            } else {
                imprimirError();
                System.out.println();
            }
        }
    }
    
    public void preguntarCambioDePersonaje() {
        Scanner scanner = new Scanner(System.in);
        boolean paso = false;
        
        while (!paso) {           
            if (jugador[0] != null && jugador[1] != null) {
                System.out.println();
                System.out.println(nombreDelJugador + " ¿Desea cambiar de Personaje?, Escribe el Número de tu Respuesta");
                System.out.println("    1. Si");
                System.out.println("    2. No");
                int decision_1 = Integer.parseInt(scanner.nextLine());
                System.out.println();

                if (decision_1 == 1) {
                    if (" A".equals(jugador[indiceJugadorEnJuego].getCasillaActual()) || " a".equals(jugador[indiceJugadorEnJuego].getCasillaActual())) {
                        if (indiceJugadorEnJuego == 0) {
                            indiceJugadorEnJuego = 1;
                        } else {
                            indiceJugadorEnJuego = 0;
                        }
                        
                        if (jugador[indiceJugadorEnJuego].saberSiPuedeVolar()) {
                            tableroAJugar[fila][columna] = jugador[indiceJugadorEnJuego].obtenerLetra();
                            jugador[indiceJugadorEnJuego].recibirFila(fila);
                            jugador[indiceJugadorEnJuego].recibirColumna(columna);
                            paso = true; 
                        } else {
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("No se pudo Realizar el cambio dado que otro personaje no puede Volar");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println();
                            
                            if (indiceJugadorEnJuego == 0) {
                                indiceJugadorEnJuego = 1;
                            } else {
                                indiceJugadorEnJuego = 0;
                            }
                            paso = true;
                        }
                    } else {
                        if (indiceJugadorEnJuego == 0) {
                            indiceJugadorEnJuego = 1;
                        } else {
                            indiceJugadorEnJuego = 0;
                        }
                        tableroAJugar[fila][columna] = jugador[indiceJugadorEnJuego].obtenerLetra();
                        jugador[indiceJugadorEnJuego].recibirFila(fila);
                        jugador[indiceJugadorEnJuego].recibirColumna(columna);
                        paso = true; 
                    }
                } else if (decision_1 == 2) {
                    paso = true;
                } else {
                    imprimirError();
                }
            } else if (jugador[0] == null && jugador[1] == null) {
                salirDelJuego = true;
            } else {
                if (!notificarPerdidaDePersonaje) {
                    if (indiceJugadorEnJuego == 0) {
                        indiceJugadorEnJuego = 1;
                    } else {
                        indiceJugadorEnJuego = 0;
                    }
                    System.out.println(color_RED + "    MENSAJE URGENTE" + restaurar);
                    System.out.println(color_RED + "---------------------------------------------------" + restaurar);
                    System.out.println("    * " + nombreDelJugador + " Perdiste a uno de tus Personajes");
                    System.out.println("    * Tú unico Personaje en Batalla es: ("  + jugador[indiceJugadorEnJuego].mandarNombre() +")");
                    System.out.println(color_RED + "---------------------------------------------------" + restaurar);
                    colocarPersonaje();
                    notificarPerdidaDePersonaje = true;
                }
                paso = true;
            }
        }
    }
    
    private void seleccionarJugador() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0, contador = 0;
        
        while (contador != 1) {
            System.out.println(color_GREEN + "   SELECCIÓN PERSONAJE PRINCIPAl" + restaurar);
            System.out.println();
            System.out.println("Escriba el Número del Personaje con el que desea empezar la Partida:");
            System.out.println("    1. " + jugador[0].mandarNombre());
            System.out.println("    2. " + jugador[1].mandarNombre());
            opcion = Integer.parseInt(scanner.nextLine());
            System.out.println();

            if (opcion == 1) {
                indiceJugadorEnJuego = 0;
                System.out.println("-------------------------------------------------------");
                System.out.println(jugador[0].mandarNombre() + " ha sido Seleccionado como Personaje Principal");
                System.out.println("-------------------------------------------------------");
                System.out.println();
                contador = 1;
            } else if (opcion == 2) {
                indiceJugadorEnJuego = 1;
                System.out.println("-------------------------------------------------------");
                System.out.println(jugador[1].mandarNombre() + " ha sido Seleccionado como Personaje Principal");
                System.out.println("-------------------------------------------------------");
                System.out.println();
                contador = 1;
            } else {
                imprimirError();
                System.out.println();
            }
        }
        colocarPersonaje();
    }
    
    private void colocarPersonaje() {
        Scanner scanner = new Scanner(System.in);
        boolean paso = false;
        
        while (!paso) {
            System.out.println();
            imprimirTablero();
            System.out.println();
            System.out.println("Escriba las coordenadas donde desea colocar al Personaje");
            System.out.println();
            System.out.println("Escriba el Número de la Fila");
            int filaSeleccionada = Integer.parseInt(scanner.nextLine());
            System.out.println("Escriba el Número de la Columna");
            int columnaSeleccionada = Integer.parseInt(scanner.nextLine());
            System.out.println();
            
            if (filaSeleccionada > 0 && filaSeleccionada < filasDelTablero && columnaSeleccionada > 0 && columnaSeleccionada < columnasDelTablero) {
                
                if (jugador[indiceJugadorEnJuego].saberSiPuedeVolar()) {
                    
                    if (!" O".equals(tableroAJugar[filaSeleccionada][columnaSeleccionada]) && !" B".equals(tableroAJugar[filaSeleccionada][columnaSeleccionada]) && !" g".equals(tableroAJugar[filaSeleccionada][columnaSeleccionada]) && !" c".equals(tableroAJugar[filaSeleccionada][columnaSeleccionada]) && !" F".equals(tableroAJugar[filaSeleccionada][columnaSeleccionada])) {
                        casillaAnterior = tableroAJugar[filaSeleccionada][columnaSeleccionada];
                        fila = filaSeleccionada;
                        columna = columnaSeleccionada;
                        tableroAJugar[filaSeleccionada][columnaSeleccionada] = jugador[indiceJugadorEnJuego].obtenerLetra();
                        jugador[indiceJugadorEnJuego].recibirFila(fila);
                        jugador[indiceJugadorEnJuego].recibirColumna(columna);
                        paso = true;
                    } else {
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("No puedes poner a tu Personaje en la Posición de un Enemigo");
                        System.out.println("-----------------------------------------------------------");
                    }
                } else {
                    
                    if (!" O".equals(tableroAJugar[filaSeleccionada][columnaSeleccionada]) && !" B".equals(tableroAJugar[filaSeleccionada][columnaSeleccionada]) && !" g".equals(tableroAJugar[filaSeleccionada][columnaSeleccionada]) && !" c".equals(tableroAJugar[filaSeleccionada][columnaSeleccionada]) && !" F".equals(tableroAJugar[filaSeleccionada][columnaSeleccionada])) {
                         
                        if (!" A".equals(tableroAJugar[filaSeleccionada][columnaSeleccionada]) && !" a".equals(tableroAJugar[filaSeleccionada][columnaSeleccionada])) {
                            casillaAnterior = tableroAJugar[filaSeleccionada][columnaSeleccionada];
                            fila = filaSeleccionada;
                            columna = columnaSeleccionada;
                            tableroAJugar[filaSeleccionada][columnaSeleccionada] = jugador[indiceJugadorEnJuego].obtenerLetra();
                            jugador[indiceJugadorEnJuego].recibirFila(fila);
                            jugador[indiceJugadorEnJuego].recibirColumna(columna);
                            paso = true;
                        } else {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("Este Personaje no vuela no puedes ponerlo sobre A o a");
                            System.out.println("-----------------------------------------------------");
                        }
                    } else {
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("No puedes poner a tu Personaje en la Posición de un Enemigo");
                        System.out.println("-----------------------------------------------------------");
                    }
                }
            } else {
                System.out.println("-------------------------------------------------");
                System.out.println("Coordenada fuera de Alcance, Intentalo Nuevamente");
                System.out.println("-------------------------------------------------");
            }
        }
    }
    
    private void seleccionarEnemigos() {
        int numeroDeEnemigos;
        enemigos[0] = null; enemigos[1] = null; enemigos[2] = null; enemigos[3] = null; enemigos[4] = null;
        
        if (nivel == 1) {
            numeroDeEnemigos = 2;
        } else if (nivel == 2) {
            numeroDeEnemigos = 3;
        } else if (nivel == 3) {
            numeroDeEnemigos = 4;
        } else {
            numeroDeEnemigos = 5;
        }
        
        for (int i = 0; i < numeroDeEnemigos; i++) {
            double personaje = Math.random();
            Personaje nuevoPersonaje = null;
            
            if (personaje < 0.20) {
                nuevoPersonaje = new Ogro();
            } else if (personaje >= 0.20 && personaje < 0.40) {
                nuevoPersonaje = new Gargola();
            } else if (personaje >= 0.40 && personaje < 0.60) {
                nuevoPersonaje = new Bruja();
            } else if (personaje >= 0.60 && personaje < 0.80) {
                nuevoPersonaje = new Cancerbero();
            } else {
                nuevoPersonaje = new FlorCarnivora();
            }     
            enemigos[i] = nuevoPersonaje;
            boolean tieneCasilla = false;
            
            while (!tieneCasilla) {
                int fila = (int) (Math.random()*tablero.getX());
                int columna = (int) (Math.random()*tablero.getY());
                
                if (tableroAJugar[fila][columna].equals(" .")) {
                    tableroAJugar[fila][columna] = enemigos[i].obtenerLetra();
                    enemigos[i].recibirFila(fila);
                    enemigos[i].recibirColumna(columna);
                    tieneCasilla = true;
                }
            }
        }
    }
    
    public boolean verificarMovimientoJugador() {
        int filasDelMapa = tablero.getX(), columnasDelMapa = tablero.getY(); 
        int numero = 1;
        boolean puedeMoverse = false;
       
        int distancia = 0;

        if (numero == 1) {
            distancia = columna - 1;

            while (distancia <= 0) {
                distancia++;
            }
            if (distancia == columna) {
                numero = 2;
            } else {
                if (jugador[indiceJugadorEnJuego].saberSiPuedeVolar()) {
                    if (tableroAJugar[fila][columna - 1].equals(" .") || tableroAJugar[fila][columna - 1].equals(" L") || tableroAJugar[fila][columna - 1].equals(" A") || tableroAJugar[fila][columna - 1].equals(" a")) {
                        puedeMoverse = true;
                    } else {
                        numero = 2;
                    }
                } else {
                    if (tableroAJugar[fila][columna - 1].equals(" .") || tableroAJugar[fila][columna - 1].equals(" L")) {
                        puedeMoverse = true;
                    } else {
                        numero = 2;
                    }
                }
            }
        }
        if (numero == 2) {
            distancia = columna + 1;

            while (distancia >= columnasDelMapa) {
                distancia--;
            }
            if (distancia == columna) {
                numero = 3;
            } else {
                if (jugador[indiceJugadorEnJuego].saberSiPuedeVolar()) {
                    if (tableroAJugar[fila][columna + 1].equals(" .") || tableroAJugar[fila][columna + 1].equals(" L") || tableroAJugar[fila][columna + 1].equals(" A") || tableroAJugar[fila][columna + 1].equals(" a")) {
                        puedeMoverse = true;
                    } else {
                        numero = 3;
                    }
                } else {
                    if (tableroAJugar[fila][columna + 1].equals(" .") || tableroAJugar[fila][columna + 1].equals(" L")) {
                        puedeMoverse = true;
                    } else {
                        numero = 3;
                    }
                }
            }
        }
        if (numero == 3) {
            distancia = fila - 1;

            while (distancia <= 0) {
                distancia++;
            }
            if (distancia == fila) {
                numero = 4;
            } else {
                if (jugador[indiceJugadorEnJuego].saberSiPuedeVolar()) {
                    if (tableroAJugar[fila - 1][columna].equals(" .") || tableroAJugar[fila - 1][columna].equals(" L") || tableroAJugar[fila - 1][columna].equals(" A") || tableroAJugar[fila - 1][columna].equals(" a")) {
                        puedeMoverse = true;
                    } else {
                        numero = 4;
                    }
                } else {
                    if (tableroAJugar[fila - 1][columna].equals(" .") || tableroAJugar[fila - 1][columna].equals(" L")) {
                        puedeMoverse = true;
                    } else {
                        numero = 4;
                    }
                }
            }
        }
        if (numero == 4) {
            distancia = fila + 1;

            while (distancia >= filasDelMapa) {
                distancia--;
            }
            if (distancia != fila) {
                if (jugador[indiceJugadorEnJuego].saberSiPuedeVolar()) {
                    if (tableroAJugar[fila + 1][columna].equals(" .") || tableroAJugar[fila + 1][columna].equals(" L") || tableroAJugar[fila + 1][columna].equals(" A") || tableroAJugar[fila + 1][columna].equals(" a")) {
                        puedeMoverse = true;
                    }
                } else {
                    if (tableroAJugar[fila + 1][columna].equals(" .") || tableroAJugar[fila + 1][columna].equals(" L")) {
                        puedeMoverse = true;
                    }
                }
            }
        }
        if (!puedeMoverse) {
            System.out.println("--------------------------------");
            System.out.println("No puedes moverte esta Encerrado");
            System.out.println("Solo puedes Atacar");
            System.out.println("--------------------------------");
            System.out.println();
        }
        return puedeMoverse;
    }
    
    public boolean verificarMovimientoEnemigo(int indice) {
        int fila = enemigos[indice].getFila(), columna = enemigos[indice].getColumna();
        int filasDelMapa = tablero.getX(), columnasDelMapa = tablero.getY(); 
        int numero = 1;
        boolean puedeMoverse = false;
       
        int distancia = 0;

        if (numero == 1) {
            distancia = columna - 1;

            while (distancia <= 0) {
                distancia++;
            }
            if (distancia == columna) {
                numero = 2;
            } else {
                if (enemigos[indice].saberSiPuedeVolar()) {
                    if (tableroAJugar[fila][columna - 1].equals(" .") || tableroAJugar[fila][columna - 1].equals(" L") || tableroAJugar[fila][columna - 1].equals(" A") || tableroAJugar[fila][columna - 1].equals(" a")) {
                        puedeMoverse = true;
                    } else {
                        numero = 2;
                    }
                } else {
                    if (tableroAJugar[fila][columna - 1].equals(" .") || tableroAJugar[fila][columna - 1].equals(" L")) {
                        puedeMoverse = true;
                    } else {
                        numero = 2;
                    }
                }
            }
        }
        if (numero == 2) {
            distancia = columna + 1;

            while (distancia >= columnasDelMapa) {
                distancia--;
            }
            if (distancia == columna) {
                numero = 3;
            } else {
                if (enemigos[indice].saberSiPuedeVolar()) {
                    if (tableroAJugar[fila][columna + 1].equals(" .") || tableroAJugar[fila][columna + 1].equals(" L") || tableroAJugar[fila][columna + 1].equals(" A") || tableroAJugar[fila][columna + 1].equals(" a")) {
                        puedeMoverse = true;
                    } else {
                        numero = 3;
                    }
                } else {
                    if (tableroAJugar[fila][columna + 1].equals(" .") || tableroAJugar[fila][columna + 1].equals(" L")) {
                        puedeMoverse = true;
                    } else {
                        numero = 3;
                    }
                }
            }
        }
        if (numero == 3) {
            distancia = fila - 1;

            while (distancia <= 0) {
                distancia++;
            }
            if (distancia == fila) {
                numero = 4;
            } else {
                if (enemigos[indice].saberSiPuedeVolar()) {
                    if (tableroAJugar[fila - 1][columna].equals(" .") || tableroAJugar[fila - 1][columna].equals(" L") || tableroAJugar[fila - 1][columna].equals(" A") || tableroAJugar[fila - 1][columna].equals(" a")) {
                        puedeMoverse = true;
                    } else {
                        numero = 4;
                    }
                } else {
                    if (tableroAJugar[fila - 1][columna].equals(" .") || tableroAJugar[fila - 1][columna].equals(" L")) {
                        puedeMoverse = true;
                    } else {
                        numero = 4;
                    }
                }
            }
        }
        if (numero == 4) {
            distancia = fila + 1;

            while (distancia >= filasDelMapa) {
                distancia--;
            }
            if (distancia != fila) {
                if (enemigos[indice].saberSiPuedeVolar()) {
                    if (tableroAJugar[fila + 1][columna].equals(" .") || tableroAJugar[fila + 1][columna].equals(" L") || tableroAJugar[fila + 1][columna].equals(" A") || tableroAJugar[fila + 1][columna].equals(" a")) {
                        puedeMoverse = true;
                    }
                } else {
                    if (tableroAJugar[fila + 1][columna].equals(" .") || tableroAJugar[fila + 1][columna].equals(" L")) {
                        puedeMoverse = true;
                    }
                }
            }
        }
        return puedeMoverse;
    }
    
    public void imprimirTablero() {
        String COLOR = "\u001B[37m";
        String ANSI_WRITE = "\u001B[37m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_YELOW = "\u001B[33m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        
        for (int i = 0; i < filasDelTablero; i++){						
            for (int j = 0; j < columnasDelTablero; j++) {
                
                if (" C".equals(tableroAJugar[i][j]) || " Q".equals(tableroAJugar[i][j]) || " M".equals(tableroAJugar[i][j]) || " G".equals(tableroAJugar[i][j]) || " D".equals(tableroAJugar[i][j])) {
                    COLOR = ANSI_PURPLE;
                } else if (" a".equals(tableroAJugar[i][j])) {
                    COLOR = ANSI_BLUE;
                } else if (" A".equals(tableroAJugar[i][j])) {
                    COLOR = ANSI_GREEN;
                } else if (" L".equals(tableroAJugar[i][j])) {
                    COLOR = ANSI_YELOW;
                } else if (" .".equals(tableroAJugar[i][j])) {
                    COLOR = ANSI_WRITE;
                } else if (" O".equals(tableroAJugar[i][j]) || " g".equals(tableroAJugar[i][j]) || " B".equals(tableroAJugar[i][j]) || " c".equals(tableroAJugar[i][j]) || " F".equals(tableroAJugar[i][j])) {
                    COLOR = ANSI_RED;
                } else {
                    COLOR = ANSI_WRITE;
                }
                System.out.print(COLOR + tableroAJugar[i][j] + ANSI_RESET);
            }
            System.out.println();
        }
    }
    
    private void imprimirError() {
        System.out.println("---------------------------------------");
        System.out.println("Número Incorrecto, Intentelo Nuevamente");
        System.out.println("---------------------------------------");
    }
    
    public int mandarOro() {
        
        if (ganador == 1) {
            System.out.println();
            System.out.println(color_BLUE + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°" + restaurar);
            System.out.println("    Felicidades " + nombreDelJugador + " destruiste a todos los Enemigos");
            System.out.println("    Ganaste 250 de Oro");
            System.out.println(color_BLUE + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°" + restaurar);
            return 250;
        } else if (ganador == 2) {
            System.out.println(color_BLUE + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°" + restaurar);
            System.out.println("    Mala Suerte " + nombreDelJugador + " todo tu Equipo cayó en Batalla");
            System.out.println("    Perdiste, Intentalo Nuevamente");
            System.out.println(color_BLUE + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°" + restaurar);
            return 0;
        } else {
            System.out.println(color_BLUE + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°" + restaurar);
            System.out.println("    " + nombreDelJugador + " es una lastima que tengas que abandonar la Batalla");
            System.out.println("    Puedes volver Iniciar una Nueva en el Menú Principal");
            System.out.println(color_BLUE + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°" + restaurar);
            return 0;
        }
    }
}