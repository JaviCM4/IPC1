package com.mycompany.aventura.main.frameDelJuego;


import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.objetos.Objeto;
import com.mycompany.aventura.main.personajes.Personaje;
import com.mycompany.aventura.main.tienda.Tienda;
import javax.swing.JOptionPane;

public class TiendaFrame extends javax.swing.JDialog {

    private int tipoDeTienda, oro, suma, numeroDePersonajesObligatorios = 0;
    private ListaElementos<Personaje> personajesJugador;
    private ListaElementos<Objeto> objetosJugador;
    private boolean hayRestriccionDePersonjes, realizoCompra = false;
    
    public TiendaFrame(java.awt.Frame parent, int tipoDeTienda, int oro, ListaElementos<Personaje> personajesJugador, ListaElementos<Objeto> objetosJugador) {
        super(parent, true);
        initComponents();
        this.setTitle("Tienda");
        this.setLocationRelativeTo(null);
        this.tipoDeTienda = tipoDeTienda;
        this.oro = oro;
        this.personajesJugador = personajesJugador;
        this.objetosJugador = objetosJugador;
        mostrarTipoDeTienda();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloTienda = new javax.swing.JLabel();
        panelDePersonajes = new javax.swing.JPanel();
        personaje_1 = new javax.swing.JCheckBox();
        personaje_2 = new javax.swing.JCheckBox();
        personaje_3 = new javax.swing.JCheckBox();
        personaje_4 = new javax.swing.JCheckBox();
        personaje_5 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        recomendacion = new javax.swing.JLabel();
        regresarAlMenuPrincipal = new javax.swing.JButton();
        comprar = new javax.swing.JButton();
        panelDeObjetos = new javax.swing.JPanel();
        objeto_1 = new javax.swing.JCheckBox();
        objeto_2 = new javax.swing.JCheckBox();
        objeto_3 = new javax.swing.JCheckBox();
        panelDeMejoras = new javax.swing.JPanel();
        mejora_1 = new javax.swing.JCheckBox();
        mejora_2 = new javax.swing.JCheckBox();
        mejora_3 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloTienda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloTienda.setText("Tienda");

        panelDePersonajes.setBorder(javax.swing.BorderFactory.createTitledBorder("Personajes"));

        personaje_1.setText("Caballero");
        personaje_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personaje_1ActionPerformed(evt);
            }
        });

        personaje_2.setText("Arquero");
        personaje_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personaje_2ActionPerformed(evt);
            }
        });

        personaje_3.setText("Mago");
        personaje_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personaje_3ActionPerformed(evt);
            }
        });

        personaje_4.setText("Gigante");
        personaje_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personaje_4ActionPerformed(evt);
            }
        });

        personaje_5.setText("Dragón");
        personaje_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personaje_5ActionPerformed(evt);
            }
        });

        jLabel2.setText("(200 de Oro c/u)");

        recomendacion.setText("Debe Seleccionar dos Personajes:");

        javax.swing.GroupLayout panelDePersonajesLayout = new javax.swing.GroupLayout(panelDePersonajes);
        panelDePersonajes.setLayout(panelDePersonajesLayout);
        panelDePersonajesLayout.setHorizontalGroup(
            panelDePersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDePersonajesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDePersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recomendacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDePersonajesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(panelDePersonajesLayout.createSequentialGroup()
                        .addGroup(panelDePersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personaje_1)
                            .addComponent(personaje_2)
                            .addComponent(personaje_3)
                            .addComponent(personaje_4)
                            .addComponent(personaje_5))
                        .addGap(0, 106, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDePersonajesLayout.setVerticalGroup(
            panelDePersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDePersonajesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recomendacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personaje_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personaje_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personaje_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personaje_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personaje_5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        regresarAlMenuPrincipal.setText("Regresar Al Menú Principal");
        regresarAlMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarAlMenuPrincipalActionPerformed(evt);
            }
        });

        comprar.setText("Comprar y Seguir");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });

        panelDeObjetos.setBorder(javax.swing.BorderFactory.createTitledBorder("Objetos"));

        objeto_1.setText("Semilla de la Vida (50 de Oro)");
        objeto_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objeto_1ActionPerformed(evt);
            }
        });

        objeto_2.setText("Elixir Verde (25 de Oro)");
        objeto_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objeto_2ActionPerformed(evt);
            }
        });

        objeto_3.setText("Capa de Movilidad (75 de Oro)");
        objeto_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objeto_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDeObjetosLayout = new javax.swing.GroupLayout(panelDeObjetos);
        panelDeObjetos.setLayout(panelDeObjetosLayout);
        panelDeObjetosLayout.setHorizontalGroup(
            panelDeObjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeObjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDeObjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(objeto_1)
                    .addComponent(objeto_2)
                    .addComponent(objeto_3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDeObjetosLayout.setVerticalGroup(
            panelDeObjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeObjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(objeto_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(objeto_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(objeto_3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDeMejoras.setBorder(javax.swing.BorderFactory.createTitledBorder("Mejoras"));

        mejora_1.setText("Vida (80 de Oro)");
        mejora_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mejora_1ActionPerformed(evt);
            }
        });

        mejora_2.setText("Daño (125 de Oro)");
        mejora_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mejora_2ActionPerformed(evt);
            }
        });

        mejora_3.setText("Movilidad (500 de Oro)");
        mejora_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mejora_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDeMejorasLayout = new javax.swing.GroupLayout(panelDeMejoras);
        panelDeMejoras.setLayout(panelDeMejorasLayout);
        panelDeMejorasLayout.setHorizontalGroup(
            panelDeMejorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeMejorasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDeMejorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mejora_1)
                    .addComponent(mejora_2)
                    .addComponent(mejora_3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDeMejorasLayout.setVerticalGroup(
            panelDeMejorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeMejorasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mejora_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mejora_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mejora_3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regresarAlMenuPrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(comprar))
                    .addComponent(panelDeMejoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelDePersonajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDeObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(tituloTienda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloTienda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDePersonajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDeObjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDeMejoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresarAlMenuPrincipal)
                    .addComponent(comprar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personaje_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personaje_1ActionPerformed
        if (hayRestriccionDePersonjes) {
            if (personaje_1.isSelected()) {
                realizarRestriccion(-1);
            } else {
                realizarRestriccion(1);
            }
        } else {
            personaje_1.setEnabled(false);
        }
    }//GEN-LAST:event_personaje_1ActionPerformed

    private void personaje_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personaje_2ActionPerformed
        if (hayRestriccionDePersonjes) {
            if (personaje_2.isSelected()) {
                realizarRestriccion(-1);
            } else {
                realizarRestriccion(1);
            }
        } else {
            personaje_2.setEnabled(false);
        }
    }//GEN-LAST:event_personaje_2ActionPerformed

    private void personaje_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personaje_3ActionPerformed
        if (hayRestriccionDePersonjes) {
            if (personaje_3.isSelected()) {
                realizarRestriccion(-1);
            } else {
                realizarRestriccion(1);
            }
        } else {
            personaje_3.setEnabled(false);
        }
    }//GEN-LAST:event_personaje_3ActionPerformed

    private void personaje_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personaje_4ActionPerformed
        if (hayRestriccionDePersonjes) {
            if (personaje_4.isSelected()) {
                realizarRestriccion(-1);
            } else {
                realizarRestriccion(1);
            }
        } else {
            personaje_4.setEnabled(false);
        }
    }//GEN-LAST:event_personaje_4ActionPerformed

    private void personaje_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personaje_5ActionPerformed
        if (hayRestriccionDePersonjes) {
            if (personaje_5.isSelected()) {
                realizarRestriccion(-1);
            } else {
                realizarRestriccion(1);
            }
        } else {
            personaje_5.setEnabled(false);
        }
    }//GEN-LAST:event_personaje_5ActionPerformed

    private void objeto_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objeto_1ActionPerformed
        objeto_1.setEnabled(false);
    }//GEN-LAST:event_objeto_1ActionPerformed

    private void objeto_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objeto_2ActionPerformed
        objeto_2.setEnabled(false);
    }//GEN-LAST:event_objeto_2ActionPerformed

    private void objeto_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objeto_3ActionPerformed
        objeto_3.setEnabled(false);
    }//GEN-LAST:event_objeto_3ActionPerformed

    private void mejora_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mejora_1ActionPerformed
        mejora_1.setEnabled(false);
    }//GEN-LAST:event_mejora_1ActionPerformed

    private void mejora_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mejora_2ActionPerformed
        mejora_2.setEnabled(false);
    }//GEN-LAST:event_mejora_2ActionPerformed

    private void mejora_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mejora_3ActionPerformed
        mejora_3.setEnabled(false);
    }//GEN-LAST:event_mejora_3ActionPerformed

    @SuppressWarnings("unchecked")
    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        if (hayRestriccionDePersonjes) {
            int contadorDeCompra = 0;
            
            if (personaje_1.isSelected()) {
                contadorDeCompra++;
            }   
            if (personaje_2.isSelected()) {
                contadorDeCompra++;
            }       
            if (personaje_3.isSelected()) {
                contadorDeCompra++;
            } 
            if (personaje_4.isSelected()) {
                contadorDeCompra++;
            }
            if (personaje_5.isSelected()) {
                contadorDeCompra++;
            } 
            
            if (contadorDeCompra == 2) {
                if (verificarMontoAPagar()) {
                    Tienda realizarCompra = new Tienda();

                    if (personaje_1.isSelected()) {
                        realizarCompra.comprarPersonajes(1, verificarNombre(), personajesJugador);
                    }   
                    if (personaje_2.isSelected()) {
                        realizarCompra.comprarPersonajes(2, verificarNombre(), personajesJugador);
                    }       
                    if (personaje_3.isSelected()) {
                        realizarCompra.comprarPersonajes(3, verificarNombre(), personajesJugador);
                    } 
                    if (personaje_4.isSelected()) {
                        realizarCompra.comprarPersonajes(4, verificarNombre(), personajesJugador);
                    }
                    if (personaje_5.isSelected()) {
                        realizarCompra.comprarPersonajes(5, verificarNombre(), personajesJugador);
                    } 
                    if (objeto_1.isSelected()) {
                        realizarCompra.comprarObjetos(1, objetosJugador);
                    }
                    if (objeto_2.isSelected()) {
                        realizarCompra.comprarObjetos(2, objetosJugador);
                    }
                    if (objeto_3.isSelected()) {
                        realizarCompra.comprarObjetos(3, objetosJugador);
                    }
                    if (mejora_1.isSelected()) {
                        realizarCompra.comprarMejoras(1, personajesJugador);
                    }
                    if (mejora_2.isSelected()) {
                        realizarCompra.comprarMejoras(2, personajesJugador);
                    }
                    if (mejora_3.isSelected()) {
                        realizarCompra.comprarMejoras(3, personajesJugador);
                    }
                    oro -= suma;
                    realizoCompra = true;
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "No tienes suficiente Oro, debe quitar cosas de la Lista", "Falta de Oro", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(this, "Tu Compra sobrepasa por " + (suma - oro) + " tu Presupuesto de " + oro + " de Oro", "Falta de Oro", JOptionPane.INFORMATION_MESSAGE);
                    abrirTodosLosAccesos();
                }
            }  else {
                JOptionPane.showMessageDialog(this, "Debes Seleccionar dos Personajes de la Tienda", "Seleccionar", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            if (verificarMontoAPagar()) {
                Tienda realizarCompra = new Tienda();

                if (personaje_1.isSelected()) {
                    realizarCompra.comprarPersonajes(1, verificarNombre(), personajesJugador);
                }   
                if (personaje_2.isSelected()) {
                    realizarCompra.comprarPersonajes(2, verificarNombre(), personajesJugador);
                }       
                if (personaje_3.isSelected()) {
                    realizarCompra.comprarPersonajes(3, verificarNombre(), personajesJugador);
                } 
                if (personaje_4.isSelected()) {
                    realizarCompra.comprarPersonajes(4, verificarNombre(), personajesJugador);
                }
                if (personaje_5.isSelected()) {
                    realizarCompra.comprarPersonajes(5, verificarNombre(), personajesJugador);
                } 
                if (objeto_1.isSelected()) {
                    realizarCompra.comprarObjetos(1, objetosJugador);
                }
                if (objeto_2.isSelected()) {
                    realizarCompra.comprarObjetos(2, objetosJugador);
                }
                if (objeto_3.isSelected()) {
                    realizarCompra.comprarObjetos(3, objetosJugador);
                }
                if (mejora_1.isSelected()) {
                    realizarCompra.comprarMejoras(1, personajesJugador);
                }
                if (mejora_2.isSelected()) {
                    realizarCompra.comprarMejoras(2, personajesJugador);
                }
                if (mejora_3.isSelected()) {
                    realizarCompra.comprarMejoras(3, personajesJugador);
                }
                oro -= suma;
                realizoCompra = true;
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "No tienes suficiente Oro, debe quitar cosas de la Lista", "Falta de Oro", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(this, "Tu Compra sobrepasa por " + (suma - oro) + " tu Presupuesto de " + oro + " de Oro", "Falta de Oro", JOptionPane.INFORMATION_MESSAGE);
                abrirTodosLosAccesos();
            }
        }
    }//GEN-LAST:event_comprarActionPerformed

    private void regresarAlMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarAlMenuPrincipalActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarAlMenuPrincipalActionPerformed
    
    private void mostrarTipoDeTienda() {
        if (tipoDeTienda == 1) {
            recomendacion.setText("Debe Seleccionar dos Personajes:");
            panelDeMejoras.setVisible(false);
            hayRestriccionDePersonjes = true;
            numeroDePersonajesObligatorios = 2;
            regresarAlMenuPrincipal.setVisible(false);
        } else if (tipoDeTienda == 2) {
            recomendacion.setText("Compra los Personajes que Quieras:");
            panelDeMejoras.setVisible(false);
            hayRestriccionDePersonjes = false;
            regresarAlMenuPrincipal.setVisible(false);
        } else {            
            recomendacion.setText("Compra los Personajes que Quieras:");
            hayRestriccionDePersonjes = false;
        }
    }
         
    private void realizarRestriccion(int condicion) {
        numeroDePersonajesObligatorios += condicion;

        if (numeroDePersonajesObligatorios == 0) {
            cerrarAccesoPersonajes();
        }
    }
        
    private void cerrarAccesoPersonajes() {
        personaje_1.setEnabled(false);
        personaje_2.setEnabled(false);
        personaje_3.setEnabled(false);
        personaje_4.setEnabled(false);
        personaje_5.setEnabled(false);
    }
    
    private boolean verificarMontoAPagar() {
        suma = 0;      

        if (personaje_1.isSelected()) {
            suma += 200;
        }   
        if (personaje_2.isSelected()) {
            suma += 200;
        }       
        if (personaje_3.isSelected()) {
            suma += 200;
        } 
        if (personaje_4.isSelected()) {
            suma += 200;
        }
        if (personaje_5.isSelected()) {
            suma += 200;
        } 
        if (objeto_1.isSelected()) {
            suma += 50;
        }
        if (objeto_2.isSelected()) {
            suma += 25;
        }
        if (objeto_3.isSelected()) {
            suma += 75;
        }
        if (mejora_1.isSelected()) {
            suma += 80;
        }
        if (mejora_2.isSelected()) {
            suma += 125;
        }
        if (mejora_3.isSelected()) {
            suma += 500;
        }
        return oro >= suma;
    }
    
    private void abrirTodosLosAccesos() {
        personaje_1.setEnabled(true);
        personaje_2.setEnabled(true);
        personaje_3.setEnabled(true);
        personaje_4.setEnabled(true);
        personaje_5.setEnabled(true);
        objeto_1.setEnabled(true);
        objeto_2.setEnabled(true);
        objeto_3.setEnabled(true);
        mejora_1.setEnabled(true);
        mejora_2.setEnabled(true);
        mejora_3.setEnabled(true);
    }
    
    public String verificarNombre() {
        String respuesta = null;
        int longitud = personajesJugador.getLongitud();
        boolean nombreCorrecto = false;
        
        while (!nombreCorrecto) {
            respuesta = JOptionPane.showInputDialog("Escribe el Nombre del Personaje");
            
            if (respuesta == null || "".equals(respuesta)) {
                respuesta = "Personaje " + (longitud + 1);
                nombreCorrecto = true;
            } else {
                longitud = personajesJugador.getLongitud();

                if (longitud != 0) {
                    for (int i = 1; i <= longitud; i++) {
                        Personaje contenido = null;

                        try {
                            contenido = personajesJugador.obtenerContenido(i);

                            if (contenido.obtenerNombre().equals(respuesta)) {
                                JOptionPane.showMessageDialog(this, "Ya tienes un Personaje con este Nombre, vuelve a Intentarlo", "Nombre Repetido", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                nombreCorrecto = true;
                                break;
                            }                          
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                } else {
                    nombreCorrecto = true;
                }
            }
        }
        return respuesta;
    }
    
    public boolean realizoCompra() {
        return realizoCompra;
    }
    
    public int obtenerOro() {
        return oro;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JCheckBox mejora_1;
    private javax.swing.JCheckBox mejora_2;
    private javax.swing.JCheckBox mejora_3;
    private javax.swing.JCheckBox objeto_1;
    private javax.swing.JCheckBox objeto_2;
    private javax.swing.JCheckBox objeto_3;
    private javax.swing.JPanel panelDeMejoras;
    private javax.swing.JPanel panelDeObjetos;
    private javax.swing.JPanel panelDePersonajes;
    private javax.swing.JCheckBox personaje_1;
    private javax.swing.JCheckBox personaje_2;
    private javax.swing.JCheckBox personaje_3;
    private javax.swing.JCheckBox personaje_4;
    private javax.swing.JCheckBox personaje_5;
    private javax.swing.JLabel recomendacion;
    private javax.swing.JButton regresarAlMenuPrincipal;
    private javax.swing.JLabel tituloTienda;
    // End of variables declaration//GEN-END:variables
}
