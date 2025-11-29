package com.mycompany.batalla_naval.main.archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

public class AccionesDelJugador {
    
    public void guardarAccionesDelJugador(String nombre, String accion, int fila, int columna) {       
        File file = new File("Acciones.avn");
        Calendar horaCompleta = Calendar.getInstance();
        int hora = horaCompleta.get(Calendar.HOUR_OF_DAY);
        int minutos = horaCompleta.get(Calendar.MINUTE);
        
        try {
            FileWriter writer = new FileWriter(file, true);

            try (PrintWriter printer = new PrintWriter(writer)) {
                printer.println(nombre + ", " + accion + " " + (fila + 1) + "-" + (columna + 1) + ", " + hora + ":" + minutos);
                printer.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
