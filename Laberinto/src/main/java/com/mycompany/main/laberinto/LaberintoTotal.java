
package com.mycompany.main.laberinto;

import java.util.Scanner;

public class LaberintoTotal {
    char[][] matriz10 = {{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ','#','#','#','#','#','#','#','#','S','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' '},{' ','S','O','O','O','O','O','O','#','O','O','O','O','O','O','O','O','O','#','O','O','O','O','O','O','O','O','#','O','O','S',' '},{' ','#','#','#','#','#','#','O','O','#','#','#','O','#','#','#','O','#','O','O','#','#','#','#','#','#','O','O','#','O','#',' '},{' ','#','O','O','G','O','#','O','#','G','G','#','O','#','G','#','O','#','G','#','O','#','O','O','O','#','#','O','O','O','#',' '},{' ','#','O','#','#','O','#','O','O','O','O','#','G','#','O','#','O','#','#','O','O','#','O','#','O','O','#','O','#','O','#',' '},{' ','#','G','#','O','O','#','O','#','#','#','#','#','#','O','#','O','O','O','#','O','#','O','#','#','#','#','O','#','O','#',' '},{' ','#','O','#','#','O','O','O','O','O','O','#','O','#','O','O','O','O','O','O','O','O','O','#','O','O','O','O','#','#','#',' '},{' ','#','#','O','O','O','#','O','#','O','#','O','O','#','#','O','#','#','O','#','#','#','#','#','O','#','O','#','#','G','#',' '},{' ','#','O','O','#','O','#','O','O','O','#','O','#','O','#','O','O','#','O','#','O','O','O','O','O','#','O','O','#','G','#',' '},{' ','#','O','#','#','O','#','#','#','O','#','O','#','O','#','#','O','#','O','#','#','#','O','#','#','#','#','G','#','O','#',' '},{' ','#','O','O','O','O','#','O','#','O','#','O','#','O','#','O','O','#','O','O','G','#','O','O','#','O','#','O','#','O','#',' '},{' ','#','#','#','G','#','O','O','O','O','#','O','#','O','#','#','O','#','#','#','#','#','O','#','O','#','#','O','#','O','#',' '},{' ','#','O','O','#','O','O','#','#','#','O','O','#','O','#','O','O','O','O','O','O','O','O','O','O','O','#','O','#','O','#',' '},{' ','#','#','O','#','#','O','#','O','O','#','O','#','O','O','O','#','O','#','#','O','#','O','O','#','O','#','O','#','O','#',' '},{' ','#','O','O','#','O','O','#','O','#','#','O','#','G','#','O','#','#','O','O','#','O','O','#','O','O','#','O','#','O','#',' '},{' ','#','#','O','#','#','O','O','O','G','#','O','#','#','#','O','#','O','O','O','O','O','#','O','O','#','#','O','#','O','#',' '},{' ','#','O','O','#','O','O','#','O','#','#','O','O','#','O','O','#','O','#','#','#','#','#','O','#','O','#','G','#','O','#',' '},{' ','#','#','O','O','O','#','#','#','O','#','O','#','O','#','O','O','O','#','G','O','O','O','O','O','O','O','#','#','O','#',' '},{' ','#','G','#','O','#','O','O','O','O','#','O','O','#','#','#','#','#','#','#','#','#','#','#','#','#','O','O','O','O','#',' '},{' ','#','G','#','O','O','O','#','#','O','O','O','O','O','G','O','O','O','G','O','O','O','G','O','O','#','#','O','#','O','#',' '},{' ','#','O','#','#','#','#','#','O','O','#','#','#','#','#','#','#','#','#','#','#','#','#','#','O','O','#','O','#','#','#',' '},{' ','#','O','#','O','O','O','#','O','#','O','O','O','O','O','O','O','O','O','O','O','O','O','O','#','O','#','O','O','O','S',' '},{' ','#','O','O','O','#','O','#','O','O','#','O','#','#','#','#','#','#','O','#','#','#','O','O','O','O','#','O','#','#','#',' '},{' ','#','#','#','#','#','O','#','O','#','O','O','#','G','O','O','O','#','O','O','O','#','O','#','#','#','#','O','#','O','#',' '},{' ','#','O','#','O','O','O','#','O','G','#','O','#','#','#','#','O','#','#','#','O','#','O','O','O','O','#','O','O','O','#',' '},{' ','#','O','#','#','#','O','#','#','#','#','O','#','O','O','O','O','#','G','#','O','#','#','#','O','#','G','#','#','O','#',' '},{' ','#','O','#','O','O','O','O','O','O','O','O','O','O','#','O','O','#','O','#','O','O','O','O','O','#','O','#','O','O','#',' '},{' ','#','O','#','#','#','#','#','#','#','#','#','O','#','O','#','#','#','O','#','O','#','#','#','#','#','O','O','O','#','#',' '},{' ','#','O','O','O','O','O','G','#','O','O','O','O','#','O','O','O','O','O','O','O','O','O','O','O','O','O','#','O','G','#',' '},{' ','#','#','#','#','#','#','#','#','#','#','#','#','#','S','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}};
    char[][] matriz11 = {{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ','#','#','#','#','#','#','#','#','S','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' '},{' ','S','O','O','O','O','O','O','#','O','O','O','O','O','O','O','O','O','#','O','O','O','O','O','O','O','O','#','O','O','S',' '},{' ','#','#','#','#','#','#','O','O','#','#','#','O','#','#','#','O','#','O','O','#','#','#','#','#','#','O','O','#','O','#',' '},{' ','#','O','O','G','O','#','O','#','G','G','#','O','#','G','#','O','#','G','#','O','#','O','O','O','#','#','O','O','O','#',' '},{' ','#','O','#','#','O','#','O','O','O','O','#','G','#','O','#','O','#','#','O','O','#','O','#','O','O','#','O','#','O','#',' '},{' ','#','G','#','O','O','#','O','#','#','#','#','#','#','O','#','O','O','O','#','O','#','O','#','#','#','#','O','#','O','#',' '},{' ','#','O','#','#','O','O','O','O','O','O','#','O','#','O','O','O','O','O','O','O','O','O','#','O','O','O','O','#','#','#',' '},{' ','#','#','O','O','O','#','O','#','O','#','O','O','#','#','O','#','#','O','#','#','#','#','#','O','#','O','#','#','G','#',' '},{' ','#','O','O','#','O','#','O','O','O','#','O','#','O','#','O','O','#','O','#','O','O','O','O','O','#','O','O','#','G','#',' '},{' ','#','O','#','#','O','#','#','#','O','#','O','#','O','#','#','O','#','O','#','#','#','O','#','#','#','#','G','#','O','#',' '},{' ','#','O','O','O','O','#','O','#','O','#','O','#','O','#','O','O','#','O','O','G','#','O','O','#','O','#','O','#','O','#',' '},{' ','#','#','#','G','#','O','O','O','O','#','O','#','O','#','#','O','#','#','#','#','#','O','#','O','#','#','O','#','O','#',' '},{' ','#','O','O','#','O','O','#','#','#','O','O','#','O','#','O','O','O','O','O','O','O','O','O','O','O','#','O','#','O','#',' '},{' ','#','#','O','#','#','O','#','O','O','#','O','#','O','O','O','#','O','#','#','O','#','O','O','#','O','#','O','#','O','#',' '},{' ','#','O','O','#','O','O','#','O','#','#','O','#','G','#','O','#','#','O','O','#','O','O','#','O','O','#','O','#','O','#',' '},{' ','#','#','O','#','#','O','O','O','G','#','O','#','#','#','O','#','O','O','O','O','O','#','O','O','#','#','O','#','O','#',' '},{' ','#','O','O','#','O','O','#','O','#','#','O','O','#','O','O','#','O','#','#','#','#','#','O','#','O','#','G','#','O','#',' '},{' ','#','#','O','O','O','#','#','#','O','#','O','#','O','#','O','O','O','#','G','O','O','O','O','O','O','O','#','#','O','#',' '},{' ','#','G','#','O','#','O','O','O','O','#','O','O','#','#','#','#','#','#','#','#','#','#','#','#','#','O','O','O','O','#',' '},{' ','#','G','#','O','O','O','#','#','O','O','O','O','O','G','O','O','O','G','O','O','O','G','O','O','#','#','O','#','O','#',' '},{' ','#','O','#','#','#','#','#','O','O','#','#','#','#','#','#','#','#','#','#','#','#','#','#','O','O','#','O','#','#','#',' '},{' ','#','O','#','O','O','O','#','O','#','O','O','O','O','O','O','O','O','O','O','O','O','O','O','#','O','#','O','O','O','S',' '},{' ','#','O','O','O','#','O','#','O','O','#','O','#','#','#','#','#','#','O','#','#','#','O','O','O','O','#','O','#','#','#',' '},{' ','#','#','#','#','#','O','#','O','#','O','O','#','G','O','O','O','#','O','O','O','#','O','#','#','#','#','O','#','O','#',' '},{' ','#','O','#','O','O','O','#','O','G','#','O','#','#','#','#','O','#','#','#','O','#','O','O','O','O','#','O','O','O','#',' '},{' ','#','O','#','#','#','O','#','#','#','#','O','#','O','O','O','O','#','G','#','O','#','#','#','O','#','G','#','#','O','#',' '},{' ','#','O','#','O','O','O','O','O','O','O','O','O','O','#','O','O','#','O','#','O','O','O','O','O','#','O','#','O','O','#',' '},{' ','#','O','#','#','#','#','#','#','#','#','#','O','#','O','#','#','#','O','#','O','#','#','#','#','#','O','O','O','#','#',' '},{' ','#','O','O','O','O','O','G','#','O','O','O','O','#','O','O','O','O','O','O','O','O','O','O','O','O','O','#','O','G','#',' '},{' ','#','#','#','#','#','#','#','#','#','#','#','#','#','S','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}};
    char[][] matriz20, matriz21;
    String nombreMapa;
    int mapas = 1, x, y, oroMapaCreado = 2, victorias = 0, atrapadas = 0, perdidas = 0, cantidadDePartidasMapa_1 = 0, cantidadDePartidasMapa_2 = 0, posicion = 0, partidasJugadas_1 = 0;
    double oroTotal = 0.0, partidasJugadas = 0.0;
    char casillaActualBot, casillaAnteriorBot = 'G';
    
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 5) {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println();
            System.out.println("Seleccione un Número:");
            System.out.println("    1. JUGAR");
            System.out.println("    2. CREAR MAPA");
            System.out.println("    3. REPORTES");
            System.out.println("    4. VISUALIZAR MAPA");
            System.out.println("    5. SALIR");
            opcion = scanner.nextInt();
            System.out.println();
            
            if (opcion == 1) {
                
                if (mapas == 1) {
                    System.out.println("Seleccione un Número:");
                    System.out.println("    1. JUGAR");
                    System.out.println("    2. VOLVER AL MENU PRINCIPAL");
                    int opcion_1 = scanner.nextInt();
                    System.out.println();
                    
                    if (opcion_1 == 1) {
                        jugar(1);
                        cantidadDePartidasMapa_1++;
                    } else if (opcion_1 != 2) {
                        System.out.println("Opción incorrecta, intentelo nuevamente");
                    }
                } else {
                    System.out.println("Seleccione un Número:");
                    System.out.println("    1. JUGAR");
                    System.out.println("    2. VOLVER AL MENU PRINCIPAL");
                    int opcion_1 = scanner.nextInt();
                    System.out.println();
                    
                    if (opcion_1 == 1) {
                        System.out.println("Seleccione el mapa que Desea Jugar:");
                        System.out.println("    1. PREDETERMINADO");
                        System.out.println("    2. " + nombreMapa);
                        int numeroDeMapa = scanner.nextInt();

                        if (numeroDeMapa == 1) {
                            jugar(1);
                            cantidadDePartidasMapa_1++;
                        } else if (numeroDeMapa == 2) {
                            jugar(2);
                            cantidadDePartidasMapa_2++;
                        } else {
                            System.out.println("Opción incorrecta, intentelo nuevamente");
                        }
                    }
                }
            } else if (opcion == 2) {
                System.out.println("Seleccione un Número:");
                System.out.println("    1. CREAR MAPA");
                System.out.println("    2. VOLVER AL MENU PRINCIPAL");
                int opcion_2 = scanner.nextInt();
                System.out.println();
                
                if (opcion_2 == 1) {
                    crearMapa();
                } else if (opcion_2 != 2) {
                    System.out.println("Opción incorrecta, intentelo nuevamente");
                }
            } else if (opcion == 3) {
                verReportes();
            } else if (opcion == 4) {
                
                if (mapas == 1) {
                    verMapaPredeterminado();
                } else {
                    System.out.println("Seleccione el mapa que Desea Visualizar:");
                    System.out.println("    1. PREDETERMINADO");
                    System.out.println("    2. " + nombreMapa);
                    int numeroDeMapa = scanner.nextInt();
                    System.out.println();
                    
                    if (numeroDeMapa == 1) {
                        verMapaPredeterminado();
                    } else if (numeroDeMapa == 2) {
                        System.out.println("Mapa: " + nombreMapa);
                        for (int i = 0; i < x; i++){						
                            for (int j = 0; j < y; j++) {
                                System.out.print(matriz21[i][j]);
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Opción incorrecta, intentelo nuevamente");
                    }
                }
            } else if (opcion == 5) {
                System.out.println("----Gracias por Jugar----9\n");
            } else {
                System.out.println("Opcion Incorrecta, seleccione un número del 1 al 5\n");
            }
        }
    }
    
    private void jugar(int mapa) {
        Scanner scanner = new Scanner(System.in);
        String comando;
        int turno = 0, fallos = 3, oro = 1, oroRecolectado = 0, filaJugador, columnaJugador, filaBot, columnaBot, random = 0, referencia = 0;
        char casillaActual, casillaAnterior = 'O';
        char[][] matriz;
        boolean movimientoBot = false;
        
        System.out.println("Comandos que puede Escribir y Utilizar durante el Juego:\n");
        System.out.println("    1. Escriba las letra A,D,W,S para moverse en esa dirección");
        System.out.println("    2. Escriba LEVANTAR para recoger el Oro que se encuentre en la casilla del Jugador");
        System.out.println("    3. Escriba MIRAR para vizualizar el lugar donde se encuentra el Jugador");
        System.out.println("    4. Escriba ORO para ver cuanto oro va recolectando durante el juego");
        System.out.println("    5. Escriba ORO REQUERIDO para ver cuanto oro necesita para poder Salir\n");
        
        if (mapa == 1) {
            matriz = matriz10;
            random = (int) (Math.random()*30);
            referencia = 15;
            
            if (random == 0 || random == 1) {
                random = 2;
            }        
        } else {
            matriz = matriz20;
            random = (int) (Math.random()*(x - 2));
            
            if (random == 0 || random == 1) {
                random = 2;
            }  
            
            if (x%2 == 0) {
                referencia = x/2;
                random--;
            } else {
                referencia = (x - 1)/2;
            }
        }
                
        matriz[random][random] = 'J';
        filaJugador = random;
        columnaJugador = random;
        
        if (random <= referencia) {
            matriz[random + 2][random + 2] = 'B';
            filaBot = random + 2;
            columnaBot = random + 2;
        } else {
            matriz[random - 2][random - 2] = 'B';
            filaBot = random - 2;
            columnaBot = random - 2;
        }
        
        while(turno == 0) {
            
            while(turno == 0 && fallos > 0 && fallos <= 3) {
                System.out.println("Escriba un Comando:");
                comando = scanner.nextLine();
                
                if ("A".equals(comando) || "a".equals(comando) || "D".equals(comando) || "d".equals(comando) || "W".equals(comando) || "w".equals(comando) || "S".equals(comando) || "s".equals(comando)) {

                    if ("W".equals(comando) || "w".equals(comando)) {
                        
                        if (mover(filaJugador - 1,columnaJugador,matriz) == 0) {
                            imprimirPared();
                        } else if (mover(filaJugador - 1,columnaJugador,matriz) == 1) {
                            casillaActual = matriz[filaJugador - 1][columnaJugador];
                            matriz[filaJugador][columnaJugador] = casillaAnterior;
                            matriz[filaJugador - 1][columnaJugador] = 'J';
                            casillaAnterior = casillaActual;
                            filaJugador -= 1;
                            fallos = 3;
                        } else if (mover(filaJugador - 1,columnaJugador,matriz) == 2) {
                            if (verificarOro(oro,oroRecolectado)) {
                                fallos = 4;
                            }
                        } else if (mover(filaJugador - 1,columnaJugador,matriz) == 3) {
                            fallos = 5;
                        }
                    } else if ("S".equals(comando) || "s".equals(comando)) {
                        
                        if (mover(filaJugador + 1,columnaJugador,matriz) == 0) {
                            imprimirPared();
                        } else if (mover(filaJugador + 1,columnaJugador,matriz) == 1) {
                            casillaActual = matriz[filaJugador + 1][columnaJugador];
                            matriz[filaJugador][columnaJugador] = casillaAnterior;
                            matriz[filaJugador + 1][columnaJugador] = 'J';
                            casillaAnterior = casillaActual;
                            filaJugador += 1;
                            fallos = 3;
                        } else if (mover(filaJugador + 1,columnaJugador,matriz) == 2) {
                            if (verificarOro(oro,oroRecolectado)) {
                                fallos = 4;
                            }
                        } else if (mover(filaJugador + 1,columnaJugador,matriz) == 3) {
                            fallos = 5;
                        }
                        
                    } else if ("A".equals(comando) || "a".equals(comando)) {
                        
                        if (mover(filaJugador,columnaJugador - 1,matriz) == 0) {
                            imprimirPared();
                        } else if (mover(filaJugador,columnaJugador - 1,matriz) == 1) {
                            casillaActual = matriz[filaJugador][columnaJugador - 1];
                            matriz[filaJugador][columnaJugador] = casillaAnterior;
                            matriz[filaJugador][columnaJugador - 1] = 'J';
                            casillaAnterior = casillaActual;
                            columnaJugador -= 1;
                            fallos = 3;
                        } else if (mover(filaJugador,columnaJugador - 1,matriz) == 2) {
                            if (verificarOro(oro,oroRecolectado)) {
                                fallos = 4;
                            }
                        } else if (mover(filaJugador,columnaJugador - 1,matriz) == 3) {
                            fallos = 5;
                        }
                    } else {
                        
                        if (mover(filaJugador,columnaJugador + 1,matriz) == 0) {
                            imprimirPared();
                        } else if (mover(filaJugador,columnaJugador + 1,matriz) == 1) {
                            casillaActual = matriz[filaJugador][columnaJugador + 1];
                            matriz[filaJugador][columnaJugador] = casillaAnterior;
                            matriz[filaJugador][columnaJugador + 1] = 'J';
                            casillaAnterior = casillaActual;
                            columnaJugador += 1;
                            fallos = 3;
                        } else if (mover(filaJugador,columnaJugador + 1,matriz) == 2) {
                            if (verificarOro(oro,oroRecolectado)) {
                                fallos = 4;
                            }
                        } else if (mover(filaJugador,columnaJugador + 1,matriz) == 3) {
                            fallos = 5;
                        }
                    }
                    turno = 1;
                } else if ("LEVANTAR".equals(comando) || "levantar".equals(comando)) {
                    
                    if (casillaAnterior == 'G') {
                        System.out.println();
                        System.out.println("------------------------");
                        System.out.println("  ¡¡¡Oro Levantado!!!");
                        System.out.println("Se realizo el Movimiento");
                        System.out.println("------------------------\n");
                        oroRecolectado ++;
                        oroTotal++;
                        casillaAnterior = 'O';
                    } else {
                        System.out.println();
                        System.out.println("---------------------------");
                        System.out.println("No hay Oro en esta Casilla");
                        System.out.println("No se realizo el Movimiento");
                        System.out.println("---------------------------\n");
                    }
                    turno = 1;
                    fallos = 3;
                } else if ("MIRAR".equals(comando) || "mirar".equals(comando)) {
                    System.out.print(matriz[filaJugador - 2][columnaJugador - 2]); System.out.print(matriz[filaJugador - 2][columnaJugador - 1]); System.out.print(matriz[filaJugador - 2][columnaJugador]); System.out.print(matriz[filaJugador - 2][columnaJugador + 1]); System.out.println(matriz[filaJugador - 2][columnaJugador + 2]);
                    System.out.print(matriz[filaJugador - 1][columnaJugador - 2]); System.out.print(matriz[filaJugador - 1][columnaJugador - 1]); System.out.print(matriz[filaJugador - 1][columnaJugador]); System.out.print(matriz[filaJugador - 1][columnaJugador + 1]); System.out.println(matriz[filaJugador - 1][columnaJugador + 2]);
                    System.out.print(matriz[filaJugador][columnaJugador - 2]);     System.out.print(matriz[filaJugador][columnaJugador - 1]);     System.out.print(matriz[filaJugador][columnaJugador]);     System.out.print(matriz[filaJugador][columnaJugador + 1]);     System.out.println(matriz[filaJugador][columnaJugador + 2]);
                    System.out.print(matriz[filaJugador + 1][columnaJugador - 2]); System.out.print(matriz[filaJugador + 1][columnaJugador - 1]); System.out.print(matriz[filaJugador + 1][columnaJugador]); System.out.print(matriz[filaJugador + 1][columnaJugador + 1]); System.out.println(matriz[filaJugador + 1][columnaJugador + 2]);
                    System.out.print(matriz[filaJugador + 2][columnaJugador - 2]); System.out.print(matriz[filaJugador + 2][columnaJugador - 1]); System.out.print(matriz[filaJugador + 2][columnaJugador]); System.out.print(matriz[filaJugador + 2][columnaJugador + 1]); System.out.println(matriz[filaJugador + 2][columnaJugador + 2]);
                    turno = 1;
                    fallos = 3;
                } else if ("ORO".equals(comando) || "oro".equals(comando)) {
                    System.out.println();
                    System.out.println("------------------------");
                    System.out.println("Tienes " + oroRecolectado + " unidades de Oro");
                    System.out.println("------------------------\n");
                    turno = 1;
                    fallos = 3;
                } else if ("ORO REQUERIDO".equals(comando) || "oro requerido".equals(comando)) {
                    System.out.println();
                    System.out.println("------------------------------------------------");
                    System.out.println("Necesita recolectar " + oro + " unidades de Oro para Ganar");
                    System.out.println("------------------------------------------------\n");
                    turno = 1;
                    fallos = 3;
                } else {
                    System.out.println("Comando Incorrecto");
                    System.out.println("Te quedan: " + (fallos - 1) + " intentos\n");
                    turno = 1;
                    fallos--;
                }
            }
            
            if (fallos != 0 || fallos != 4 || fallos != 5) {
                
                if (jugadorEnLaMira(matriz,filaBot,columnaBot)) {

                    if (posicion == 0) {
                        // Mover Izquierda
                        if (moverBot(filaBot,columnaBot - 1,matriz) == 1 || moverBot(filaBot,columnaBot - 1,matriz) == 2) {

                            if (moverBot(filaBot,columnaBot - 1,matriz) == 1) {
                                direccionarBot(1,matriz,filaBot,columnaBot);
                                columnaBot--;
                            } else {
                                fallos = 5;
                            }
                        }
                    } else if (posicion == 1) {
                        // Mover Derecha
                        if (moverBot(filaBot,columnaBot + 1,matriz) == 1 || moverBot(filaBot,columnaBot + 1,matriz) == 2) {

                            if (moverBot(filaBot,columnaBot + 1,matriz) == 1) {
                                direccionarBot(2,matriz,filaBot,columnaBot);
                                columnaBot++;
                            } else {
                                fallos = 5;
                            }
                        }
                    } else if (posicion == 2) {
                        // Mover Arriba
                        if (moverBot(filaBot - 1,columnaBot,matriz) == 1 || moverBot(filaBot - 1,columnaBot,matriz) == 2) {

                            if (moverBot(filaBot - 1,columnaBot,matriz) == 1) {
                                direccionarBot(3,matriz,filaBot,columnaBot);
                                filaBot--;
                            } else {
                                fallos = 5;
                            }
                        }
                    } else if (posicion == 3) {
                        // Mover Abajo
                        if (moverBot(filaBot + 1,columnaBot,matriz) == 1 || moverBot(filaBot + 1,columnaBot,matriz) == 2) {

                            if (moverBot(filaBot + 1,columnaBot,matriz) == 1) {
                                direccionarBot(4,matriz,filaBot,columnaBot);
                                filaBot++;
                            } else {
                                fallos = 5;
                            }
                        }
                    } else if (posicion == 4) {
                        // Mover Arriba-Izquierda
                        if (moverBot(filaBot - 1,columnaBot,matriz) == 1 || moverBot(filaBot - 1,columnaBot,matriz) == 2) {

                            if (moverBot(filaBot - 1,columnaBot,matriz) == 1) {
                                direccionarBot(3,matriz,filaBot,columnaBot);
                                filaBot--;
                            } else {
                                fallos = 5;
                            }
                        } else {
                            if (moverBot(filaBot,columnaBot - 1,matriz) == 1 || moverBot(filaBot,columnaBot - 1,matriz) == 2) {

                                if (moverBot(filaBot,columnaBot - 1,matriz) == 1) {
                                    direccionarBot(1,matriz,filaBot,columnaBot);
                                    columnaBot--;
                                } else {
                                    fallos = 5;
                                }
                            }
                        }
                    } else if (posicion == 5) {
                        // Mover Arriba-Derecha
                        if (moverBot(filaBot - 1,columnaBot,matriz) == 1 || moverBot(filaBot - 1,columnaBot,matriz) == 2) {

                            if (moverBot(filaBot - 1,columnaBot,matriz) == 1) {
                                direccionarBot(3,matriz,filaBot,columnaBot);
                                filaBot--;
                            } else {
                                fallos = 5;
                            }
                        } else {
                            if (moverBot(filaBot,columnaBot + 1,matriz) == 1 || moverBot(filaBot,columnaBot + 1,matriz) == 2) {

                                if (moverBot(filaBot,columnaBot + 1,matriz) == 1) {
                                    direccionarBot(2,matriz,filaBot,columnaBot);
                                    columnaBot++;
                                } else {
                                    fallos = 5;
                                }
                            }
                        }
                    } else if (posicion == 6) {
                        // Mover Abajo-Izquierda
                        if (moverBot(filaBot + 1,columnaBot,matriz) == 1 || moverBot(filaBot + 1,columnaBot,matriz) == 2) {

                            if (moverBot(filaBot + 1,columnaBot,matriz) == 1) {
                                direccionarBot(4,matriz,filaBot,columnaBot);
                                filaBot++;
                            } else {
                                fallos = 5;
                            }
                        } else {
                            if (moverBot(filaBot,columnaBot - 1,matriz) == 1 || moverBot(filaBot,columnaBot - 1,matriz) == 2) {

                                if (moverBot(filaBot,columnaBot - 1,matriz) == 1) {
                                    direccionarBot(1,matriz,filaBot,columnaBot);
                                    columnaBot--;
                                } else {
                                    fallos = 5;
                                }
                            }
                        }
                    } else if (posicion == 7) {
                        // Mover Abajo-Derecha
                        if (moverBot(filaBot + 1,columnaBot,matriz) == 1 || moverBot(filaBot + 1,columnaBot,matriz) == 2) {

                            if (moverBot(filaBot + 1,columnaBot,matriz) == 1) {
                                direccionarBot(4,matriz,filaBot,columnaBot);
                                filaBot++;
                            } else {
                                fallos = 5;
                            }
                        } else {
                            if (moverBot(filaBot,columnaBot + 1,matriz) == 1 || moverBot(filaBot,columnaBot + 1,matriz) == 2) {

                                if (moverBot(filaBot,columnaBot + 1,matriz) == 1) {
                                    direccionarBot(2,matriz,filaBot,columnaBot);
                                    columnaBot++;
                                } else {
                                    fallos = 5;
                                }
                            }
                        }
                    }                    
                } else {
                    double random_1 = Math.random();
                    movimientoBot = false;

                    while (!movimientoBot) {
                        if (random_1 < 0.25) {
                            // Mover a la Izquierda
                            if (moverBot(filaBot,columnaBot - 1,matriz) == 0) {
                                random_1 = 0.375;
                            } else if (moverBot(filaBot,columnaBot - 1,matriz) == 1) {
                                direccionarBot(1,matriz,filaBot,columnaBot);
                                columnaBot--;
                                movimientoBot = true;
                            } else {
                                movimientoBot = true;
                                fallos = 5;
                            }
                        }
                        if (random_1 >= 0.25 && random_1 < 0.50) {
                            // Mover a la Derecha
                            if (moverBot(filaBot,columnaBot + 1,matriz) == 0) {
                                random_1 = 0.625;
                            } else if (moverBot(filaBot,columnaBot + 1,matriz) == 1) {
                                direccionarBot(2,matriz,filaBot,columnaBot);
                                columnaBot++;
                                movimientoBot = true;
                            } else {
                                movimientoBot = true;
                                fallos = 5;
                            }
                        }
                        if (random_1 >= 0.50 && random_1 < 0.75) {
                            // Mover Arriba
                            if (moverBot(filaBot - 1,columnaBot,matriz) == 0) {
                                random_1 = 0.875;
                            } else if (moverBot(filaBot - 1,columnaBot,matriz) == 1) {
                                direccionarBot(3,matriz,filaBot,columnaBot);
                                filaBot--;
                                movimientoBot = true;
                            } else {
                                movimientoBot = true;
                                fallos = 5;
                            }
                        }
                        if (random_1 >= 0.75 && random_1 < 1) {
                            // Mover Abajo
                            if (moverBot(filaBot + 1,columnaBot,matriz) == 0) {
                                random_1 = 0.125;
                            } else if (moverBot(filaBot + 1,columnaBot,matriz) == 1) {
                                direccionarBot(4,matriz,filaBot,columnaBot);
                                filaBot++;
                                movimientoBot = true;
                            } else {
                                movimientoBot = true;
                                fallos = 5;
                            }
                        }
                    }
                }         
                turno = 0;
            }
                
            if (fallos == 0) {
                System.out.println();
                System.out.println("--------------------");
                System.out.println("   ¡¡¡Perdiste!!!");
                System.out.println("Intentalo Nuevamente");
                System.out.println("--------------------\n");
                perdidas++;
                turno = 1;
            }
            if (fallos == 4) {
                System.out.println();
                System.out.println("-------------");
                System.out.println("¡¡¡Ganaste!!!");
                System.out.println("-------------\n");
                victorias++;
                turno = 1;
            } 
            if (fallos == 5) {
                System.out.println();
                System.out.println("---------------");
                System.out.println("¡¡¡Perdiste!!!");
                System.out.println("Fuiste Atrapado");
                System.out.println("---------------\n");
                perdidas++;
                atrapadas++;
                turno = 1;
            }
        }
        
        partidasJugadas++;
        partidasJugadas_1++;
        
        if (mapa == 1) {
            for (int i = 0; i < 32; i++) {
                for (int j = 0; j < 32; j++) {
                    matriz[i][j] = matriz11[i][j];
                }
            }
        } else {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    matriz[i][j] = matriz21[i][j];
                }
            }
        }
    }
    
    private int mover(int fila, int columna, char[][] matriz) {
        int permiso = 0;
        
        switch (matriz[fila][columna]) {
            case '#' -> permiso = 0;
            case 'O', 'G' -> permiso = 1;
            case 'S' -> permiso = 2;
            case 'B' -> permiso = 3;
            default -> {
            }
        }
        return permiso;
    }
    
    private boolean verificarOro(int oro, int oroRecogido) {
        
        if (oroRecogido >= oro) {
            return true;
        } else {
            System.out.println();
            System.out.println("-----------------------------------");
            System.out.println("No tienes Suficiente Oro para Salir");
            System.out.println("-----------------------------------");
            System.out.println();
            return false;
        }
    }
        
    private void imprimirPared() {
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("       ¡¡¡Pared!!!");
        System.out.println("No se realizo el Movimiento");   
        System.out.println("---------------------------");
        System.out.println();
    }
    
    private boolean jugadorEnLaMira(char[][] matriz, int fila, int columna) {
        boolean jugadorVisto = false;
      
        if (matriz[fila][columna - 2] == 'J' || matriz[fila][columna - 1] == 'J') {
            jugadorVisto = true;
            posicion = 0;
        }
        if (matriz[fila][columna + 2] == 'J' || matriz[fila][columna + 1] == 'J') {
            jugadorVisto = true;
            posicion = 1;
        }
        if (matriz[fila - 2][columna] == 'J' || matriz[fila - 1][columna] == 'J') {
            jugadorVisto = true;
            posicion = 2;
        }
        if (matriz[fila + 2][columna] == 'J' || matriz[fila + 1][columna] == 'J') {
            jugadorVisto = true;
            posicion = 3;
        }
        if (matriz[fila - 2][columna - 2] == 'J' || matriz[fila - 2][columna - 1] == 'J' || matriz[fila - 1][columna - 2] == 'J' || matriz[fila - 1][columna - 1] == 'J') {
            jugadorVisto = true;
            posicion = 4;
        }
        if (matriz[fila - 2][columna + 2] == 'J' || matriz[fila - 2][columna + 1] == 'J' || matriz[fila - 1][columna + 2] == 'J' || matriz[fila - 1][columna + 1] == 'J') {
            jugadorVisto = true;
            posicion = 5;
        }
        if (matriz[fila + 1][columna - 2] == 'J' || matriz[fila + 1][columna - 1] == 'J' || matriz[fila + 2][columna - 2] == 'J' || matriz[fila + 2][columna - 1] == 'J') {
            jugadorVisto = true;
            posicion = 6;
        }
        if (matriz[fila + 1][columna + 2] == 'J' || matriz[fila + 1][columna + 1] == 'J' || matriz[fila + 2][columna + 2] == 'J' || matriz[fila + 2][columna + 1] == 'J') {
            jugadorVisto = true;
            posicion = 7;
        }
        return jugadorVisto;
    }
    
    private int moverBot(int fila, int columna, char[][] matriz) {
        int permiso = 0;
        
        switch (matriz[fila][columna]) {
            case '#', 'S' -> permiso = 0;
            case 'O', 'G' -> permiso = 1;
            case 'J' -> permiso = 2;
            default -> {
            }
        }
        return permiso;
    }
    
    private void direccionarBot(int posicion, char[][] matriz, int fila, int columna) {
        
        if (posicion == 1) {
            // Izquierda
            casillaActualBot = matriz[fila][columna - 1];
            matriz[fila][columna] = casillaAnteriorBot;
            matriz[fila][columna - 1] = 'B';
            casillaAnteriorBot = casillaActualBot;
        } else if (posicion == 2) {
            // Derecha
            casillaActualBot = matriz[fila][columna + 1];
            matriz[fila][columna] = casillaAnteriorBot;
            matriz[fila][columna + 1] = 'B';
            casillaAnteriorBot = casillaActualBot;
        } else if (posicion == 3) {
            // Arriba
            casillaActualBot = matriz[fila - 1][columna];
            matriz[fila][columna] = casillaAnteriorBot;
            matriz[fila - 1][columna] = 'B';
            casillaAnteriorBot = casillaActualBot;
        } else {
            // Abajo
            casillaActualBot = matriz[fila + 1][columna];
            matriz[fila][columna] = casillaAnteriorBot;
            matriz[fila + 1][columna] = 'B';
            casillaAnteriorBot = casillaActualBot;
        }
    }
    
    private void crearMapa() {
        Scanner scanner = new Scanner(System.in);
        boolean paso = false, pasoValor = false, pasoOro = false;
        int contadorOro = 0;
        mapas = 1;
        
        System.out.println("Tome en Cuenta las Siguientes Recomendaciones antes de Crear su Mapa");
        System.out.println();
        System.out.println("    1. El Número de Filas y Columnas debe ser mayor o igual a 7");
        System.out.println("    2. El Mapa se llenara de Izquierda a Derecha por filas 9\n");
        
        while(!paso) {
            System.out.println("Escriba el Número de Filas");
            x = scanner.nextInt();
            x += 2;        
            System.out.println("Escriba el Número de Columnas");
            y = scanner.nextInt();
            y += 2;
            
            if (x >= 9 && y >= 9) {
                paso = true;
            } else {
                System.out.println();
                System.out.println("--------------------------------------------------------");
                System.out.println("El Número de Filas y Columnas debe ser mayor o igual a 7");
                System.out.println("--------------------------------------------------------\n");
            }
        }
        
        matriz20 = new char[x][y];
        matriz21 = new char[x][y];
        System.out.println("-----------------------------\n\n");
        
        for (int i = 0; i < y; i++) {
            matriz20[0][i] = ' ';
            matriz20[x - 1][i] = ' ';
        }
        for (int i = 1; i < x - 1; i++) {
            matriz20[i][0] = ' ';
            matriz20[i][y - 1] = ' ';
        }
        for (int i = 1; i < y - 1; i++) {
            matriz20[1][i] = '#';
            matriz20[x - 2][i] = '#';
        }
        for (int i = 2; i < x - 2; i++) {
            matriz20[i][1] = '#';
            matriz20[i][y - 2] = '#';
        }
        matriz20[1][2] = 'S';
        matriz20[x - 2][y - 3] = 'S';
        
        for (int i = 2; i < x - 2; i++) {
            for (int j = 2; j < y - 2; j++) {
                pasoValor = false;
                
                while (!pasoValor) {
                    System.out.println("Escriba el Valor de la Casilla:");
                    char valor = scanner.next().charAt(0);
                    
                    if (valor == '#' || valor == 'S' || valor == 'O' || valor == 'G') {
                        matriz20[i][j] = valor;
                        
                        if (j == y - 3) {
                            for (int k = 0; k < i + 1; k++) {
                                for (int l = 0; l < y - 1; l++) {
                                    System.out.print(matriz20[k][l]);
                                }
                                System.out.println();
                            }
                            if (i == x - 3) {
                                for (int k = 0; k < y; k++) {
                                    System.out.print(matriz20[x - 2][k]);
                                }
                                System.out.println();
                            }
                            
                            System.out.println();
                            System.out.println("Desea Continuar con la Siguiente Linea:");
                            System.out.println("    1. Si");
                            System.out.println("    2. No, Repetir linea");
                            int opcion = scanner.nextInt();
                            System.out.println();

                            if (opcion == 2) {
                                j = 1;
                            }
                        }
                        pasoValor = true;
                    } else {
                        System.out.println();
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("¡¡¡El valor de la casilla es Incorrecto, Intentelo nuevamente!!!");
                        System.out.println("----------------------------------------------------------------\n");
                    }
                }  
            }
        }
        System.out.println("---------------------------------------\n\n");
        
        while (!pasoOro) {
            System.out.println("Escriba la cantidad de Oro necesaria para Ganar:");
            int oro = scanner.nextInt();

            for (int i = 1; i < x - 1; i++) {
                for (int j = 1; j < y - 1; j++) {
                    if (matriz20[i][j] == 'G') {
                        contadorOro++; 
                    }
                }
            }
            if (oro <= contadorOro) {
                System.out.println("------------------------------------------------\n\n");
                oroMapaCreado = oro;
                pasoOro = true;
            } else {
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("El número de Oro en el tablero es Insuficiente para el número de Oro necesario para Ganar");
                System.out.println("El número debe ser menor o igual a " + contadorOro);
                System.out.println("-----------------------------------------------------------------------------------------\n");
            }
        }
        
        System.out.println("Escriba el nombre del Mapa:");
        nombreMapa = scanner.next();
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("¡¡¡Mapa creado Correctamente!!!\n\n");
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matriz21[i][j] = matriz20[i][j];
            }
        }        
        mapas++;
    }
    
