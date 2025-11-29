package com.mycompany.aventura.main.frameDelJuego;

import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.tablero.Casilla;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ActivarCapaDeMovilidad extends javax.swing.JDialog {

    private ListaElementos<Casilla> tablero = new ListaElementos<>();
    private ListaElementos<Casilla> vistaDelTablero = new ListaElementos<>();
    private int filaNueva = 0, columnaNueva = 0, fila = 0, columna;
    private String casillaActual = null, casillaAnterior, nombre;
    
    public ActivarCapaDeMovilidad(java.awt.Frame parent, ListaElementos<Casilla> vistaDelTablero, ListaElementos<Casilla> tablero, int fila, int columna, String casillaAnterior, String nombre) {
        super(parent, true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.vistaDelTablero = vistaDelTablero;
        this.tablero = tablero;
        this.fila = fila;
        this.columna = columna;
        this.casillaAnterior = casillaAnterior;
        this.nombre = nombre;
        mostrarCapa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numeroDePosicion = new javax.swing.JSpinner();
        mover = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelCapaDeMovilidad = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Control"));

        jLabel2.setText("Seleccione el Número de la");

        jLabel3.setText("posición a la que desea");

        mover.setText("Mover");
        mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverActionPerformed(evt);
            }
        });

        jLabel6.setText("1");

        jLabel7.setText("2");

        jLabel8.setText("3");

        jLabel9.setText("4");

        jLabel10.setText("J");

        jLabel11.setText("6");

        jLabel12.setText("7");

        jLabel13.setText("8");

        jLabel14.setText("9");

        jLabel4.setText("moverse:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numeroDePosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mover))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mover)
                    .addComponent(numeroDePosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Capa de Movilidad");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Vista de la Capa"));

        javax.swing.GroupLayout panelCapaDeMovilidadLayout = new javax.swing.GroupLayout(panelCapaDeMovilidad);
        panelCapaDeMovilidad.setLayout(panelCapaDeMovilidadLayout);
        panelCapaDeMovilidadLayout.setHorizontalGroup(
            panelCapaDeMovilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        panelCapaDeMovilidadLayout.setVerticalGroup(
            panelCapaDeMovilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCapaDeMovilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCapaDeMovilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverActionPerformed
        if (obtenerNumeroDePosicion() > 0 && obtenerNumeroDePosicion() < 10) {
            if (obtenerNumeroDePosicion() != 5) {
                try {
                    if (!"pared".equals(vistaDelTablero.obtenerContenido(obtenerNumeroDePosicion()).obtenerTipoDeCasilla())) {
                        if (obtenerNumeroDePosicion() == 1) {
                            for (int i = 1; i <= tablero.getLongitud(); i++) {
                                if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {
                                    tablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + nombre + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                    casillaActual = tablero.obtenerContenido(i).obtenerTipoDeCasilla();
                                    tablero.obtenerContenido(i).cambiarTipoDeCasilla(nombre);
                                    filaNueva = tablero.obtenerContenido(i).obtenerFila();
                                    columnaNueva = tablero.obtenerContenido(i).obtenerColumna();
                                }
                            }
                        }
                        if (obtenerNumeroDePosicion() == 2) {
                            for (int i = 1; i <= tablero.getLongitud(); i++) {
                                if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == columna) {
                                    tablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + nombre + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                    casillaActual = tablero.obtenerContenido(i).obtenerTipoDeCasilla();
                                    tablero.obtenerContenido(i).cambiarTipoDeCasilla(nombre);
                                    filaNueva = tablero.obtenerContenido(i).obtenerFila();
                                    columnaNueva = tablero.obtenerContenido(i).obtenerColumna();
                                }
                            }
                        }
                        if (obtenerNumeroDePosicion() == 3) {
                            for (int i = 1; i <= tablero.getLongitud(); i++) {
                                if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {
                                    tablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + nombre + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                    casillaActual = tablero.obtenerContenido(i).obtenerTipoDeCasilla();
                                    tablero.obtenerContenido(i).cambiarTipoDeCasilla(nombre);
                                    filaNueva = tablero.obtenerContenido(i).obtenerFila();
                                    columnaNueva = tablero.obtenerContenido(i).obtenerColumna();
                                }
                            }
                        }
                        if (obtenerNumeroDePosicion() == 4) {
                            for (int i = 1; i <= tablero.getLongitud(); i++) {
                                if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {
                                    tablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + nombre + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                    casillaActual = tablero.obtenerContenido(i).obtenerTipoDeCasilla();
                                    tablero.obtenerContenido(i).cambiarTipoDeCasilla(nombre);
                                    filaNueva = tablero.obtenerContenido(i).obtenerFila();
                                    columnaNueva = tablero.obtenerContenido(i).obtenerColumna();
                                }
                            }
                        }
                        if (obtenerNumeroDePosicion() == 6) {
                            for (int i = 1; i <= tablero.getLongitud(); i++) {
                                if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {
                                    tablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + nombre + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                    casillaActual = tablero.obtenerContenido(i).obtenerTipoDeCasilla();
                                    tablero.obtenerContenido(i).cambiarTipoDeCasilla(nombre);
                                    filaNueva = tablero.obtenerContenido(i).obtenerFila();
                                    columnaNueva = tablero.obtenerContenido(i).obtenerColumna();
                                }
                            }
                        }
                        if (obtenerNumeroDePosicion() == 7) {
                            for (int i = 1; i <= tablero.getLongitud(); i++) {
                                if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {
                                    tablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + nombre + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                    casillaActual = tablero.obtenerContenido(i).obtenerTipoDeCasilla();
                                    tablero.obtenerContenido(i).cambiarTipoDeCasilla(nombre);
                                    filaNueva = tablero.obtenerContenido(i).obtenerFila();
                                    columnaNueva = tablero.obtenerContenido(i).obtenerColumna();
                                }
                            }
                        }
                        if (obtenerNumeroDePosicion() == 8) {
                            for (int i = 1; i <= tablero.getLongitud(); i++) {
                                if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == columna) {
                                    tablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + nombre + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                    casillaActual = tablero.obtenerContenido(i).obtenerTipoDeCasilla();
                                    tablero.obtenerContenido(i).cambiarTipoDeCasilla(nombre);
                                    filaNueva = tablero.obtenerContenido(i).obtenerFila();
                                    columnaNueva = tablero.obtenerContenido(i).obtenerColumna();
                                }
                            }
                        }
                        if (obtenerNumeroDePosicion() == 9) {
                            for (int i = 1; i <= tablero.getLongitud(); i++) {
                                if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {
                                    tablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + nombre + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                    casillaActual = tablero.obtenerContenido(i).obtenerTipoDeCasilla();
                                    tablero.obtenerContenido(i).cambiarTipoDeCasilla(nombre);
                                    filaNueva = tablero.obtenerContenido(i).obtenerFila();
                                    columnaNueva = tablero.obtenerContenido(i).obtenerColumna();
                                }
                            }
                        }
                        
                        for (int i = 1; i <= tablero.getLongitud(); i++) {
                            if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == columna) {
                                tablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + casillaAnterior + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                tablero.obtenerContenido(i).cambiarTipoDeCasilla(casillaAnterior);
                            }
                        }
                        
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null,"No Puedes Moverte a esta Dirección","Seleccionar",JOptionPane.ERROR_MESSAGE);
                    }
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null,"No Puedes Seleccionar la Posición en donde estas","Seleccionar",JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Número fuera de Rango","Seleccionar",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_moverActionPerformed

    private void mostrarCapa() {
        panelCapaDeMovilidad.setLayout(new GridLayout(3,3));
                
        try {
            int indice = 1;

            for (int i = 0; i < 3; i++) {           
                for (int j = 0; j < 3; j++) {
                    panelCapaDeMovilidad.add(vistaDelTablero.obtenerContenido(indice));  
                    String imagen = vistaDelTablero.obtenerContenido(indice).obtenerTipoDeCasilla();                    
                    vistaDelTablero.obtenerContenido(indice).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + imagen + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                    indice++;
                }
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        panelCapaDeMovilidad.updateUI();
    }
    
    public int obtenerFilaNueva() {
        return filaNueva;
    } 
    
    public int obtenerColumnaNueva() {
        return columnaNueva;
    } 
    
    public String obtenerCasillaAnterior() {
        return casillaActual;
    } 
    
    private int obtenerNumeroDePosicion() {
        return (int) numeroDePosicion.getValue();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mover;
    private javax.swing.JSpinner numeroDePosicion;
    private javax.swing.JPanel panelCapaDeMovilidad;
    // End of variables declaration//GEN-END:variables
}
