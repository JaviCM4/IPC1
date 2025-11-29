package com.mycompany.batalla_naval.main.controlDelJuego;

import com.mycompany.batalla_naval.main.archivos.RecibirTableros;
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

public class ColeccionDeTableros extends javax.swing.JDialog {

    private String[] listaDelNombreDeLosTablero;
    private boolean cargoUnArchivo;
    private int indiceDeTablero = 0;
    private String path, pathNuevo;
    
    public ColeccionDeTableros(java.awt.Frame parent, String path) {
        super(parent,true);
        this.path = path;
        initComponents();
        this.setLocationRelativeTo(null);
        obtenerElNombreDeTodosLosTableros();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nombreDelTableroDeJuego = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        cargarArchivo = new javax.swing.JButton();
        regresarAlMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Colección de Tableros");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tableros"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreDelTableroDeJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(nombreDelTableroDeJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        cargarArchivo.setText("Cargar Archivo");
        cargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivoActionPerformed(evt);
            }
        });

        regresarAlMenuPrincipal.setText("Regresar Al Menú Principal");
        regresarAlMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarAlMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regresarAlMenuPrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cargarArchivo)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 107, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(siguiente)
                            .addComponent(anterior))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(siguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresarAlMenuPrincipal)
                    .addComponent(cargarArchivo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        indiceDeTablero++;
        mostrarNombreDelTablero();
    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        indiceDeTablero--;
        mostrarNombreDelTablero();
    }//GEN-LAST:event_anteriorActionPerformed

    private void cargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivoActionPerformed
        boolean archivoCargado = false;
        
        while(!archivoCargado) {
            JFileChooser jFileChooser = new JFileChooser();
            FileNameExtensionFilter filtrado = new FileNameExtensionFilter("th", "th");
            jFileChooser.setFileFilter(filtrado);

            int respuesta = jFileChooser.showOpenDialog(this);

            if (respuesta == JFileChooser.APPROVE_OPTION) {
                pathNuevo = jFileChooser.getSelectedFile().getPath();

                File file = new File(pathNuevo);

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
                                    archivoCargado = true;
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

                    if (archivoCargado) {
                        RecibirTableros recibirNuevosTableros = new RecibirTableros();
                        recibirNuevosTableros.sumarTableros(path, pathNuevo);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this,"No se a Encontrado tableros en este Archivo vuelve a Seleccionar","Archivo Erroneo",JOptionPane.ERROR_MESSAGE);
                        archivoCargado = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(this,"No Existe el Archivo","Archivo Inexistente",JOptionPane.ERROR_MESSAGE);
                    archivoCargado = false;
                }
            } else {
                break;
            }
        }
    }//GEN-LAST:event_cargarArchivoActionPerformed

    private void regresarAlMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarAlMenuPrincipalActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarAlMenuPrincipalActionPerformed

    public void mostrarNombreDelTablero() {
        if ("No hay Tableros, Carga un Archivo".equals(listaDelNombreDeLosTablero[0])) {
            nombreDelTableroDeJuego.setText(listaDelNombreDeLosTablero[0]);
            siguiente.setEnabled(false);
            anterior.setEnabled(false);
        } else {
            if (indiceDeTablero >= 0 && indiceDeTablero < listaDelNombreDeLosTablero.length) {
                nombreDelTableroDeJuego.setText(listaDelNombreDeLosTablero[indiceDeTablero]);
            } else {
                if (indiceDeTablero < 0) {
                    indiceDeTablero = 0;
                    JOptionPane.showMessageDialog(this,"Inicio de la Lista","Tableros",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    indiceDeTablero = listaDelNombreDeLosTablero.length - 1;
                    JOptionPane.showMessageDialog(this,"Fin de la Lista","Tableros",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }
    
    public void obtenerElNombreDeTodosLosTableros() {
        RecibirTableros datos = new RecibirTableros();
        listaDelNombreDeLosTablero = datos.obtenerNombreDeTodosLosTableros(path);
        mostrarNombreDelTablero();
    }
    
    public boolean obtenerSiCargoUnArchivo() {
        return cargoUnArchivo;
    }
    
    public String obtenerNuevoPath() {
        return path;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton cargarArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreDelTableroDeJuego;
    private javax.swing.JButton regresarAlMenuPrincipal;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
