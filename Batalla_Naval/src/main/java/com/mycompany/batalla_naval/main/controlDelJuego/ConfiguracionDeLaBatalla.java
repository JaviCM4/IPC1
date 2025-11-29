package com.mycompany.batalla_naval.main.controlDelJuego;

import com.mycompany.batalla_naval.main.archivos.RecibirTableros;
import com.mycompany.batalla_naval.main.bombas.*;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ConfiguracionDeLaBatalla extends javax.swing.JDialog {

    private boolean terminoSeleccion = false, seleccionoNivel = false, seleccionoTablero = false, juegoNuevo;
    private Bomba[] bombas;
    private int numeroDeIteraciones;
    private RecibirTableros recibir = new RecibirTableros();
    private String[] nombreDeTablerosRecibidos;
    private String tableroSeleccionado, path, nombre;
    private JLabel[] listaDeNombres;
    
    public ConfiguracionDeLaBatalla(java.awt.Frame parent, boolean juegoNuevo, String path) {
        super(parent,true);
        this.juegoNuevo = juegoNuevo;
        this.path = path;
        initComponents();
        this.setLocationRelativeTo(null);
        verificarModoDeJuego();
        visualizarTablero.setEnabled(false);
        volverASeleccionar.setEnabled(false);
        numeroDeTableroSeleccionado.setEnabled(false);
        SeleccionarTablero.setEnabled(false);
        nombreDelJugador.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Nivel_1 = new javax.swing.JButton();
        Nivel_2 = new javax.swing.JButton();
        Nivel_3 = new javax.swing.JButton();
        datosDelJugador = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombreDelJugador = new javax.swing.JTextField();
        tablero = new javax.swing.JPanel();
        SeleccionarTablero = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numeroDeTableroSeleccionado = new javax.swing.JSpinner();
        nombreDeLosTablerosActuales = new javax.swing.JPanel();
        visualizarTablero = new javax.swing.JButton();
        volverASeleccionar = new javax.swing.JButton();
        RegresarAlMenuPrincipal = new javax.swing.JButton();
        IniciarBatalla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo.setText("Configuración de la Batalla");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecciona un Nivel"));

        Nivel_1.setText("Nivel Principiante");
        Nivel_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nivel_1ActionPerformed(evt);
            }
        });

        Nivel_2.setText("Nivel Intermedio");
        Nivel_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nivel_2ActionPerformed(evt);
            }
        });

        Nivel_3.setText("Nivel Titán");
        Nivel_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nivel_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nivel_1)
                    .addComponent(Nivel_2)
                    .addComponent(Nivel_3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Nivel_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nivel_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nivel_3)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        datosDelJugador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));

        jLabel2.setText("Escriba su Nombre:");

        javax.swing.GroupLayout datosDelJugadorLayout = new javax.swing.GroupLayout(datosDelJugador);
        datosDelJugador.setLayout(datosDelJugadorLayout);
        datosDelJugadorLayout.setHorizontalGroup(
            datosDelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosDelJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosDelJugadorLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(nombreDelJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        datosDelJugadorLayout.setVerticalGroup(
            datosDelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosDelJugadorLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreDelJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        tablero.setBorder(javax.swing.BorderFactory.createTitledBorder("Tableros"));

        SeleccionarTablero.setText("Seleccionar Tablero");
        SeleccionarTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarTableroActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione el Número del Tablero que desea Jugar:");

        javax.swing.GroupLayout nombreDeLosTablerosActualesLayout = new javax.swing.GroupLayout(nombreDeLosTablerosActuales);
        nombreDeLosTablerosActuales.setLayout(nombreDeLosTablerosActualesLayout);
        nombreDeLosTablerosActualesLayout.setHorizontalGroup(
            nombreDeLosTablerosActualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        nombreDeLosTablerosActualesLayout.setVerticalGroup(
            nombreDeLosTablerosActualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        visualizarTablero.setText("Visualizar Tablero");
        visualizarTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarTableroActionPerformed(evt);
            }
        });

        volverASeleccionar.setText("Volver a Seleccionar");
        volverASeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverASeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tableroLayout = new javax.swing.GroupLayout(tablero);
        tablero.setLayout(tableroLayout);
        tableroLayout.setHorizontalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreDeLosTablerosActuales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableroLayout.createSequentialGroup()
                        .addComponent(numeroDeTableroSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SeleccionarTablero))
                    .addGroup(tableroLayout.createSequentialGroup()
                        .addGroup(tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(volverASeleccionar)
                            .addComponent(visualizarTablero))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tableroLayout.setVerticalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreDeLosTablerosActuales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroDeTableroSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeleccionarTablero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(visualizarTablero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volverASeleccionar)
                .addContainerGap())
        );

        RegresarAlMenuPrincipal.setText("Regresar al Menú Principal");
        RegresarAlMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarAlMenuPrincipalActionPerformed(evt);
            }
        });

        IniciarBatalla.setText("Iniciar Batalla");
        IniciarBatalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarBatallaActionPerformed(evt);
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
                        .addComponent(tablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(datosDelJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(IniciarBatalla, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Titulo)
                                .addGap(127, 127, 127))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(RegresarAlMenuPrincipal)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datosDelJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IniciarBatalla)
                        .addGap(0, 111, Short.MAX_VALUE))
                    .addComponent(tablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegresarAlMenuPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nivel_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nivel_1ActionPerformed
        crearInventario(1);
        nombreDeTablerosRecibidos = recibir.obtenerNombreDeTablerosEspecificos(0,36,path);
        
        if (visualizarTableros()) {
            bloquearSeleccionDeNiveles(false);
            seleccionoNivel = true;
            visualizarTablero.setEnabled(true);
            volverASeleccionar.setEnabled(true);
            numeroDeTableroSeleccionado.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this,"No hay Tableros con esas Dimensiones","Tablero",JOptionPane.INFORMATION_MESSAGE);
            bloquearSeleccionDeNiveles(true);
        }
    }//GEN-LAST:event_Nivel_1ActionPerformed

    private void Nivel_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nivel_2ActionPerformed
        crearInventario(2);
        nombreDeTablerosRecibidos = recibir.obtenerNombreDeTablerosEspecificos(36,64,path);
        if (visualizarTableros()) {
            bloquearSeleccionDeNiveles(false);
            seleccionoNivel = true;
            visualizarTablero.setEnabled(true);
            volverASeleccionar.setEnabled(true);
            numeroDeTableroSeleccionado.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this,"No hay Tableros con esas Dimensiones","Tablero",JOptionPane.INFORMATION_MESSAGE);
            bloquearSeleccionDeNiveles(true);
        }
    }//GEN-LAST:event_Nivel_2ActionPerformed

    private void Nivel_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nivel_3ActionPerformed
        crearInventario(3);
        nombreDeTablerosRecibidos = recibir.obtenerNombreDeTablerosEspecificos(64,400,path);
        if (visualizarTableros()) {
            bloquearSeleccionDeNiveles(false);
            seleccionoNivel = true;
            visualizarTablero.setEnabled(true);
            volverASeleccionar.setEnabled(true);
            numeroDeTableroSeleccionado.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this,"No hay Tableros con esas Dimensiones, vuelve a Seleccionar","Tablero",JOptionPane.INFORMATION_MESSAGE);
            bloquearSeleccionDeNiveles(true);
        }
    }//GEN-LAST:event_Nivel_3ActionPerformed

    private void RegresarAlMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarAlMenuPrincipalActionPerformed
        terminoSeleccion = false;
        this.dispose();
    }//GEN-LAST:event_RegresarAlMenuPrincipalActionPerformed

    private void SeleccionarTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarTableroActionPerformed
        if (obtenerNumeroDeTablero() >= 1 && obtenerNumeroDeTablero() <= numeroDeIteraciones) {
            tableroSeleccionado = nombreDeTablerosRecibidos[obtenerNumeroDeTablero() - 1];
            mostrarTableroAJugar();
            SeleccionarTablero.setEnabled(false);
            volverASeleccionar.setEnabled(false);
            seleccionoTablero = true;
            nombreDelJugador.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this,"Número fuera del Rango","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SeleccionarTableroActionPerformed

    private void IniciarBatallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarBatallaActionPerformed
        if (!seleccionoNivel) {
            JOptionPane.showMessageDialog(this,"Debes seleccionar un Nivel para Jugar","Nivel",JOptionPane.INFORMATION_MESSAGE);
        } else {       
            if (!seleccionoTablero) {
                JOptionPane.showMessageDialog(this,"Debes seleccionar un Tablero de Juego","Tablero",JOptionPane.INFORMATION_MESSAGE);
            } else { 
                if (juegoNuevo) {
                    if ("".equals(obtenerNombre())) {
                        JOptionPane.showMessageDialog(this,"Debes escribir tu Nombre de Usuario","Nombre",JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        String[] cadena = obtenerNombre().split("");
                        nombre = "";
                        
                        for (int i = 0; i < cadena.length; i++) {                           
                            if (!" ".equals(cadena[i])) {
                                nombre += cadena[i];
                            }
                        }
                        
                        if ("".equals(nombre)) {
                            nombre = "Jugador";
                        }
                        terminoSeleccion = true;
                        this.dispose();
                    }
                } else {
                    terminoSeleccion = true;
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_IniciarBatallaActionPerformed

    private void visualizarTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarTableroActionPerformed
        if (obtenerNumeroDeTablero() >= 1 && obtenerNumeroDeTablero() <= numeroDeIteraciones) {
            tableroSeleccionado = nombreDeTablerosRecibidos[obtenerNumeroDeTablero() - 1];
            mostrarTableroAJugar();
            SeleccionarTablero.setEnabled(true);
            visualizarTablero.setEnabled(false);
            numeroDeTableroSeleccionado.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this,"Número fuera del Rango","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_visualizarTableroActionPerformed

    private void volverASeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverASeleccionarActionPerformed
        nombreDeLosTablerosActuales.removeAll();
        nombreDeLosTablerosActuales.repaint();
        visualizarTablero.setEnabled(false);
        volverASeleccionar.setEnabled(false);
        numeroDeTableroSeleccionado.setEnabled(false);
        SeleccionarTablero.setEnabled(false);
        nombreDelJugador.setEnabled(false);
        bloquearSeleccionDeNiveles(true);
    }//GEN-LAST:event_volverASeleccionarActionPerformed
    
    public boolean visualizarTableros() {
        if (!"-----".equals(nombreDeTablerosRecibidos[0])) {
            numeroDeIteraciones = nombreDeTablerosRecibidos.length;
            listaDeNombres = new JLabel[numeroDeIteraciones];
            nombreDeLosTablerosActuales.setLayout(new GridLayout(numeroDeIteraciones,1));
            
            nombreDeLosTablerosActuales.removeAll();
            for (int i = 0; i < numeroDeIteraciones; i++) {   
                listaDeNombres[i] = new JLabel("(" + (i + 1) + ").  " + nombreDeTablerosRecibidos[i]);
                nombreDeLosTablerosActuales.add(listaDeNombres[i]);
            }
            nombreDeLosTablerosActuales.updateUI();
            return true;
        } else {
            return false;
        }
    }
    
    public void crearInventario(int nivel) {
        int numeroDeBombasNormales;
        int numeroDeBombasEspeciales;
        
        if (nivel == 1) {
            bombas =  new Bomba[22];
            numeroDeBombasNormales = 10;
            numeroDeBombasEspeciales = 4;
        } else if (nivel == 2) {
            bombas =  new Bomba[18];
            numeroDeBombasNormales = 9;
            numeroDeBombasEspeciales = 3;
        } else {
            bombas =  new Bomba[11];
            numeroDeBombasNormales = 5;
            numeroDeBombasEspeciales = 2;
        }
        
        for (int i = 0; i < numeroDeBombasNormales; i++) {
            bombas[i] = new Normal();
        }
        for (int i = numeroDeBombasNormales; i < numeroDeBombasNormales + numeroDeBombasEspeciales; i++) {
            bombas[i] = new Torpedo();
        }
        numeroDeBombasNormales = numeroDeBombasNormales + numeroDeBombasEspeciales;
        
        for (int i = numeroDeBombasNormales; i < numeroDeBombasNormales + numeroDeBombasEspeciales; i++) {
            bombas[i] = new Misil();
        }
        numeroDeBombasNormales = numeroDeBombasNormales + numeroDeBombasEspeciales;
        
        for (int i = numeroDeBombasNormales; i < numeroDeBombasNormales + numeroDeBombasEspeciales; i++) {
            bombas[i] = new Hecatombe();
        }
    }
    
    public void bloquearSeleccionDeNiveles(boolean estado) {
        Nivel_1.setEnabled(estado);
        Nivel_2.setEnabled(estado);
        Nivel_3.setEnabled(estado);
    }
    
    public void verificarModoDeJuego() {
        if (!juegoNuevo) {
            datosDelJugador.setVisible(false);
        }
    }
    
    public String obtenerNombre() {
        return String.valueOf(nombreDelJugador.getText());
    }
    
    public int obtenerNumeroDeTablero() {
        return (int) numeroDeTableroSeleccionado.getValue();
    }
    
    public String recibirNombre() {
        return nombre;
    }
    
    public Bomba[] mandarBombas() {
        return bombas;
    }
    
    public boolean terminoSeleccionDelJuego() {
        return terminoSeleccion;
    }
    
    public String mandarTableroAJugar() {
        return tableroSeleccionado;
    }
    
    public void mostrarTableroAJugar() {
        RecibirTableros buscar = new RecibirTableros();
        String[][] tableroAJugar = buscar.obtenerTablero(tableroSeleccionado, path);
        int contadorDeBombasMisiles = 0, contadorDeBombasTorpedo = 0, contadorDeBombasHecatombe = 0, contadorBarcos = 0;
        
        for (int i = 0; i < tableroAJugar.length; i++) {
            for (int j = 0; j < tableroAJugar[0].length; j++) {
                if ("I".equals(tableroAJugar[i][j])) {
                    contadorDeBombasMisiles++;
                } else if ("T".equals(tableroAJugar[i][j])) {
                    contadorDeBombasTorpedo++;
                } else if ("O".equals(tableroAJugar[i][j])) {
                    contadorDeBombasHecatombe++;
                } else if ("B1".equals(tableroAJugar[i][j]) || "B2".equals(tableroAJugar[i][j]) || "B3".equals(tableroAJugar[i][j])) {
                    contadorBarcos++;
                }
            }
        }
        
        String[] tableroAMostrar = new String[tableroAJugar.length + 6];   
        
        String[] partesDelNombre = tableroSeleccionado.split(" ");
        tableroAMostrar[0] = "Tablero " + partesDelNombre[0];
        tableroAMostrar[1] = "Dimensiones " + partesDelNombre[1];
        
        for (int i = 2; i < tableroAMostrar.length - 4; i++) {
            String cadena = "";
            
            for (int j = 0; j < tableroAJugar[0].length; j++) {
                if (j < (tableroAJugar[0].length - 1)) {
                    cadena = cadena + "X,";
                } else {
                    cadena = cadena + "X";
                }
            }
            tableroAMostrar[i] = cadena;
        }
        
        tableroAMostrar[tableroAMostrar.length - 4] = "Barcos: " + contadorBarcos;
        tableroAMostrar[tableroAMostrar.length - 3] = "Torpedo: " + contadorDeBombasTorpedo;
        tableroAMostrar[tableroAMostrar.length - 2] = "Misil: " + contadorDeBombasMisiles;
        tableroAMostrar[tableroAMostrar.length - 1] = "Hecatombe: " + contadorDeBombasHecatombe;
       
        nombreDeLosTablerosActuales.removeAll();
        JLabel[] caracteristicaDelTablero = new JLabel[tableroAMostrar.length];
        numeroDeIteraciones = caracteristicaDelTablero.length;
        nombreDeLosTablerosActuales.setLayout(new GridLayout(numeroDeIteraciones,1));
            
        for (int i = 0; i < numeroDeIteraciones; i++) {   
            caracteristicaDelTablero[i] = new JLabel(tableroAMostrar[i]);
            nombreDeLosTablerosActuales.add(caracteristicaDelTablero[i]);
        }
        nombreDeLosTablerosActuales.updateUI();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IniciarBatalla;
    private javax.swing.JButton Nivel_1;
    private javax.swing.JButton Nivel_2;
    private javax.swing.JButton Nivel_3;
    private javax.swing.JButton RegresarAlMenuPrincipal;
    private javax.swing.JButton SeleccionarTablero;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel datosDelJugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel nombreDeLosTablerosActuales;
    private javax.swing.JTextField nombreDelJugador;
    private javax.swing.JSpinner numeroDeTableroSeleccionado;
    private javax.swing.JPanel tablero;
    private javax.swing.JButton visualizarTablero;
    private javax.swing.JButton volverASeleccionar;
    // End of variables declaration//GEN-END:variables
}
