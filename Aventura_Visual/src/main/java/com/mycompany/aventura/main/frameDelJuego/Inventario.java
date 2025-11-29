package com.mycompany.aventura.main.frameDelJuego;


import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.objetos.*;
import com.mycompany.aventura.main.personajes.*;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Inventario extends javax.swing.JDialog {

    private ListaElementos<JLabel> personajesJLabel = new ListaElementos<>();
    private ListaElementos<String> partidasGuardadas = new ListaElementos<>();
    private ListaElementos<JLabel> objetosJLabel = new ListaElementos<>();
    private ListaElementos<Personaje> personajesJugador;
    private ListaElementos<Objeto> objetosJugador;
    private int oro = 0;
            
    public Inventario(java.awt.Frame parent, ListaElementos<Personaje> personajesJugador, ListaElementos<Objeto> objetosJugador, ListaElementos<String> partidasGuardadas) {
        super(parent, true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.personajesJugador = personajesJugador;
        this.objetosJugador = objetosJugador;
        this.partidasGuardadas = partidasGuardadas;
        mostrarPersonajes();
        mostrarObjetos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelPersonajes = new javax.swing.JPanel();
        panelObjetos = new javax.swing.JPanel();
        vender = new javax.swing.JButton();
        regresarAlMenuPrincipal = new javax.swing.JButton();
        eliminarPersonaje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Inventario");

        panelPersonajes.setBorder(javax.swing.BorderFactory.createTitledBorder("Personajes"));

        javax.swing.GroupLayout panelPersonajesLayout = new javax.swing.GroupLayout(panelPersonajes);
        panelPersonajes.setLayout(panelPersonajesLayout);
        panelPersonajesLayout.setHorizontalGroup(
            panelPersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        panelPersonajesLayout.setVerticalGroup(
            panelPersonajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelObjetos.setBorder(javax.swing.BorderFactory.createTitledBorder("Objetos"));

        javax.swing.GroupLayout panelObjetosLayout = new javax.swing.GroupLayout(panelObjetos);
        panelObjetos.setLayout(panelObjetosLayout);
        panelObjetosLayout.setHorizontalGroup(
            panelObjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        panelObjetosLayout.setVerticalGroup(
            panelObjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        vender.setText("Vender");
        vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderActionPerformed(evt);
            }
        });

        regresarAlMenuPrincipal.setText("Regresar Al Menú Principal");
        regresarAlMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarAlMenuPrincipalActionPerformed(evt);
            }
        });

        eliminarPersonaje.setText("Eliminar Personajes");
        eliminarPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPersonajeActionPerformed(evt);
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
                        .addComponent(panelPersonajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(vender, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(panelObjetos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(regresarAlMenuPrincipal)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eliminarPersonaje)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(257, 257, 257))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPersonajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelObjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarPersonaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regresarAlMenuPrincipal)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderActionPerformed
        boolean haySemilla = false, hayElixix = false, hayCapa = false;
        int indiceSemilla = 0, indiceElixir = 0, indiceCapa = 0, contador = 0;
        
        if (partidasGuardadas.estaVacia()) {
            if (objetosJugador.estaVacia()) {
                JOptionPane.showMessageDialog(this,"No hay Objetos para Vender","Venta",JOptionPane.INFORMATION_MESSAGE);
            } else {
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
                                oro = objetosJugador.obtenerContenido(indiceSemilla).getPrecio();
                                objetosJugador.eliminar(indiceSemilla);
                                JOptionPane.showMessageDialog(this,"Se realizo la Venta se le reembolsaron " + oro + " de oro","Venta",JOptionPane.INFORMATION_MESSAGE);
                                salir = true;
                            } else {
                                JOptionPane.showMessageDialog(this,"No tienes Semilla de la Vida en tu Inventario, vuelve a Seleccionar","Semilla de la Vida",JOptionPane.ERROR_MESSAGE);
                            }
                        } else if (seleccion == 1) {
                            if (hayElixix) {
                                oro = objetosJugador.obtenerContenido(indiceElixir).getPrecio();
                                objetosJugador.eliminar(indiceElixir);
                                JOptionPane.showMessageDialog(this,"Se realizo la Venta se le reembolsaron " + oro + " de oro","Venta",JOptionPane.INFORMATION_MESSAGE);
                                salir = true;
                            } else {
                                JOptionPane.showMessageDialog(this,"No tienes Elixir Verde en tu Inventario, vuelve a Seleccionar","Semilla de la Vida",JOptionPane.ERROR_MESSAGE);
                            }
                        } else if (seleccion == 2) {
                            if (hayCapa) {
                                oro = objetosJugador.obtenerContenido(indiceCapa).getPrecio();
                                objetosJugador.eliminar(indiceCapa);
                                JOptionPane.showMessageDialog(this,"Se realizo la Venta se le reembolsaron " + oro + " de oro","Venta",JOptionPane.INFORMATION_MESSAGE);
                                salir = true;
                            } else {
                                JOptionPane.showMessageDialog(this,"No tienes Capa de Movilidad en tu Inventario, vuelve a Seleccionar","Semilla de la Vida",JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this,"Debes Seleccionar el Objeto que Desea Vender","Seleccionar",JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (ListaElementosExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null,"Solo puedes Eliminar Objetos si no tienes Partidas Guardas","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_venderActionPerformed

    private void regresarAlMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarAlMenuPrincipalActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarAlMenuPrincipalActionPerformed

    private void eliminarPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPersonajeActionPerformed
        boolean salir = false;
        
        if (partidasGuardadas.estaVacia()) {
            if (personajesJugador.getLongitud() > 2) {
                while (!salir) {
                    String respuesta = JOptionPane.showInputDialog("Escriba el Número del Personaje que desea Eliminar");

                    if ("".equals(respuesta) || respuesta == null) {
                        JOptionPane.showMessageDialog(null,"Debes Escribir el Número del Personaje a Eliminar","Escribe un Nombre",JOptionPane.ERROR_MESSAGE);
                    } else {
                        try {
                            int numero = Integer.parseInt(respuesta);

                            if (numero > 0 && numero <= personajesJugador.getLongitud()) {
                                try {
                                    JOptionPane.showMessageDialog(null,"Personaje Eliminado","Eliminación Completada",JOptionPane.INFORMATION_MESSAGE);
                                    personajesJugador.eliminar(numero);
                                    salir = true;
                                    this.dispose();
                                } catch (ListaElementosExcepcion ex) {
                                    System.out.println(ex.getMessage());
                                }
                            } else {
                                JOptionPane.showMessageDialog(null,"Número fuera de Rango","Error",JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null,"Debe Ingresar un Número","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null,"Debes tener al menos 2 Personajes para la Batalla","Error",JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Solo puedes Eliminar Personajes si no tienes Partidas Guardas","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarPersonajeActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void mostrarPersonajes() {
        
        if (personajesJugador.estaVacia()) {
            panelPersonajes.setLayout(new GridLayout(1,1));
            personajesJLabel.agregarALaLista(new JLabel(" (1) No tienes Personajes"));
            try {
                panelPersonajes.add(personajesJLabel.obtenerContenido(1));
            } catch (ListaElementosExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            panelPersonajes.setLayout(new GridLayout(personajesJugador.getLongitud(),1));

            for (int i = 1; i <= personajesJugador.getLongitud(); i++) {   
                try {
                    personajesJLabel.agregarALaLista(new JLabel("(" + i + ") " + personajesJugador.obtenerContenido(i).mostrarCaracteristicasDelPersonaje()));
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
                try {
                    panelPersonajes.add(personajesJLabel.obtenerContenido(i));
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        panelPersonajes.updateUI();
    }
    
    private void mostrarObjetos() {
        
        if (objetosJugador.estaVacia()) {
            panelObjetos.setLayout(new GridLayout(1,1));
            objetosJLabel.agregarALaLista(new JLabel(" (1) No tienes Objetos"));
            try {
                panelObjetos.add(objetosJLabel.obtenerContenido(1));
            } catch (ListaElementosExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            panelObjetos.setLayout(new GridLayout(objetosJugador.getLongitud(),1));

            for (int i = 1; i <= objetosJugador.getLongitud(); i++) {   
                try {
                    objetosJLabel.agregarALaLista(new JLabel("(" + i + ") " + objetosJugador.obtenerContenido(i).getNombre()));
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
                try {
                    panelObjetos.add(objetosJLabel.obtenerContenido(i));
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        panelObjetos.updateUI();
    }
    
    public int obtenerOro() {
        return oro;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminarPersonaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelObjetos;
    private javax.swing.JPanel panelPersonajes;
    private javax.swing.JButton regresarAlMenuPrincipal;
    private javax.swing.JButton vender;
    // End of variables declaration//GEN-END:variables
}
