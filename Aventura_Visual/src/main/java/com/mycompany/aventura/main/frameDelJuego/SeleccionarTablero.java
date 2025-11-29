package com.mycompany.aventura.main.frameDelJuego;


import com.mycompany.aventura.main.archivos.ArchivoDeTableros;
import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.personajes.*;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SeleccionarTablero extends javax.swing.JDialog {

    private ListaElementos<String> tablerosDisponibles = new ListaElementos<>();
    private ListaElementos<Personaje> personajesEnemigos = new ListaElementos<>();
    private boolean nivelesBloqueados = false, realizoSeleccion = false;
    
    public SeleccionarTablero(java.awt.Frame parent, ListaElementos<Personaje>personajesEnemigos) {
        super(parent, true);
        initComponents();
        this.personajesEnemigos = personajesEnemigos;
        this.setLocationRelativeTo(null);
        ArchivoDeTableros recibirTableros = new ArchivoDeTableros();
        recibirTableros.obtenerElNombreYDimensionesDeTodosLosTableros(tablerosDisponibles);
        ordenarTableros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelTablerosDisponibles = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        facil = new javax.swing.JButton();
        medio = new javax.swing.JButton();
        dificil = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        numeroDeTableroSeleccionado = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        generarTableros = new javax.swing.JButton();
        confirmarSeleccion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        mayores = new javax.swing.JButton();
        menores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Selección de Tablero y Nivel");

        panelTablerosDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Tableros Disponibles"));

        javax.swing.GroupLayout panelTablerosDisponiblesLayout = new javax.swing.GroupLayout(panelTablerosDisponibles);
        panelTablerosDisponibles.setLayout(panelTablerosDisponiblesLayout);
        panelTablerosDisponiblesLayout.setHorizontalGroup(
            panelTablerosDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );
        panelTablerosDisponiblesLayout.setVerticalGroup(
            panelTablerosDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Niveles"));

        facil.setText("Fácil");
        facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facilActionPerformed(evt);
            }
        });

        medio.setText("Medio");
        medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medioActionPerformed(evt);
            }
        });

        dificil.setText("Difícil");
        dificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificilActionPerformed(evt);
            }
        });

        jLabel4.setText("Seleccionar el Nivel a Jugar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(facil)
                    .addComponent(medio)
                    .addComponent(dificil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(facil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dificil)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccionar Tablero"));

        jLabel2.setText("Seleccione el Número del Tablero");

        jLabel3.setText("que desea Jugar:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(numeroDeTableroSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(numeroDeTableroSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        generarTableros.setText("Generar Tableros");
        generarTableros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarTablerosActionPerformed(evt);
            }
        });

        confirmarSeleccion.setText("Confirmar Selección");
        confirmarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarSeleccionActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordenar Tableros"));

        mayores.setText("Mayores");
        mayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayoresActionPerformed(evt);
            }
        });

        menores.setText("Menores");
        menores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(mayores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mayores)
                    .addComponent(menores))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTablerosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmarSeleccion))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(generarTableros)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generarTableros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(confirmarSeleccion))
                    .addComponent(panelTablerosDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilActionPerformed
        personajesEnemigos.agregarALaLista(new Ogro("Ogro"));
        personajesEnemigos.agregarALaLista(new Gargola("Gargola"));
        personajesEnemigos.agregarALaLista(new FlorCarnivora("Flor Carnivora"));
        cerrarAccesoALosNiveles();
    }//GEN-LAST:event_facilActionPerformed

    private void medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medioActionPerformed
        personajesEnemigos.agregarALaLista(new Ogro("Ogro"));
        personajesEnemigos.agregarALaLista(new Gargola("Gargola"));
        personajesEnemigos.agregarALaLista(new FlorCarnivora("Flor Carnivora"));
        personajesEnemigos.agregarALaLista(new Cancerbero("Cancerbero"));
        personajesEnemigos.agregarALaLista(new Bruja("Bruja"));
        cerrarAccesoALosNiveles();
    }//GEN-LAST:event_medioActionPerformed

    private void dificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificilActionPerformed
        personajesEnemigos.agregarALaLista(new Ogro("Ogro"));
        personajesEnemigos.agregarALaLista(new Ogro("Ogro"));
        personajesEnemigos.agregarALaLista(new Gargola("Gargola"));
        personajesEnemigos.agregarALaLista(new FlorCarnivora("Flor Carnivora"));
        personajesEnemigos.agregarALaLista(new FlorCarnivora("Flor Carnivora"));
        personajesEnemigos.agregarALaLista(new Cancerbero("Cancerbero"));
        personajesEnemigos.agregarALaLista(new Bruja("Bruja"));
        personajesEnemigos.agregarALaLista(new Bruja("Bruja"));
        cerrarAccesoALosNiveles();
    }//GEN-LAST:event_dificilActionPerformed

    private void mayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayoresActionPerformed
        mostrarTablerosDisponibles(2);
    }//GEN-LAST:event_mayoresActionPerformed

    private void menoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menoresActionPerformed
        mostrarTablerosDisponibles(1);
    }//GEN-LAST:event_menoresActionPerformed

    private void confirmarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarSeleccionActionPerformed
        try {
            if (!"No hay Tableros Disponibles".equals(tablerosDisponibles.obtenerContenido(1))) {
                if (obtenerNumeroDeTablero() >= 1 && obtenerNumeroDeTablero() <= tablerosDisponibles.getLongitud()) {
                    if (nivelesBloqueados) {
                        tablerosDisponibles.encontrarPorIndice(obtenerNumeroDeTablero());
                        realizoSeleccion = true;
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this,"Debes Seleccionar un Nivel","Error",JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    if (obtenerNumeroDeTablero() == 0) {
                        JOptionPane.showMessageDialog(this,"Debes Seleccionar un Tablero","Seleccionar Tablero",JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this,"Número fuera del Rango","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this,"Debe Cargar o Crear Tableros para poder Continuar","Error",JOptionPane.ERROR_MESSAGE);
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_confirmarSeleccionActionPerformed

    private void generarTablerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarTablerosActionPerformed
        GenerarTablero crear = new GenerarTablero(new javax.swing.JFrame());
        crear.setVisible(true);
        tablerosDisponibles = new ListaElementos<>();
        ArchivoDeTableros recibirTableros = new ArchivoDeTableros();
        recibirTableros.obtenerElNombreYDimensionesDeTodosLosTableros(tablerosDisponibles);
        
        try {
            if ("No hay Tableros Disponibles".equals(tablerosDisponibles.obtenerContenido(1))) {
                mostrarTablerosDisponibles(1);
            } else {
                ordenarTableros();
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_generarTablerosActionPerformed

    private void ordenarTableros() {
        try {
            for (int i = 2; i <= tablerosDisponibles.getLongitud(); i++) { 
                String nombreACambiar = tablerosDisponibles.obtenerContenido(i);
                String[] tableroAMover = tablerosDisponibles.obtenerContenido(i).split(" ");

                for (int j = i - 1; j > 0; j--) {
                    String[] tableroAnterior = tablerosDisponibles.obtenerContenido(j).split(" ");

                    String[] primerTablero = tableroAMover[1].split("X");
                    String[] segundoTablero = tableroAnterior[1].split("X");

                    int tamañoTableroAMover = Integer.parseInt(primerTablero[0]) * Integer.parseInt(primerTablero[1]);
                    int tamañoTableroAnterior = Integer.parseInt(segundoTablero[0]) * Integer.parseInt(segundoTablero[1]);

                    if (tamañoTableroAnterior > tamañoTableroAMover) {
                        tablerosDisponibles.encontrarPorIndice(j + 1).setContenido(tablerosDisponibles.obtenerContenido(j));
                        tablerosDisponibles.encontrarPorIndice(j).setContenido(nombreACambiar);
                    }
                }
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        mostrarTablerosDisponibles(1);
    }
    
    private void mostrarTablerosDisponibles(int modoDeMostrar) {
        ListaElementos<JLabel> tablerosDisponiblesJLabel = new ListaElementos<>();
        panelTablerosDisponibles.removeAll();
        panelTablerosDisponibles.setLayout(new GridLayout(tablerosDisponibles.getLongitud(),1));

        if (modoDeMostrar == 1) {
            try {
                for (int i = 1; i <= tablerosDisponibles.getLongitud(); i++) {
                    tablerosDisponiblesJLabel.agregarALaLista(new JLabel("(" + (i) + ").  " + tablerosDisponibles.obtenerContenido(i)));
                    panelTablerosDisponibles.add(tablerosDisponiblesJLabel.obtenerContenido(i));
                }
            } catch (ListaElementosExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            int indice = 1;
            try {
                for (int i = tablerosDisponibles.getLongitud(); i > 0; i--) {   
                    tablerosDisponiblesJLabel.agregarALaLista(new JLabel("(" + (i) + ").  " + tablerosDisponibles.obtenerContenido(i)));
                    panelTablerosDisponibles.add(tablerosDisponiblesJLabel.obtenerContenido(indice));
                    indice++;
                }
            } catch (ListaElementosExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
        panelTablerosDisponibles.updateUI();
    }
    
    private void cerrarAccesoALosNiveles() {
        facil.setEnabled(false);
        medio.setEnabled(false);
        dificil.setEnabled(false);
        nivelesBloqueados = true;
    }

    public String obtenerTableroAJugar() {
        try {
            if (obtenerNumeroDeTablero() >= 1 && obtenerNumeroDeTablero() <= tablerosDisponibles.getLongitud()) {
                return tablerosDisponibles.obtenerContenido(obtenerNumeroDeTablero());
            } else {
                return "Tablero";
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        return "Tablero";
    }
    
    public boolean realizoSeleccion() {
        return realizoSeleccion;
    }
    
    private int obtenerNumeroDeTablero() {
        return (int) numeroDeTableroSeleccionado.getValue();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarSeleccion;
    private javax.swing.JButton dificil;
    private javax.swing.JButton facil;
    private javax.swing.JButton generarTableros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton mayores;
    private javax.swing.JButton medio;
    private javax.swing.JButton menores;
    private javax.swing.JSpinner numeroDeTableroSeleccionado;
    private javax.swing.JPanel panelTablerosDisponibles;
    // End of variables declaration//GEN-END:variables
}
