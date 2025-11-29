package com.mycompany.aventura.main.personajes;

import com.mycompany.aventura.main.hilos.HiloDelAtaqueNormal;
import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.tablero.Arbol;
import com.mycompany.aventura.main.tablero.Casilla;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mago extends Personaje {

    public Mago(String nombre) {
        super.nombre = nombre;
        tipo = "mago";
        daño = 60;
        vida = 100;
        movilidad = 2;
        punteo = 0;
        porcentajeDeEfectividad = 0.75;
        puedeVolar = true;
    }
    
    @Override
    public void moverPersonaje(ListaElementos<Casilla> tablero, String casillaAnterior, String direccion, ListaElementos<String> accionesEnemigos) {
        int fila_1 = fila, columna_1 = columna, contador = 0, espaciosLibres = 0, distancia = 0;
        boolean hayObstaculos = true, seMovio = true, salir = false;
        String casillaAGuardar = null;

        while (!salir) {
            String respuesta = JOptionPane.showInputDialog("Selecciona la distancia entre el Rango de 1 a " + movilidad);
            
            if ("".equals(respuesta) || respuesta == null) {
                JOptionPane.showMessageDialog(null,"Debes Escribir un Nombre de Usuario","Escribe un Nombre",JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    int numero = Integer.parseInt(respuesta);
                    
                    if (numero > 0 && numero <= movilidad) {
                        distancia = numero;
                        salir = true;
                    } else {
                        JOptionPane.showMessageDialog(null,"Número fuera de Rango","Error",JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,"Debe Ingresar un Número","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        salir = false;
        
        if (direccion.equals("a")) {
            columna_1 -= distancia;

            if (columna_1 < 1) {
                while (columna_1 < 1) {
                    columna_1++;
                    contador++;
                }
            }
        } else if (direccion.equals("d")) {
            columna_1 += distancia;

            if (columna_1 > columnasDelTablero) {
                while (columna_1 > columnasDelTablero) {
                    columna_1--;
                    contador++;
                }
            }
        } else if (direccion.equals("w")) {
            fila_1 -= distancia;

            if (fila_1 < 1) {
                while (fila_1 < 1) {
                    fila_1++;
                    contador++;
                }
            }
        } else if (direccion.equals("s")){
            fila_1 += distancia;

            if (fila_1 > filasDelTablero) {
                while (fila_1 > filasDelTablero) {
                    fila_1--;
                    contador++;
                }
            }
        }
        if (fila_1 == fila && columna_1 == columna) {
            seMovio = false;
        }

        distancia -= contador;

        if (seMovio) {              
            if (direccion.equals("a")) {
                for (int i = 1; i <= distancia; i++) {                
                    for (int j = 1; j <= tablero.getLongitud(); j++) {
                        try {
                            if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna - i)) {
                                if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("planicie") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("lava") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("arbol") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("rio")) {
                                    casillaAGuardar = tablero.obtenerContenido(j).obtenerTipoDeCasilla();
                                    espaciosLibres++;
                                    hayObstaculos = false;
                                } else {
                                    salir = true;
                                    break;
                                }
                            }
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    if (salir) {
                        break;
                    }
                }
            } else if (direccion.equals("d")) {
                for (int i = 1; i <= distancia; i++) {
                    for (int j = 1; j <= tablero.getLongitud(); j++) {
                        try {
                            if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna + i)) {
                                if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("planicie") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("lava") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("arbol") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("rio")) {
                                    casillaAGuardar = tablero.obtenerContenido(j).obtenerTipoDeCasilla();
                                    espaciosLibres++;
                                    hayObstaculos = false;
                                } else {
                                    salir = true;
                                    break;
                                }
                            }
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    if (salir) {
                        break;
                    }
                }                
            } else if (direccion.equals("w")) {
                for (int i = 1; i <= distancia; i++) {
                    for (int j = 1; j <= tablero.getLongitud(); j++) {
                        try {
                            if (tablero.obtenerContenido(j).obtenerFila() == (fila - i) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                                if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("planicie") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("lava") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("arbol") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("rio")) {
                                    casillaAGuardar = tablero.obtenerContenido(j).obtenerTipoDeCasilla();
                                    espaciosLibres++;
                                    hayObstaculos = false;
                                } else {
                                    salir = true;
                                    break;
                                }
                            }
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    if (salir) {
                        break;
                    }
                }                
            } else if (direccion.equals("s")) {
                for (int i = 1; i <= distancia; i++) {
                    for (int j = 1; j <= tablero.getLongitud(); j++) {
                        try {
                            if (tablero.obtenerContenido(j).obtenerFila() == (fila + i) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                                if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("planicie") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("lava") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("arbol") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("rio")) {
                                    casillaAGuardar = tablero.obtenerContenido(j).obtenerTipoDeCasilla();
                                    espaciosLibres++;
                                    hayObstaculos = false;
                                } else {
                                    salir = true;
                                    break;
                                }
                            }
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    if (salir) {
                        break;
                    }
                }
            }

            if (!hayObstaculos) {
                for (int i = 1; i <= tablero.getLongitud(); i++) {
                    try {
                        if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == columna) {
                            tablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + casillaAnterior + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                            tablero.obtenerContenido(i).cambiarTipoDeCasilla(casillaAnterior);
                        }
                    } catch (ListaElementosExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                }

                if (distancia != espaciosLibres) {
                    int espaciosARestar = distancia - espaciosLibres;
                    distancia -= espaciosARestar;
                }

                int filaACambiar = 0;
                int columnaACambiar = 0;

                if (direccion.equals("a")) { 
                    filaACambiar = fila;
                    columnaACambiar = columna - distancia;
                    columna -= distancia;
                } else if (direccion.equals("d")) {
                    filaACambiar = fila;
                    columnaACambiar = columna + distancia;
                    columna += distancia;
                } else if (direccion.equals("w")) {
                    filaACambiar = fila - distancia;
                    columnaACambiar = columna;
                    fila -= distancia;
                } else if (direccion.equals("s")) {
                    filaACambiar = fila + distancia;
                    columnaACambiar = columna;
                    fila += distancia;
                }  

                for (int i = 1; i <= tablero.getLongitud(); i++) {
                    try {
                        if (tablero.obtenerContenido(i).obtenerFila() == filaACambiar && tablero.obtenerContenido(i).obtenerColumna() == columnaACambiar) {
                            tablero.obtenerContenido(i).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + tipo + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                            tablero.obtenerContenido(i).cambiarTipoDeCasilla(tipo);
                        }
                    } catch (ListaElementosExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                casillaActual = casillaAGuardar;  
            } else {
                JOptionPane.showMessageDialog(null,"No puedes pasar por Aquí","Obstaculo",JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Pared","Pared",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @Override
    public void atacarPersonaje(ListaElementos<Casilla> tablero, ListaElementos<Arbol> arboles, ListaElementos<Personaje> personajesEnemigos, ListaElementos<String> casillasAnteriores, String direccion, ListaElementos<String> accionesEnemigos) {
        boolean seMovio = true, encontroAlgo = false, salir = false;
        int distancia = 0, distanciaAEnviar = 0;
            
        if ("a".equals(direccion)) {
            distancia = columna - 1;
        } else if ("d".equals(direccion)) {
            distancia = columnasDelTablero - columna;
        } else if ("w".equals(direccion)) {
            distancia = fila - 1;
        } else if ("s".equals(direccion)) {
            distancia = filasDelTablero - fila;
        }

        if (distancia == 0) {
            seMovio = false;
        }
        
        if (seMovio) {
            double random = 0.50;//Math.random();

            if (random < porcentajeDeEfectividad) {
                for (int i = 1; i <= distancia; i++) {       
                    int filaAtacada = 0;
                    int columnaAtacada = 0;

                    if ("a".equals(direccion)) {
                        filaAtacada = fila;
                        columnaAtacada = columna - i;
                    } else if ("d".equals(direccion)) {
                        filaAtacada = fila;
                        columnaAtacada = columna + i;                                       
                    } else if ("w".equals(direccion)) {
                        filaAtacada = fila - i;
                        columnaAtacada = columna;
                    } else {
                        filaAtacada = fila + i;
                        columnaAtacada = columna;
                    }
                    
                    if (!arboles.estaVacia()) {
                        for (int j = 1; j <= arboles.getLongitud(); j++) {
                            try {
                                if (arboles.obtenerContenido(j).obtenerFila() == filaAtacada && arboles.obtenerContenido(j).obtenerColumna() == columnaAtacada) {
                                    if (arboles.obtenerContenido(j).obtenerSiElArbolEstaActivo()) {
                                        arboles.obtenerContenido(j).quitarVida(daño);

                                        if (arboles.obtenerContenido(j).obtenerVida() == 0) {
                                            for (int k = 1; k <= tablero.getLongitud(); k++) {
                                                if (tablero.obtenerContenido(k).obtenerFila() == filaAtacada && tablero.obtenerContenido(k).obtenerColumna() == columnaAtacada) {
                                                    tablero.obtenerContenido(k).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/planicie.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                                    tablero.obtenerContenido(k).cambiarTipoDeCasilla("planicie");
                                                }
                                            }
                                            arboles.eliminar(j);
                                            JOptionPane.showMessageDialog(null,"El Mago (" + nombre + ") destruyó un Árbol","Información del Usuario",JOptionPane.INFORMATION_MESSAGE);
                                        } else {
                                            JOptionPane.showMessageDialog(null,"El Mago (" + nombre + ") hizó un daño de " + daño + " a un Árbol","Información del Usuario",JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        salir = true;
                                        encontroAlgo = true;
                                    }
                                }
                            } catch (ListaElementosExcepcion ex) {
                                System.out.println(ex.getMessage());
                            }
                        }
                    }
                    
                    if (!personajesEnemigos.estaVacia()) {
                        for (int j = 1; j <= personajesEnemigos.getLongitud(); j++) {
                            try {
                                if (personajesEnemigos.obtenerContenido(j).obtenerFilaDelJugador() == filaAtacada && personajesEnemigos.obtenerContenido(j).obtenerColumnaDelJugador() == columnaAtacada) {
                                    personajesEnemigos.obtenerContenido(j).aumentarOQuitarVida(-daño);

                                    if (personajesEnemigos.obtenerContenido(j).obtenerVida() == 0) {
                                        for (int k = 1; k <= tablero.getLongitud(); k++) {
                                            if (tablero.obtenerContenido(k).obtenerFila() == filaAtacada && tablero.obtenerContenido(k).obtenerColumna() == columnaAtacada) {
                                                tablero.obtenerContenido(k).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + personajesEnemigos.obtenerContenido(j).getCasillaActual() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                                tablero.obtenerContenido(k).cambiarTipoDeCasilla(personajesEnemigos.obtenerContenido(j).getCasillaActual());
                                            }
                                        }
                                        JOptionPane.showMessageDialog(null,"El Mago (" + nombre + ") dejó fuera de Combate a " + personajesEnemigos.obtenerContenido(j).obtenerNombre(),"Información del Usuario",JOptionPane.INFORMATION_MESSAGE);
                                        punteo = personajesEnemigos.obtenerContenido(j).obtenerPunteo();
                                        personajesEnemigos.eliminar(j);
                                        casillasAnteriores.eliminar(j);
                                    } else {
                                        JOptionPane.showMessageDialog(null,"El Mago (" + nombre + ") atacó a " + personajesEnemigos.obtenerContenido(j).obtenerNombre() + " dejandoló con " + personajesEnemigos.obtenerContenido(j).obtenerVida() + " de vida","Información del Usuario",JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    salir = true;
                                    encontroAlgo = true;
                                }
                            } catch (ListaElementosExcepcion ex) {
                                System.out.println(ex.getMessage());
                            }
                        }
                    }
                    distanciaAEnviar = i;
                    
                    if (salir) {
                        break;
                    }
                }               
                if (!encontroAlgo) {
                    JOptionPane.showMessageDialog(null,"El Mago (" + nombre + ") atacó pero no habia Objetivos Cerca","Información del Usuario",JOptionPane.INFORMATION_MESSAGE);
                }
                
                HiloDelAtaqueNormal iniciar = new HiloDelAtaqueNormal(tablero, distanciaAEnviar, fila, columna, direccion);
                iniciar.start();
            } else {
                JOptionPane.showMessageDialog(null,"El Mago (" + nombre + ") falló el Ataque","Información del Usuario",JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,"No puedes Atacar en esta Dirección","Información del Usuario",JOptionPane.ERROR_MESSAGE);
        }
    } 
}
