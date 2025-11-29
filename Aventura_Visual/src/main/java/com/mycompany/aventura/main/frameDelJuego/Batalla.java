package com.mycompany.aventura.main.frameDelJuego;

import com.mycompany.aventura.main.archivos.ArchivoDeTableros;
import com.mycompany.aventura.main.archivos.ArchivoGuardarPartidaSerializable;
import com.mycompany.aventura.main.guardarPartida.GuardarPartida;
import com.mycompany.aventura.main.jugador.Jugador;
import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.objetos.*;
import com.mycompany.aventura.main.personajes.*;
import com.mycompany.aventura.main.tablero.Arbol;
import com.mycompany.aventura.main.tablero.Casilla;
import com.mycompany.aventura.main.tablero.Tablero;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Batalla extends javax.swing.JDialog {

    private GuardarPartida partida;
    private Jugador jugador;
    private ListaElementos<Casilla> casillasJLabel = new ListaElementos<>();
    private ListaElementos<Arbol> arboles = new ListaElementos<>();
    private ListaElementos<String> accionesEnemigos = new ListaElementos<>();
    private ListaElementos<String> casillasDelTablero = new ListaElementos<>();
    private ListaElementos<String> casillasAnteriores = new ListaElementos<>();
    private ListaElementos<Personaje> personajesJugador = new ListaElementos<>();
    private ListaElementos<Personaje> personajesEnBatalla = new ListaElementos<>();
    private ListaElementos<Objeto> objetosJugador = new ListaElementos<>();
    private ListaElementos<Personaje> personajesEnemigos = new ListaElementos<>();
    private String nombreDelTableroAJugar, casillaAnterior, path;
    private int filas, columnas, indicePersonajeSeleccionado_1 = 0, indicePersonajeSeleccionado_2 = 0, indicePersonaje = 1, punteo = 0, accion = 0, punteoJugador = 0, oro = 0, modo = 0;
    private boolean yaSeLeNotificoPerdida = false;

    public Batalla(java.awt.Frame parent, int modo, GuardarPartida partida, ListaElementos<Personaje> personajesJugador, ListaElementos<Objeto> objetosJugador, ListaElementos<Personaje> personajesEnemigo, String nombreDelTableroAJugar, String path, Jugador jugador) {
        super(parent, true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.modo = modo;
        this.partida = partida;
        this.personajesJugador = personajesJugador;
        this.objetosJugador = objetosJugador;
        this.personajesEnemigos = personajesEnemigo;
        this.nombreDelTableroAJugar = nombreDelTableroAJugar;
        this.path = path;
        this.jugador = jugador;
        abrirOCerrarOpciones(false);
        abrirOCerrarControles(false);
        mostrarTablero(modo);
        fila.setVisible(false);
        columna.setVisible(false);
        filaSeleccionada.setVisible(false);
        columnaSeleccionada.setVisible(false);
        colocar.setVisible(false);
        guardarPartida.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        batallaTablero = new javax.swing.JPanel();
        panelBatalla = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        moverse = new javax.swing.JButton();
        atacar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        arriba = new javax.swing.JButton();
        abajo = new javax.swing.JButton();
        derecha = new javax.swing.JButton();
        izquierda = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        regresarAlMenuPrincipal = new javax.swing.JButton();
        seleccionarPersonajes = new javax.swing.JButton();
        fila = new javax.swing.JLabel();
        filaSeleccionada = new javax.swing.JSpinner();
        columna = new javax.swing.JLabel();
        columnaSeleccionada = new javax.swing.JSpinner();
        colocar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        mostrarJugadorEnBatalla = new javax.swing.JLabel();
        mostrarJugadorEnBatallaDatos = new javax.swing.JLabel();
        guardarPartida = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        batallaTablero.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablero"));

        javax.swing.GroupLayout panelBatallaLayout = new javax.swing.GroupLayout(panelBatalla);
        panelBatalla.setLayout(panelBatallaLayout);
        panelBatallaLayout.setHorizontalGroup(
            panelBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBatallaLayout.setVerticalGroup(
            panelBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout batallaTableroLayout = new javax.swing.GroupLayout(batallaTablero);
        batallaTablero.setLayout(batallaTableroLayout);
        batallaTableroLayout.setHorizontalGroup(
            batallaTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(batallaTableroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBatalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        batallaTableroLayout.setVerticalGroup(
            batallaTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(batallaTableroLayout.createSequentialGroup()
                .addComponent(panelBatalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Batalla");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Controles"));

        jLabel2.setText("Seleccione la Acción:");

        moverse.setText("Moverse");
        moverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverseActionPerformed(evt);
            }
        });

        atacar.setText("Atacar");
        atacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atacarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(atacar)
                    .addComponent(moverse))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(atacar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(moverse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección"));

        arriba.setText("Arriba");
        arriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaActionPerformed(evt);
            }
        });

        abajo.setText("Abajo");
        abajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoActionPerformed(evt);
            }
        });

        derecha.setText("Derecha");
        derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaActionPerformed(evt);
            }
        });

        izquierda.setText("Izquierda");
        izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arriba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(izquierda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(derecha)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(abajo)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arriba, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(izquierda)
                    .addComponent(derecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abajo)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        regresarAlMenuPrincipal.setText("Regresar Al Menu Principal");
        regresarAlMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarAlMenuPrincipalActionPerformed(evt);
            }
        });

        seleccionarPersonajes.setText("Seleccionar Personajes");
        seleccionarPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarPersonajesActionPerformed(evt);
            }
        });

        fila.setText("Fila:");

        columna.setText("Columna:");

        colocar.setText("Colocar");
        colocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colocarActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Personaje En Batalla"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarJugadorEnBatalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarJugadorEnBatallaDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mostrarJugadorEnBatalla, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarJugadorEnBatallaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        guardarPartida.setText("Guardar Partida");
        guardarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPartidaActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Enemigos"));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 163, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(batallaTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(195, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(189, 189, 189)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(colocar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regresarAlMenuPrincipal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(columna)
                                .addComponent(fila))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(columnaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(filaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seleccionarPersonajes, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(guardarPartida, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batallaTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fila)
                            .addComponent(filaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seleccionarPersonajes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(columna)
                            .addComponent(columnaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarPartida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regresarAlMenuPrincipal)
                            .addComponent(colocar))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionarPersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarPersonajesActionPerformed
        SeleccionarPersonaje seleccionar = new SeleccionarPersonaje(new javax.swing.JFrame(), personajesJugador, casillasJLabel, filas, columnas);
        seleccionar.setVisible(true);
        personajesEnBatalla = seleccionar.obtenerPersonajesEnBatalla();
        casillaAnterior = seleccionar.obtenerCasillaAnterior();
        indicePersonajeSeleccionado_1 = seleccionar.obtenerNumeroDelPersonajePrincipal();
        indicePersonajeSeleccionado_2 = seleccionar.obtenerNumeroDelPersonajeSecundario();
        actualizarDatos();
        seleccionarPersonajes.setVisible(false);
        guardarPartida.setVisible(true);
        abrirOCerrarOpciones(true);
        abrirOCerrarControles(false);
        colocarEnemigos();
    }//GEN-LAST:event_seleccionarPersonajesActionPerformed

    private void atacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atacarActionPerformed
        accion = 1;
        
        try {
            if ("caballero".equals(personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerTipo())) {
                atacarMovimiento("j");
                abrirOCerrarControles(false);
            } else {
                abrirOCerrarOpciones(false);
                abrirOCerrarControles(true);
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_atacarActionPerformed

    private void moverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverseActionPerformed
        try {
            if (personajesEnBatalla.obtenerContenido(indicePersonaje).verificarMovimientoJugador(casillasJLabel)) {
                accion = 2;
                abrirOCerrarOpciones(false);
                abrirOCerrarControles(true);
            } else {
                JOptionPane.showMessageDialog(null,"No puedes moverte estas Encerrado, solo puedes Atacar","Encerrado",JOptionPane.ERROR_MESSAGE);
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_moverseActionPerformed

    private void arribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaActionPerformed
        if (accion == 1) {
            atacarMovimiento("w");
        } else {
            moverDireccion("w");
        }
        abrirOCerrarOpciones(true);
        abrirOCerrarControles(false);
    }//GEN-LAST:event_arribaActionPerformed

    private void abajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoActionPerformed
        if (accion == 1) {
            atacarMovimiento("s");
        } else {
            moverDireccion("s");
        }
        abrirOCerrarOpciones(true);
        abrirOCerrarControles(false);
    }//GEN-LAST:event_abajoActionPerformed

    private void derechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaActionPerformed
        if (accion == 1) {
            atacarMovimiento("d");
        } else {
            moverDireccion("d");
        }
        abrirOCerrarOpciones(true);
        abrirOCerrarControles(false);
    }//GEN-LAST:event_derechaActionPerformed

    private void izquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaActionPerformed
        if (accion == 1) {
            atacarMovimiento("a");
        } else {
            moverDireccion("a");
        }
        abrirOCerrarOpciones(true);
        abrirOCerrarControles(false);
    }//GEN-LAST:event_izquierdaActionPerformed

    private void colocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colocarActionPerformed
        indicePersonaje = 1;

        if (obtenerNumeroDeFila() > 0 && obtenerNumeroDeFila() <= filas) {
            if (obtenerNumeroDeColumna() > 0 && obtenerNumeroDeColumna() <= columnas) {
                for (int i = 1; i <= casillasJLabel.getLongitud(); i++) {
                    try {
                        if (casillasJLabel.obtenerContenido(i).obtenerFila() == obtenerNumeroDeFila() && casillasJLabel.obtenerContenido(i).obtenerColumna() == obtenerNumeroDeColumna()) {
                            if ("planicie".equals(casillasJLabel.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(casillasJLabel.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                casillasJLabel.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerTipo() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                casillaAnterior = casillasJLabel.obtenerContenido(i).obtenerTipoDeCasilla();
                                casillasJLabel.obtenerContenido(i).cambiarTipoDeCasilla(personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerTipo());
                                personajesEnBatalla.obtenerContenido(indicePersonaje).recibirFila(obtenerNumeroDeFila());
                                personajesEnBatalla.obtenerContenido(indicePersonaje).recibirColumna(obtenerNumeroDeColumna());
                                yaSeLeNotificoPerdida = true;
                                atacar.setEnabled(true);
                                moverse.setEnabled(true);
                                fila.setVisible(false);
                                columna.setVisible(false);
                                filaSeleccionada.setVisible(false);
                                columnaSeleccionada.setVisible(false);
                                colocar.setVisible(false);
                                guardarPartida.setVisible(true);
                                encenderOApagarArboles();
                                preguntarUtilizacionDeObjetos();
                            } else {
                                JOptionPane.showMessageDialog(this,"No puedes Colocar al Personaje sobre esta Casilla","Error",JOptionPane.ERROR_MESSAGE);
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
    }//GEN-LAST:event_colocarActionPerformed

    private void guardarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPartidaActionPerformed
        GuardarPartida guardar = new GuardarPartida(casillasJLabel, personajesEnBatalla, personajesEnemigos, arboles, casillaAnterior, casillasAnteriores, indicePersonaje, filas, columnas, indicePersonajeSeleccionado_1, indicePersonajeSeleccionado_2, yaSeLeNotificoPerdida);
        ArchivoGuardarPartidaSerializable guardarSerializable = new ArchivoGuardarPartidaSerializable();
        String path = null;
        boolean salir = false;

        while (!salir) {
            path = JOptionPane.showInputDialog("Escribe el Nombre Del Archivo");
            if ("".equals(path) || path == null) {
                JOptionPane.showMessageDialog(this,"Debes Escribir un Nombre para el Archio","Escribe un Nombre",JOptionPane.ERROR_MESSAGE);
            } else {
                salir = jugador.guardarNombreDeLaPartidaGuardada(path);
                
                if (!salir) {
                    JOptionPane.showMessageDialog(this,"Ya Existe una Partida guardada con ese Nombre","Nombre Repetido",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        guardarSerializable.GuardarArchivo(guardar, path);
        this.dispose();
    }//GEN-LAST:event_guardarPartidaActionPerformed

    private void regresarAlMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarAlMenuPrincipalActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null,"¿Desea Salir?, Recuerda que si Sales Perderás Todas tus Objetos Utilizados", "Desea Salir", JOptionPane.YES_NO_OPTION);

        if (selectedOption == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_regresarAlMenuPrincipalActionPerformed

    private void mostrarTablero(int modo) {
        if (modo == 1) {
            ArchivoDeTableros recibir = new ArchivoDeTableros();
            casillasDelTablero = recibir.obtenerTableroAJugar(nombreDelTableroAJugar);

            String[] datosDelTablero = nombreDelTableroAJugar.split(" ");
            String parteNumerica = datosDelTablero[1];
            String[] numeroEnPartes = parteNumerica.split("X");
            filas = Integer.parseInt(numeroEnPartes[0]);
            columnas = Integer.parseInt(numeroEnPartes[1]);

            Tablero obtener = new Tablero();
            casillasJLabel = obtener.crearTableroJLabel(casillasDelTablero, arboles, filas, columnas, 427, 421);
        } else {
            casillasJLabel = partida.obtenerTablero();
            personajesEnBatalla = partida.obtenerPersonajesEnBatalla();
            personajesEnemigos = partida.obtenerPersonajesEnemigos();
            arboles = partida.obtenerArboles();
            casillaAnterior = partida.obtenerCasillaAnterior();
            casillasAnteriores = partida.obtenerCasillasAnteriores();
            indicePersonaje = partida.obtenerIndiceJugador();
            filas = partida.obtenerFila();
            columnas = partida.obtenerColumna();
            indicePersonajeSeleccionado_1 = partida.obtenerIndicePersonajeSeleccionado_1();
            indicePersonajeSeleccionado_2 = partida.obtenerIndicePersonajeSeleccionado_2();
            yaSeLeNotificoPerdida = partida.obtenerSiYaSeLeNotificoPerdida();
            actualizarDatos();
            seleccionarPersonajes.setVisible(false);
            abrirOCerrarOpciones(true);
            abrirOCerrarControles(false);
        }

        panelBatalla.setLayout(new GridLayout(filas, columnas));

        try {
            int indice = 1;

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    panelBatalla.add(casillasJLabel.obtenerContenido(indice));
                    String imagen = casillasJLabel.obtenerContenido(indice).obtenerTipoDeCasilla();
                    casillasJLabel.obtenerContenido(indice).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + imagen + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                    indice++;
                }
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        panelBatalla.updateUI();
    }

    private void abrirOCerrarOpciones(boolean estado) {
        atacar.setEnabled(estado);
        moverse.setEnabled(estado);
    }

    private void abrirOCerrarControles(boolean estado) {
        arriba.setEnabled(estado);
        abajo.setEnabled(estado);
        derecha.setEnabled(estado);
        izquierda.setEnabled(estado);
    }

    private void moverDireccion(String direccion) {
        try {
            personajesEnBatalla.obtenerContenido(indicePersonaje).moverPersonaje(casillasJLabel, casillaAnterior, direccion, accionesEnemigos);
            casillaAnterior = personajesEnBatalla.obtenerContenido(indicePersonaje).getCasillaActual();
            encenderOApagarArboles();
            turnoDelEnemigo();
            preguntarCambioDePersonaje();
            verificarConcursantes();
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }       
        atacar.setEnabled(true);
        moverse.setEnabled(true);
    }

    private void atacarMovimiento(String direccion) {
        try {
            personajesEnBatalla.obtenerContenido(indicePersonaje).atacarPersonaje(casillasJLabel, arboles, personajesEnemigos, casillasAnteriores, direccion, accionesEnemigos);
            punteoJugador += personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerPunteo();
            personajesEnBatalla.obtenerContenido(indicePersonaje).guardarPunteo(0);
            encenderOApagarArboles();
            turnoDelEnemigo();
            preguntarCambioDePersonaje();
            verificarConcursantes();
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        atacar.setEnabled(true);
        moverse.setEnabled(true);
    }

    private void turnoDelEnemigo() {
        try {
            for (int i = 1; i <= personajesEnemigos.getLongitud(); i++) {
                double random = 0;
                int desplazamiento = 0;
                String comando = null;

                if ("bruja".equals(personajesEnemigos.obtenerContenido(i).obtenerTipo())) {
                    if (filas >= columnas) {
                        desplazamiento = filas;
                    } else {
                        desplazamiento = columnas;
                    }
                    comando = personajesEnemigos.obtenerContenido(i).obtenerDireccionNormal(casillasJLabel, desplazamiento);
                } else if ("florCarnivora".equals(personajesEnemigos.obtenerContenido(i).obtenerTipo())) {
                    desplazamiento = 3;
                    comando = personajesEnemigos.obtenerContenido(i).obtenerDireccionNormal(casillasJLabel, desplazamiento);
                } else if ("gargola".equals(personajesEnemigos.obtenerContenido(i).obtenerTipo())) {
                    desplazamiento = 2;
                    comando = personajesEnemigos.obtenerContenido(i).obtenerDireccionNormal(casillasJLabel, desplazamiento);
                } else if ("ogro".equals(personajesEnemigos.obtenerContenido(i).obtenerTipo())) {
                    comando = personajesEnemigos.obtenerContenido(i).obtenerDireccionCuadrado(casillasJLabel);
                } else if ("cancerbero".equals(personajesEnemigos.obtenerContenido(i).obtenerTipo())) {
                    comando = personajesEnemigos.obtenerContenido(i).obtenerDireccionCuadrado(casillasJLabel);
                }

                if ("j".equals(comando)) {
                    if (personajesEnemigos.obtenerContenido(i).verificarMovimientoJugador(casillasJLabel)) {
                        random = 0.25;
                    } else {
                        random = 0.75;
                    }

                    if (random < 0.50) {
                        if  (!"florCarnivora".equals(personajesEnemigos.obtenerContenido(i).obtenerTipo())) {
                            personajesEnemigos.obtenerContenido(i).moverPersonaje(casillasJLabel, casillasAnteriores.obtenerContenido(i), "j", accionesEnemigos);
                            casillasAnteriores.encontrarPorIndice(i).setContenido(personajesEnemigos.obtenerContenido(i).getCasillaActual());
                        }
                    } else {
                        personajesEnemigos.obtenerContenido(i).atacarPersonaje(casillasJLabel, arboles, personajesEnBatalla, casillasAnteriores, "j", accionesEnemigos);
                    }
                } else {
                    personajesEnemigos.obtenerContenido(i).atacarPersonaje(casillasJLabel, arboles, personajesEnBatalla, casillasAnteriores, "j", accionesEnemigos);
                }
            }
            
            mostrarAccionesEnemigos();
            accionesEnemigos = new ListaElementos<>();
            encenderOApagarArboles();
            actualizarDatos();
            verificarLava();
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void mostrarAccionesEnemigos() {
        ListaElementos<JLabel> accionesEnemigosJLabel = new ListaElementos<>();
        jPanel6.removeAll();
        jPanel6.setLayout(new GridLayout(accionesEnemigos.getLongitud(), 1));

        try {
            int indice = 1;

            for (int i = 0; i < accionesEnemigos.getLongitud(); i++) {
                accionesEnemigosJLabel.agregarALaLista(new JLabel (accionesEnemigos.obtenerContenido(indice)));
                jPanel6.add(accionesEnemigosJLabel.obtenerContenido(indice));
                indice++;
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        jPanel6.updateUI();
    }

    private void preguntarCambioDePersonaje() {
        if (personajesEnBatalla.getLongitud() != 1) {
            try {
                int selectedOption = JOptionPane.showConfirmDialog(null,"¿Desea Cambiar de Personaje?", "Cambio", JOptionPane.YES_NO_OPTION);

                if (selectedOption == JOptionPane.YES_NO_OPTION) {
                    boolean bloquear = false;
                    int indicador = 1;
                    
                    if ("arbol".equals(casillaAnterior) || "rio".equals(casillaAnterior)) {
                        if (indicePersonaje == 1) {
                            indicador = 2;
                        }
                        bloquear = true;
                    }
                    
                    if (bloquear) {
                        if (personajesEnBatalla.obtenerContenido(indicador).saberSiPuedeVolar()) {
                            if (indicePersonaje == 1) {
                                personajesEnBatalla.obtenerContenido(2).recibirCasillaActual(personajesEnBatalla.obtenerContenido(1).getCasillaActual());
                                personajesEnBatalla.obtenerContenido(2).recibirFila(personajesEnBatalla.obtenerContenido(1).obtenerFilaDelJugador());
                                personajesEnBatalla.obtenerContenido(2).recibirColumna(personajesEnBatalla.obtenerContenido(1).obtenerColumnaDelJugador());
                                personajesEnBatalla.obtenerContenido(1).recibirFila(0);
                                personajesEnBatalla.obtenerContenido(1).recibirColumna(0);
                                indicePersonaje = 2;
                            } else {
                                personajesEnBatalla.obtenerContenido(1).recibirCasillaActual(personajesEnBatalla.obtenerContenido(2).getCasillaActual());
                                personajesEnBatalla.obtenerContenido(1).recibirFila(personajesEnBatalla.obtenerContenido(2).obtenerFilaDelJugador());
                                personajesEnBatalla.obtenerContenido(1).recibirColumna(personajesEnBatalla.obtenerContenido(2).obtenerColumnaDelJugador());
                                personajesEnBatalla.obtenerContenido(2).recibirFila(0);
                                personajesEnBatalla.obtenerContenido(2).recibirColumna(0);
                                indicePersonaje = 1;
                            }
                            for (int i = 1; i <= casillasJLabel.getLongitud(); i++) {
                                if (casillasJLabel.obtenerContenido(i).obtenerFila() == personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerFilaDelJugador() && casillasJLabel.obtenerContenido(i).obtenerColumna() == personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerColumnaDelJugador()) {
                                    casillasJLabel.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerTipo() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                    casillasJLabel.obtenerContenido(i).cambiarTipoDeCasilla(personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerTipo());
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(this,"El otro Personaje no puede volar, no se realizo el Cambio","No se realizo el Cambio",JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        if (indicePersonaje == 1) {
                            personajesEnBatalla.obtenerContenido(2).recibirCasillaActual(personajesEnBatalla.obtenerContenido(1).getCasillaActual());
                            personajesEnBatalla.obtenerContenido(2).recibirFila(personajesEnBatalla.obtenerContenido(1).obtenerFilaDelJugador());
                            personajesEnBatalla.obtenerContenido(2).recibirColumna(personajesEnBatalla.obtenerContenido(1).obtenerColumnaDelJugador());
                            personajesEnBatalla.obtenerContenido(1).recibirFila(0);
                            personajesEnBatalla.obtenerContenido(1).recibirColumna(0);
                            indicePersonaje = 2;
                        } else {
                            personajesEnBatalla.obtenerContenido(1).recibirCasillaActual(personajesEnBatalla.obtenerContenido(2).getCasillaActual());
                            personajesEnBatalla.obtenerContenido(1).recibirFila(personajesEnBatalla.obtenerContenido(2).obtenerFilaDelJugador());
                            personajesEnBatalla.obtenerContenido(1).recibirColumna(personajesEnBatalla.obtenerContenido(2).obtenerColumnaDelJugador());
                            personajesEnBatalla.obtenerContenido(2).recibirFila(0);
                            personajesEnBatalla.obtenerContenido(2).recibirColumna(0);
                            indicePersonaje = 1;
                        }
                        for (int i = 1; i <= casillasJLabel.getLongitud(); i++) {
                            if (casillasJLabel.obtenerContenido(i).obtenerFila() == personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerFilaDelJugador() && casillasJLabel.obtenerContenido(i).obtenerColumna() == personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerColumnaDelJugador()) {
                                casillasJLabel.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerTipo() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                casillasJLabel.obtenerContenido(i).cambiarTipoDeCasilla(personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerTipo());
                            }
                        }
                    }
                    preguntarUtilizacionDeObjetos();
                } else {
                    preguntarUtilizacionDeObjetos();
                }
            } catch (ListaElementosExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            if (!yaSeLeNotificoPerdida) {
                JOptionPane.showMessageDialog(this,"Perdiste a uno de tus Personajes, debes colocar el Otro en el Tablero","Notificación de Perdida del Personaje",JOptionPane.ERROR_MESSAGE);
                fila.setVisible(true);
                columna.setVisible(true);
                filaSeleccionada.setVisible(true);
                columnaSeleccionada.setVisible(true);
                colocar.setVisible(true);
                guardarPartida.setVisible(false);
            } else {
                preguntarUtilizacionDeObjetos();
            }
        }
        actualizarDatos();
    }

    private void preguntarUtilizacionDeObjetos() {
        if (objetosJugador.getLongitud() != 0) {
            int selectedOption = JOptionPane.showConfirmDialog(null,"¿Desea Utilizar un Objeto de su Inventario?", "Objetos", JOptionPane.YES_NO_OPTION);

            if (selectedOption == JOptionPane.YES_NO_OPTION) {
                boolean haySemilla = false, hayElixix = false, hayCapa = false;
                int indiceSemilla = 0, indiceElixir = 0, indiceCapa = 0;

                for (int i = 1; i <= objetosJugador.getLongitud(); i++) {
                    try {
                        String nombre = objetosJugador.obtenerContenido(i).getNombre();

                        if ("Semilla de la Vida".equals(nombre)) {
                            if (!haySemilla) {
                                indiceSemilla = i;
                            }
                            haySemilla = true;
                        } else if ("Elixir Verde".equals(nombre)) {
                            if (!hayElixix) {
                                indiceElixir = i;
                            }
                            hayElixix = true;
                        } else if ("Capa de Movilidad".equals(nombre)) {
                            if (!hayCapa) {
                                indiceCapa = i;
                            }
                            hayCapa = true;
                        }
                    } catch (ListaElementosExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                }

                String[] options = {"Semilla de la Vida", "Elixir Verde", "Capa de Movilidad"};
                boolean salir = false;

                while (!salir) {
                    int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el Objeto que desea Utilizar","Objetos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                    try {
                        if (seleccion == 0) {
                            if (haySemilla) {
                                if (personajesEnBatalla.getLongitud() == 2) {
                                    JOptionPane.showMessageDialog(this,"Los dos Personajes están vivos","Semilla de la Vida",JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    SemillaDeLaVida aUtilizar = (SemillaDeLaVida) objetosJugador.obtenerContenido(indiceSemilla);
                                    aUtilizar.resucitarPersonaje(personajesEnBatalla, indicePersonaje, personajesJugador, indicePersonajeSeleccionado_1, indicePersonajeSeleccionado_2);
                                    objetosJugador.eliminar(indiceSemilla);
                                    yaSeLeNotificoPerdida = false;
                                }
                                salir = true;
                            } else {
                                JOptionPane.showMessageDialog(this,"No tienes Semilla de la Vida en tu Inventario, vuelve a Seleccionar","Semilla de la Vida",JOptionPane.ERROR_MESSAGE);
                            }
                        } else if (seleccion == 1) {
                            if (hayElixix) {
                                ElixirVerde aUtilizar = (ElixirVerde) objetosJugador.obtenerContenido(indiceElixir);
                                aUtilizar.recuperarVida(personajesEnBatalla, indicePersonaje, personajesJugador, indicePersonajeSeleccionado_1, indicePersonajeSeleccionado_2);
                                objetosJugador.eliminar(indiceElixir);
                                mostrarJugadorEnBatalla.setText("Nombre: " + personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerNombre() + "/   Tipo: " + personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerTipo());
                                mostrarJugadorEnBatallaDatos.setText("Vida: " + personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerVida() + "/   Daño: " + personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerDaño());
                                salir = true;
                            } else {
                                JOptionPane.showMessageDialog(this,"No tienes Elixir Verde en tu Inventario, vuelve a Seleccionar","Semilla de la Vida",JOptionPane.ERROR_MESSAGE);
                            }
                        } else if (seleccion == 2) {
                            if (hayCapa) {
                                CapaDeMovilidad aUtilizar = (CapaDeMovilidad) objetosJugador.obtenerContenido(indiceCapa);
                                aUtilizar.activarCapa(casillasJLabel, personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerFilaDelJugador(), personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerColumnaDelJugador(), filas, columnas, casillaAnterior, personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerTipo(), personajesEnBatalla.obtenerContenido(indicePersonaje).saberSiPuedeVolar());
                                personajesEnBatalla.obtenerContenido(indicePersonaje).recibirFila(aUtilizar.obtenerFilaNueva());
                                personajesEnBatalla.obtenerContenido(indicePersonaje).recibirColumna(aUtilizar.obtenerColumnaNueva());
                                casillaAnterior = aUtilizar.obtenerCasillaAnterior();
                                objetosJugador.eliminar(indiceCapa);
                                salir = true;
                            } else {
                                JOptionPane.showMessageDialog(this,"No tienes Capa de Movilidad en tu Inventario, vuelve a Seleccionar","Semilla de la Vida",JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this,"Debes Seleccionar el Objeto que Desea Utilizar","Seleccionar",JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (ListaElementosExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }
    }

    private void colocarEnemigos() {
        boolean todosLosEnemigosHanSidoColocados = false;
        int indice = 1;

        try {
            while (!todosLosEnemigosHanSidoColocados) {
                Random random_1 = new Random();
                int filaAColocar = (random_1.nextInt(filas) + 1);

                Random random_2 = new Random();
                int columnaAColocar = (random_2.nextInt(columnas) + 1);

                for (int i = 1; i <= casillasJLabel.getLongitud(); i++) {

                    if (casillasJLabel.obtenerContenido(i).obtenerFila() == filaAColocar && casillasJLabel.obtenerContenido(i).obtenerColumna() == columnaAColocar) {
                        if (personajesEnemigos.obtenerContenido(indice).saberSiPuedeVolar()) {
                            if ("planicie".equals(casillasJLabel.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(casillasJLabel.obtenerContenido(i).obtenerTipoDeCasilla()) || "rio".equals(casillasJLabel.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(casillasJLabel.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                casillasJLabel.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + personajesEnemigos.obtenerContenido(indice).obtenerTipo() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                casillasAnteriores.agregarALaLista(casillasJLabel.obtenerContenido(i).obtenerTipoDeCasilla());
                                personajesEnemigos.obtenerContenido(indice).recibirCasillaActual(casillasJLabel.obtenerContenido(i).obtenerTipoDeCasilla());
                                casillasJLabel.obtenerContenido(i).cambiarTipoDeCasilla(personajesEnemigos.obtenerContenido(indice).obtenerTipo());
                                personajesEnemigos.obtenerContenido(indice).recibirFila(filaAColocar);
                                personajesEnemigos.obtenerContenido(indice).recibirColumna(columnaAColocar);
                                personajesEnemigos.obtenerContenido(indice).recibirFilasDelTablero(filas);
                                personajesEnemigos.obtenerContenido(indice).recibirColumnasDelTablero(columnas);
                                indice++;
                            }
                        } else {
                            if ("planicie".equals(casillasJLabel.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(casillasJLabel.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                casillasJLabel.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + personajesEnemigos.obtenerContenido(indice).obtenerTipo() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                casillasAnteriores.agregarALaLista(casillasJLabel.obtenerContenido(i).obtenerTipoDeCasilla());
                                personajesEnemigos.obtenerContenido(indice).recibirCasillaActual(casillasJLabel.obtenerContenido(i).obtenerTipoDeCasilla());
                                casillasJLabel.obtenerContenido(i).cambiarTipoDeCasilla(personajesEnemigos.obtenerContenido(indice).obtenerTipo());
                                personajesEnemigos.obtenerContenido(indice).recibirFila(filaAColocar);
                                personajesEnemigos.obtenerContenido(indice).recibirColumna(columnaAColocar);
                                personajesEnemigos.obtenerContenido(indice).recibirFilasDelTablero(filas);
                                personajesEnemigos.obtenerContenido(indice).recibirColumnasDelTablero(columnas);
                                indice++;
                            }
                        }
                    }
                }
                if (personajesEnemigos.getLongitud() == (indice - 1)) {
                    todosLosEnemigosHanSidoColocados = true;
                }
            }

            for (int i = 1; i <= personajesEnemigos.getLongitud(); i++) {
                encenderOApagarArboles();
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        actualizarDatos();
    }

    public void encenderOApagarArboles() {
        try {
            for (int i = 1; i <= arboles.getLongitud(); i++) {
                arboles.obtenerContenido(i).cambiarElEstadoDelArbol(true);
            }

            for (int i = 1; i <= arboles.getLongitud(); i++) {

                for (int j = 1; j <= personajesEnemigos.getLongitud(); j++) {
                    if (personajesEnemigos.obtenerContenido(j).obtenerFilaDelJugador() == arboles.obtenerContenido(i).obtenerFila() && personajesEnemigos.obtenerContenido(j).obtenerColumnaDelJugador() == arboles.obtenerContenido(i).obtenerColumna()) {
                        arboles.obtenerContenido(i).cambiarElEstadoDelArbol(false);
                        break;
                    }
                }
            }

            for (int i = 1; i <= arboles.getLongitud(); i++) {

                for (int j = 1; j <= personajesEnBatalla.getLongitud(); j++) {
                    if (personajesEnBatalla.obtenerContenido(j).obtenerFilaDelJugador() == arboles.obtenerContenido(i).obtenerFila() && personajesEnBatalla.obtenerContenido(j).obtenerColumnaDelJugador() == arboles.obtenerContenido(i).obtenerColumna()) {
                        arboles.obtenerContenido(i).cambiarElEstadoDelArbol(false);
                        break;
                    }
                }
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void verificarConcursantes() {
        if (personajesEnBatalla.estaVacia()) {
            JOptionPane.showMessageDialog(this,"Perdiste, tus dos personajes cayeron en Batalla","Perdiste",JOptionPane.ERROR_MESSAGE);
            oro = 0;
            if (modo == 2) {
                jugador.eliminarPartidaGuardada(path);
            }
            this.dispose();
        } else if (personajesEnemigos.estaVacia()) {
            JOptionPane.showMessageDialog(this,"Ganaste destruiste a todos los Enemigos, obtuviste 250 de Oro","Victoria",JOptionPane.INFORMATION_MESSAGE);
            oro = 250;
            if (modo == 2) {
                jugador.eliminarPartidaGuardada(path);
            }
            this.dispose();
        }
    }

    public void actualizarDatos() {
        try {
            mostrarJugadorEnBatalla.setText("Nombre: " + personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerNombre() + "/   Tipo: " + personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerTipo());
            mostrarJugadorEnBatallaDatos.setText("Vida: " + personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerVida() + "/   Daño: " + personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerDaño());
        } catch (ListaElementosExcepcion ex) {
            mostrarJugadorEnBatalla.setText("Nombre: -----/   Tipo: -----");
            mostrarJugadorEnBatallaDatos.setText("Vida: --/   Daño: --");
        }
    }

    public void verificarLava() {
        int hayLava = 0;
        
        try {
            if ("lava".equals(casillaAnterior)) {
                personajesEnBatalla.obtenerContenido(indicePersonaje).aumentarOQuitarVida((int) -(personajesEnBatalla.obtenerContenido(indicePersonaje).obtenerVida() * 0.05));
                JOptionPane.showMessageDialog(this,"El Jugador esta sobre Lava pierde 5% de Vida","Lava",JOptionPane.ERROR_MESSAGE);
            }

            for (int i = 1; i <= casillasAnteriores.getLongitud(); i++) {
                if ("lava".equals(casillasAnteriores.obtenerContenido(i))) {
                    personajesEnemigos.obtenerContenido(i).aumentarOQuitarVida((int) -(personajesEnemigos.obtenerContenido(i).obtenerVida() * 0.05));          
                    hayLava++;
                }
            }
            
            if (hayLava == 1) {
                JOptionPane.showMessageDialog(this,"Un Enemigo esta sobre lava pierde 5% de Vida","Lava",JOptionPane.ERROR_MESSAGE);
            } else if (hayLava > 1){
                JOptionPane.showMessageDialog(this,"Hay Enemigos que estan sobre lava pierden 5% de Vida","Lava",JOptionPane.ERROR_MESSAGE);
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public int obtenerOro(){
        return oro;
    }

    public int obtenerPunteoEnBatalla() {
        return punteoJugador;
    }

    private int obtenerNumeroDeFila() {
        return (int) filaSeleccionada.getValue();
    }

    private int obtenerNumeroDeColumna() {
        return (int) columnaSeleccionada.getValue();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abajo;
    private javax.swing.JButton arriba;
    private javax.swing.JButton atacar;
    private javax.swing.JPanel batallaTablero;
    private javax.swing.JButton colocar;
    private javax.swing.JLabel columna;
    private javax.swing.JSpinner columnaSeleccionada;
    private javax.swing.JButton derecha;
    private javax.swing.JLabel fila;
    private javax.swing.JSpinner filaSeleccionada;
    private javax.swing.JButton guardarPartida;
    private javax.swing.JButton izquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel mostrarJugadorEnBatalla;
    private javax.swing.JLabel mostrarJugadorEnBatallaDatos;
    private javax.swing.JButton moverse;
    private javax.swing.JPanel panelBatalla;
    private javax.swing.JButton regresarAlMenuPrincipal;
    private javax.swing.JButton seleccionarPersonajes;
    // End of variables declaration//GEN-END:variables
}