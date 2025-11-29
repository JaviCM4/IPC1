package com.mycompany.batalla_naval.main.controlDelJuego;

import com.mycompany.batalla_naval.main.archivos.DatosDelJugador;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class Puntajes extends javax.swing.JFrame {

    private JLabel[] resultados;
    private boolean iniciarConMenores = true;
    
    public Puntajes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tablaDePunteos = new javax.swing.JPanel();
        regresarAlMenuPrincipal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        notasMenores = new javax.swing.JButton();
        notasMayores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Punteos"));

        javax.swing.GroupLayout tablaDePunteosLayout = new javax.swing.GroupLayout(tablaDePunteos);
        tablaDePunteos.setLayout(tablaDePunteosLayout);
        tablaDePunteosLayout.setHorizontalGroup(
            tablaDePunteosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tablaDePunteosLayout.setVerticalGroup(
            tablaDePunteosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablaDePunteos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(tablaDePunteos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        regresarAlMenuPrincipal.setText("Regresar al Menú Principal");
        regresarAlMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarAlMenuPrincipalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Puntaje");

        notasMenores.setText("Notas Menores");
        notasMenores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notasMenoresActionPerformed(evt);
            }
        });

        notasMayores.setText("Notas Mayores");
        notasMayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notasMayoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regresarAlMenuPrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(notasMayores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notasMenores)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(236, 236, 236))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresarAlMenuPrincipal)
                    .addComponent(notasMenores)
                    .addComponent(notasMayores))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarAlMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarAlMenuPrincipalActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarAlMenuPrincipalActionPerformed

    private void notasMayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notasMayoresActionPerformed
        iniciarConMenores = false;
        mostrarPunteos();
    }//GEN-LAST:event_notasMayoresActionPerformed

    private void notasMenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notasMenoresActionPerformed
        iniciarConMenores = true;
        mostrarPunteos();
    }//GEN-LAST:event_notasMenoresActionPerformed

    public void mostrarPunteos() {
        DatosDelJugador datos = new DatosDelJugador();
        String[] listaDeJugadores = datos.mandarListaDeJugadores();        
        tablaDePunteos.removeAll();
        int numeroDeReportes;
        
        if (listaDeJugadores.length >= 20) {
            numeroDeReportes = 20;
        } else {
            numeroDeReportes = listaDeJugadores.length;
        }
        resultados = new JLabel[numeroDeReportes];
        tablaDePunteos.setLayout(new GridLayout(resultados.length,1));             
        
        for (int i = 1; i <= listaDeJugadores.length - 1; i++) { 
            String punteo = listaDeJugadores[i];
            String[] cadena = listaDeJugadores[i].split(" ");
            int notaAMover = Integer.parseInt(cadena[1]);
            
            for (int j = i - 1; j >= 0; j--) {      
                String[] cadena_1 = listaDeJugadores[j].split(" ");
                int notaAnterior = Integer.parseInt(cadena_1[1]);
                
                if (notaAnterior > notaAMover) {
                    listaDeJugadores[j + 1] = listaDeJugadores[j];
                    listaDeJugadores[j] = punteo;
                }
            }
        }
        
        if (iniciarConMenores) {
            for (int i = 0; i < resultados.length; i++) {     
                resultados[i] = new JLabel("(" + (i + 1) + ").  " + listaDeJugadores[i]);
                tablaDePunteos.add(resultados[i]);
            }
        } else {
            int indice = 0;
            int contador = listaDeJugadores.length - numeroDeReportes;
            
            for (int i = (listaDeJugadores.length - 1); i >= contador; i--) {     
                resultados[indice] = new JLabel("(" + (indice + 1) + ").  " + listaDeJugadores[i]);
                tablaDePunteos.add(resultados[indice]);
                indice++;
            }
        }
        tablaDePunteos.updateUI();
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton notasMayores;
    private javax.swing.JButton notasMenores;
    private javax.swing.JButton regresarAlMenuPrincipal;
    private javax.swing.JPanel tablaDePunteos;
    // End of variables declaration//GEN-END:variables
}
