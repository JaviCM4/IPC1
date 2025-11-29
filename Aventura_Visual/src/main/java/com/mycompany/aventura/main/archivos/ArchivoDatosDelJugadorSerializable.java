package com.mycompany.aventura.main.archivos;

import com.mycompany.aventura.main.guardarPartida.GuardarJugador;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchivoDatosDelJugadorSerializable {
    
    public void guardarDatosDelJugador(GuardarJugador jugador) {

        try {
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("JugadorGuardado.dat"));
            escribiendoFichero.writeObject(jugador);
            escribiendoFichero.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }
   
    public GuardarJugador recuperarJugador() {
        GuardarJugador jugadorRecuperado = null;
        
        try {
            ObjectInputStream recuperarFichero = new ObjectInputStream(new FileInputStream("JugadorGuardado.dat"));
            jugadorRecuperado = (GuardarJugador) recuperarFichero.readObject();
            recuperarFichero.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return jugadorRecuperado;
    }
}
