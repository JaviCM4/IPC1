package com.mycompany.aventura.main.personajes;

import com.mycompany.aventura.main.listas.ListaElementos;
import com.mycompany.aventura.main.listas.ListaElementosExcepcion;
import com.mycompany.aventura.main.tablero.Arbol;
import com.mycompany.aventura.main.tablero.Casilla;
import java.io.Serializable;

public abstract class Personaje implements Serializable {
    
    protected String nombre, tipo, casillaActual = "planicie";
    protected int daño, vida, movilidad, fila, columna, filasDelTablero, columnasDelTablero, punteo;
    protected double porcentajeDeEfectividad;
    protected boolean puedeVolar;
        
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerTipo() {
        return tipo;
    }
    
    public void aumentarDaño(int aumento) {
        daño += aumento;
    }

    public int obtenerDaño() {
        return daño;
    }
    
    public void setMovilidad(int movilidad) {
        this.movilidad += movilidad;
    }
    
    public void establecerVida(int vida) {
        this.vida = vida;
    }
    
    public void aumentarOQuitarVida(int aumento) {
        vida += aumento;
    }
    
    public int obtenerVida() {      
        if (vida > 0) {
            return vida;
        } else {
            return 0;
        }
    }

    public void guardarPunteo(int punteo) {
        this.punteo = punteo;
    }
    
    public int obtenerPunteo() { 
        return punteo;
    }
    
    public int obtenerFilaDelJugador() {
        return fila;
    }
    
    public void recibirFila(int fila) {
        this.fila = fila;
    }
    
    public int obtenerColumnaDelJugador() {
        return columna;
    }
    
    public void recibirColumna(int columna) {
        this.columna = columna;
    }
    
    public void recibirFilasDelTablero(int filasDelTablero) {
        this.filasDelTablero = filasDelTablero;
    }
    
    public void recibirColumnasDelTablero(int columnasDelTablero) {
        this.columnasDelTablero = columnasDelTablero;
    }
    
    public String getCasillaActual() {
        return casillaActual;
    }
    
    public void recibirCasillaActual(String casilla) {
        casillaActual = casilla;
    }
    
    public boolean saberSiPuedeVolar() {
        return puedeVolar;
    }
    
    public String mostrarCaracteristicasDelPersonaje() {
        return "Nombre: " + nombre + "/ Tipo: " + tipo + "/ Vida: " + vida + "/ Daño: " + daño + "/ Movilidad: " + movilidad;
    }
    
    public String mostrarCarateristicasBasicas() {
        return "Nombre: " + nombre + "/ Tipo: " + tipo;
    }
    
