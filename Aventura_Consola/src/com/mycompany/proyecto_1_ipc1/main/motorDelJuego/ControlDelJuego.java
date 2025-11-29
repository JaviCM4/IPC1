/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_ipc1.main.motorDelJuego;


import com.mycompany.proyecto_1_ipc1.main.objetos.*;
import com.mycompany.proyecto_1_ipc1.main.personajes.*;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ControlDelJuego {
    
    private Jugador jugador = new Jugador();
    private Personaje[] equipoJugador = new Personaje[5], duoJugador = new Personaje[2];
    private Objeto[] objetosJugador = new Objeto[10];
    private String[][] tableroDeJuego_1 = {{" 0"," 1"," 2"," 3"," 4"," 5"," 6"," 7"," 8"},{" 1"," ."," ."," ."," ."," ."," ."," ."," ."},{" 2"," ."," ."," ."," ."," ."," ."," ."," ."},{" 3"," ."," ."," ."," ."," ."," ."," ."," ."},{" 4"," ."," ."," ."," ."," ."," ."," ."," ."},{" 5"," ."," ."," ."," ."," ."," ."," ."," ."},{" 6"," ."," ."," ."," ."," ."," ."," ."," ."},{" 7"," ."," ."," ."," ."," ."," ."," ."," ."},{" 8"," ."," ."," ."," ."," ."," ."," ."," ."}};
    private Tablero predeterminado = new Tablero(tableroDeJuego_1,"Predeterminado",25,10,5,9,9), personalizado, aJugar;
    private Tienda visitar = new Tienda();
    private String nombreDelJugador;
    private String ANSI_GREEN = "\u001B[32m", ANSI_RESET = "\u001B[0m";
    private int numeroDePersonajes = 0, nivel = 0, apartado = 1;
    private boolean primeraPartida = false;
    
    public void empezar() {       
        Scanner scanner = new Scanner(System.in);
        jugador.guardarEquipoJugador(equipoJugador);
        jugador.guardarObjetosJugador(objetosJugador);
        int opcion = 0;

        System.out.println("Escribe tu Nombre");
        jugador.guardarNombre(scanner.nextLine());
        System.out.println();
        
        System.out.println("--------------------");
        System.out.println("Bienvenido " + jugador.mandarNombre());
        System.out.println("--------------------");
        
        while (opcion != 5) {
            System.out.println();
            System.out.println(ANSI_GREEN + "   MENÚ PRINCIPAL  " + ANSI_RESET);
            System.out.println();
            System.out.println("Escriba el Número de una de las Siguientes Opciones:");
            System.out.println("    1. Iniciar Partida");
            System.out.println("    2. Tienda");
            System.out.println("    3. Generación de Tablero");
            System.out.println("    4. Inventario");
            System.out.println("    5. Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            System.out.println();
            
            if (opcion == 1) {
                int decision = 0;
                  
                if (!primeraPartida) {
                    decision = 0;
                    jugador.guardarOro(500);
                    System.out.println(ANSI_GREEN + "   INICIAR PARTIDA" + ANSI_RESET);
                    
                    while (decision != 2) {
                        System.out.println();
                        System.out.println(jugador.mandarNombre() +" ¿Quiere iniciar un Nuevo Juego?, Escribe el Número de tu Respuesta");
                        System.out.println("    1. Si");
                        System.out.println("    2. No");
                        decision = Integer.parseInt(scanner.nextLine());

                        if (decision == 1) {    
                            System.out.println();
                            System.out.println("------------------------------------------------------------");
                            System.out.println("Se te han abonado 500 de Oro, para que inicies esta Aventura");
                            System.out.println("------------------------------------------------------------");
                            irALaTienda_1();
                            
                            while (apartado != 3) {
                                if (apartado == 1) {
                                    organizarEquipo();
                                }
                                if (apartado == 2) {
                                    seleccionarTablero();
                                }
                            }
                            Batalla nuevaBatalla = new Batalla(aJugar,duoJugador,jugador.mandarObjetosJugador(),jugador.mandarNombre(),nivel); 
                            nuevaBatalla.iniciarJuego();
                            int oro = jugador.mandarOro();
                            jugador.guardarOro(oro += nuevaBatalla.mandarOro());
                            primeraPartida = true;
                            decision = 2;
                        } else if (decision == 2) {
                            jugador.guardarOro(0);
                        } else {
                            System.out.println();
                            imprimirError();
                        }
                    }
                } else {
                    decision = 0;
                    System.out.println(ANSI_GREEN + "    INICIAR PARTIDA" + ANSI_RESET);
                    
                    while (decision != 2) {
                        System.out.println();
                        System.out.println(jugador.mandarNombre() +" ¿Quiere iniciar un Nuevo Juego?, Escribe el Número de tu Respuesta");
                        System.out.println("    1. Si");
                        System.out.println("    2. No");
                        decision = Integer.parseInt(scanner.nextLine());

                        if (decision == 1) {
                            irALaTienda_2();
                            apartado = 1;
                            while (apartado != 3) {
                                if (apartado == 1) {
                                    organizarEquipo();
                                }
                                if (apartado == 2) {
                                    seleccionarTablero();
                                }
                            }
                            Batalla nuevaBatalla = new Batalla(aJugar,duoJugador,jugador.mandarObjetosJugador(),jugador.mandarNombre(),nivel);
                            nuevaBatalla.iniciarJuego();
                            int oro = jugador.mandarOro();
                            jugador.guardarOro(oro += nuevaBatalla.mandarOro());
                            decision = 2;
                        } else if (decision != 2) {
                            imprimirError();
                        }
                    }
                }
            } else if (opcion == 2) {
                irALaTienda_3();
            } else if (opcion == 3) {
                generarTablero(1);
            } else if (opcion == 4) {
                verInventario();
            } else if (opcion == 5) {
                System.out.println("-----------------");
                System.out.println("Gracias por Jugar");
                System.out.println("-----------------");
                System.out.println();
            } else {
                imprimirError();
            }
        }
    }
    
    private void irALaTienda_1() {
        Scanner scanner = new Scanner(System.in);
        int opcion_1 = 0, opcion_2 = 0;

        while (numeroDePersonajes != 2) {
            System.out.println();
            System.out.println(ANSI_GREEN + "   TIENDA (PERSONAJES)" + ANSI_RESET);
            System.out.println();
            System.out.println("Oro: " + jugador.mandarOro());
            System.out.println("Escriba el Número del Personaje que desea Comprar:");
            System.out.println("    1. Caballero");
            System.out.println("    2. Arquero");
            System.out.println("    3. Mago");
            System.out.println("    4. Gigante");
            System.out.println("    5. Dragón");
            opcion_1 = Integer.parseInt(scanner.nextLine());
            System.out.println();

            if (opcion_1 > 0 && opcion_1 < 6) {
                int oroGastado = jugador.mandarOro();
                jugador.guardarOro(visitar.comprarPersonajes(jugador.mandarOro(),opcion_1,jugador.mandarEquipoJugador())); 

                if (oroGastado != jugador.mandarOro()) {
                    numeroDePersonajes++;
                }
            } else {
                imprimirError();
            }
        }
        
        while (opcion_2 != 4) {
            System.out.println();
            System.out.println(ANSI_GREEN + "   TIENDA (OBJETOS)" + ANSI_RESET);
            System.out.println();
            System.out.println("Oro: " + jugador.mandarOro());
            System.out.println("Escriba el Número del Objeto que desea Comprar ó pulse 4 para Seguir");
            System.out.println("    1. Semilla de la Vida");
            System.out.println("    2. Elixir Verde");
            System.out.println("    3. Capa de Movilidad");
            System.out.println("    4. Seguir");
            opcion_2 = Integer.parseInt(scanner.nextLine());
            System.out.println();

            if (opcion_2 > 0 && opcion_2 < 4) {
                jugador.guardarOro(visitar.comprarObjetos(jugador.mandarOro(),opcion_2,jugador.mandarObjetosJugador()));
            } else if (opcion_2 != 4) {
                imprimirError();
            }
        }
    }
    
    private void irALaTienda_2() {
        Scanner scanner = new Scanner(System.in);
        boolean paso = false;
        
        while (!paso) {
            System.out.println();
            System.out.println(ANSI_GREEN + "   TIENDA DE PERSONAJE Y OBJETOS" + ANSI_RESET);
            System.out.println();
            System.out.println("Oro: " + jugador.mandarOro());
            System.out.println("Escriba el Número de una de las Siguientes Opciones:");
            System.out.println("    1. Comprar Objetos");
            System.out.println("    2. Comprar Personajes");
            System.out.println("    3. Seguir");
            int opcion_1 = Integer.parseInt(scanner.nextLine());
            System.out.println();
            
            if (opcion_1 == 1) {
                int opcion_2 = 0;
                
                while (opcion_2 != 4) {
                    System.out.println();
                    System.out.println("Escriba el Número del Objeto que desea Comprar:");
                    System.out.println("    1. Semilla de la Vida");
                    System.out.println("    2. Elixir Verde");
                    System.out.println("    3. Capa de Movilidad");
                    System.out.println("    4. Regresar al Menú de la Tienda");
                    opcion_2 = Integer.parseInt(scanner.nextLine());
                    System.out.println();

                    if (opcion_2 == 1 || opcion_2 == 2 || opcion_2 == 3) {
                        jugador.guardarOro(visitar.comprarObjetos(jugador.mandarOro(),opcion_2,jugador.mandarObjetosJugador()));
                        opcion_2 = 4;
                    } else if (opcion_2 != 4) {
                        imprimirError();
                    }
                }
            } else if (opcion_1 == 2) {
                int opcion_2 = 0;
                
                while (opcion_2 != 6) {
                    System.out.println();
                    System.out.println("Escriba el Número del Personaje que desea Comprar:");
                    System.out.println("    1. Caballero");
                    System.out.println("    2. Arquero");
                    System.out.println("    3. Mago");
                    System.out.println("    4. Gigante");
                    System.out.println("    5. Dragón");
                    System.out.println("    6. Regresar al Menú de la Tienda");
                    opcion_2 = Integer.parseInt(scanner.nextLine());
                    System.out.println();

                    if (opcion_2 == 1 || opcion_2 == 2 || opcion_2 == 3 || opcion_2 == 4 || opcion_2 == 5) {
                        jugador.guardarOro(visitar.comprarPersonajes(jugador.mandarOro(),opcion_2,jugador.mandarEquipoJugador()));
                        opcion_2 = 6;
                    } else if (opcion_2 != 6) {
                        imprimirError();
                    }
                } 
            } else if (opcion_1 == 3){
                paso = true;
            } else {
                imprimirError();
            }
        }
    }
    
    private void irALaTienda_3() {        
        Scanner scanner = new Scanner(System.in);
        int opcion_1 = 0;
        
        if (jugador.mandarOro() != 0) {
            while (opcion_1 != 4) {
                System.out.println();
                System.out.println(ANSI_GREEN + "   TIENDA GENERAL" + ANSI_RESET);
                System.out.println();                
                System.out.println("Oro: " + jugador.mandarOro());
                System.out.println("Escriba el Número de una de las Siguientes Opciones:");
                System.out.println("    1. Comprar Objetos");
                System.out.println("    2. Comprar Personajes");
                System.out.println("    3. Comprar Mejoras");
                System.out.println("    4. Regresar al Menú Principal");
                opcion_1 = Integer.parseInt(scanner.nextLine());
                System.out.println();

                if (opcion_1 == 1) {
                    int opcion_2 = 0;

                    while (opcion_2 != 4) {
                        System.out.println();
                        System.out.println("Escriba el Número del Objeto que desea Comprar:");
                        System.out.println("    1. Semilla de la Vida");
                        System.out.println("    2. Elixir Verde");
                        System.out.println("    3. Capa de Movilidad");
                        System.out.println("    4. Regresar al Menú de la Tienda");
                        opcion_2 = Integer.parseInt(scanner.nextLine());
                        System.out.println();

                        if (opcion_2 == 1 || opcion_2 == 2 || opcion_2 == 3) {
                            jugador.guardarOro(visitar.comprarObjetos(jugador.mandarOro(),opcion_2,jugador.mandarObjetosJugador()));
                            opcion_1 = opcion_2 = 4;
                        } else if (opcion_2 != 4) {
                            imprimirError();
                        }
                    }
                } else if (opcion_1 == 2) {
                    int opcion_2 = 0;

                    while (opcion_2 != 6) {
                        System.out.println();
                        System.out.println("Escriba el Número del Personaje que desea Comprar:");
                        System.out.println("    1. Caballero");
                        System.out.println("    2. Arquero");
                        System.out.println("    3. Mago");
                        System.out.println("    4. Gigante");
                        System.out.println("    5. Dragón");
                        System.out.println("    6. Regresar al Menú de la Tienda");
                        opcion_2 = Integer.parseInt(scanner.nextLine());
                        System.out.println();

                        if (opcion_2 == 1 || opcion_2 == 2 || opcion_2 == 3 || opcion_2 == 4 || opcion_2 == 5) {
                            jugador.guardarOro(visitar.comprarPersonajes(jugador.mandarOro(),opcion_2,jugador.mandarEquipoJugador()));
                            opcion_1 = 4;
                            opcion_2 = 6;
                        } else if (opcion_2 != 6) {
                            imprimirError();
                        }
                    } 
                } else if (opcion_1 == 3) {

                    if (jugador.mandarEquipoJugador()[0] != null) {
                        int opcion_2 = 0;

                        while (opcion_2 != 4) {
                            System.out.println();
                            System.out.println("Escriba el Número de la Mejora que desea Comprar:");
                            System.out.println("    1. Vida");
                            System.out.println("    2. Daño");
                            System.out.println("    3. Movilidad");
                            System.out.println("    4. Regresar al Menú de la Tienda");
                            opcion_2 = Integer.parseInt(scanner.nextLine());
                            System.out.println();

                            if (opcion_2 == 1 || opcion_2 == 2 || opcion_2 == 3) {
                                int[] recibirInformacion = visitar.comprarMejoras(jugador.mandarOro(),opcion_2,jugador.mandarEquipoJugador());                        
                                jugador.guardarOro(recibirInformacion[0]);
                                if (recibirInformacion[1] == 0) {
                                    opcion_1 = opcion_2 = 4;
                                }
                            } else if (opcion_2 != 4) {
                                imprimirError();
                            }
                        } 
                    } else {
                        System.out.println("----------------------------------------------");
                        System.out.println("No tienes Personajes en tu Equipo para Mejorar");
                        System.out.println("----------------------------------------------");
                    }
                } else if (opcion_1 != 4) {
                    imprimirError();
                }
            }
        } else {
            System.out.println("---------------------------------");
            System.out.println("No tienes Oro para ir a la Tienda");
            System.out.println("---------------------------------");
        }
    }
    
    private void generarTablero(int indice) {
        Scanner scanner = new Scanner(System.in);
        double generacionDelArbol = 0, generacionDelAgua = 0, generacionDeLaLava = 0;
        String[][] nuevoTablero;
        boolean paso = false, salir = false;
        int x = 0, y = 0;

        System.out.println(ANSI_GREEN + "   GENERADOR DE TABLEROS" + ANSI_RESET);
        System.out.println();
        
        while(!paso) {
            System.out.println("Escriba el Número de Filas");
            x = Integer.parseInt(scanner.nextLine());
            x += 1;        
            System.out.println("Escriba el Número de Columnas");
            y = Integer.parseInt(scanner.nextLine());
            y += 1;
            
            if (x >= 9 && y >= 9 && x <= 16 && y <= 16) {
                paso = true;
            } else if (x > 16 || y > 16) {
                System.out.println();
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("No se recomienda un Tablero tan grande para que la batallas no se vuelvan tan");
                System.out.println("largas, el tamaño máximo es de 15 casillas tanto de filas como Columnas");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("------------------------------------------------------------------------");
                System.out.println("El Número de Filas y Columnas debe ser mayor o igual a 8, para tener una");
                System.out.println("mejor experiencia en el Juego");
                System.out.println("------------------------------------------------------------------------");
                System.out.println();
            }
        }
        
        nuevoTablero = new String[x][y];
        System.out.println("-----------------------------");
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                nuevoTablero[i][j] = " .";
            }
        }
        for (int i = 1; i < y; i++) {     
            if (i < 10) {
                nuevoTablero[0][i] = " " + (i);
            } else {
                nuevoTablero[0][i] = (i) + "";
            }
        }
        for (int i = 1; i < x; i++) {
            if (i < 10) {
                nuevoTablero[i][0] = " " + (i);
            } else {
                nuevoTablero[i][0] = (i) + "";
            }
        }
        nuevoTablero[0][0] = " 0";
        
        while(!salir) {
            System.out.println();
            System.out.println("Escriba los siguientes Porcentajes entre el Rango de 1 a 100");
            System.out.println();
            System.out.println("Escriba el % de Generación que tendrá el Árbol");
            generacionDelArbol = Double.parseDouble(scanner.nextLine());       
            System.out.println("Escriba el % de Generación que tendrá el Agua");
            generacionDelAgua = Double.parseDouble(scanner.nextLine());
            System.out.println("Escriba el % de Generación que tendrá la Lava");
            generacionDeLaLava = Double.parseDouble(scanner.nextLine());

            if (generacionDelArbol > 0 && generacionDelArbol < 101 && generacionDelAgua > 0 && generacionDelAgua < 101 && generacionDeLaLava > 0 && generacionDeLaLava < 101) {
                salir = true;
            } else {
                System.out.println();
                System.out.println("-------------------------------------------------------");
                System.out.println("Se excedio el Rango de Generación, Intentelo Nuevamente");
                System.out.println("-------------------------------------------------------");
            }
        }
        System.out.println("------------------------------------------------------------");
        System.out.println();
        System.out.println("Escriba el Nombre del Nuevo Tablero de Juego:");
        String nombreDelTablero = scanner.nextLine();
        personalizado = new Tablero(nuevoTablero,nombreDelTablero,generacionDelArbol,generacionDelAgua,generacionDeLaLava,x,y);
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("Tablero Generado Exitosamente");
        if (indice == 1) {
            System.out.println("Puedes Jugarlo en la sección de Iniciar Partida");
        }
        System.out.println("-----------------------------------------------");
    }
    
    private void verInventario() {
        Scanner scanner = new Scanner(System.in);
        int contador_1 = 0, contador_2 = 0;
        boolean inventarioDeObjetosVacio = true;
        
        System.out.println(ANSI_GREEN + "   INVENTARIO" + ANSI_RESET);
        System.out.println();
        System.out.println("Equipo:");
        System.out.println("_________________________________________");
        for (int i = 0; i < 5; i++) {
            
            if (jugador.mandarEquipoJugador()[i] != null) {
                System.out.println((i + 1) + ". Nombre: " + jugador.mandarEquipoJugador()[i].mandarNombre());
                System.out.println(String.format("    * Vida: %s, Daño: %s, Movilidad: %s", jugador.mandarEquipoJugador()[i].obtenerVida(), jugador.mandarEquipoJugador()[i].obtenerDaño(), jugador.mandarEquipoJugador()[i].getMovilidad()));
                System.out.println("_________________________________________");
                contador_1++;
            }
        }
        if (contador_1 == 0) {
            System.out.println("No tienes Personajes dentro de tu Equipo");
            System.out.println("_________________________________________");
        }
        System.out.println();
        System.out.println("Objetos:");
        System.out.println("______________________________________________________________");
        for (int i = 0; i < 10; i++) {
            if (jugador.mandarObjetosJugador()[i] != null) {
                System.out.println((i + 1) + ". Nombre: " + jugador.mandarObjetosJugador()[i].getNombre());
                System.out.println("    * Habilidad: " + jugador.mandarObjetosJugador()[i].getHabilidad());
                System.out.println("______________________________________________________________");
                contador_2++;
                inventarioDeObjetosVacio = false;
            }
        }
        if (contador_2 == 0) {
            System.out.println("No tienes ningún Objeto dentro de tu Invetario");
            System.out.println("______________________________________________________________");
        }
        if (!inventarioDeObjetosVacio) {
            int opcion = 0;
            
            while (opcion != 2) {
                System.out.println();
                System.out.println(jugador.mandarNombre() + " ¿Deseas Vender un Objeto?, Escriba el Número de su Respuesta:");
                System.out.println("    1. Si");
                System.out.println("    2. No");
                opcion = Integer.parseInt(scanner.nextLine());
                System.out.println();

                if (opcion == 1) {
                    int opcion_2 = 0;
                    
                    while (opcion_2 != 11) {
                        System.out.println();
                        System.out.println("Escriba el Número de Objeto que desea Vender:");

                        for (int i = 0; i < 10; i++) {

                            if (jugador.mandarObjetosJugador()[i] != null) {
                                System.out.println(String.format("    " + (i + 1) + ". Nombre: %s", jugador.mandarObjetosJugador()[i].getNombre()));
                            } else {
                                System.out.println(String.format("    " + (i + 1) + ". Nombre: %s", "---------"));
                            }
                        }
                        System.out.println("    11. Regresar al Menú Principal");
                        opcion_2 = Integer.parseInt(scanner.nextLine()); 
                        System.out.println();

                        if (opcion_2 > 0 && opcion_2 < 11) {                           
                            if (jugador.mandarObjetosJugador()[opcion_2 - 1] != null) {
                                int precio = jugador.mandarObjetosJugador()[opcion_2 - 1].getPrecio();
                                jugador.mandarObjetosJugador()[opcion_2 - 1] = null;
                                System.out.println("----------------------------------------------");
                                System.out.println("Artículo vendido se te a Reembolsado " + precio + " de Oro");
                                System.out.println("----------------------------------------------");
                                
                                for (int i = opcion_2 - 1; i < 10; i++) {
                                    if (i != 9) {
                                        jugador.mandarObjetosJugador()[i] = jugador.mandarObjetosJugador()[i + 1];
                                    } else {
                                        jugador.mandarObjetosJugador()[i] = null;
                                    }
                                }
                                int oro = jugador.mandarOro();
                                jugador.guardarOro(oro += precio);
                                opcion = 2;
                                opcion_2 = 11;
                            } else {
                                System.out.println("------------------------------------");
                                System.out.println("No hay Ningún Objeto en esta casilla");
                                System.out.println("------------------------------------");
                            }
                        } else if (opcion_2 == 11) {
                            opcion = 2;
                        } else {
                            imprimirError();
                        }
                    }
                } else if (opcion != 2) {
                    imprimirError();
                }
            }
        }
    }
    
    private void organizarEquipo() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0, contador = 0, numeroDeCompra = 0;
           
        while (contador != 2) {
            System.out.println(ANSI_GREEN + "   SELECCIÓN DE PERSONAJES" + ANSI_RESET);
            System.out.println();
            System.out.println("Selecciona dos Personajes de tu Equipo para la Batalla, Escribe el Número del Personaje");
            for (int i = 0; i < 5; i++) {          
                if (jugador.mandarEquipoJugador()[i] != null) {
                    System.out.println("    " + (i + 1) + ". " + jugador.mandarEquipoJugador()[i].mandarNombre());
                } else {
                    System.out.println("    " + (i + 1) + ". " + "----------");
                }
            }
            opcion = Integer.parseInt(scanner.nextLine());
            System.out.println();
            
            if (opcion > 0 && opcion < 6) {  
                if (jugador.mandarEquipoJugador()[opcion - 1] != null) {
                    if (numeroDeCompra == 0) {
                        duoJugador[contador] = jugador.mandarEquipoJugador()[opcion - 1];
                        System.out.println("------------------------------------------");
                        System.out.println(duoJugador[contador].mandarNombre() + " fue seleccionado para la Batalla");
                        System.out.println("------------------------------------------");
                        System.out.println();
                        numeroDeCompra = opcion;
                        contador++;
                    } else if (opcion == numeroDeCompra) {
                        System.out.println("-----------------------------------------------");
                        System.out.println("Personaje ya Seleccionado, vuelve a Seleccionar");
                        System.out.println("-----------------------------------------------");
                        System.out.println();
                    } else {
                        duoJugador[contador] = jugador.mandarEquipoJugador()[opcion - 1];
                        System.out.println("------------------------------------------");
                        System.out.println(duoJugador[contador].mandarNombre() + " fue seleccionado para la Batalla");
                        System.out.println("------------------------------------------");
                        System.out.println();
                        contador++;
                    }
                } else {
                    System.out.println("---------------------------------------");
                    System.out.println("No hay Ningún Personaje en esta Casilla");
                    System.out.println("---------------------------------------");
                    System.out.println();
                }
            } else {
                imprimirError();
                System.out.println();
            }
        }
        apartado = 2;
    }
    
    private void seleccionarTablero() {
        Scanner scanner = new Scanner(System.in);
        boolean paso = false, tieneSegundoTablero = false, seleccionoTablero = false, seleccionoNivel = false;
        
        while (!paso) {
            while (!seleccionoTablero) {
                System.out.println(ANSI_GREEN + "   SELECCIÓN DE TABLERO" + ANSI_RESET);
                System.out.println();
                System.out.println("Escribe el Número de Tablero que deseas Jugar ó pulsa 3 para generar uno Nuevo");
                System.out.println("    1. Predeterminado");

                if (personalizado == null) {
                    System.out.println("    2. --------");
                } else {
                    System.out.println("    2. " + personalizado.getNombreDelTablero());
                    tieneSegundoTablero = true;
                }
                System.out.println("    3. Generar un Nuevo Tablero");
                System.out.println("    4. Regresar");
                int opcion = Integer.parseInt(scanner.nextLine());
                System.out.println();

                if (opcion == 1) {
                    System.out.println("-----------------------------------");
                    System.out.println("Tablero Predeterminado Seleccionado");
                    System.out.println("-----------------------------------");
                    System.out.println();
                    aJugar = predeterminado;
                    seleccionoTablero = true;
                    seleccionoNivel = false;
                } else if (opcion == 2) {              
                    if (tieneSegundoTablero) {
                        System.out.println("-----------------------------------");
                        System.out.println("Tablero " + personalizado.getNombreDelTablero() + " Seleccionado");
                        System.out.println("-----------------------------------");
                        System.out.println();
                        aJugar = personalizado;
                        seleccionoTablero = true;
                        seleccionoNivel = false;
                    } else {
                        System.out.println("------------------------------");
                        System.out.println("No has Generado ningún Tablero");
                        System.out.println("------------------------------");
                        System.out.println();
                    }
                } else if (opcion == 3) {
                    generarTablero(2);
                    System.out.println();
                } else if (opcion == 4) {
                    seleccionoTablero = true;
                    seleccionoNivel = true;
                    apartado = 1;
                    paso = true;
                } else {
                    imprimirError();
                    System.out.println();
                }
            }

            while (!seleccionoNivel) {
                System.out.println(ANSI_GREEN + "   SELECCIÓN DE NIVEL" + ANSI_RESET);
                System.out.println();
                System.out.println("Escribe el Número del Nivel de Juego que desea Jugar");
                System.out.println("    1. Nivel 1");
                System.out.println("    2. Nivel 2");
                System.out.println("    3. Nivel 3");
                System.out.println("    4. Nivel 4");
                System.out.println("    5. Regresar");
                int opcion = Integer.parseInt(scanner.nextLine());
                System.out.println();

                if (opcion == 1) {
                    nivel = 1;
                    paso = seleccionoNivel = true;
                    apartado = 3;
                } else if (opcion == 2) {
                    nivel = 2;
                    paso = seleccionoNivel = true;
                    apartado = 3;
                } else if (opcion == 3) {
                    nivel = 3;
                    paso = seleccionoNivel = true;
                    apartado = 3;
                } else if (opcion == 4) {
                    nivel = 4;
                    paso = seleccionoNivel = true;
                    apartado = 3;
                } else if (opcion == 5) {
                    seleccionoNivel = true;
                    seleccionoTablero = false;
                } else {
                    imprimirError();
                    System.out.println();
                }
            }
        }
    }
    
    private void imprimirError() {
        System.out.println("---------------------------------------");
        System.out.println("Número Incorrecto, Intentelo Nuevamente");
        System.out.println("---------------------------------------");
    }
}