    private void verReportes() {
        String mapaMasJugado;
        double promedio;
        
        System.out.println("--------------------------------");
        System.out.println("Partidas Jugadas: " + partidasJugadas_1);
        System.out.println("Partidas Ganadas: " + victorias);
        System.out.println("Partidas Perdidas: " + perdidas);
        System.out.println("Capturas por el Bot: " + atrapadas);
        
        if (cantidadDePartidasMapa_1 == 0 && cantidadDePartidasMapa_2 == 0) {
            mapaMasJugado = "--------";
        } else {
            if (cantidadDePartidasMapa_1 > cantidadDePartidasMapa_2) {
                mapaMasJugado = "PREDETERMINADO";
            }  else if (cantidadDePartidasMapa_1 < cantidadDePartidasMapa_2) {
                mapaMasJugado = nombreMapa;
            } else {
                mapaMasJugado = "AMBOS MAPAS HAN SIDO JUGADOS " + cantidadDePartidasMapa_1 + " VECES";
            }
        }
        
        System.out.println("Mapa más Jugador: " + mapaMasJugado);
        
        if (oroTotal == 0 && partidasJugadas == 0) {
            promedio = 0;
        } else {
            promedio = oroTotal / partidasJugadas;
        }
        
        System.out.println("Oro Promedio por Partida: " + promedio);
        System.out.println("--------------------------------");
        System.out.println();
    }
    
    private void verMapaPredeterminado() {
        System.out.println("Mapa: PREDETERMINADO");
        for (int i = 0; i < 32; i++){						
            for (int j = 0; j < 32; j++) {
                System.out.print(matriz10[i][j]);
            }
            System.out.println();
        }
    }  
}