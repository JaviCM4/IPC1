package com.mycompany.batalla_naval.main.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class RecibirTableros {
    
    String[][] tablerosSeleccionado;
    
    public String[] obtenerNombreDeTablerosEspecificos(int limiteInferior, int limiteSuperior, String path) {
        File file = new File(path);
        BufferedReader entrada = null;
        String cadena;
        int contadorDeTableros = 0;
        String[] nombreDeLosTableros = null;
        
        if (file.exists()) {            
            try {
                entrada = new BufferedReader(new FileReader(file)); 

                while ((cadena = entrada.readLine()) != null) {
                    String[] partes = cadena.split(" ");
                    
                    if (partes.length > 1) {
                        if ("dimension".equals(partes[0])) {
                            String parteNumerica = partes[1];
                            String[] numeroEnPartes = parteNumerica.split("X");
                            int fila = 0,columna = 0,tamaño;
                            
                            try {
                                fila = Integer.parseInt(numeroEnPartes[0]);
                                columna = Integer.parseInt(numeroEnPartes[1]);
                            } catch (NumberFormatException e){
                                System.out.println(e.getMessage());
                            }
                            tamaño = fila*columna;
                            
                            if (tamaño > limiteInferior && tamaño <= limiteSuperior) {
                                contadorDeTableros++;
                            }
                        }
                    }
                }
                
                entrada = new BufferedReader(new FileReader(file)); 
                
                if (contadorDeTableros != 0) {
                    nombreDeLosTableros = new String[contadorDeTableros];
                    int indice = 0;
                    String nombreDelTableroPosible = "-----";

                    while ((cadena = entrada.readLine()) != null) {
                        String[] partes = cadena.split(" ");

                        if (partes.length > 1) {
                            if ("tablero".equals(partes[0])) {
                                nombreDelTableroPosible = partes[1];
                            }                           
                            if ("dimension".equals(partes[0])) {
                                String parteNumerica = partes[1];
                                String[] numeroEnPartes = parteNumerica.split("X");
                                int tamaño = 0;
                                
                                try {
                                    int fila = Integer.parseInt(numeroEnPartes[0]);
                                    int columna = Integer.parseInt(numeroEnPartes[1]);
                                    tamaño = fila*columna;
                                } catch (NumberFormatException e) {
                                    System.out.println(e.getMessage());
                                }
                                if (tamaño > limiteInferior && tamaño <= limiteSuperior) {
                                    nombreDeLosTableros[indice] = nombreDelTableroPosible + " " + parteNumerica;
                                    indice++;
                                }
                            }
                        }
                    }
                } else {
                    nombreDeLosTableros = new String[1];
                    nombreDeLosTableros[0] = "-----";
                }
            } catch (FileNotFoundException e) {
                System.out.println("Excepción de tipo: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Excepción de tipo: " + e.getMessage());
            }
        } else {
            System.out.println("Archivo Inexistente");
        }
        return nombreDeLosTableros;
    }
    
    public String[][] obtenerTablero(String tableroABuscar, String path) {
        File file = new File(path);
        BufferedReader entrada = null;
        String cadena;       
        // Nombre del tablero
        String[] datosDelTablero = tableroABuscar.split(" ");
        String nombreDelTablero = datosDelTablero[0];       
        // Dimensiones del Tablero
        String parteNumerica = datosDelTablero[1];
        String[] numeroEnPartes = parteNumerica.split("X");
        int filas = Integer.parseInt(numeroEnPartes[0]);
        int columnas = Integer.parseInt(numeroEnPartes[1]);                          
        String[][] tablero = new String[filas][columnas];
        
        if (file.exists()) {            
            try {
                entrada = new BufferedReader(new FileReader(file)); 
                boolean tableroEncontrado = false, lineaDeltablero = false; 
                int indice = 0;
                
                while ((cadena = entrada.readLine()) != null) {
                    String[] partes = cadena.split(" ");
                    
                    if (!tableroEncontrado) {
                        if (partes.length > 1) {
                            if (nombreDelTablero.equals(partes[1])) {   
                                tableroEncontrado = true;
                            }
                        }
                    } else {
                        if (lineaDeltablero) {
                            if (indice < filas) {
                                String[] casillas = cadena.split(",");

                                for (int i = 0; i < columnas; i++) {
                                    tablero[indice][i] = casillas[i];
                                }
                                indice++;
                            }
                        } else {
                            lineaDeltablero = true;
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("Excepción de tipo: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Excepción de tipo: " + e.getMessage());
            }
        } else {
            System.out.println("Archivo Inexistente");
        }
        return tablero;
    }
    
    public int obtenerNumeroDeTableros(String path) {
        File file = new File(path);
        BufferedReader entrada = null;
        int contadorDeTableros = 0;
        String cadena;
        
        if (file.exists()) {            
            try {
                entrada = new BufferedReader(new FileReader(file));
                
                while ((cadena = entrada.readLine()) != null) {
                    String[] partes = cadena.split(" ");
                    
                    if (partes.length > 1) {
                        if ("tablero".equals(partes[0])) {
                            contadorDeTableros++;
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("Excepción de tipo: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Excepción de tipo: " + e.getMessage());
            }
        }
        return contadorDeTableros;
    }
    
    public String[] obtenerNombreDeTodosLosTableros(String path) {
        int numeroDeTableros = obtenerNumeroDeTableros(path);
        String[] nombreDeLosTableros;
        
        if (numeroDeTableros > 0) {
            File file = new File(path);
            BufferedReader entrada = null;
            nombreDeLosTableros = new String[numeroDeTableros];
            String cadena, nombreDelTablero = "No hay Tableros, Carga un Archivo";;
            
            if (file.exists()) {            
                try {
                    entrada = new BufferedReader(new FileReader(file)); 
                    int contador = 0;
                    int indice = 0;
                    
                    while ((cadena = entrada.readLine()) != null) {
                        String[] partes = cadena.split(" ");

                        if (partes.length > 1) {
                            if ("tablero".equals(partes[0])) {
                                nombreDelTablero = partes[1];
                                contador = 1;
                            } else {
                                if (contador == 1) {
                                    nombreDeLosTableros[indice] = nombreDelTablero + " " + partes[1];
                                    contador = 0;
                                    indice++;
                                }
                            }
                        }
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Excepción de tipo: " + e.getMessage());
                } catch (IOException e) {
                    System.out.println("Excepción de tipo: " + e.getMessage());
                }
            } else {
                System.out.println("Archivo Inexistente");
            }
        } else {
            nombreDeLosTableros = new String[1];
            nombreDeLosTableros[0] = "No hay Tableros, Carga un Archivo";
        }
        return nombreDeLosTableros;
    }
    
    public void sumarTableros(String path, String pathNuevo) {
        File file = new File(pathNuevo);
        BufferedReader entrada = null;
        String cadena;
        boolean paso = false;
        
        if (file.exists()) {            
            try {
                entrada = new BufferedReader(new FileReader(file)); 

                while ((cadena = entrada.readLine()) != null) {
                    File file_1 = new File(path);
                    
                    try {
                        FileWriter writer = new FileWriter(file_1, true);

                        try (PrintWriter printer = new PrintWriter(writer)) { 
                            if (!paso) {
                                printer.println();
                                printer.print(cadena);
                                printer.println();
                                paso = true;
                            } else {
                                printer.println(cadena);
                            }
                            printer.close();
                        }
                    } catch (IOException e) {

                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("Excepción de tipo: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Excepción de tipo: " + e.getMessage());
            }
        } else {
            System.out.println("Archivo Inexistente");
        }
    }
}
