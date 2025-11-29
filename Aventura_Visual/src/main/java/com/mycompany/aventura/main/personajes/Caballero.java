package com.mycompany.aventura.main.personajes;

import com.mycompany.aventura.main.hilos.HiloDelAtaqueCuadrado;
import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.tablero.Arbol;
import com.mycompany.aventura.main.tablero.Casilla;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Caballero extends Personaje {
    
    public Caballero(String nombre) {
        super.nombre = nombre;
        tipo = "caballero";
        daño = 45;
        vida = 300;
        movilidad = 1;
        punteo = 0;
        porcentajeDeEfectividad = 0.75;
        puedeVolar = false;
    }
    
    @Override
    public void moverPersonaje(ListaElementos<Casilla> tablero, String casillaAnterior, String direccion, ListaElementos<String> accionesEnemigos) {
        int fila_1 = fila, columna_1 = columna, contador = 0, espaciosLibres = 0, distancia = movilidad;
        boolean hayObstaculos = true, seMovio = true, salir = false;
        String casillaAGuardar = null;
        
        if (direccion.equals("a")) {
            columna_1 -= distancia;

            while (columna_1 < 1) {
                columna_1++;
                contador++;
            }
        } else if (direccion.equals("d")) {
            columna_1 += distancia;

            while (columna_1 > columnasDelTablero) {
                columna_1--;
                contador++;
            }
        } else if (direccion.equals("w")) {
            fila_1 -= distancia;
            
            while (fila_1 < 1) {
                fila_1++;
                contador++;
            }
        } else {
            fila_1 += distancia;

            while (fila_1 > filasDelTablero) {
                fila_1--;
                contador++;
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
                                if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("planicie") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("lava")) {
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
                                if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("planicie") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("lava")) {
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
                                if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("planicie") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("lava")) {
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
                                if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("planicie") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("lava")) {
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
                        if (tablero.obtenerContenido(i).obtenerFila() == (filaACambiar) && tablero.obtenerContenido(i).obtenerColumna() == columnaACambiar) {
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
        
    public void atacarPersonaje(ListaElementos<Casilla> tablero, ListaElementos<Arbol> arboles, ListaElementos<Personaje> personajesEnemigos, ListaElementos<String> casillasAnteriores, String direccion, ListaElementos<String> accionesEnemigos) {
        boolean uno = true, dos = true, tres = true, cuatro = true, cinco = true, seis = true, siete = true, ocho = true, encontroAlgo = false;
        ListaElementos<Integer> filasObjetoDetectado = new ListaElementos<>();
        ListaElementos<Integer> columnasObjetoDetectado = new ListaElementos<>();
        
        if (fila == 1 && columna == 1) {
            uno = dos = tres = cuatro = seis = false;
        } else if (fila == 1 && columna != 1 && columna != columnasDelTablero) {
            uno = dos = tres = false;
        } else if (fila == 1 && columna == columnasDelTablero) {
            uno = dos = tres = cinco = ocho = false;
        } else if (columna == 1 && fila != 1 && fila != filasDelTablero) {
            uno = cuatro = seis = false;
        } else if (columna == columnasDelTablero && fila != 1 && fila != filasDelTablero) {
            tres = cinco = ocho = false;
        } else if (fila == filasDelTablero && columna == 1) {
            uno = cuatro = seis = siete = ocho = false;
        } else if (fila == filasDelTablero && columna != 1 && columna != columnasDelTablero) {
            seis = siete = ocho = false;
        } else if (fila == filasDelTablero && columna == columnasDelTablero) {
            tres = cinco = seis = siete = ocho = false;
        }
        
        if (uno) {
            for (int i = 1; i <= tablero.getLongitud(); i++) {
                try {
                    if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {
                        if ("ogro".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gargola".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "bruja".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "cancerbero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "florCarnivora".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            filasObjetoDetectado.agregarALaLista(fila - 1);
                            columnasObjetoDetectado.agregarALaLista(columna - 1);
                        }
                    }
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        if (dos) {
            for (int i = 1; i <= tablero.getLongitud(); i++) {
                try {
                    if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna)) {                  
                        if ("ogro".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gargola".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "bruja".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "cancerbero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "florCarnivora".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            filasObjetoDetectado.agregarALaLista(fila - 1);
                            columnasObjetoDetectado.agregarALaLista(columna);
                        }
                    }
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        if (tres) {
            for (int i = 1; i <= tablero.getLongitud(); i++) {
                try {
                    if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {                  
                        if ("ogro".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gargola".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "bruja".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "cancerbero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "florCarnivora".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            filasObjetoDetectado.agregarALaLista(fila - 1);
                            columnasObjetoDetectado.agregarALaLista(columna + 1);
                        }
                    }
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        if (cuatro) {
            for (int i = 1; i <= tablero.getLongitud(); i++) {
                try {
                    if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {                  
                        if ("ogro".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gargola".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "bruja".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "cancerbero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "florCarnivora".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            filasObjetoDetectado.agregarALaLista(fila);
                            columnasObjetoDetectado.agregarALaLista(columna - 1);
                        }
                    }
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        if (cinco) {
            for (int i = 1; i <= tablero.getLongitud(); i++) {
                try {
                    if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {                  
                        if ("ogro".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gargola".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "bruja".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "cancerbero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "florCarnivora".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            filasObjetoDetectado.agregarALaLista(fila);
                            columnasObjetoDetectado.agregarALaLista(columna + 1);
                        }
                    }
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        if (seis) {
            for (int i = 1; i <= tablero.getLongitud(); i++) {
                try {
                    if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {                  
                        if ("ogro".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gargola".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "bruja".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "cancerbero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "florCarnivora".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            filasObjetoDetectado.agregarALaLista(fila + 1);
                            columnasObjetoDetectado.agregarALaLista(columna - 1);
                        }
                    }
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        if (siete) {
            for (int i = 1; i <= tablero.getLongitud(); i++) {
                try {
                    if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == columna) {                  
                        if ("ogro".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gargola".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "bruja".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "cancerbero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "florCarnivora".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            filasObjetoDetectado.agregarALaLista(fila + 1);
                            columnasObjetoDetectado.agregarALaLista(columna);
                        }
                    }
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        if (ocho) {
            for (int i = 1; i <= tablero.getLongitud(); i++) {
                try {
                    if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {                  
                        if ("ogro".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gargola".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "bruja".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "cancerbero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "florCarnivora".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            filasObjetoDetectado.agregarALaLista(fila + 1);
                            columnasObjetoDetectado.agregarALaLista(columna + 1);
                        }
                    }
                } catch (ListaElementosExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        
        double random = Math.random();
        
        if (random < porcentajeDeEfectividad) {
            
            if (!arboles.estaVacia()) {
                for (int i = 1; i <= filasObjetoDetectado.getLongitud(); i++) {
                    for (int j = 1; j <= arboles.getLongitud(); j++) {
                        try {
                            if (arboles.obtenerContenido(j).obtenerFila() == filasObjetoDetectado.obtenerContenido(i) && arboles.obtenerContenido(j).obtenerColumna() == columnasObjetoDetectado.obtenerContenido(i)) {
                                if (arboles.obtenerContenido(j).obtenerSiElArbolEstaActivo()) {
                                    arboles.obtenerContenido(j).quitarVida(daño);

                                    if (arboles.obtenerContenido(j).obtenerVida() == 0) {
                                        for (int k = 1; k <= tablero.getLongitud(); k++) {
                                            if (tablero.obtenerContenido(k).obtenerFila() == filasObjetoDetectado.obtenerContenido(i) && tablero.obtenerContenido(k).obtenerColumna() == columnasObjetoDetectado.obtenerContenido(i)) {
                                                tablero.obtenerContenido(k).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/planicie.png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                                tablero.obtenerContenido(k).cambiarTipoDeCasilla("planicie");
                                            }
                                        }
                                        arboles.eliminar(j);
                                        JOptionPane.showMessageDialog(null,"El Caballero (" + nombre + ") destruyó un Árbol","Información del Usuario",JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null,"El Caballero (" + nombre + ") hizó un daño de " + daño + " a un Árbol","Información del Usuario",JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    encontroAlgo = true;
                                    break;
                                }
                            }
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                }
            }
            
            if (!personajesEnemigos.estaVacia()) {
                for (int i = 1; i <= filasObjetoDetectado.getLongitud(); i++) {
                    for (int j = 1; j <= personajesEnemigos.getLongitud(); j++) {
                        try {
                            if (personajesEnemigos.obtenerContenido(j).obtenerFilaDelJugador() == filasObjetoDetectado.obtenerContenido(i) && personajesEnemigos.obtenerContenido(j).obtenerColumnaDelJugador() == columnasObjetoDetectado.obtenerContenido(i)) {
                                personajesEnemigos.obtenerContenido(j).aumentarOQuitarVida(-daño);

                                if (personajesEnemigos.obtenerContenido(j).obtenerVida() == 0) {
                                    for (int k = 1; k <= tablero.getLongitud(); k++) {
                                        if (tablero.obtenerContenido(k).obtenerFila() == filasObjetoDetectado.obtenerContenido(i) && tablero.obtenerContenido(k).obtenerColumna() == columnasObjetoDetectado.obtenerContenido(i)) {
                                            tablero.obtenerContenido(k).setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/com/mycompany/aventura/main/frameDelJuego/" + personajesEnemigos.obtenerContenido(j).getCasillaActual() + ".png")).getImage().getScaledInstance(-1, -1, java.awt.Image.SCALE_SMOOTH)));
                                            tablero.obtenerContenido(k).cambiarTipoDeCasilla(personajesEnemigos.obtenerContenido(j).getCasillaActual());
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null,"El Caballero (" + nombre + ") dejó fuera de Combate a " + personajesEnemigos.obtenerContenido(j).obtenerNombre(),"Información del Usuario",JOptionPane.INFORMATION_MESSAGE);
                                    punteo = personajesEnemigos.obtenerContenido(j).obtenerPunteo();
                                    personajesEnemigos.eliminar(j);
                                    casillasAnteriores.eliminar(j);
                                } else {
                                    JOptionPane.showMessageDialog(null,"El Caballero (" + nombre + ") atacó a " + personajesEnemigos.obtenerContenido(j).obtenerNombre() + " dejandoló con " + personajesEnemigos.obtenerContenido(j).obtenerVida() + " de vida","Información del Usuario",JOptionPane.INFORMATION_MESSAGE);
                                }
                                encontroAlgo = true;
                                break;
                            }
                        } catch (ListaElementosExcepcion ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                }
            }
            
            HiloDelAtaqueCuadrado iniciar = new HiloDelAtaqueCuadrado(tablero, fila, columna, uno, dos, tres, cuatro, cinco, seis, siete, ocho);
            iniciar.start();
            
            if (!encontroAlgo) {
                JOptionPane.showMessageDialog(null,"El Caballero (" + nombre + ") atacó pero no habia Objetivos Cerca","Información del Usuario",JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,"El Caballero (" + nombre + ") falló el Ataque","Información del Usuario",JOptionPane.ERROR_MESSAGE);
        }
    }
}
