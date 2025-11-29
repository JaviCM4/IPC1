
package com.mycompany.main.bot;

public class Bot {
    
    private char[][] mapaUtilizado;
    private int posicion = 0, fila, columna;
    char casillaActualBot, casillaAnteriorBot = 'G';
    
    public Bot(char[][] mapaUtilizado, int fila, int columna) {
        this.mapaUtilizado = mapaUtilizado;
        this.fila = fila;
        this.columna = columna;
    }
    
    public int analizarMovilidadBot(int fila, int columna) {
        int permiso = 0;
        
        switch (mapaUtilizado[fila][columna]) {
            case '#', 'S' -> permiso = 0;
            case 'O', 'G' -> permiso = 1;
            case 'J' -> permiso = 2;
            default -> {
            }
        }
        return permiso;
    }
    
    public int realizarMovimiento(int fallos) {
        
        if (jugadorEnLaMira()) {
            if (posicion == 0) {
                // Mover Izquierda
                if (analizarMovilidadBot(fila, columna - 1) == 1 || analizarMovilidadBot(fila, columna - 1) == 2) {

                    if (analizarMovilidadBot(fila, columna - 1) == 1) {
                        direccionarBot(1);
                        columna--;
                    } else {
                        fallos = 5;
                    }
                }
            } else if (posicion == 1) {
                // Mover Derecha
                if (analizarMovilidadBot(fila, columna + 1) == 1 || analizarMovilidadBot(fila, columna + 1) == 2) {

                    if (analizarMovilidadBot(fila, columna + 1) == 1) {
                        direccionarBot(2);
                        columna++;
                    } else {
                        fallos = 5;
                    }
                }
            } else if (posicion == 2) {
                // Mover Arriba
                if (analizarMovilidadBot(fila - 1, columna) == 1 || analizarMovilidadBot(fila - 1, columna) == 2) {

                    if (analizarMovilidadBot(fila - 1, columna) == 1) {
                        direccionarBot(3);
                        fila--;
                    } else {
                        fallos = 5;
                    }
                }
            } else if (posicion == 3) {
                // Mover Abajo
                if (analizarMovilidadBot(fila + 1, columna) == 1 || analizarMovilidadBot(fila + 1, columna) == 2) {

                    if (analizarMovilidadBot(fila + 1, columna) == 1) {
                        direccionarBot(4);
                        fila++;
                    } else {
                        fallos = 5;
                    }
                }
            } else if (posicion == 4) {
                // Mover Arriba-Izquierda
                if (analizarMovilidadBot(fila - 1, columna) == 1 || analizarMovilidadBot(fila - 1, columna) == 2) {

                    if (analizarMovilidadBot(fila - 1, columna) == 1) {
                        direccionarBot(3);
                        fila--;
                    } else {
                        fallos = 5;
                    }
                } else {
                    if (analizarMovilidadBot(fila, columna - 1) == 1 || analizarMovilidadBot(fila, columna - 1) == 2) {

                        if (analizarMovilidadBot(fila, columna - 1) == 1) {
                            direccionarBot(1);
                            columna--;
                        } else {
                            fallos = 5;
                        }
                    }
                }
            } else if (posicion == 5) {
                // Mover Arriba-Derecha
                if (analizarMovilidadBot(fila - 1, columna) == 1 || analizarMovilidadBot(fila - 1, columna) == 2) {

                    if (analizarMovilidadBot(fila - 1, columna) == 1) {
                        direccionarBot(3);
                        fila--;
                    } else {
                        fallos = 5;
                    }
                } else {
                    if (analizarMovilidadBot(fila, columna + 1) == 1 || analizarMovilidadBot(fila, columna + 1) == 2) {

                        if (analizarMovilidadBot(fila, columna + 1) == 1) {
                            direccionarBot(2);
                            columna++;
                        } else {
                            fallos = 5;
                        }
                    }
                }
            } else if (posicion == 6) {
                // Mover Abajo-Izquierda
                if (analizarMovilidadBot(fila + 1, columna) == 1 || analizarMovilidadBot(fila + 1, columna) == 2) {

                    if (analizarMovilidadBot(fila + 1, columna) == 1) {
                        direccionarBot(4);
                        fila++;
                    } else {
                        fallos = 5;
                    }
                } else {
                    if (analizarMovilidadBot(fila, columna - 1) == 1 || analizarMovilidadBot(fila, columna - 1) == 2) {

                        if (analizarMovilidadBot(fila, columna - 1) == 1) {
                            direccionarBot(1);
                            columna--;
                        } else {
                            fallos = 5;
                        }
                    }
                }
            } else if (posicion == 7) {
                // Mover Abajo-Derecha
                if (analizarMovilidadBot(fila + 1, columna) == 1 || analizarMovilidadBot(fila + 1, columna) == 2) {

                    if (analizarMovilidadBot(fila + 1, columna) == 1) {
                        direccionarBot(4);
                        fila++;
                    } else {
                        fallos = 5;
                    }
                } else {
                    if (analizarMovilidadBot(fila, columna + 1) == 1 || analizarMovilidadBot(fila, columna + 1) == 2) {

                        if (analizarMovilidadBot(fila, columna + 1) == 1) {
                            direccionarBot(2);
                            columna++;
                        } else {
                            fallos = 5;
                        }
                    }
                }
            }                    
        } else {
            double random_1 = Math.random();
            boolean movimientoBot = false;

            while (!movimientoBot) {
                if (random_1 < 0.25) {
                    // Mover a la Izquierda
                    if (analizarMovilidadBot(fila, columna - 1) == 0) {
                        random_1 = 0.375;
                    } else if (analizarMovilidadBot(fila, columna - 1) == 1) {
                        direccionarBot(1);
                        columna--;
                        movimientoBot = true;
                    } else {
                        movimientoBot = true;
                        fallos = 5;
                    }
                }
                if (random_1 >= 0.25 && random_1 < 0.50) {
                    // Mover a la Derecha
                    if (analizarMovilidadBot(fila, columna + 1) == 0) {
                        random_1 = 0.625;
                    } else if (analizarMovilidadBot(fila, columna + 1) == 1) {
                        direccionarBot(2);
                        columna++;
                        movimientoBot = true;
                    } else {
                        movimientoBot = true;
                        fallos = 5;
                    }
                }
                if (random_1 >= 0.50 && random_1 < 0.75) {
                    // Mover Arriba
                    if (analizarMovilidadBot(fila - 1, columna) == 0) {
                        random_1 = 0.875;
                    } else if (analizarMovilidadBot(fila - 1, columna) == 1) {
                        direccionarBot(3);
                        fila--;
                        movimientoBot = true;
                    } else {
                        movimientoBot = true;
                        fallos = 5;
                    }
                }
                if (random_1 >= 0.75 && random_1 < 1) {
                    // Mover Abajo
                    if (analizarMovilidadBot(fila + 1, columna) == 0) {
                        random_1 = 0.125;
                    } else if (analizarMovilidadBot(fila + 1, columna) == 1) {
                        direccionarBot(4);
                        fila++;
                        movimientoBot = true;
                    } else {
                        movimientoBot = true;
                        fallos = 5;
                    }
                }
            }
        }
        return fallos;
    }
    
