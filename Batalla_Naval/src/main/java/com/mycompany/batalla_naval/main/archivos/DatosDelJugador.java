package com.mycompany.batalla_naval.main.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DatosDelJugador {
    
    public void guardarDatosDelJugador(String nombre, int puntuacion) {       
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
    
    public void AgregarNuevoPunteo(String nombre, int puntuacion) {
        File file = new File("Punteos.war");
        String[] listaDeJugadores = null;
        BufferedReader entrada = null;
        String cadena;
        
        if (file.exists()) {            
            try {
                entrada = new BufferedReader(new FileReader(file));
                int contador = 0;
                
                while ((cadena = entrada.readLine()) != null) {
                    contador++;
                }
                
                if (contador == 0) {
                    listaDeJugadores = new String[1];
                    listaDeJugadores[0] = "No hay Registro";
                } else {
                    listaDeJugadores = new String[contador];
                    entrada = new BufferedReader(new FileReader(file));
                    int indice = 0;

                    while ((cadena = entrada.readLine()) != null) {
                        listaDeJugadores[indice] = cadena;
                        indice++;
                    }
                }
                listaDeJugadores[listaDeJugadores.length - 1] = nombre + ", " + puntuacion;
                
                try {
                    FileWriter writer = new FileWriter(file, false);

                    try (PrintWriter printer = new PrintWriter(writer)) {
                        for (int i = 0; i < listaDeJugadores.length; i++) {
                            printer.println(listaDeJugadores[i]);
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
            listaDeJugadores = new String[1];
            listaDeJugadores[0] = "No hay Registro";
        }
    }
    
    public String[] mandarListaDeJugadores() {
        File file = new File("Punteos.war");
        String[] listaDeJugadores = null;
        BufferedReader entrada = null;
        String cadena;
        
        if (file.exists()) {            
            try {
                entrada = new BufferedReader(new FileReader(file));
                int contador = 0;
                
                while ((cadena = entrada.readLine()) != null) {
                    contador++;
                }
                
                if (contador == 0) {
                    listaDeJugadores = new String[1];
                    listaDeJugadores[0] = "No hay Registro";
                } else {
                    listaDeJugadores = new String[contador];
                    entrada = new BufferedReader(new FileReader(file));
                    int indice = 0;

                    while ((cadena = entrada.readLine()) != null) {
                        listaDeJugadores[indice] = cadena;
                        indice++;
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            listaDeJugadores = new String[1];
            listaDeJugadores[0] = "No hay Registro";
        }
        return listaDeJugadores;
    }
}
