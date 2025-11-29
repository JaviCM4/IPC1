/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_1_ipc1.main.objetos;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CapaDeMovilidad extends Objeto {
    
    private int filaNueva = 0, columnaNueva = 0;
    private String casillaActual = " .";
    
    public CapaDeMovilidad() {
        nombre = "Capa de Movilidad";
        habilidad = "Mueve al Personaje una Casilla a su Alrededor";
        precio = 75;
    }
    
    public void activarCapa_1(String[][] tablero, int fila, int columna, String casillaAnterior, int x, int y, String letra) {
        Scanner scanner = new Scanner(System.in);
        boolean uno = true, dos = true, tres = true, cuatro = true, cinco = true, seis = true, siete = true, ocho = true;
        String vistaDelTablero[][] = new String[3][3];
        
        if (fila == 1 && columna == 1) {
            uno = dos = tres = cuatro = seis = false;
        } else if (fila == 1 && columna != 1 && columna != y - 1) {
            uno = dos = tres = false;
        } else if (fila == 1 && columna == y - 1) {
            uno = dos = tres = cinco = ocho = false;
        } else if (columna == 1 && fila != 1 && fila != x - 1) {
            uno = cuatro = seis = false;
        } else if (columna == y - 1 && fila != 1 && fila != x - 1) {
            tres = cinco = ocho = false;
        } else if (fila == x - 1 && columna == 1) {
            uno = cuatro = seis = siete = ocho = false;
        } else if (fila == x - 1 && columna != 1 && columna != y - 1) {
            seis = siete = ocho = false;
        } else if (fila == x - 1 && columna == y - 1) {
            tres = cinco = seis = siete = ocho = false;
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vistaDelTablero[i][j] = " /";
            }
        }
        vistaDelTablero[1][1] = letra;
        
        if (uno) {
            if (" .".equals(tablero[fila - 1][columna - 1])) {
                vistaDelTablero[0][0] = " 1";
            } else {
                uno = false;
            }
        }
        if (dos) {
            if (" .".equals(tablero[fila - 1][columna])) {
                vistaDelTablero[0][1] = " 2";
            } else {
                dos = false;
            }
        }
        if (tres) {
            if (" .".equals(tablero[fila - 1][columna + 1])) {
                vistaDelTablero[0][2] = " 3";
            } else {
                tres = false;
            }
        }
        if (cuatro) {
            if (" .".equals(tablero[fila][columna - 1])) {
                vistaDelTablero[1][0] = " 4";
            } else {
                cuatro = false;
            }
        }
        if (cinco) {
            if (" .".equals(tablero[fila][columna + 1])) {
                vistaDelTablero[1][2] = " 5";
            } else {
                cinco = false;
            }
        }
        if (seis) {
            if (" .".equals(tablero[fila + 1][columna - 1])) {
                vistaDelTablero[2][0] = " 6";
            } else {
                seis = false;
            }
        }
        if (siete) {
            if (" .".equals(tablero[fila + 1][columna])) {
                vistaDelTablero[2][1] = " 7";
            } else {
                siete = false;
            }
        }
        if (ocho) {
            if (" .".equals(tablero[fila + 1][columna + 1])) {
                vistaDelTablero[2][2] = " 8";
            } else {
                ocho = false;
            }
        }
        boolean paso = false;
        boolean puedeMoverse = false;
        
        while(!paso) {
            puedeMoverse = true;
            String COLOR = "\u001B[37m";
            String ANSI_WRITE = "\u001B[37m";
            String ANSI_PURPLE = "\u001B[35m";
            String ANSI_RED = "\u001B[31m";
            String ANSI_RESET = "\u001B[0m";
            System.out.println();
            System.out.println("(Capa de Movilidad Activada)");
            System.out.println();
            
            for (int i = 0; i < 3; i++){						
                for (int j = 0; j < 3; j++) {
                    
                    if (" C".equals(vistaDelTablero[i][j]) || " Q".equals(vistaDelTablero[i][j]) || " M".equals(vistaDelTablero[i][j]) || " G".equals(vistaDelTablero[i][j]) || " D".equals(vistaDelTablero[i][j])) {
                        COLOR = ANSI_PURPLE;
                    } else if (" /".equals(vistaDelTablero[i][j])) {
                        COLOR = ANSI_RED;
                    } else {
                        COLOR = ANSI_WRITE;
                    }
                    System.out.print(COLOR + vistaDelTablero[i][j] + ANSI_RESET);
                }
                System.out.println();
            }
            
            System.out.println();
            System.out.println("Escriba el Número de la Posición donde desea Mover al Personaje");
            int opcion = Integer.parseInt(scanner.nextLine());
            System.out.println();

            if (opcion > 0 && opcion < 9) {
                if (opcion == 1) {
                    if (uno) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila - 1][columna - 1];
                        tablero[fila - 1][columna - 1] = letra;
                        filaNueva = fila - 1;
                        columnaNueva = columna - 1;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                } else if (opcion == 2) {
                    if (dos) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila - 1][columna];
                        tablero[fila - 1][columna] = letra;
                        filaNueva = fila - 1;
                        columnaNueva = columna;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                } else if (opcion == 3) {
                    if (tres) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila - 1][columna + 1];
                        tablero[fila - 1][columna + 1] = letra;
                        filaNueva = fila - 1;
                        columnaNueva = columna + 1;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                } else if (opcion == 4) {
                    if (cuatro) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila][columna - 1];
                        tablero[fila][columna - 1] = letra;
                        filaNueva = fila;
                        columnaNueva = columna - 1;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                } else if (opcion == 5) {
                    if (cinco) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila][columna + 1];
                        tablero[fila][columna + 1] = letra;
                        filaNueva = fila;
                        columnaNueva = columna + 1;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                } else if (opcion == 6) {
                    if (seis) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila + 1][columna - 1];
                        tablero[fila + 1][columna - 1] = letra;
                        filaNueva = fila + 1;
                        columnaNueva = columna - 1;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                } else if (opcion == 7) {
                    if (siete) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila + 1][columna];
                        tablero[fila + 1][columna] = letra;
                        filaNueva = fila + 1;
                        columnaNueva = columna;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                } else if (opcion == 8) {
                    if (ocho) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila + 1][columna + 1];
                        tablero[fila + 1][columna + 1] = letra;
                        filaNueva = fila + 1;
                        columnaNueva = columna + 1;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                }
                if (!puedeMoverse) {
                    System.out.println("-----------------------------------");
                    System.out.println("No puedes Moverte en esta Dirección");
                    System.out.println("-----------------------------------");
                }
            } else {
                System.out.println("---------------------------------------");
                System.out.println("Número Incorrecto, Intentalo Nuevamente");
                System.out.println("---------------------------------------");
            }
        }
        System.out.println("------------------------");
        System.out.println("Se realizo el Movimiento");
        System.out.println("------------------------");
        System.out.println();
    }
    
    public void activarCapa_2(String[][] tablero, int fila, int columna, String casillaAnterior, int x, int y, String letra) {
        Scanner scanner = new Scanner(System.in);
        boolean uno = true, dos = true, tres = true, cuatro = true, cinco = true, seis = true, siete = true, ocho = true;
        String vistaDelTablero[][] = new String[3][3];
        
        if (fila == 1 && columna == 1) {
            uno = dos = tres = cuatro = seis = false;
        } else if (fila == 1 && columna != 1 && columna != y - 1) {
            uno = dos = tres = false;
        } else if (fila == 1 && columna == y - 1) {
            uno = dos = tres = cinco = ocho = false;
        } else if (columna == 1 && fila != 1 && fila != x - 1) {
            uno = cuatro = seis = false;
        } else if (columna == y - 1 && fila != 1 && fila != x - 1) {
            tres = cinco = ocho = false;
        } else if (fila == x - 1 && columna == 1) {
            uno = cuatro = seis = siete = ocho = false;
        } else if (fila == x - 1 && columna != 1 && columna != y - 1) {
            seis = siete = ocho = false;
        } else if (fila == x - 1 && columna == y - 1) {
            tres = cinco = seis = siete = ocho = false;
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vistaDelTablero[i][j] = " /";
            }
        }
        vistaDelTablero[1][1] = letra;
        
        if (uno) {
            if (" .".equals(tablero[fila - 1][columna - 1]) || " a".equals(tablero[fila - 1][columna - 1]) || " A".equals(tablero[fila - 1][columna - 1])) {
                vistaDelTablero[0][0] = " 1";
            } else {
                uno = false;
            }
        }
        if (dos) {
            if (" .".equals(tablero[fila - 1][columna]) || " a".equals(tablero[fila - 1][columna]) || " A".equals(tablero[fila - 1][columna])) {
                vistaDelTablero[0][1] = " 2";
            } else {
                dos = false;
            }
        }
        if (tres) {
            if (" .".equals(tablero[fila - 1][columna + 1]) || " a".equals(tablero[fila - 1][columna + 1]) || " A".equals(tablero[fila - 1][columna + 1])) {
                vistaDelTablero[0][2] = " 3";
            } else {
                tres = false;
            }
        }
        if (cuatro) {
            if (" .".equals(tablero[fila][columna - 1]) || " a".equals(tablero[fila][columna - 1]) || " A".equals(tablero[fila][columna - 1])) {
                vistaDelTablero[1][0] = " 4";
            } else {
                cuatro = false;
            }
        }
        if (cinco) {
            if (" .".equals(tablero[fila][columna + 1]) || " a".equals(tablero[fila][columna + 1]) || " A".equals(tablero[fila][columna + 1])) {
                vistaDelTablero[1][2] = " 5";
            } else {
                cinco = false;
            }
        }
        if (seis) {
            if (" .".equals(tablero[fila + 1][columna - 1]) || " a".equals(tablero[fila + 1][columna - 1]) || " A".equals(tablero[fila + 1][columna - 1])) {
                vistaDelTablero[2][0] = " 6";
            } else {
                seis = false;
            }
        }
        if (siete) {
            if (" .".equals(tablero[fila + 1][columna]) || " a".equals(tablero[fila + 1][columna]) || " A".equals(tablero[fila + 1][columna])) {
                vistaDelTablero[2][1] = " 7";
            } else {
                siete = false;
            }
        }
        if (ocho) {
            if (" .".equals(tablero[fila + 1][columna + 1]) || " a".equals(tablero[fila + 1][columna + 1]) || " A".equals(tablero[fila + 1][columna + 1])) {
                vistaDelTablero[2][2] = " 8";
            } else {
                ocho = false;
            }
        }
        boolean paso = false;
        boolean puedeMoverse = false;
        
        while(!paso) {
            puedeMoverse = true;
            String COLOR = "\u001B[37m";
            String ANSI_WRITE = "\u001B[37m";
            String ANSI_PURPLE = "\u001B[35m";
            String ANSI_RED = "\u001B[31m";
            String ANSI_RESET = "\u001B[0m";
            System.out.println();
            System.out.println("(Capa de Movilidad Activada)");
            System.out.println();
            
            for (int i = 0; i < 3; i++){						
                for (int j = 0; j < 3; j++) {
                    
                    if (" C".equals(vistaDelTablero[i][j]) || " Q".equals(vistaDelTablero[i][j]) || " M".equals(vistaDelTablero[i][j]) || " G".equals(vistaDelTablero[i][j]) || " D".equals(vistaDelTablero[i][j])) {
                        COLOR = ANSI_PURPLE;
                    } else if (" /".equals(vistaDelTablero[i][j])) {
                        COLOR = ANSI_RED;
                    } else {
                        COLOR = ANSI_WRITE;
                    }
                    System.out.print(COLOR + vistaDelTablero[i][j] + ANSI_RESET);
                }
                System.out.println();
            }
            
            System.out.println();
            System.out.println("Escriba el Número de la Posición donde desea Mover al Personaje");
            int opcion = Integer.parseInt(scanner.nextLine());
            System.out.println();

            if (opcion > 0 && opcion < 9) {
                if (opcion == 1) {
                    if (uno) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila - 1][columna - 1];
                        tablero[fila - 1][columna - 1] = letra;
                        filaNueva = fila - 1;
                        columnaNueva = columna - 1;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                } else if (opcion == 2) {
                    if (dos) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila - 1][columna];
                        tablero[fila - 1][columna] = letra;
                        filaNueva = fila - 1;
                        columnaNueva = columna;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                } else if (opcion == 3) {
                    if (tres) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila - 1][columna + 1];
                        tablero[fila - 1][columna + 1] = letra;
                        filaNueva = fila - 1;
                        columnaNueva = columna + 1;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                } else if (opcion == 4) {
                    if (cuatro) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila][columna - 1];
                        tablero[fila][columna - 1] = letra;
                        filaNueva = fila;
                        columnaNueva = columna - 1;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                } else if (opcion == 5) {
                    if (cinco) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila][columna + 1];
                        tablero[fila][columna + 1] = letra;
                        filaNueva = fila;
                        columnaNueva = columna + 1;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                } else if (opcion == 6) {
                    if (seis) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila + 1][columna - 1];
                        tablero[fila + 1][columna - 1] = letra;
                        filaNueva = fila + 1;
                        columnaNueva = columna - 1;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                } else if (opcion == 7) {
                    if (siete) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila + 1][columna];
                        tablero[fila + 1][columna] = letra;
                        filaNueva = fila + 1;
                        columnaNueva = columna;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                } else if (opcion == 8) {
                    if (ocho) {
                        tablero[fila][columna] = casillaAnterior;
                        casillaActual = tablero[fila + 1][columna + 1];
                        tablero[fila + 1][columna + 1] = letra;
                        filaNueva = fila + 1;
                        columnaNueva = columna + 1;
                        paso = true;
                    } else {
                        puedeMoverse = false;
                    }
                }
                if (!puedeMoverse) {
                    System.out.println("-----------------------------------");
                    System.out.println("No puedes Moverte en esta Dirección");
                    System.out.println("-----------------------------------");
                }
            } else {
                System.out.println("---------------------------------------");
                System.out.println("Número Incorrecto, Intentalo Nuevamente");
                System.out.println("---------------------------------------");
            }
        }
        System.out.println("------------------------");
        System.out.println("Se realizo el Movimiento");
        System.out.println("------------------------");
        System.out.println();
    }
    
    public boolean verAlcanceDelaCapa(String[][] tablero, int fila, int columna, int x, int y) {
        boolean uno = true, dos = true, tres = true, cuatro = true, cinco = true, seis = true, siete = true, ocho = true;
        boolean sePuedeActivar = false;
        
        if (fila == 1 && columna == 1) {
            uno = dos = tres = cuatro = seis = false;
        } else if (fila == 1 && columna != 1 && columna != y - 1) {
            uno = dos = tres = false;
        } else if (fila == 1 && columna == y - 1) {
            uno = dos = tres = cinco = ocho = false;
        } else if (columna == 1 && fila != 1 && fila != x - 1) {
            uno = cuatro = seis = false;
        } else if (columna == y - 1 && fila != 1 && fila != x - 1) {
            tres = cinco = ocho = false;
        } else if (fila == x - 1 && columna == 1) {
            uno = cuatro = seis = siete = ocho = false;
        } else if (fila == x - 1 && columna != 1 && columna != y - 1) {
            seis = siete = ocho = false;
        } else if (fila == x - 1 && columna == y - 1) {
            tres = cinco = seis = siete = ocho = false;
        }
        
        if (uno) {
            if (!" .".equals(tablero[fila - 1][columna - 1])) {
                uno = false;
            }
        }
        if (dos) {
            if (!" .".equals(tablero[fila - 1][columna])) {
                dos = false;
            }
        }
        if (tres) {
            if (!" .".equals(tablero[fila - 1][columna + 1])) {
                tres = false;
            }
        }
        if (cuatro) {
            if (!" .".equals(tablero[fila][columna - 1])) {
                cuatro = false;
            }
        }
        if (cinco) {
            if (!" .".equals(tablero[fila][columna + 1])) {
                cinco = false;
            }
        }
        if (seis) {
            if (!" .".equals(tablero[fila + 1][columna - 1])) {
                seis = false;
            }
        }
        if (siete) {
            if (!" .".equals(tablero[fila + 1][columna])) {
                siete = false;
            }
        }
        if (ocho) {
            if (!" .".equals(tablero[fila + 1][columna + 1])) {
                ocho = false;
            }
        }
        
        if (uno == true) {
            sePuedeActivar = true;
        }
        if (dos == true) {
            sePuedeActivar = true;
        }
        if (tres == true) {
            sePuedeActivar = true;
        }
        if (cuatro == true) {
            sePuedeActivar = true;
        }
        if (cinco == true) {
            sePuedeActivar = true;
        }
        if (seis == true) {
            sePuedeActivar = true;
        }
        if (siete == true) {
            sePuedeActivar = true;
        }
        if (ocho == true) {
            sePuedeActivar = true;
        }
        return sePuedeActivar;
    }
    
    public int mandarFilaNueva() {
        return filaNueva;
    }
    
    public int mandarColumnaNueva() {
        return columnaNueva;
    }
    
    public String mandarCasillaActual() {
        return casillaActual;
    }
}
