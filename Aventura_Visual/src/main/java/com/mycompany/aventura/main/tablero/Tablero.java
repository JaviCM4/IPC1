package com.mycompany.aventura.main.tablero;

import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import java.awt.Dimension;
import java.util.Random;
import javax.swing.JLabel;

public class Tablero {
    
    public ListaElementos<String> crearTableroTexto(int filas, int columnas, int numeroDeRios, int numeroDeArboles, int numeroDeLava) {
        ListaElementos<String> tableroNuevo = new ListaElementos<>();
        ListaElementos<Integer> numeroDeReferencia = new ListaElementos<>();
                
        for (int i = 1; i <= filas * columnas; i++) { 
            tableroNuevo.agregarALaLista("-");
        }
        
        int contador = 1;
        
        numeroDeReferencia.agregarALaLista(contador);
        for (int i = 1; i < filas; i++) {
            
            for (int j = 1; j <= columnas; j++) {
                contador++;
            }
            numeroDeReferencia.agregarALaLista(contador);
        }
        
        while (numeroDeRios != 0) {
            Random random_1 = new Random();
            int numeroDeColumna = (random_1.nextInt(columnas) + 1);

            Random random = new Random();
            int turno = (random.nextInt(2) + 1);
            
            if (turno == 1) {
                Random random_2 = new Random();
                int respuesta = (random_2.nextInt(2) + 1);

                if (respuesta == 1) {
                    if ("-".equals(tableroNuevo.encontrarPorIndice(numeroDeColumna).getContenido())) {
                        tableroNuevo.encontrarPorIndice(numeroDeColumna).setContenido("~");
                        tableroNuevo.encontrarPorIndice(numeroDeColumna + columnas).setContenido("~");
                        tableroNuevo.encontrarPorIndice(numeroDeColumna + columnas + columnas).setContenido("~");
                        numeroDeRios--;
                    }
                } else {
                    numeroDeColumna--;
                    if ("-".equals(tableroNuevo.encontrarPorIndice(tableroNuevo.getLongitud() - numeroDeColumna).getContenido())) {
                        tableroNuevo.encontrarPorIndice(tableroNuevo.getLongitud() - numeroDeColumna).setContenido("~");
                        tableroNuevo.encontrarPorIndice(tableroNuevo.getLongitud() - numeroDeColumna - columnas).setContenido("~");
                        tableroNuevo.encontrarPorIndice(tableroNuevo.getLongitud() - numeroDeColumna - columnas - columnas).setContenido("~");
                        numeroDeRios--;
                    }
                }
            } else {
                Random random_3 = new Random();
                int numeroDeLista = (random_3.nextInt(numeroDeReferencia.getLongitud()) + 1);
                int numeroDeCasilla = numeroDeReferencia.encontrarPorIndice(numeroDeLista).getContenido();

                Random random_2 = new Random();
                int respuesta = (random_2.nextInt(2) + 1);

                if (numeroDeLista == 1) {
                    respuesta = 1;
                }
                if (numeroDeLista == numeroDeReferencia.getLongitud()) {
                    respuesta = 2;
                }
                if (respuesta == 1) {
                    if ("-".equals(tableroNuevo.encontrarPorIndice(numeroDeCasilla).getContenido())) {
                        tableroNuevo.encontrarPorIndice(numeroDeCasilla).setContenido("~");
                        tableroNuevo.encontrarPorIndice(numeroDeCasilla + 1).setContenido("~");
                        tableroNuevo.encontrarPorIndice(numeroDeCasilla + 2).setContenido("~");
                        numeroDeRios--;
                    }
                } else {
                    if ("-".equals(tableroNuevo.encontrarPorIndice(numeroDeCasilla - 1).getContenido())) {
                        tableroNuevo.encontrarPorIndice(numeroDeCasilla - 1).setContenido("~");
                        tableroNuevo.encontrarPorIndice(numeroDeCasilla - 2).setContenido("~");
                        tableroNuevo.encontrarPorIndice(numeroDeCasilla - 3).setContenido("~");
                        numeroDeRios--;
                    }
                }
            }
        }

        while (numeroDeArboles != 0) {
            Random random_1 = new Random();
            int numeroDeCasilla = (random_1.nextInt(filas * columnas) + 1);

            if ("-".equals(tableroNuevo.encontrarPorIndice(numeroDeCasilla).getContenido())) {
                tableroNuevo.encontrarPorIndice(numeroDeCasilla).setContenido("T");
                numeroDeArboles--;
            }
        }
        
        while (numeroDeLava != 0) {
            Random random_1 = new Random();
            int numeroDeCasilla = (random_1.nextInt(filas * columnas) + 1);

            if ("-".equals(tableroNuevo.encontrarPorIndice(numeroDeCasilla).getContenido())) {
                tableroNuevo.encontrarPorIndice(numeroDeCasilla).setContenido("#");
                numeroDeLava--;
            }
        }     
        return tableroNuevo;
    }
    
    public ListaElementos<Casilla> crearTableroJLabel(ListaElementos<String> tipoDeCasilla, ListaElementos<Arbol> arboles, int filas, int columnas, int anchoDelTablero, int alturaDelTablero) {
        ListaElementos<Casilla> casillas = new ListaElementos<>();
        
        int indice = 1;
        int ancho = anchoDelTablero/columnas;
        int altura = alturaDelTablero/filas;
        
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                try {
                    String imagen = "planicie";
                    
                    if ("~".equals(tipoDeCasilla.obtenerContenido(indice))) {
                        imagen = "rio";
                    } else if ("T".equals(tipoDeCasilla.obtenerContenido(indice))) {
                        imagen = "arbol";
                        arboles.agregarALaLista(new Arbol(i, j));
                    } else if ("#".equals(tipoDeCasilla.obtenerContenido(indice))) {
                        imagen = "lava";
                    }
                    casillas.agregarALaLista(new Casilla(i, j, imagen));
                    casillas.obtenerContenido(indice).setPreferredSize(new Dimension(ancho, altura));
                    indice++;
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return casillas;
    }
    
    public ListaElementos<JLabel> crearTableroJLabelMuestra(ListaElementos<String> tipoDeCasilla, int filas, int columnas) {
        ListaElementos<JLabel> casillas = new ListaElementos<>();
        
        int ancho = 300/columnas;
        int altura = 301/filas;

        for (int i = 1; i <= tipoDeCasilla.getLongitud(); i++) {
            try {
                casillas.agregarALaLista(new JLabel());
                casillas.obtenerContenido(i).setPreferredSize(new Dimension(ancho, altura));
            } catch (ListaElementosExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
        return casillas;
    }
}