    public boolean verificarMovimientoJugador(ListaElementos<Casilla> tablero) {
        boolean puedeMoverse = false;
        int numero = 1;
       
        int distancia = 0;

        try {
            if (numero == 1) {
                distancia = columna - 1;

                while (distancia < 1) {
                    distancia++;
                }
                if (distancia == columna) {
                    numero = 2;
                } else {
                    if (saberSiPuedeVolar()) {
                        for (int i = 1; i <= tablero.getLongitud(); i++) {
                            if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {
                                if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "rio".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                    puedeMoverse = true;
                                } else {
                                    numero = 2;
                                }
                            }
                        }
                    } else {
                        for (int i = 1; i <= tablero.getLongitud(); i++) {
                            if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {
                                if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                    puedeMoverse = true;
                                } else {
                                    numero = 2;
                                }
                            }
                        }
                    }
                }
            }
            if (numero == 2) {
                distancia = columna + 1;

                while (distancia > columnasDelTablero) {
                    distancia--;
                }
                if (distancia == columna) {
                    numero = 3;
                } else {
                    if (saberSiPuedeVolar()) {
                        for (int i = 1; i <= tablero.getLongitud(); i++) {
                            if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {
                                if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "rio".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                    puedeMoverse = true;
                                } else {
                                    numero = 3;
                                }
                            }
                        }
                    } else {
                        for (int i = 1; i <= tablero.getLongitud(); i++) {
                            if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {
                                if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                    puedeMoverse = true;
                                } else {
                                    numero = 3;
                                }
                            }
                        }
                    }
                }
            }
            if (numero == 3) {
                distancia = fila - 1;

                while (distancia < 1) {
                    distancia++;
                }
                if (distancia == fila) {
                    numero = 4;
                } else {
                    if (saberSiPuedeVolar()) {
                        for (int i = 1; i <= tablero.getLongitud(); i++) {
                            if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == columna) {
                                if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "rio".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                    puedeMoverse = true;
                                } else {
                                    numero = 4;
                                }
                            }
                        }
                    } else {
                        for (int i = 1; i <= tablero.getLongitud(); i++) {
                            if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == columna) {
                                if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                    puedeMoverse = true;
                                } else {
                                    numero = 4;
                                }
                            }
                        }
                    }
                }
            }
            if (numero == 4) {
                distancia = fila + 1;

                while (distancia > filasDelTablero) {
                    distancia--;
                }
                if (distancia != fila) {
                    if (saberSiPuedeVolar()) {
                        for (int i = 1; i <= tablero.getLongitud(); i++) {
                            if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == columna) {
                                if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "rio".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arbol".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                    puedeMoverse = true;
                                }
                            }
                        }
                    } else {
                        for (int i = 1; i <= tablero.getLongitud(); i++) {
                            if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == columna) {
                                if ("planicie".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "lava".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                                    puedeMoverse = true;
                                }
                            }
                        }
                    }
                }
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        return puedeMoverse;
    }
    
    public String obtenerDireccionNormal(ListaElementos<Casilla> tablero, int distancia) {
        boolean encontroAlJugador = false;
        int direccionDelAtaque = 1;
        String comando = "j";
        
        if (direccionDelAtaque == 1) {
            for (int i = 1; i <= distancia; i++) {
                for (int j = 1; j <= tablero.getLongitud(); j++) {
                    try {
                        if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna - i)) {
                            if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("caballero") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("arquero") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("mago") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("gigante") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("dragon")) {
                                comando = "a";
                                encontroAlJugador = true;
                                break;
                            }
                        }
                    } catch (ListaElementosExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                if (encontroAlJugador) {
                    break;
                }
            }
            if (!encontroAlJugador) {
                direccionDelAtaque = 2;
            }
        }
        if (direccionDelAtaque == 2) {
            for (int i = 1; i <= distancia; i++) {
                for (int j = 1; j <= tablero.getLongitud(); j++) {
                    try {
                        if (tablero.obtenerContenido(j).obtenerFila() == fila && tablero.obtenerContenido(j).obtenerColumna() == (columna + i)) {
                            if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("caballero") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("arquero") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("mago") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("gigante") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("dragon")) {
                                comando = "d";
                                encontroAlJugador = true;
                                break;
                            }
                        }
                    } catch (ListaElementosExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                if (encontroAlJugador) {
                    break;
                }
            }
            if (!encontroAlJugador) {
                direccionDelAtaque = 3;
            }
        }
        if (direccionDelAtaque == 3) {
            for (int i = 1; i <= distancia; i++) {
                for (int j = 1; j <= tablero.getLongitud(); j++) {
                    try {
                        if (tablero.obtenerContenido(j).obtenerFila() == (fila - i) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                            if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("caballero") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("arquero") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("mago") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("gigante") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("dragon")) {
                                comando = "w";
                                encontroAlJugador = true;
                                break;
                            }
                        }
                    } catch (ListaElementosExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                if (encontroAlJugador) {
                    break;
                }
            }
            if (!encontroAlJugador) {
                direccionDelAtaque = 4;
            }
        }
        if (direccionDelAtaque == 4) {
            for (int i = 1; i <= distancia; i++) {
                for (int j = 1; j <= tablero.getLongitud(); j++) {
                    try {
                        if (tablero.obtenerContenido(j).obtenerFila() == (fila + i) && tablero.obtenerContenido(j).obtenerColumna() == columna) {
                            if (tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("caballero") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("arquero") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("mago") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("gigante") || tablero.obtenerContenido(j).obtenerTipoDeCasilla().equals("dragon")) {
                                comando = "s";
                                encontroAlJugador = true;
                                break;
                            }
                        }
                    } catch (ListaElementosExcepcion ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                if (encontroAlJugador) {
                    break;
                }
            }
        }
        return comando;
    }
    
    public String obtenerDireccionCuadrado(ListaElementos<Casilla> tablero) { 
        boolean uno = true, dos = true, tres = true, cuatro = true, cinco = true, seis = true, siete = true, ocho = true, encontroAlgo = false;
        String comando = "j";
        
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
        
        try {
            if (uno) {
                for (int i = 1; i <= tablero.getLongitud(); i++) {
                    if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            comando = "a";
                        }
                    }             
                }
            }
            if (dos) {
                for (int i = 1; i <= tablero.getLongitud(); i++) {
                    if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna)) {                  
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            comando = "a";
                        }
                    }
                }
            }
            if (tres) {
                for (int i = 1; i <= tablero.getLongitud(); i++) {
                    if (tablero.obtenerContenido(i).obtenerFila() == (fila - 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {                  
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            comando = "a";
                        }
                    }
                }
            }
            if (cuatro) {
                for (int i = 1; i <= tablero.getLongitud(); i++) {
                    if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {                  
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            comando = "a";
                        }
                    }
                }
            }
            if (cinco) {
                for (int i = 1; i <= tablero.getLongitud(); i++) {
                    if (tablero.obtenerContenido(i).obtenerFila() == fila && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {                  
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            comando = "a";
                        }
                    }
                }
            }
            if (seis) {
                for (int i = 1; i <= tablero.getLongitud(); i++) {
                    if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna - 1)) {                  
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            comando = "a";
                        }
                    }
                }
            }
            if (siete) {
                for (int i = 1; i <= tablero.getLongitud(); i++) {
                    if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == columna) {                  
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            comando = "a";
                        }
                    }
                }
            }
            if (ocho) {
                for (int i = 1; i <= tablero.getLongitud(); i++) {
                    if (tablero.obtenerContenido(i).obtenerFila() == (fila + 1) && tablero.obtenerContenido(i).obtenerColumna() == (columna + 1)) {                  
                        if ("caballero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "arquero".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "mago".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "gigante".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla()) || "dragon".equals(tablero.obtenerContenido(i).obtenerTipoDeCasilla())) {
                            comando = "a";
                        }
                    }
                }
            }
        } catch (ListaElementosExcepcion ex) {
            System.out.println(ex.getMessage());
        }
        return comando;
    }
    
    public abstract void moverPersonaje(ListaElementos<Casilla> tablero, String casillaAnterior, String direccion, ListaElementos<String> accionesEnemigos);
    
    public abstract void atacarPersonaje(ListaElementos<Casilla> tablero, ListaElementos<Arbol> arboles, ListaElementos<Personaje> personajesEnemigos, ListaElementos<String> casillasAnteriores, String direccion, ListaElementos<String> accionesEnemigos);
    
}