    private void direccionarBot(int posicion) {
        
        if (posicion == 1) {
            // Izquierda
            casillaActualBot = mapaUtilizado[fila][columna - 1];
            mapaUtilizado[fila][columna] = casillaAnteriorBot;
            mapaUtilizado[fila][columna - 1] = 'B';
            casillaAnteriorBot = casillaActualBot;
        } else if (posicion == 2) {
            // Derecha
            casillaActualBot = mapaUtilizado[fila][columna + 1];
            mapaUtilizado[fila][columna] = casillaAnteriorBot;
            mapaUtilizado[fila][columna + 1] = 'B';
            casillaAnteriorBot = casillaActualBot;
        } else if (posicion == 3) {
            // Arriba
            casillaActualBot = mapaUtilizado[fila - 1][columna];
            mapaUtilizado[fila][columna] = casillaAnteriorBot;
            mapaUtilizado[fila - 1][columna] = 'B';
            casillaAnteriorBot = casillaActualBot;
        } else {
            // Abajo
            casillaActualBot = mapaUtilizado[fila + 1][columna];
            mapaUtilizado[fila][columna] = casillaAnteriorBot;
            mapaUtilizado[fila + 1][columna] = 'B';
            casillaAnteriorBot = casillaActualBot;
        }
    }
    
    public boolean jugadorEnLaMira() {
        boolean jugadorVisto = false;
      
        if (mapaUtilizado[fila][columna - 2] == 'J' || mapaUtilizado[fila][columna - 1] == 'J') {
            jugadorVisto = true;
            posicion = 0;
        }
        if (mapaUtilizado[fila][columna + 2] == 'J' || mapaUtilizado[fila][columna + 1] == 'J') {
            jugadorVisto = true;
            posicion = 1;
        }
        if (mapaUtilizado[fila - 2][columna] == 'J' || mapaUtilizado[fila - 1][columna] == 'J') {
            jugadorVisto = true;
            posicion = 2;
        }
        if (mapaUtilizado[fila + 2][columna] == 'J' || mapaUtilizado[fila + 1][columna] == 'J') {
            jugadorVisto = true;
            posicion = 3;
        }
        if (mapaUtilizado[fila - 2][columna - 2] == 'J' || mapaUtilizado[fila - 2][columna - 1] == 'J' || mapaUtilizado[fila - 1][columna - 2] == 'J' || mapaUtilizado[fila - 1][columna - 1] == 'J') {
            jugadorVisto = true;
            posicion = 4;
        }
        if (mapaUtilizado[fila - 2][columna + 2] == 'J' || mapaUtilizado[fila - 2][columna + 1] == 'J' || mapaUtilizado[fila - 1][columna + 2] == 'J' || mapaUtilizado[fila - 1][columna + 1] == 'J') {
            jugadorVisto = true;
            posicion = 5;
        }
        if (mapaUtilizado[fila + 1][columna - 2] == 'J' || mapaUtilizado[fila + 1][columna - 1] == 'J' || mapaUtilizado[fila + 2][columna - 2] == 'J' || mapaUtilizado[fila + 2][columna - 1] == 'J') {
            jugadorVisto = true;
            posicion = 6;
        }
        if (mapaUtilizado[fila + 1][columna + 2] == 'J' || mapaUtilizado[fila + 1][columna + 1] == 'J' || mapaUtilizado[fila + 2][columna + 2] == 'J' || mapaUtilizado[fila + 2][columna + 1] == 'J') {
            jugadorVisto = true;
            posicion = 7;
        }
        return jugadorVisto;
    }
}
