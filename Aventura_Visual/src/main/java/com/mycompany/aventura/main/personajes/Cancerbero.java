package com.mycompany.aventura.main.personajes;

import com.mycompany.aventura.main.hilos.HiloDelAtaqueCuadrado;
import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.tablero.Arbol;
import com.mycompany.aventura.main.tablero.Casilla;
import java.util.Random;
import javax.swing.ImageIcon;

public class Cancerbero extends Personaje {
    
    public Cancerbero(String nombre) {
        super.nombre = nombre;
        tipo = "cancerbero";
        daño = 45;
        vida = 400;
        movilidad = 1;
        punteo = 30;
        porcentajeDeEfectividad = 0.60;
        puedeVolar = false;
    }

    @Override
    public void moverPersonaje(ListaElementos<Casilla> tablero, String casillaAnterior, String direccionNoUtilizada, ListaElementos<String> accionesEnemigos) {
        boolean paso = false, salir = false;
        String casillaAGuardar = null, comando = null, accion = null;
 
        while (!paso) {
            int contador = 0, espaciosLibres = 0, fila_1 = fila, columna_1 = columna;
            boolean hayObstaculos = true, seMovio = true;
            
            Random random = new Random();
            int direccion = (random.nextInt(5) + 1);

            if (direccion == 1) {
                comando = "a";
            } else if (direccion == 2) {
                comando = "d";
            } else if (direccion == 3) {
                comando = "w";
            } else {
                comando = "s";
            }
            
            int distancia = movilidad;

            if ("a".equals(comando)) {
                columna_1 -= distancia;

                while (columna_1 < 1) {
                    columna_1++;
                    contador++;
                }
            } else if ("d".equals(comando)) {
                columna_1 += distancia;

                while (columna_1 > columnasDelTablero) {
                    columna_1--;
                    contador++;
                }
            } else if ("w".equals(comando)) {
                fila_1 -= distancia;

                while (fila_1 < 1) {
                    fila_1++;
                    contador++;
                }
            } else if ("s".equals(comando)) {
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
                if (comando.equals("a")) {
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
                } else if (comando.equals("d")) {
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
                } else if (comando.equals("w")) {
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
                } else if (comando.equals("s")) {
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

                    if (comando.equals("a")) { 
                        filaACambiar = fila;
                        columnaACambiar = columna - distancia;
                        columna -= distancia;
                    } else if (comando.equals("d")) {
                        filaACambiar = fila;
                        columnaACambiar = columna + distancia;
                        columna += distancia;
                    } else if (comando.equals("w")) {
                        filaACambiar = fila - distancia;
                        columnaACambiar = columna;
                        fila -= distancia;
                    } else if (comando.equals("s")) {
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
                    
                    if (comando.equals("a")) { 
                        accion = "El Cancerbero (" + fila + "," + columna + ") se Movio a la Izquierda";
                    } else if (comando.equals("d")) { 
                        accion = "El Cancerbero (" + fila + "," + columna + ") se Movio a la Derecha";
                    } else if (comando.equals("w")) { 
                        accion = "El Cancerbero (" + fila + "," + columna + ") se Movio hacia Arriba";
                    } else {
                        accion = "El Cancerbero (" + fila + "," + columna + ") se Movio hacia Abajo";
                    }
                    casillaActual = casillaAGuardar;
                    paso = true;
                }
            }
        }
        accionesEnemigos.agregarALaLista(accion);
    }

    @Override
    public void atacarPersonaje(ListaElementos<Casilla> tablero, ListaElementos<Arbol> arboles, ListaElementos<Personaje> personajesEnemigos, ListaElementos<String> casillasAnteriores, String direccion, ListaElementos<String> accionesEnemigos) {
        boolean uno = true, dos = true, tres = true, cuatro = true, cinco = true, seis = true, siete = true, ocho = true, encontroAlgo = false;
        ListaElementos<Integer> filasObjetoDetectado = new ListaElementos<>();
        ListaElementos<Integer> columnasObjetoDetectado = new ListaElementos<>();
        String accion = null;
        
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
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
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
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
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
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
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
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
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
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
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
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
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
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
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
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
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
                                        accion = "El Cancerbero (" + fila + "," + columna + ") destruyó un Árbol";
                                    } else {
                                        accion = "El Cancerbero (" + fila + "," + columna + ") hizó un daño de " + daño + " a un Árbol";
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
                                    accion = "El Cancerbero (" + fila + "," + columna + ") dejó fuera de Combate a " + personajesEnemigos.obtenerContenido(j).obtenerNombre();
                                    personajesEnemigos.eliminar(j);
                                } else {
                                    accion = "El Cancerbero (" + fila + "," + columna + ") atacó a " + personajesEnemigos.obtenerContenido(j).obtenerNombre() + " dejandoló con " + personajesEnemigos.obtenerContenido(j).obtenerVida() + " de vida";
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
                accion = "El Cancerbero (" + fila + "," + columna + ") atacó pero no habia Objetivos Cerca";
            }
        } else {
            accion = "El Cancerbero (" + fila + "," + columna + ") falló el Ataque";
        }
        accionesEnemigos.agregarALaLista(accion);
    }
}
