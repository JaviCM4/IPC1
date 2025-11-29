package com.mycompany.batalla_naval.main.controlDelJuego;

import com.mycompany.batalla_naval.main.archivos.DatosDelJugador;
import com.mycompany.batalla_naval.main.jugador.Jugador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuPrincipal extends javax.swing.JFrame {

    private Jugador jugador;
    private String path = "";
    private boolean archivoCargado = false, primeraPartida = false;
    private int punteo = 0;
    
    public MenuPrincipal() {
        initComponents();
        this.setTitle("Batalla Naval");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        IniciarPartida.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        IniciarPartida = new javax.swing.JButton();
        NuevaPartida = new javax.swing.JButton();
        Puntajes = new javax.swing.JButton();
        ColeccionDeTableros = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Menú Principal");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pulse una de las Siguientes Opciones:"));

        IniciarPartida.setText("Iniciar Partida");
        IniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarPartidaActionPerformed(evt);
            }
        });

        NuevaPartida.setText("Nueva Partida");
        NuevaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPartidaActionPerformed(evt);
            }
        });

        Puntajes.setText("Puntajes");
        Puntajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntajesActionPerformed(evt);
            }
        });

        ColeccionDeTableros.setText("Colección de Tableros");
        ColeccionDeTableros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColeccionDeTablerosActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Salir)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Puntajes)
                                .addGap(219, 219, 219))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(NuevaPartida)
                                .addGap(190, 190, 190))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(IniciarPartida)
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ColeccionDeTableros)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IniciarPartida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NuevaPartida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Puntajes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ColeccionDeTableros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(Salir)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarPartidaActionPerformed
        ConfiguracionDeLaBatalla configuracion = new ConfiguracionDeLaBatalla(this, false, path);
        configuracion.setVisible(true);
        
        if (configuracion.terminoSeleccionDelJuego()) {
            jugador.recibirInventario(configuracion.mandarBombas()); // Inventario del Usuario
            String tableroAJugar = configuracion.mandarTableroAJugar(); // Nombre del Tablero a Jugar
            Batalla irALaBatalla = new Batalla(this, tableroAJugar, path, jugador.obtenerBomba(), jugador.obtenerNombre());
            irALaBatalla.setVisible(true);
            punteo += irALaBatalla.obtenerPunteo();
            DatosDelJugador datos = new DatosDelJugador();
            datos.AgregarNuevoPunteo(jugador.obtenerNombre(), punteo);
        }
    }//GEN-LAST:event_IniciarPartidaActionPerformed

    private void NuevaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPartidaActionPerformed
        if (!archivoCargado) {
            JFileChooser jFileChooser = new JFileChooser();
            FileNameExtensionFilter filtrado = new FileNameExtensionFilter("th", "th");
            jFileChooser.setFileFilter(filtrado);
            
            int respuesta = jFileChooser.showOpenDialog(this);
            
            if (respuesta == JFileChooser.APPROVE_OPTION) {
                path = jFileChooser.getSelectedFile().getPath();
                archivoCargado = true;
            }
        }
        
        if (archivoCargado) {
            File file = new File(path);
            boolean paso = false;
            
            if (file.exists()) {
                BufferedReader entrada = null;
                
                try { 
                    entrada = new BufferedReader(new FileReader(file));
                    String cadena;
                    int indice = 0;
                    
                    while ((cadena = entrada.readLine()) != null) {
                        String[] partes = cadena.split(" ");
                        
                        if (partes.length > 1 && indice == 0) {
                            if ("tablero".equals(partes[0])) {
                                indice = 1;
                            }
                        } else if (partes.length > 1 && indice == 1){
                            if ("dimension".equals(partes[0])) {
                                paso = true;
                                break;
                            } else {
                                indice = 0;
                            }
                        }
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if (paso) {
                    ConfiguracionDeLaBatalla configuracion = new ConfiguracionDeLaBatalla(this,true,path);
                    configuracion.setVisible(true);

                    if (configuracion.terminoSeleccionDelJuego()) {
                        jugador = new Jugador(configuracion.recibirNombre()); // Nombre Del Usuario
                        jugador.recibirInventario(configuracion.mandarBombas()); // Inventario del Usuario
                        String tableroAJugar = configuracion.mandarTableroAJugar(); // Nombre del Tablero a Jugar
                        Batalla irALaBatalla = new Batalla(this, tableroAJugar, path, jugador.obtenerBomba(), jugador.obtenerNombre());
                        irALaBatalla.setVisible(true);
                        punteo = 0;
                        punteo += irALaBatalla.obtenerPunteo();
                        DatosDelJugador datos = new DatosDelJugador();
                        datos.guardarDatosDelJugador(jugador.obtenerNombre(), punteo);
                        IniciarPartida.setVisible(true);
                        primeraPartida = true;
                    }
                } else {
                    JOptionPane.showMessageDialog(this,"No se a Encontrado tableros en este Archivo vuelve a Seleccionar","Archivo Erroneo",JOptionPane.ERROR_MESSAGE);
                    archivoCargado = false;
                }
            } else {
                JOptionPane.showMessageDialog(this,"No Existe el Archivo","Archivo Inexistente",JOptionPane.ERROR_MESSAGE);
                archivoCargado = false;
            }
        } else {
            JOptionPane.showMessageDialog(this,"Debes Cargar un Archivo para Poder Jugador","Falta De Archivo",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_NuevaPartidaActionPerformed

    private void PuntajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntajesActionPerformed
        Puntajes visualizar = new Puntajes();
        visualizar.setVisible(true);
    }//GEN-LAST:event_PuntajesActionPerformed

    private void ColeccionDeTablerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColeccionDeTablerosActionPerformed
        if (primeraPartida) {
            ColeccionDeTableros tableros = new ColeccionDeTableros(this, path);
            tableros.setVisible(true);

            if (tableros.obtenerSiCargoUnArchivo()) {
                path = tableros.obtenerNuevoPath();
            }
        } else {
            JOptionPane.showMessageDialog(this,"Debes Terminar tu Primera Batalla para visualizar los Tableros","Acceso Denegado",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ColeccionDeTablerosActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ColeccionDeTableros;
    private javax.swing.JButton IniciarPartida;
    private javax.swing.JButton NuevaPartida;
    private javax.swing.JButton Puntajes;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
