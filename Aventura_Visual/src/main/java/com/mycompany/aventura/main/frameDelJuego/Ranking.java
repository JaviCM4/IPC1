package com.mycompany.aventura.main.frameDelJuego;

import com.mycompany.aventura.main.archivos.ArchivoDePunteos;
import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Ranking extends javax.swing.JDialog {

    ListaElementos<String> punteosTotales = new ListaElementos<>(); 
       
    public Ranking(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        this.setLocationRelativeTo(null);
        ArchivoDePunteos punteos = new ArchivoDePunteos();
        punteosTotales = punteos.obtenerPunteosDeTodosLosJugadores();
        ordenarPunteos();
        mostrarJugadores(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelTablaDeJugadores = new javax.swing.JPanel();
        menores = new javax.swing.JButton();
        mayores = new javax.swing.JButton();
        regresarAlMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Ranking");

        panelTablaDeJugadores.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de Jugadores"));

        javax.swing.GroupLayout panelTablaDeJugadoresLayout = new javax.swing.GroupLayout(panelTablaDeJugadores);
        panelTablaDeJugadores.setLayout(panelTablaDeJugadoresLayout);
        panelTablaDeJugadoresLayout.setHorizontalGroup(
            panelTablaDeJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelTablaDeJugadoresLayout.setVerticalGroup(
            panelTablaDeJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        menores.setText("Menores");
        menores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menoresActionPerformed(evt);
            }
        });

        mayores.setText("Mayores");
        mayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayoresActionPerformed(evt);
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
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTablaDeJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regresarAlMenuPrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(mayores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menores)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTablaDeJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mayores)
                        .addComponent(menores))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(regresarAlMenuPrincipal)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayoresActionPerformed
        mostrarJugadores(2);
    }//GEN-LAST:event_mayoresActionPerformed

    private void menoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menoresActionPerformed
        mostrarJugadores(1);
    }//GEN-LAST:event_menoresActionPerformed

    private void regresarAlMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarAlMenuPrincipalActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarAlMenuPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */

    private void mostrarJugadores(int modoDeMostrar) {
        ListaElementos<JLabel> punteosTotalesJLabel = new ListaElementos<>();
        panelTablaDeJugadores.removeAll();
        panelTablaDeJugadores.setLayout(new GridLayout(punteosTotales.getLongitud(),1));

        if (modoDeMostrar == 1) {
            try {
                for (int i = 1; i <= punteosTotales.getLongitud(); i++) {
                    punteosTotalesJLabel.agregarALaLista(new JLabel("(" + (i) + ").  " + punteosTotales.obtenerContenido(i)));
                    panelTablaDeJugadores.add(punteosTotalesJLabel.obtenerContenido(i));
                }
            } catch (ListaElementosExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            int indice = 1;
            try {
                for (int i = punteosTotales.getLongitud(); i > 0; i--) {   
                    punteosTotalesJLabel.agregarALaLista(new JLabel("(" + (indice) + ").  " + punteosTotales.obtenerContenido(i)));
                    panelTablaDeJugadores.add(punteosTotalesJLabel.obtenerContenido(indice));
                    indice++;
                }
            } catch (ListaElementosExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
        panelTablaDeJugadores.updateUI();
    }
    
    public void ordenarPunteos() {
        for (int i = 2; i <= punteosTotales.getLongitud(); i++) {
            try {
                String contenido = punteosTotales.obtenerContenido(i);
                String[] cadena = punteosTotales.obtenerContenido(i).split(" ");
                int notaAMover = Integer.parseInt(cadena[1]);
                
                for (int j = i - 1; j > 0; j--) {
                    String[] cadena_1 = punteosTotales.obtenerContenido(j).split(" ");
                    int notaAnterior = Integer.parseInt(cadena_1[1]);
                    
                    if (notaAnterior > notaAMover) {
                        punteosTotales.encontrarPorIndice(j + 1).setContenido(punteosTotales.obtenerContenido(j));
                        punteosTotales.encontrarPorIndice(j).setContenido(contenido);
                    }
                }
            } catch (ListaElementosExcepcion ex) {
                Logger.getLogger(Ranking.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mayores;
    private javax.swing.JButton menores;
    private javax.swing.JPanel panelTablaDeJugadores;
    private javax.swing.JButton regresarAlMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
