package com.mycompany.aventura.main.frameDelJuego;


import com.mycompany.aventura.main.archivos.ArchivoDeTableros;
import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.tablero.Tablero;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GenerarTablero extends javax.swing.JDialog {
    
    private ListaElementos<String> tableroAMostrar = new ListaElementos<>();
    
    public GenerarTablero(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        this.setLocationRelativeTo(null);
        abrirOCerrarCreacionDeTablero(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cargarTableros = new javax.swing.JButton();
        crearTableroNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        filasNombre = new javax.swing.JLabel();
        columnasNombre = new javax.swing.JLabel();
        riosNombre = new javax.swing.JLabel();
        numeroDeFilas = new javax.swing.JSpinner();
        numeroDeColumnas = new javax.swing.JSpinner();
        numeroDeRios = new javax.swing.JSpinner();
        arbolesNombre = new javax.swing.JLabel();
        numeroDeArboles = new javax.swing.JSpinner();
        lavaNombre = new javax.swing.JLabel();
        numeroDeLava = new javax.swing.JSpinner();
        guardar = new javax.swing.JButton();
        visualizar = new javax.swing.JButton();
        recomendacion = new javax.swing.JLabel();
        regresarAlMenuPrincipal = new javax.swing.JButton();
        panelTableroCreado = new javax.swing.JPanel();
        panelVisualizadorDeTablero = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        cargarTableros.setText("Cargar Tableros");
        cargarTableros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarTablerosActionPerformed(evt);
            }
        });

        crearTableroNuevo.setText("Crear Tablero Nuevo");
        crearTableroNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTableroNuevoActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione una de las siguientes Opciones:");

        filasNombre.setText("Filas:");

        columnasNombre.setText("Columnas:");

        riosNombre.setText("Número de Rios:");

        arbolesNombre.setText("Número de Arboles:");

        lavaNombre.setText("Número de Lava:");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        visualizar.setText("Visualizar");
        visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarActionPerformed(evt);
            }
        });

        recomendacion.setText("Recuerde que cada Río tendra una longitud de 3 Casillas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(visualizar)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recomendacion)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(riosNombre)
                                .addGap(24, 24, 24)
                                .addComponent(numeroDeRios, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lavaNombre)
                                    .addGap(22, 22, 22)
                                    .addComponent(numeroDeLava))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(arbolesNombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numeroDeArboles, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargarTableros)
                            .addComponent(crearTableroNuevo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(filasNombre)
                                .addGap(86, 86, 86)
                                .addComponent(numeroDeFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(columnasNombre)
                                .addGap(55, 55, 55)
                                .addComponent(numeroDeColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cargarTableros)
                .addGap(12, 12, 12)
                .addComponent(crearTableroNuevo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filasNombre)
                    .addComponent(numeroDeFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(columnasNombre)
                    .addComponent(numeroDeColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(recomendacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(riosNombre)
                    .addComponent(numeroDeRios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arbolesNombre)
                    .addComponent(numeroDeArboles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lavaNombre)
                    .addComponent(numeroDeLava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(visualizar))
                .addContainerGap())
        );

        regresarAlMenuPrincipal.setText("Regresar");
        regresarAlMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarAlMenuPrincipalActionPerformed(evt);
            }
        });

        panelTableroCreado.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablero Creado"));

        javax.swing.GroupLayout panelVisualizadorDeTableroLayout = new javax.swing.GroupLayout(panelVisualizadorDeTablero);
        panelVisualizadorDeTablero.setLayout(panelVisualizadorDeTableroLayout);
        panelVisualizadorDeTableroLayout.setHorizontalGroup(
            panelVisualizadorDeTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        panelVisualizadorDeTableroLayout.setVerticalGroup(
            panelVisualizadorDeTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );

        jLabel3.setText("Este Tablero será el que se Guarde:");

        javax.swing.GroupLayout panelTableroCreadoLayout = new javax.swing.GroupLayout(panelTableroCreado);
        panelTableroCreado.setLayout(panelTableroCreadoLayout);
        panelTableroCreadoLayout.setHorizontalGroup(
            panelTableroCreadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableroCreadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTableroCreadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelVisualizadorDeTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTableroCreadoLayout.setVerticalGroup(
            panelTableroCreadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableroCreadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelVisualizadorDeTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Generar Tablero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regresarAlMenuPrincipal)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelTableroCreado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel4)))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTableroCreado, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regresarAlMenuPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarTablerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarTablerosActionPerformed
        cargarTableros.setEnabled(false);
        crearTableroNuevo.setEnabled(false);
        String pathEntrante;
        boolean archivoCargado = false;
        
        while(!archivoCargado) {
            JFileChooser jFileChooser = new JFileChooser();
            FileNameExtensionFilter filtrado = new FileNameExtensionFilter("th", "th");
            jFileChooser.setFileFilter(filtrado);

            int respuesta = jFileChooser.showOpenDialog(this);
            
            if (respuesta == JFileChooser.APPROVE_OPTION) {
                pathEntrante = jFileChooser.getSelectedFile().getPath();             
                ArchivoDeTableros recibirNuevosTableros = new ArchivoDeTableros();
                recibirNuevosTableros.sumarTablerosDelArchivo(pathEntrante);
                archivoCargado = true;
                this.dispose();
            }
        }
    }//GEN-LAST:event_cargarTablerosActionPerformed

    private void crearTableroNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTableroNuevoActionPerformed
        cargarTableros.setEnabled(false);
        crearTableroNuevo.setEnabled(false);
        abrirOCerrarCreacionDeTablero(true);
        guardar.setEnabled(false);
    }//GEN-LAST:event_crearTableroNuevoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null,"¿Deseas Guardar este Tablero?", "Pregunta", JOptionPane.YES_NO_OPTION); 
        
        if (selectedOption == JOptionPane.YES_OPTION) {
            boolean salir = false;
            String respuesta = null;
            String nombre = null;
            
            while (!salir) {
                respuesta = JOptionPane.showInputDialog("Escribe el Nombre del Tablero");
                if ("".equals(respuesta) || respuesta == null) {
                    JOptionPane.showMessageDialog(this,"Debes Escribir un Nombre al Tablero","Escribe un Nombre",JOptionPane.ERROR_MESSAGE);
                } else {
                    ArchivoDeTableros revisar = new ArchivoDeTableros();
                    ListaElementos<String> nombreDeLosTableros = revisar.obtenerNombreDeTodosLosTableros("Tableros_De_Juego.th");
                    
                    String[] cadena = respuesta.split("");
                    nombre = "";
                    
                    for (int i = 0; i < cadena.length; i++) {                           
                        if (!" ".equals(cadena[i])) {
                            nombre += cadena[i];
                        }
                    }
                    
                    if ("".equals(nombre)) {
                        nombre = "Tablero_" + nombreDeLosTableros.getLongitud() + 1;
                        JOptionPane.showMessageDialog(this,"Dado que no especifico Nombre el Tablero se Guardo como: " + nombre,"Nombre del Tablero",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    nombre = "<<" + nombre + ">>";
                    
                    for (int i = 1; i <= nombreDeLosTableros.getLongitud(); i++) {
                        try {
                            if (nombreDeLosTableros.obtenerContenido(i).equals(nombre)) {
                                JOptionPane.showMessageDialog(this,"Ya Existe un Tablero con este Nombre","Nombre Repetido",JOptionPane.ERROR_MESSAGE);
                                break;
                            } else {
                                if (i == nombreDeLosTableros.getLongitud()) {
                                    salir = true;
                                }
                            }
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                }
            }
            
            // Ordenar Tablero
            
            ListaElementos<String> tableroArmado = new ListaElementos<>();
            int indice = 1;

            for (int i = 0; i < obtenerNumeroDeFilas(); i++) {
                String cadena = "";

                for (int j = 0; j < obtenerNumeroDeColumnas(); j++) {
                    if (j < (obtenerNumeroDeColumnas() - 1)) {
                        cadena += tableroAMostrar.encontrarPorIndice(indice).getContenido() + ",";
                    } else {
                        cadena += tableroAMostrar.encontrarPorIndice(indice).getContenido();
                    }
                    indice++;
                }
                tableroArmado.agregarALaLista(cadena);
            }   
            
            ArchivoDeTableros guardarTablero = new ArchivoDeTableros();
            guardarTablero.sumarTableroCreado(nombre, obtenerNumeroDeFilas(), obtenerNumeroDeColumnas(), tableroArmado);
            this.dispose();
        } else if (selectedOption == 1) {
            panelVisualizadorDeTablero.removeAll();
            panelVisualizadorDeTablero.updateUI();
            cargarTableros.setEnabled(true);
            crearTableroNuevo.setEnabled(true);
            abrirOCerrarCreacionDeTablero(false);
            restarurarSpinner();
        } else {
            JOptionPane.showMessageDialog(this,"Debes seleccionar si deseas Guardar el Tablero","Falta de Espacio",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarActionPerformed
        if (obtenerNumeroDeFilas() <= 4 || obtenerNumeroDeColumnas() <= 4) {
            JOptionPane.showMessageDialog(this,"El Número de Filas y Columnas debe ser Mayor o igual a 5","Falta de Dimensiones",JOptionPane.ERROR_MESSAGE);
        } else {
            if (sumaDeCasillas()) {
                tableroAMostrar = new ListaElementos<>();
                ListaElementos<JLabel> tableroAMostrarJLabel = new ListaElementos<>();
                Tablero tablero = new Tablero();
                tableroAMostrar = tablero.crearTableroTexto(obtenerNumeroDeFilas(), obtenerNumeroDeColumnas(), obtenerNumeroDeRios(), obtenerNumeroDeArboles(), obtenerNumeroDeLava());
                panelVisualizadorDeTablero.removeAll();

                tableroAMostrarJLabel = tablero.crearTableroJLabelMuestra(tableroAMostrar, obtenerNumeroDeFilas(), obtenerNumeroDeColumnas());
                panelVisualizadorDeTablero.setLayout(new GridLayout(obtenerNumeroDeFilas(),obtenerNumeroDeColumnas()));
                
                try {
                    int indice = 1;

                    for (int i = 0; i < obtenerNumeroDeFilas(); i++) {           
                        for (int j = 0; j < obtenerNumeroDeColumnas(); j++) {
                            panelVisualizadorDeTablero.add(tableroAMostrarJLabel.obtenerContenido(indice));  
                            String tipoDeCasilla = tableroAMostrar.obtenerContenido(indice);
                            String imagen = "planicie";
        
                            if ("~".equals(tipoDeCasilla)) {
                                imagen = "rio";
                            } else if ("T".equals(tipoDeCasilla)) {
                                imagen = "arbol";
                            } else if ("#".equals(tipoDeCasilla)) {
                                imagen = "lava";
                            }
                            tableroAMostrarJLabel.obtenerContenido(indice).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + imagen + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                            tableroAMostrarJLabel.obtenerContenido(indice).setBackground(Color.GREEN);
                            indice++;
                        }
                    }
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
                panelVisualizadorDeTablero.updateUI();
                abrirOCerrarCreacionDeTablero(false);
                guardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_visualizarActionPerformed

    private void regresarAlMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarAlMenuPrincipalActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarAlMenuPrincipalActionPerformed
    
    // Acciones Extras
    
    public void verTableroCreado() {
        ListaElementos<String> tableroAMostrar = new ListaElementos<>();
        ListaElementos<JLabel> tableroAMostrarJLabel = new ListaElementos<>();
        Tablero tablero = new Tablero();
        tableroAMostrar = tablero.crearTableroTexto(obtenerNumeroDeFilas(), obtenerNumeroDeColumnas(), obtenerNumeroDeRios(), obtenerNumeroDeArboles(), obtenerNumeroDeLava());
        panelVisualizadorDeTablero.setVisible(true);
        panelVisualizadorDeTablero.setLayout(new GridLayout(tableroAMostrar.getLongitud(),1));

        try {
            for (int i = 1; i <= tableroAMostrar.getLongitud(); i++) {
                JLabel nuevo = new JLabel(tableroAMostrar.obtenerContenido(i));
                tableroAMostrarJLabel.agregarALaLista(nuevo);
                nuevo.setPreferredSize(new Dimension(60, 25));  
                panelVisualizadorDeTablero.add(tableroAMostrarJLabel.obtenerContenido(i));
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        panelVisualizadorDeTablero.updateUI();
    }
    
    public void abrirOCerrarCreacionDeTablero(boolean estado) {
        filasNombre.setEnabled(estado);
        columnasNombre.setEnabled(estado);
        riosNombre.setEnabled(estado);
        arbolesNombre.setEnabled(estado);
        lavaNombre.setEnabled(estado);
        numeroDeFilas.setEnabled(estado);
        numeroDeColumnas.setEnabled(estado);
        numeroDeRios.setEnabled(estado);
        numeroDeArboles.setEnabled(estado);
        numeroDeLava.setEnabled(estado);
        visualizar.setEnabled(estado);
        guardar.setEnabled(estado);
        recomendacion.setEnabled(estado);
    }
    
    public void restarurarSpinner() {
        numeroDeFilas.setValue(0);
        numeroDeColumnas.setValue(0);
        numeroDeRios.setValue(0);
        numeroDeArboles.setValue(0);
        numeroDeLava.setValue(0);
    }
    
    private boolean sumaDeCasillas() {
        if (obtenerNumeroDeRios() < 0 || obtenerNumeroDeArboles() < 0 || obtenerNumeroDeLava() < 0) {
            JOptionPane.showMessageDialog(this,"El Número de las Casillas tiene que ser Mayor o Igual a Cero","Número Incorrecto",JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            int sumaDeCasillasEspeciales = (obtenerNumeroDeRios() * 3) + obtenerNumeroDeArboles() + obtenerNumeroDeLava();
            int casillasDisponibles = obtenerNumeroDeFilas() * obtenerNumeroDeColumnas();

            if (casillasDisponibles >= sumaDeCasillasEspeciales) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this,"El Número de Casillas Especiales sobrepasada por " + (sumaDeCasillasEspeciales - casillasDisponibles) + " la cantidad de Casillas Disponibles","Falta de Espacio",JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
    
    public int obtenerNumeroDeFilas() {
        return (int) numeroDeFilas.getValue();
    }
    
    public int obtenerNumeroDeColumnas() {
        return (int) numeroDeColumnas.getValue();
    }
    
    public int obtenerNumeroDeRios() {
        return (int) numeroDeRios.getValue();
    }
    
    public int obtenerNumeroDeArboles() {
        return (int) numeroDeArboles.getValue();
    }
    
    public int obtenerNumeroDeLava() {
        return (int) numeroDeLava.getValue();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arbolesNombre;
    private javax.swing.JButton cargarTableros;
    private javax.swing.JLabel columnasNombre;
    private javax.swing.JButton crearTableroNuevo;
    private javax.swing.JLabel filasNombre;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavaNombre;
    private javax.swing.JSpinner numeroDeArboles;
    private javax.swing.JSpinner numeroDeColumnas;
    private javax.swing.JSpinner numeroDeFilas;
    private javax.swing.JSpinner numeroDeLava;
    private javax.swing.JSpinner numeroDeRios;
    private javax.swing.JPanel panelTableroCreado;
    private javax.swing.JPanel panelVisualizadorDeTablero;
    private javax.swing.JLabel recomendacion;
    private javax.swing.JButton regresarAlMenuPrincipal;
    private javax.swing.JLabel riosNombre;
    private javax.swing.JButton visualizar;
    // End of variables declaration//GEN-END:variables
}
