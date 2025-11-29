package com.mycompany.aventura.main.frameDelJuego;

import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.personajes.*;
import com.mycompany.aventura.main.tablero.Casilla;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SeleccionarPersonaje extends javax.swing.JDialog {

    private ListaElementos<Personaje> personajesEnBatalla = new ListaElementos<>();
    private ListaElementos<Personaje> personajesJugador = new ListaElementos<>();
    private ListaElementos<Casilla> casillasDelTablero = new ListaElementos<>();
    private int filas, columnas;
    private String casillaAnterior;
    
    public SeleccionarPersonaje(java.awt.Frame parent, ListaElementos<Personaje> personajesJugador, ListaElementos<Casilla> casillasDelTablero, int filas, int columnas) {
        super(parent, true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.personajesJugador = personajesJugador;
        this.casillasDelTablero = casillasDelTablero;
        this.filas = filas;
        this.columnas = columnas;
        mostrarPersonajesDisponibles();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelPersonajesDisponibles = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        numeroPersonajePrincipal = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        numeroPersonajeSecundario = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numeroDeFila = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        numeroDeColumna = new javax.swing.JSpinner();
        aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Personajes Disponibles"));

        javax.swing.GroupLayout panelPersonajesDisponiblesLayout = new javax.swing.GroupLayout(panelPersonajesDisponibles);
        panelPersonajesDisponibles.setLayout(panelPersonajesDisponiblesLayout);
        panelPersonajesDisponiblesLayout.setHorizontalGroup(
            panelPersonajesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );
        panelPersonajesDisponiblesLayout.setVerticalGroup(
            panelPersonajesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPersonajesDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPersonajesDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Seleccionar Personaje y Posición");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccionar Personajes"));

        jLabel2.setText("Selecciona tu Personaje Principal:");

        jLabel3.setText("Seleccina tu Personaje Secundario:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroPersonajePrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroPersonajeSecundario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroPersonajePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numeroPersonajeSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccionar Posición"));

        jLabel4.setText("Selecciona la Fila y la Columna donde ");

        jLabel5.setText("iniciará el Personaje Principal:");

        jLabel6.setText("Número de Fila:");

        jLabel7.setText("Número de Columna:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroDeFila, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroDeColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(numeroDeFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(numeroDeColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(aceptar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(aceptar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        if (obtenerNumeroDelPersonajePrincipal() > 0 && obtenerNumeroDelPersonajePrincipal() <= personajesJugador.getLongitud()) {
            if (obtenerNumeroDelPersonajeSecundario() > 0 && obtenerNumeroDelPersonajeSecundario() <= personajesJugador.getLongitud()) {
                if (obtenerNumeroDelPersonajeSecundario() != obtenerNumeroDelPersonajePrincipal()) {
                    if (obtenerNumeroDeFila() > 0 && obtenerNumeroDeFila() <= filas) {
                        if (obtenerNumeroDeColumna() > 0 && obtenerNumeroDeColumna() <= columnas) {
                            for (int i = 1; i <= casillasDelTablero.getLongitud(); i++) {
                                try {
                                    if (casillasDelTablero.obtenerContenido(i).obtenerFila() == obtenerNumeroDeFila() && casillasDelTablero.obtenerContenido(i).obtenerColumna() == obtenerNumeroDeColumna()) {
                                        if (!personajesJugador.obtenerContenido(obtenerNumeroDelPersonajePrincipal()).saberSiPuedeVolar()) { 
                                            if ("planicie".equals(casillasDelTablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(casillasDelTablero.obtenerContenido(i).obtenerTipoDeCasilla())) {

                                                for (int j = 1; j <= 2; j++) {
                                                    Personaje nuevo = null;
                                                    int indice = 0;

                                                    if (j == 1) {
                                                        indice = obtenerNumeroDelPersonajePrincipal();
                                                    } else {
                                                        indice = obtenerNumeroDelPersonajeSecundario();
                                                    }

                                                    if ("caballero".equals(personajesJugador.obtenerContenido(indice).obtenerTipo())) {
                                                        nuevo = new Caballero(personajesJugador.obtenerContenido(indice).obtenerNombre());
                                                    } else if ("arquero".equals(personajesJugador.obtenerContenido(indice).obtenerTipo())) {
                                                        nuevo = new Arquero(personajesJugador.obtenerContenido(indice).obtenerNombre());
                                                    } else if ("mago".equals(personajesJugador.obtenerContenido(indice).obtenerTipo())) {
                                                        nuevo = new Mago(personajesJugador.obtenerContenido(indice).obtenerNombre());
                                                    } else if ("gigante".equals(personajesJugador.obtenerContenido(indice).obtenerTipo())) {
                                                        nuevo = new Gigante(personajesJugador.obtenerContenido(indice).obtenerNombre());
                                                    } else if ("dragon".equals(personajesJugador.obtenerContenido(indice).obtenerTipo())) {
                                                        nuevo = new Dragon(personajesJugador.obtenerContenido(indice).obtenerNombre());
                                                    }
                                                    nuevo.establecerVida(personajesJugador.obtenerContenido(indice).obtenerVida());
                                                    personajesEnBatalla.agregarALaLista(nuevo);
                                                }

                                                casillasDelTablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + personajesEnBatalla.obtenerContenido(1).obtenerTipo() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                                // Cambio de Casilla
                                                casillaAnterior = casillasDelTablero.obtenerContenido(i).obtenerTipoDeCasilla();
                                                personajesEnBatalla.obtenerContenido(1).recibirCasillaActual(casillaAnterior);
                                                casillasDelTablero.obtenerContenido(i).cambiarTipoDeCasilla(personajesEnBatalla.obtenerContenido(1).obtenerTipo());
                                                // Primer Personaje
                                                personajesEnBatalla.obtenerContenido(1).recibirFila(obtenerNumeroDeFila());
                                                personajesEnBatalla.obtenerContenido(1).recibirColumna(obtenerNumeroDeColumna());
                                                personajesEnBatalla.obtenerContenido(1).recibirFilasDelTablero(filas);
                                                personajesEnBatalla.obtenerContenido(1).recibirColumnasDelTablero(columnas);
                                                // Segundo Personaje
                                                personajesEnBatalla.obtenerContenido(2).recibirFila(0);
                                                personajesEnBatalla.obtenerContenido(2).recibirColumna(0);                             
                                                personajesEnBatalla.obtenerContenido(2).recibirFilasDelTablero(filas);
                                                personajesEnBatalla.obtenerContenido(2).recibirColumnasDelTablero(columnas);
                                                this.dispose();
                                            } else {
                                                JOptionPane.showMessageDialog(this,"No puedes Colocar al Personaje sobre esta Casilla","Error",JOptionPane.ERROR_MESSAGE);
                                            }
                                        } else {
                                            
                                            for (int j = 1; j <= 2; j++) {
                                                Personaje nuevo = null;
                                                int indice = 0;

                                                if (j == 1) {
                                                    indice = obtenerNumeroDelPersonajePrincipal();
                                                } else {
                                                    indice = obtenerNumeroDelPersonajeSecundario();
                                                }

                                                if ("caballero".equals(personajesJugador.obtenerContenido(indice).obtenerTipo())) {
                                                    nuevo = new Caballero(personajesJugador.obtenerContenido(indice).obtenerNombre());
                                                } else if ("arquero".equals(personajesJugador.obtenerContenido(indice).obtenerTipo())) {
                                                    nuevo = new Arquero(personajesJugador.obtenerContenido(indice).obtenerNombre());
                                                } else if ("mago".equals(personajesJugador.obtenerContenido(indice).obtenerTipo())) {
                                                    nuevo = new Mago(personajesJugador.obtenerContenido(indice).obtenerNombre());
                                                } else if ("gigante".equals(personajesJugador.obtenerContenido(indice).obtenerTipo())) {
                                                    nuevo = new Gigante(personajesJugador.obtenerContenido(indice).obtenerNombre());
                                                } else if ("dragon".equals(personajesJugador.obtenerContenido(indice).obtenerTipo())) {
                                                    nuevo = new Dragon(personajesJugador.obtenerContenido(indice).obtenerNombre());
                                                }
                                                nuevo.establecerVida(personajesJugador.obtenerContenido(indice).obtenerVida());
                                                personajesEnBatalla.agregarALaLista(nuevo);
                                            }

                                            casillasDelTablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + personajesEnBatalla.obtenerContenido(1).obtenerTipo() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                            // Cambio de Casilla
                                            casillaAnterior = casillasDelTablero.obtenerContenido(i).obtenerTipoDeCasilla();
                                            personajesEnBatalla.obtenerContenido(1).recibirCasillaActual(casillaAnterior);
                                            casillasDelTablero.obtenerContenido(i).cambiarTipoDeCasilla(personajesEnBatalla.obtenerContenido(1).obtenerTipo());
                                            // Primer Personaje
                                            personajesEnBatalla.obtenerContenido(1).recibirFila(obtenerNumeroDeFila());
                                            personajesEnBatalla.obtenerContenido(1).recibirColumna(obtenerNumeroDeColumna());
                                            personajesEnBatalla.obtenerContenido(1).recibirFilasDelTablero(filas);
                                            personajesEnBatalla.obtenerContenido(1).recibirColumnasDelTablero(columnas);
                                            // Segundo Personaje
                                            personajesEnBatalla.obtenerContenido(2).recibirFila(0);
                                            personajesEnBatalla.obtenerContenido(2).recibirColumna(0);                             
                                            personajesEnBatalla.obtenerContenido(2).recibirFilasDelTablero(filas);
                                            personajesEnBatalla.obtenerContenido(2).recibirColumnasDelTablero(columnas);
                                            this.dispose();
                                        }
                                    }
                                } catch (ListaElementosExcepcion ex) {
                                    System.out.println(ex.getMessage());
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(this,"El Número de Columnas esta fuera de Rango","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this,"El Número de Filas esta fuera de Rango","Error",JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this,"No puedes Escoger dos veces al mismo Personaje","Error",JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this,"El Número Del Personaje Secundario esta fuera de Rango","Error",JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,"El Número Del Personaje Principal esta fuera de Rango","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarActionPerformed
    
    private void mostrarPersonajesDisponibles() {
        ListaElementos<JLabel> personajesJLabel = new ListaElementos<>();
        
        panelPersonajesDisponibles.setLayout(new GridLayout(personajesJugador.getLongitud(),1));

        for (int i = 1; i <= personajesJugador.getLongitud(); i++) {   
            try {
                personajesJLabel.agregarALaLista(new JLabel("(" + i + ") " + personajesJugador.obtenerContenido(i).mostrarCarateristicasBasicas()));
                panelPersonajesDisponibles.add(personajesJLabel.obtenerContenido(i));
            } catch (ListaElementosExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
        panelPersonajesDisponibles.updateUI();
    }
    
    public ListaElementos<Personaje> obtenerPersonajesEnBatalla() {
        return personajesEnBatalla;
    }
    
    public String obtenerCasillaAnterior() {
        return casillaAnterior;
    }
    
    public int obtenerNumeroDelPersonajePrincipal() {
        return (int) numeroPersonajePrincipal.getValue();
    }
    
    public int obtenerNumeroDelPersonajeSecundario() {
        return (int) numeroPersonajeSecundario.getValue();
    }
    
    public int obtenerNumeroDeFila() {
        return (int) numeroDeFila.getValue();
    }
    
    public int obtenerNumeroDeColumna() {
        return (int) numeroDeColumna.getValue();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner numeroDeColumna;
    private javax.swing.JSpinner numeroDeFila;
    private javax.swing.JSpinner numeroPersonajePrincipal;
    private javax.swing.JSpinner numeroPersonajeSecundario;
    private javax.swing.JPanel panelPersonajesDisponibles;
    // End of variables declaration//GEN-END:variables
}
