package com.mycompany.aventura.main.frameDelJuego;


import com.mycompany.aventura.main.archivos.ArchivoDatosDelJugadorSerializable;
import com.mycompany.aventura.main.archivos.ArchivoDePunteos;
import com.mycompany.aventura.main.archivos.ArchivoGuardarPartidaSerializable;
import com.mycompany.aventura.main.guardarPartida.GuardarJugador;
import com.mycompany.aventura.main.guardarPartida.GuardarPartida;
import com.mycompany.aventura.main.jugador.Jugador;
import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.personajes.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    private ListaElementos<Personaje> personajesEnemigos = new ListaElementos<>();
    private Jugador jugador = new Jugador();
    private boolean primeraPartida = true;
    private String tableroAJugar;
    private int modoTienda = 2;
    
    public MenuPrincipal() {
        initComponents();
        this.setResizable(false);
        this.setTitle("Menu Principal");
        this.setLocationRelativeTo(null);
        recibirDatosDelJugador();
        cerrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloMenuPrincipal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        iniciarPartida = new javax.swing.JButton();
        tienda = new javax.swing.JButton();
        generacionDeTablero = new javax.swing.JButton();
        inventario = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        mostrarOro = new javax.swing.JLabel();
        ranking = new javax.swing.JButton();
        mostrarNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMenuPrincipal.setText("Menu Principal");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione"));

        iniciarPartida.setText("Iniciar Partida");
        iniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarPartidaActionPerformed(evt);
            }
        });

        tienda.setText("Tienda");
        tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiendaActionPerformed(evt);
            }
        });

        generacionDeTablero.setText("Generación de Tablero");
        generacionDeTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generacionDeTableroActionPerformed(evt);
            }
        });

        inventario.setText("Inventario");
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        mostrarOro.setText("jLabel1");

        ranking.setText("Ranking");
        ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(mostrarOro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iniciarPartida)
                            .addComponent(generacionDeTablero)
                            .addComponent(tienda)
                            .addComponent(ranking)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(mostrarNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inventario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(iniciarPartida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tienda)
                .addGap(12, 12, 12)
                .addComponent(generacionDeTablero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ranking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(mostrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(mostrarOro))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(tituloMenuPrincipal)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMenuPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarPartidaActionPerformed
        File file = new File("Punteos.war");
        
        if (file.exists()) {
            primeraPartida = false;
        } else {
            primeraPartida = true;
        }
        
        if (primeraPartida) {
            JOptionPane.showMessageDialog(this,"Bienvenido, Se te han abonado 500 de Oro, para que Inicies tú Aventura","Oro",JOptionPane.INFORMATION_MESSAGE);
            jugador.guardarOro(500);
            modoTienda = 1;
            irALaBatalla();
        } else {
            
            if (!jugador.obtenerPartidaGuardadas().estaVacia()) {
                
                for (int i = 1; i < jugador.obtenerPartidaGuardadas().getLongitud(); i++) {
                    try {
                        System.out.println(jugador.obtenerPartidaGuardadas().obtenerContenido(i));
                    } catch (ListaElementosExcepcion ex) {
                        Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                int selectedOption = JOptionPane.showConfirmDialog(null,"¿Deseas Continuar con la Partida en Juego?", "Pregunta", JOptionPane.YES_NO_OPTION); 

                if (selectedOption == JOptionPane.YES_OPTION) {
                    GuardarPartida recibido = null;
                    boolean salir = false;
                    String respuesta = null;

                    while (!salir) {
                        respuesta = JOptionPane.showInputDialog("Escribe el Nombre de la Partida Guardada");
                        if ("".equals(respuesta) || respuesta == null) {
                            JOptionPane.showMessageDialog(this,"Debes Escribir el Nombre del Archivo","Escribe el Nombre",JOptionPane.ERROR_MESSAGE);
                        } else {
                            salir = true;
                        }
                    }
                    ArchivoGuardarPartidaSerializable obtenerSerializable = new ArchivoGuardarPartidaSerializable();
                    recibido = obtenerSerializable.LeerArchivo(respuesta);

                    try {
                        Batalla nueva = new Batalla(this, 2, recibido, jugador.obtenerListaPersonajes(), jugador.obtenerListaObjetos(), personajesEnemigos, tableroAJugar, respuesta, jugador);
                        nueva.setVisible(true);
                        jugador.aumentarPunteo(nueva.obtenerPunteoEnBatalla());
                        jugador.aumentarOro(nueva.obtenerOro());
                        personajesEnemigos = new ListaElementos<>();
                        ArchivoDePunteos archivo = new ArchivoDePunteos();
                        archivo.agregarNuevoPunteo(jugador.obtenerNombre(), jugador.obtenerPunteoJugador());
                    } catch (NullPointerException ex) {
                        System.out.println("El Archivo no Existe");
                    }
                    mostrarNombre.setText("Nombre: " + jugador.obtenerNombre());
                    mostrarOro.setText("Oro: " + jugador.obtenerOro());
                } else {
                    irALaBatalla();
                }
            } else {
                irALaBatalla();
            }
        }
    }//GEN-LAST:event_iniciarPartidaActionPerformed

    private void irALaBatalla() {
        GuardarPartida recibido = null;
        String respuesta = null;
        boolean salir = false;

        int selectedOption = 1;
        
        if (!primeraPartida) {  
            selectedOption = JOptionPane.showConfirmDialog(null,"¿Desea seguir Jugando con este Usuario?", "Pregunta", JOptionPane.YES_NO_OPTION); 
            
            if (selectedOption == JOptionPane.NO_OPTION) { // YES_NO_OPTION    Yes = 0, X = -1, No = 1
                
                while (!salir) {
                    respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
                    if ("".equals(respuesta) || respuesta == null) {
                        JOptionPane.showMessageDialog(this,"Debes Escribir un Nombre de Usuario","Escribe un Nombre",JOptionPane.ERROR_MESSAGE);
                    } else {
                        salir = true;
                    }
                }
                String[] cadena = respuesta.split("");
                String nombreDelUsuario = "";

                for (int i = 0; i < cadena.length; i++) {                           
                    if (!" ".equals(cadena[i])) {
                        nombreDelUsuario += cadena[i];
                    }
                }
                salir = false;
                modoTienda = 1;
                jugador.guardarNombre(nombreDelUsuario); jugador.guardarPunteo(0); jugador.guardarOro(500); jugador.guardarListaPersonaejes(new ListaElementos<>()); jugador.guardarListaObjetos(new ListaElementos<>());
            } else {
                modoTienda = 2;
            }
        } else {
            while (!salir) {
                respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
                
                if ("".equals(respuesta) || respuesta == null) {
                    JOptionPane.showMessageDialog(this,"Debes Escribir un Nombre de Usuario","Escribe un Nombre",JOptionPane.ERROR_MESSAGE);
                } else {
                    salir = true;
                }
            }
            String[] cadena = respuesta.split("");
            String nombreDelUsuario = "";

            for (int i = 0; i < cadena.length; i++) {                           
                if (!" ".equals(cadena[i])) {
                    nombreDelUsuario += cadena[i];
                }
            }
            salir = false;
            jugador.guardarNombre(nombreDelUsuario);
        }
        
        // Tienda
        while (!salir) {
            TiendaFrame irAComprar = new TiendaFrame(this, modoTienda, jugador.obtenerOro(), jugador.obtenerListaPersonajes(), jugador.obtenerListaObjetos());
            irAComprar.setVisible(true);
            jugador.guardarOro(irAComprar.obtenerOro());
            salir = irAComprar.realizoCompra();
        }
        salir = false;
        
        // Selección de Nivel y Tablero
        while (!salir) {
            SeleccionarTablero seleccionar = new SeleccionarTablero(this, personajesEnemigos);
            seleccionar.setVisible(true);           
            tableroAJugar = seleccionar.obtenerTableroAJugar();
            salir = seleccionar.realizoSeleccion();
        }
  
        Batalla nueva = new Batalla(this, 1, recibido, jugador.obtenerListaPersonajes(), jugador.obtenerListaObjetos(), personajesEnemigos, tableroAJugar, respuesta, jugador);
        nueva.setVisible(true);
        jugador.aumentarPunteo(nueva.obtenerPunteoEnBatalla());
        jugador.aumentarOro(nueva.obtenerOro());
        personajesEnemigos = new ListaElementos<>();
        ArchivoDePunteos archivo = new ArchivoDePunteos();
        
        if (selectedOption == JOptionPane.NO_OPTION) {
            archivo.guardarPunteoDelJugador(jugador.obtenerNombre(), jugador.obtenerPunteoJugador());
        } else {
            archivo.agregarNuevoPunteo(jugador.obtenerNombre(), jugador.obtenerPunteoJugador());
        }
        
        mostrarNombre.setText("Nombre: " + jugador.obtenerNombre());
        mostrarOro.setText("Oro: " + jugador.obtenerOro());
    }
    
    private void tiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiendaActionPerformed
        if (jugador.obtenerOro() <= 0) {
            JOptionPane.showMessageDialog(this,"No tienes Oro para ir a la Tienda","Falta de Oro",JOptionPane.INFORMATION_MESSAGE);
        } else {
            TiendaFrame irAComprar = new TiendaFrame(this, 3, jugador.obtenerOro(), jugador.obtenerListaPersonajes(), jugador.obtenerListaObjetos());
            irAComprar.setVisible(true);
            jugador.guardarOro(irAComprar.obtenerOro());
            mostrarOro.setText("Oro: " + jugador.obtenerOro());
        }
    }//GEN-LAST:event_tiendaActionPerformed

    private void generacionDeTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generacionDeTableroActionPerformed
        GenerarTablero crear = new GenerarTablero(this);
        crear.setVisible(true);
    }//GEN-LAST:event_generacionDeTableroActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        Inventario visualizar = new Inventario(this, jugador.obtenerListaPersonajes(), jugador.obtenerListaObjetos(), jugador.obtenerPartidaGuardadas());
        visualizar.setVisible(true);
        jugador.aumentarOro(visualizar.obtenerOro());
        mostrarOro.setText("Oro: " + jugador.obtenerOro());
    }//GEN-LAST:event_inventarioActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        GuardarJugador guardarJugador = new GuardarJugador(jugador.obtenerNombre(), jugador.obtenerOro(), jugador.obtenerPunteoJugador(), jugador.obtenerListaPersonajes(), jugador.obtenerListaObjetos(), jugador.obtenerPartidaGuardadas());
        ArchivoDatosDelJugadorSerializable guardar = new ArchivoDatosDelJugadorSerializable();
        guardar.guardarDatosDelJugador(guardarJugador);
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void rankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingActionPerformed
        Ranking visualizar = new Ranking(this);
        visualizar.setVisible(true);
    }//GEN-LAST:event_rankingActionPerformed

    private void recibirDatosDelJugador() {
        GuardarJugador jugadorRecuperado = null;
        ArchivoDatosDelJugadorSerializable recibir = new ArchivoDatosDelJugadorSerializable();
        jugadorRecuperado = recibir.recuperarJugador();
        
        if (jugadorRecuperado != null) {
            jugador.guardarNombre(jugadorRecuperado.obtenerNombre());
            jugador.guardarOro(jugadorRecuperado.obtenerOro());
            jugador.guardarPunteo(jugadorRecuperado.obtenerPuntuacion());
            jugador.guardarListaPersonaejes(jugadorRecuperado.obtenerPersonajesJugador());
            jugador.guardarListaObjetos(jugadorRecuperado.obtenerObjetosJugador());
            mostrarNombre.setText("Nombre: " + jugador.obtenerNombre());
        }
        mostrarOro.setText("Oro: " + jugador.obtenerOro());
    }

    public void cerrar() {
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                GuardarJugador guardarJugador = new GuardarJugador(jugador.obtenerNombre(), jugador.obtenerOro(), jugador.obtenerPunteoJugador(), jugador.obtenerListaPersonajes(), jugador.obtenerListaObjetos(), jugador.obtenerPartidaGuardadas());
                ArchivoDatosDelJugadorSerializable guardar = new ArchivoDatosDelJugadorSerializable();
                guardar.guardarDatosDelJugador(guardarJugador);
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generacionDeTablero;
    private javax.swing.JButton iniciarPartida;
    private javax.swing.JButton inventario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mostrarNombre;
    private javax.swing.JLabel mostrarOro;
    private javax.swing.JButton ranking;
    private javax.swing.JButton salir;
    private javax.swing.JButton tienda;
    private javax.swing.JLabel tituloMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
