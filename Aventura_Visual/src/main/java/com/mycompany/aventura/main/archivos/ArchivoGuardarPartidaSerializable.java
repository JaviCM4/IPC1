package com.mycompany.aventura.main.archivos;

import com.mycompany.aventura.main.guardarPartida.GuardarPartida;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class ArchivoGuardarPartidaSerializable {
    
    public void GuardarArchivo(GuardarPartida guardar, String path) {

        try {
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream(path + ".dat"));
            escribiendoFichero.writeObject(guardar);
            escribiendoFichero.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }
    
    public GuardarPartida LeerArchivo(String path) {
        GuardarPartida partidaRecuperada = null;
        
        try {
            ObjectInputStream recuperarFichero = new ObjectInputStream(new FileInputStream(path + ".dat"));
            partidaRecuperada = (GuardarPartida) recuperarFichero.readObject();
            recuperarFichero.close();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"El Nombre del Archivo que Ingreso no Existe","Archivo Inexistente",JOptionPane.ERROR_MESSAGE);               
        }
        return partidaRecuperada;
    }
}
