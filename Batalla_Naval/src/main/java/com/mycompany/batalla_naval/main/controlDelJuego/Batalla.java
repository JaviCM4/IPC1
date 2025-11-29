package com.mycompany.batalla_naval.main.controlDelJuego;

import com.mycompany.batalla_naval.main.archivos.RecibirTableros;
import com.mycompany.batalla_naval.main.barcos.*;
import com.mycompany.batalla_naval.main.bombas.*;
import com.mycompany.batalla_naval.main.tablero.Casilla;
import com.mycompany.batalla_naval.main.tablero.Tablero;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Batalla extends javax.swing.JDialog {

    private Tablero invocarTablero = new Tablero();
    private boolean bombasNormalesTerminadas = false, bombasTorpedoTerminadas = false, bombasMisilesTerminadas = false, bombasHecatombeTerminadas = false;
    private Casilla[][] casillas;
    private String[][] tableroAJugar;
    private Barco[] barcosEnElTablero;
    private String nombreDelJugador, nombreDelTableroAJugar, path;
    private Bomba[] bombas;
    private Bomba bombaSeleccionada;
    private int punteo = 0;

    public Batalla(java.awt.Frame parent, String nombreDelTableroAJugar, String path, Bomba[] bombas, String nombreDelJugador) {
        super(parent,true);
        this.nombreDelTableroAJugar = nombreDelTableroAJugar;
        this.path = path;
        this.bombas = bombas;
        this.nombreDelJugador = nombreDelJugador;
        initComponents();
        this.setTitle("Batalla");
        this.setLocationRelativeTo(null);
        llamarTablero();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        tablero = new javax.swing.JPanel();
        tableroDeJuego = new javax.swing.JPanel();
        regresarAlMenuPrincipal = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bombaNormal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bombaTorpedo = new javax.swing.JButton();
        bombaMisil = new javax.swing.JButton();
        bombaHecatombe = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titulo.setText("Batalla");

        tablero.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablero"));

        javax.swing.GroupLayout tableroDeJuegoLayout = new javax.swing.GroupLayout(tableroDeJuego);
        tableroDeJuego.setLayout(tableroDeJuegoLayout);
        tableroDeJuegoLayout.setHorizontalGroup(
            tableroDeJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        tableroDeJuegoLayout.setVerticalGroup(
            tableroDeJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout tableroLayout = new javax.swing.GroupLayout(tablero);
        tablero.setLayout(tableroLayout);
        tableroLayout.setHorizontalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tableroDeJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        tableroLayout.setVerticalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableroLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tableroDeJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        regresarAlMenuPrincipal.setText("Regresar al Menú Principal");
        regresarAlMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarAlMenuPrincipalActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bombas"));

        bombaNormal.setText("Normal");
        bombaNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bombaNormalActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione la  Bomba que desea Utilizar: ");

        bombaTorpedo.setText("Torpedo");
        bombaTorpedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bombaTorpedoActionPerformed(evt);
            }
        });

        bombaMisil.setText("Misil");
        bombaMisil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bombaMisilActionPerformed(evt);
            }
        });

        bombaHecatombe.setText("Hecatombe");
        bombaHecatombe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bombaHecatombeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(bombaNormal)
                    .addComponent(bombaTorpedo)
                    .addComponent(bombaMisil)
                    .addComponent(bombaHecatombe)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(bombaNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bombaTorpedo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bombaMisil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bombaHecatombe)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota"));

        jLabel2.setText("- El Navio  Ocupa 3 Casillas.");

        jLabel3.setText("- El Pailebot Ocupa 1 Casilla.");

        jLabel4.setText("- El Bergantín Ocupa 2 Casillas.");

        jLabel5.setText("- La Normal Explota una Casilla.");

        jLabel6.setText("- El Torpedo Explota en Diagonal.");

        jLabel7.setText("- El Misil Explota en una Línea Recta.");

        jLabel8.setText("- El Hecatombre Explota todo a su");

        jLabel9.setText("  alrededor a una Casilla de Distancia.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regresarAlMenuPrincipal)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(349, 349, 349))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regresarAlMenuPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bombaNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bombaNormalActionPerformed
        int contadorDeBombas = 0;
        
        for (int i = 0; i < bombas.length; i++) {
            if (bombas[i] != null) {
                if ("Normal".equals(bombas[i].verTipoDeBomba())) {
                    for (int j = 0; j < bombas.length; j++) {
                        if (bombas[j] != null) {
                            if ("Normal".equals(bombas[j].verTipoDeBomba())) {
                                contadorDeBombas++;
                            }
                        }
                    }
                    abrirOCerrarAccesosALasBombas(false);
                    if (contadorDeBombas != 1) {
                        JOptionPane.showMessageDialog(this,"Bomba Seleccionda, te quedan " + (contadorDeBombas - 1) + " bombas Normales","Selección Existosa",JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this,"Esta es tu Ultima Bomba Normal","Bombas Normales",JOptionPane.ERROR_MESSAGE);
                        bombasNormalesTerminadas = true;
                    }
                    invocarTablero.recibirFrame(this);
                    bombaSeleccionada = bombas[i];
                    invocarTablero.recibirBombaSeleccionada(bombaSeleccionada);
                    desbloquearTablero();
                    bombas[i] = null;
                    break;
                }
            } 
        }
    }//GEN-LAST:event_bombaNormalActionPerformed

    private void bombaTorpedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bombaTorpedoActionPerformed
        int contadorDeBombas = 0;
        
        for (int i = 0; i < bombas.length; i++) {
            if (bombas[i] != null) {
                if ("Torpedo".equals(bombas[i].verTipoDeBomba())) {
                    for (int j = 0; j < bombas.length; j++) {
                        if (bombas[j] != null) {
                            if ("Torpedo".equals(bombas[j].verTipoDeBomba())) {
                                contadorDeBombas++;
                            }
                        }
                    }
                    abrirOCerrarAccesosALasBombas(false);
                    if (contadorDeBombas != 1) {
                        JOptionPane.showMessageDialog(this,"Bomba Seleccionda, te quedan " + (contadorDeBombas - 1) + " bombas Torpedo","Selección Existosa",JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this,"Esta es tu Ultima Bomba Torpedo","Bombas Torpedo",JOptionPane.ERROR_MESSAGE);
                        bombasTorpedoTerminadas = true;
                    }
                    invocarTablero.recibirFrame(this);
                    bombaSeleccionada = bombas[i];
                    invocarTablero.recibirBombaSeleccionada(bombaSeleccionada);
                    desbloquearTablero();
                    bombas[i] = null;
                    break;
                }
            }
        }
    }//GEN-LAST:event_bombaTorpedoActionPerformed

    private void bombaMisilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bombaMisilActionPerformed
        int contadorDeBombas = 0;
        
        for (int i = 0; i < bombas.length; i++) {
            if (bombas[i] != null) {
                if ("Misil".equals(bombas[i].verTipoDeBomba())) {
                    for (int j = 0; j < bombas.length; j++) {
                        if (bombas[j] != null) {
                            if ("Misil".equals(bombas[j].verTipoDeBomba())) {
                                contadorDeBombas++;
                            }
                        }
                    }
                    abrirOCerrarAccesosALasBombas(false);
                    if (contadorDeBombas != 1) {
                        JOptionPane.showMessageDialog(this,"Bomba Seleccionda, te quedan " + (contadorDeBombas - 1) + " bombas Misil","Selección Existosa",JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this,"Esta es tu Ultima Bomba Misil","Bombas Misiles",JOptionPane.ERROR_MESSAGE);
                        bombasMisilesTerminadas = true;
                    }
                    invocarTablero.recibirFrame(this);
                    bombaSeleccionada = bombas[i];
                    invocarTablero.recibirBombaSeleccionada(bombaSeleccionada);
                    desbloquearTablero();
                    bombas[i] = null;
                    break;
                }
            }
        }
    }//GEN-LAST:event_bombaMisilActionPerformed

    private void bombaHecatombeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bombaHecatombeActionPerformed
        int contadorDeBombas = 0;
        
        for (int i = 0; i < bombas.length; i++) {
            if (bombas[i] != null) {
                if ("Hecatombe".equals(bombas[i].verTipoDeBomba())) {
                    for (int j = 0; j < bombas.length; j++) {
                        if (bombas[j] != null) {
                            if ("Hecatombe".equals(bombas[j].verTipoDeBomba())) {
                                contadorDeBombas++;
                            }
                        }
                    }
                    abrirOCerrarAccesosALasBombas(false);
                    if (contadorDeBombas != 1) {
                        JOptionPane.showMessageDialog(this,"Bomba Seleccionda, te quedan " + (contadorDeBombas - 1) + " bombas Hecatombe","Selección Existosa",JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this,"Esta es tu Ultima Bomba Hecatombe","Bombas Hecatombe",JOptionPane.ERROR_MESSAGE);
                        bombasHecatombeTerminadas = true;
                    }
                    invocarTablero.recibirFrame(this);
                    bombaSeleccionada = bombas[i];
                    invocarTablero.recibirBombaSeleccionada(bombaSeleccionada);
                    desbloquearTablero();
                    bombas[i] = null;
                    break;
                }
            }
        }
    }//GEN-LAST:event_bombaHecatombeActionPerformed

    private void regresarAlMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarAlMenuPrincipalActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null,"¿Desea Salir?, Recuerda que si Sales Perderás Todas tus Bombas", "Desea Salir", JOptionPane.YES_NO_OPTION); 
        
        if (selectedOption == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_regresarAlMenuPrincipalActionPerformed

    public void llamarTablero() {
        RecibirTableros buscar = new RecibirTableros();
        tableroAJugar = buscar.obtenerTablero(nombreDelTableroAJugar, path);
        crearBarcos();
        mostrarTablero();
    }
    
    public void crearBarcos() {
        int contadorDeBarcos = 0;
        
        for (int i = 0; i < tableroAJugar.length; i++) {
            for (int j = 0; j < tableroAJugar[0].length; j++) {
                if ("B1".equals(tableroAJugar[i][j]) || "B2".equals(tableroAJugar[i][j]) || "B3".equals(tableroAJugar[i][j])) {
                    contadorDeBarcos++;
                }
            }
        }
        
        barcosEnElTablero = new Barco[contadorDeBarcos];
        int indice = 0;
        
        for (int i = 0; i < tableroAJugar.length; i++) {
            for (int j = 0; j < tableroAJugar[0].length; j++) {
                if ("B1".equals(tableroAJugar[i][j])) {
                    barcosEnElTablero[indice] = new Pailebot();
                    barcosEnElTablero[indice].recibirCoordenada(i, j);
                    indice++;
                } else if ("B2".equals(tableroAJugar[i][j])) {
                    barcosEnElTablero[indice] = new Bergantin();
                    barcosEnElTablero[indice].recibirCoordenada(i, j);
                    indice++;
                } else if ("B3".equals(tableroAJugar[i][j])) {
                    barcosEnElTablero[indice] = new Navio();
                    barcosEnElTablero[indice].recibirCoordenada(i, j);
                    indice++;
                }
            }
        }
        invocarTablero.recibirTropa(barcosEnElTablero);
    }
    
    public void mostrarTablero() {
        int filas = tableroAJugar.length;
        int columnas = tableroAJugar[0].length;
        
        try {
            casillas = invocarTablero.crearTablero(filas, columnas, tableroAJugar, tableroDeJuego.getHeight(), tableroDeJuego.getWidth());
            tableroDeJuego.setLayout(new GridLayout(filas, columnas));

            for (int i = 0; i < filas; i++) {           
                for (int j = 0; j < columnas; j++) {
                    tableroDeJuego.add(casillas[i][j]);
                    casillas[i][j].setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/batalla_naval/main/controlDelJuego/oceano.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                    casillas[i][j].setBackground(Color.CYAN);
                    casillas[i][j].setEnabled(false);
                }
            }
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this,"Ha Ocurrido un Error en la Dimensiones,","Error en la Dimensiones",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }
    
    public void desbloquearTablero() {
        for (int i = 0; i < casillas.length; i++) {           
            for (int j = 0; j < casillas[0].length; j++) {
                
                if (!casillas[i][j].obtenerSiLaCasillaFueRevelada()) {
                    casillas[i][j].setEnabled(true);
                }
            }
        }
    }
    
    public boolean verificarCantidadDeBombas() {
        for (int i = 0; i < bombas.length; i++) {
            if (bombas[i] != null) {
                return true;
            }
        }
        JOptionPane.showMessageDialog(this,"Perdiste, Ya no tienes más Bombas en tu Inventario","Derrota",JOptionPane.INFORMATION_MESSAGE);
        return false;
    }
    
    public void aumentarPunteo(int aumento) {
        punteo += aumento;
    }
    
    public int obtenerPunteo() {
        return punteo;
    }
    
    public void cerrar(int indice) {
        if (indice == 0) {
            JOptionPane.showMessageDialog(this,"Ganaste, Destruiste a Todos los Barcos","Victoria",JOptionPane.INFORMATION_MESSAGE);
        }
        this.dispose();
    }
    
    public void abrirOCerrarAccesosALasBombas(boolean estado) {
        if (!bombasNormalesTerminadas) {
            bombaNormal.setEnabled(estado);
        }
        if (!bombasTorpedoTerminadas) {
            bombaTorpedo.setEnabled(estado);
        }
        if (!bombasMisilesTerminadas) {
            bombaMisil.setEnabled(estado);
        }
        if (!bombasHecatombeTerminadas) {
            bombaHecatombe.setEnabled(estado);
        }
    }
    
    public String obtenerNombreDelJugador() {
        return nombreDelJugador;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bombaHecatombe;
    private javax.swing.JButton bombaMisil;
    private javax.swing.JButton bombaNormal;
    private javax.swing.JButton bombaTorpedo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton regresarAlMenuPrincipal;
    private javax.swing.JPanel tablero;
    private javax.swing.JPanel tableroDeJuego;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}