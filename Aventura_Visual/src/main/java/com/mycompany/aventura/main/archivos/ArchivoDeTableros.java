
package com.mycompany.aventura.main.archivos;

import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class ArchivoDeTableros {
    
    public void sumarTablerosDelArchivo(String pathNuevo) {
        ListaElementos<String> nombreDeLosTableros = new ListaElementos<>();
        File file = new File(pathNuevo);
        BufferedReader entrada = null;
        int numeroDeTablerosRepetidos = 0;
        String cadena;
        boolean paso = false, tableroEncontrado = false;
        
        if (file.exists()) {            
            try {
                nombreDeLosTableros = obtenerNombreDeTodosLosTableros("Tableros_De_Juego.th");
                entrada = new BufferedReader(new FileReader(file)); 

                while ((cadena = entrada.readLine()) != null) {
                    String[] partes = cadena.split(" ");
                    
                    if (partes.length > 1) {
                        if ("tablero".equals(partes[0])) {
                            for (int i = 1; i <= nombreDeLosTableros.getLongitud(); i++) {
                                try {
                                    if (nombreDeLosTableros.obtenerContenido(i).equals(partes[1])) {
                                        tableroEncontrado = false;
                                        numeroDeTablerosRepetidos++;
                                        break;
                                    } else {
                                        tableroEncontrado = true;
                                    }
                                } catch (ListaElementosExcepcion ex) {
                                    System.out.println(ex.getMessage());
                                }
                            }
                        }
                    }
                    
                    if (tableroEncontrado) {                      
                        File file_1 = new File("Tableros_De_Juego.th");

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
                            System.out.println(e.getMessage());
                        }
                    }
                }
                JOptionPane.showMessageDialog(null,"Se Encontrarón " + numeroDeTablerosRepetidos + " tableros Repetidos","Tableros Repetidos",JOptionPane.INFORMATION_MESSAGE);
                entrada.close();
            } catch (FileNotFoundException e) {
                System.out.println("Excepción Suma de Archivos de tipo: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Excepción Suma de Archivos de tipo: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null,"El Archivo que Ingreso no Existe","Archivo Inexistente",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void sumarTableroCreado(String nombre, int filas, int columnas, ListaElementos<String> tableroCreado) {
        ListaElementos<String> tableroCompleto = new ListaElementos<>();
        File file = new File("Tableros_De_Juego.th");
        boolean paso = false;
        
        tableroCompleto.agregarALaLista("tablero " + nombre);
        tableroCompleto.agregarALaLista("dimension " + filas + "X" + columnas);
        
        for (int i = 1; i <= tableroCreado.getLongitud(); i++) {
            try {
                tableroCompleto.agregarALaLista(tableroCreado.obtenerContenido(i));
            } catch (ListaElementosExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        for (int i = 1; i <= tableroCompleto.getLongitud(); i++) {
            try {
                FileWriter writer = new FileWriter(file, true);

                try (PrintWriter printer = new PrintWriter(writer)) { 
                    try {
                        if (!paso) {
                            printer.println();
                            printer.print(tableroCompleto.obtenerContenido(i));
                            printer.println();
                            paso = true;
                        } else {
                            printer.println(tableroCompleto.obtenerContenido(i));
                        }
                    } catch (ListaElementosExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                    printer.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public ListaElementos<String> obtenerNombreDeTodosLosTableros(String path) {
        ListaElementos<String> nombreDeLosTableros = new ListaElementos<>();
        int numeroDeTableros = obtenerNumeroDeTableros(path);
        
        if (numeroDeTableros > 0) {
            File file = new File(path);
            BufferedReader entrada = null;
            String cadena, nombreDelTablero = "No hay Tableros, Carga un Archivo";
                       
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
                                nombreDeLosTableros.agregarALaLista(nombreDelTablero);
                                contador = 0;
                                indice++;
                            }
                        }
                    }
                }
                entrada.close();
            } catch (FileNotFoundException e) {
                System.out.println("Excepción Obtener Nombres de tipo: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Excepción Obtener Nombres de tipo: " + e.getMessage());
            }
        } else {
            nombreDeLosTableros.agregarALaLista("------");
        }
        return nombreDeLosTableros;
    }
    
    private int obtenerNumeroDeTableros(String path) {
        File file = new File(path);
        BufferedReader entrada = null;
        int contadorDeTableros = 0;
        String cadena;
                 
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
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("Excepción Contador de tipo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Excepción Contador de tipo: " + e.getMessage());
        }
        return contadorDeTableros;
    }
    
    public void obtenerElNombreYDimensionesDeTodosLosTableros(ListaElementos<String> tablerosDisponibles) {
        File file = new File("Tableros_De_Juego.th");
        BufferedReader entrada = null;
        String cadena, nombreDelTablero = null, parteNumerica = null;
        
        if (file.exists()) {            
            try {
                entrada = new BufferedReader(new FileReader(file)); 

                while ((cadena = entrada.readLine()) != null) {
                    String[] partes = cadena.split(" ");

                    if (partes.length > 1) {
                        if ("tablero".equals(partes[0])) {
                            nombreDelTablero = partes[1];
                        }                           
                        if ("dimension".equals(partes[0])) {
                            parteNumerica = partes[1];
                            tablerosDisponibles.agregarALaLista(nombreDelTablero + " " + parteNumerica);
                        }
                    }
                }
                entrada.close();
            } catch (FileNotFoundException e) {
                System.out.println("Excepción de tipo: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Excepción de tipo: " + e.getMessage());
            }
        } else {
            tablerosDisponibles.agregarALaLista("No hay Tableros Disponibles");
        }
    }
    
    public ListaElementos<String> obtenerTableroAJugar(String tableroABuscar) {
        File file = new File("Tableros_De_Juego.th");
        BufferedReader entrada = null;
        String cadena;
        ListaElementos<String> casillasDelTablero = new ListaElementos<>();
        
        String[] datosDelTablero = tableroABuscar.split(" ");
        String nombreDelTablero = datosDelTablero[0];     
        String parteNumerica = datosDelTablero[1];
        String[] numeroEnPartes = parteNumerica.split("X");
        int filas = Integer.parseInt(numeroEnPartes[0]);
        int columnas = Integer.parseInt(numeroEnPartes[1]);
        
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
                                    casillasDelTablero.agregarALaLista(casillas[i]);
                                }
                                indice++;
                            }
                        } else {
                            lineaDeltablero = true;
                        }
                    }
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return casillasDelTablero;
    }
}
