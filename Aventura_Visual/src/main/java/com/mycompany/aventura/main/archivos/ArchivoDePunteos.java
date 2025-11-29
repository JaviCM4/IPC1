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

public class ArchivoDePunteos {
    
    public void guardarPunteoDelJugador(String nombre, int puntuacion) {
        File file = new File("Punteos.war");

        try {
            FileWriter writer = new FileWriter(file, true);

            try (PrintWriter printer = new PrintWriter(writer)) {
                printer.println(nombre + ", " + puntuacion);
                printer.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void agregarNuevoPunteo(String nombre, int puntuacion) {
        File file = new File("Punteos.war");
        ListaElementos<String> listaDeJugadores = new ListaElementos<>();
        BufferedReader entrada = null;
        String cadena;
        
        if (file.exists()) {            
            try {
                entrada = new BufferedReader(new FileReader(file));

                while ((cadena = entrada.readLine()) != null) {
                    listaDeJugadores.agregarALaLista(cadena);
                }
                
                listaDeJugadores.encontrarPorIndice(listaDeJugadores.getLongitud()).setContenido(nombre + ", " + puntuacion);
                
                try {
                    FileWriter writer = new FileWriter(file, false);

                    try (PrintWriter printer = new PrintWriter(writer)) {
                        for (int i = 1; i <= listaDeJugadores.getLongitud(); i++) {
                            try {
                                printer.println(listaDeJugadores.obtenerContenido(i));
                            } catch (ListaElementosExcepcion ex) {
                                System.out.println(ex.getMessage());
                            }
                        }
                        printer.close();
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            listaDeJugadores.agregarALaLista("No hay Registro");
        }
    }
    
    public ListaElementos<String> obtenerPunteosDeTodosLosJugadores() {
        File file = new File("Punteos.war");
        ListaElementos<String> listaDeJugadores = new ListaElementos<>();
        BufferedReader entrada = null;
        String cadena;
        
        if (file.exists()) {            
            try {
                entrada = new BufferedReader(new FileReader(file));
                
                while ((cadena = entrada.readLine()) != null) {
                    listaDeJugadores.agregarALaLista(cadena);
                }
                entrada.close();
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            listaDeJugadores.agregarALaLista("No hay Registro");
        }
        return listaDeJugadores;
    }
    
}
