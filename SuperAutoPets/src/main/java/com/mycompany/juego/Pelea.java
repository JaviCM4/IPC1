/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

import com.mycompany.juego.animales.*;

/**
 *
 * @author DELL
 */
public class Pelea {    
    private final Hormiga Hormiga;
    private final Pescado Pescado;
    private final Mosquito Mosquito;
    private final Grillo Grillo;
    private final Castor Castor;
    private final Caballo Caballo;
    private final Nutria Nutria;
    private final Escarabajo Escarabajo;
    private final ControlDelAnimal Jugador;    
    
    public Pelea() {
        Hormiga = new Hormiga();
        Pescado = new Pescado();
        Mosquito = new Mosquito();
        Grillo = new Grillo();
        Castor = new Castor();
        Caballo =  new Caballo();
        Nutria = new Nutria();
        Escarabajo = new Escarabajo();
        Jugador = new ControlDelAnimal();
    }
    
    public int correrBatalla(String mascotaJugador[], String mascotaBot[], int victoria) {
        String contrincante = null;
        String contrincante2 = null;
        int partida = 0;
        int vidaJugador = 0;
        int dañoJugador = 0;
        int vidaJugador1 = 0;
        int dañoJugador1 = 0;
        int vidaJugador2 = 0;
        int dañoJugador2 = 0;
        int vidaJugador3 = 0;
        int dañoJugador3 = 0;
        int vidaJugador4 = 0;
        int dañoJugador4 = 0;
        int vidaJugador5 = 0;
        int dañoJugador5 = 0;               
        int vidaBot = 0;
        int dañoBot = 0;
        int vidaBot1 = 0;
        int dañoBot1 = 0;
        int vidaBot2 = 0;
        int dañoBot2 = 0;
        int vidaBot3 = 0;
        int dañoBot3 = 0;
        int vidaBot4 = 0;
        int dañoBot4 = 0;
        int vidaBot5 = 0;
        int dañoBot5 = 0;        
        String archivo = null;
        String archivo1 = mascotaJugador[0];
        String archivo2 = mascotaJugador[1];
        String archivo3 = mascotaJugador[2];
        String archivo4 = mascotaJugador[3];
        String archivo5 = mascotaJugador[4];
        
        System.out.println("Enfrentamiento entre: ");
        System.out.println(mascotaJugador[0] + " / " + mascotaJugador[1] + " / " + mascotaJugador[2] + " / " + mascotaJugador[3] + " / " + mascotaJugador[4] + "  vs  " + mascotaBot[0] + " / " + mascotaBot[1] + " / " + mascotaBot[2] + " / " + mascotaBot[3] + " / " + mascotaBot[4]);
        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            
            if (!"------".equals(mascotaJugador[i])) {
                
                if (i == 0) {
                    archivo = mascotaJugador[0];
                }

                if (i == 1) {
                    archivo = mascotaJugador[1];            
                }

                if (i == 2) {
                    archivo = mascotaJugador[2];            
                }

                if (i == 3) {
                    archivo = mascotaJugador[3];            
                }

                if (i == 4) {
                    archivo = mascotaJugador[4];            
                }   
                
                if ("Hormiga".equals(archivo)) {  
                    vidaJugador = Jugador.darVida(archivo);
                    dañoJugador = Jugador.darDaño(archivo);
                    System.out.println("Vida Hormiga:" + vidaJugador);
                    System.out.println("Daño Hormiga:" + dañoJugador);
                }   

                if ("Pescado".equals(archivo)) {
                    vidaJugador = Pescado.mandarVida();
                    dañoJugador = Pescado.mandarDaño();
                }  

                if ("Mosquito".equals(archivo)) {
                    vidaJugador = Mosquito.mandarVida();
                    dañoJugador = Mosquito.mandarDaño();
                }              

                if ("Grillo".equals(archivo)) {
                    vidaJugador = Grillo.mandarVida();
                    dañoJugador = Grillo.mandarDaño();
                }  

                if ("Castor".equals(archivo)) {
                    vidaJugador = Castor.mandarVida();
                    dañoJugador = Castor.mandarDaño();
                }   

                if ("Caballo".equals(archivo)) {
                    vidaJugador = Caballo.mandarVida();
                    dañoJugador = Caballo.mandarDaño();            
                }

                if ("Nutria".equals(archivo)) {
                    vidaJugador = Nutria.mandarVida();
                    dañoJugador = Nutria.mandarDaño();
                }   

                if ("Escarabajo".equals(archivo)) {
                    vidaJugador = Escarabajo.mandarVida();
                    dañoJugador = Escarabajo.mandarDaño();            
                } 
                
                if (i == 0) {
                    vidaJugador1 = vidaJugador;
                    dañoJugador1 = dañoJugador;
                }
                
                if (i == 1) {
                    vidaJugador2 = vidaJugador;
                    dañoJugador2 = dañoJugador;
                }

                if (i == 2) {
                    vidaJugador3 = vidaJugador;
                    dañoJugador3 = dañoJugador;
                }

                if (i == 3) {
                    vidaJugador4 = vidaJugador;
                    dañoJugador4 = dañoJugador;
                }

                if (i == 4) {
                    vidaJugador5 = vidaJugador;
                    dañoJugador5 = dañoJugador;
                }                
            }
        }
        
        for (int i = 0; i < 5; i++) {
                
            if (i == 0) {
                archivo = mascotaBot[0];
            }

            if (i == 1) {
                archivo = mascotaBot[1];            
            }

            if (i == 2) {
                archivo = mascotaBot[2];            
            }

            if (i == 3) {
                archivo = mascotaBot[3];            
            }

            if (i == 4) {
                archivo = mascotaBot[4];            
            }   
                
            if ("Hormiga".equals(archivo)) { 
                vidaBot = Hormiga.mandarVida();
                dañoBot = Hormiga.mandarDaño();
                System.out.println("Vida de la Hormiga bot: " + vidaBot);
                System.out.println("Vida de la Hormiga bot: " + dañoBot);                
            }   

            if ("Pescado".equals(archivo)) {
                vidaBot = Pescado.mandarVida();
                dañoBot = Pescado.mandarDaño();
            }  

            if ("Mosquito".equals(archivo)) {
                vidaBot = Mosquito.mandarVida();
                dañoBot = Mosquito.mandarDaño();
            }              

            if ("Grillo".equals(archivo)) {
                vidaBot = Grillo.mandarVida();
                dañoBot = Grillo.mandarDaño();
            }  

            if ("Castor".equals(archivo)) {
                vidaBot = Castor.mandarVida();
                dañoBot = Castor.mandarDaño();
            }   

            if ("Caballo".equals(archivo)) {
                vidaBot = Caballo.mandarVida();
                dañoBot = Caballo.mandarDaño();            
            }

            if ("Nutria".equals(archivo)) {
                vidaBot = Nutria.mandarVida();
                dañoBot = Nutria.mandarDaño();
            }   

            if ("Escarabajo".equals(archivo)) {
                vidaBot = Escarabajo.mandarVida();
                dañoBot = Escarabajo.mandarDaño();            
            } 
                
            if (i == 0) {
                vidaBot1 = vidaBot;
                dañoBot1 = dañoBot;
            }
              
            if (i == 1) {
                vidaBot2 = vidaBot;
                dañoBot2 = dañoBot;
            } 
            
            if (i == 2) {
                vidaBot3 = vidaBot;
                dañoBot3 = dañoBot;
            }

            if (i == 3) {
                vidaBot4 = vidaBot;
                dañoBot4 = dañoBot;
            }

            if (i == 4) {
                vidaBot5 = vidaBot;
                dañoBot5 = dañoBot;
            }                
        }       
        
        int batalla = 1; 
        int arreglo = 4;
        int arreglo1 = 0;
            
        while (batalla != 0) {
            System.out.println();
            System.out.println("¡¡¡Batalla!!!");
            System.out.println();  
            
            while (arreglo != -1) {
            
                if ("------".equals(mascotaJugador[arreglo])) {
                    arreglo = arreglo - 1;
                } else  {
                    contrincante = mascotaJugador[arreglo];
                    break;
                }
            }
            
            while (arreglo1 != 5) {
                
                if ("------".equals(mascotaBot[arreglo1])) {
                    arreglo1 = arreglo1 + 1;
                } else {
                    contrincante2 = mascotaBot[arreglo1];   
                    break;
                }                
            }   
            
            System.out.println(contrincante + "  vs  " + contrincante2);
            System.out.println();
            
            int vidaAnimalJugador = 0;
            int dañoAnimalJugador = 0;
            int vidaAnimalBot = 0;
            int dañoAnimalBot = 0;
            
            if (arreglo == 0) {
                vidaAnimalJugador = vidaJugador1;
                dañoAnimalJugador = dañoJugador1;                
            }
            
            if (arreglo == 1) {
                vidaAnimalJugador = vidaJugador2;
                dañoAnimalJugador = dañoJugador2;             
            }
            
            if (arreglo == 2) {
                vidaAnimalJugador = vidaJugador3;
                dañoAnimalJugador = dañoJugador3;             
            }
            
            if (arreglo == 3) {
                vidaAnimalJugador = vidaJugador4;
                dañoAnimalJugador = dañoJugador4;             
            }
            
            if (arreglo == 4) {
                vidaAnimalJugador = vidaJugador5;
                dañoAnimalJugador = dañoJugador5;             
            }
            
            if (arreglo1 == 0) {
                vidaAnimalBot = vidaBot1;
                dañoAnimalBot = dañoBot1;                
            }
            
            if (arreglo1 == 1) {
                vidaAnimalBot = vidaBot2;
                dañoAnimalBot = dañoBot2;             
            }
            
            if (arreglo1 == 2) {
                vidaAnimalBot = vidaBot3;
                dañoAnimalBot = dañoBot3;             
            }
            
            if (arreglo1 == 3) {
                vidaAnimalBot = vidaBot4;
                dañoAnimalBot = dañoBot4;             
            }
            
            if (arreglo1 == 4) {
                vidaAnimalBot = vidaBot5;
                dañoAnimalBot = dañoBot5;             
            }
            
            while (vidaAnimalJugador > 0 && vidaAnimalBot > 0) {
                vidaAnimalJugador -= dañoAnimalBot;
                vidaAnimalBot -= dañoAnimalJugador;
                
                if (vidaAnimalJugador <= 0) {
                    System.out.println(contrincante + " recibio un daño de " + dañoAnimalBot + " y quedo fuera de combate ya que quedo con " + vidaAnimalJugador + " de vida");
                    mascotaJugador[arreglo] = "------";
                    System.out.println();
                } else {
                    System.out.println(contrincante + " recibio un daño de " + dañoAnimalBot + " pero resistio al ataque quedando con " + vidaAnimalJugador + " de vida");
                    System.out.println();
                }
                
                if (vidaAnimalBot <= 0) {
                    System.out.println(contrincante2 + " recibio un daño de " + dañoAnimalJugador + " y quedo fuera de combate ya que quedo con " + vidaAnimalBot + " de vida");
                    System.out.println();
                    mascotaBot[arreglo1] = "------";           
                } else {
                    System.out.println(contrincante2 + " recibio un daño de " + dañoAnimalBot + " pero resistio al ataque quedando con " + vidaAnimalBot + " de vida");
                    System.out.println();
                }
            }     
            
            if (arreglo == 0) {
                vidaJugador1 = vidaAnimalJugador;
                dañoJugador1 = dañoAnimalJugador;                
            }
            
            if (arreglo == 1) {
                vidaJugador2 = vidaAnimalJugador;
                dañoJugador2 = dañoAnimalJugador;              
            }
            
            if (arreglo == 2) {
                vidaJugador3 = vidaAnimalJugador;
                dañoJugador3 = dañoAnimalJugador;               
            }
            
            if (arreglo == 3) {
                vidaJugador4 = vidaAnimalJugador;
                dañoJugador4 = dañoAnimalJugador;          
            }
            
            if (arreglo == 4) {
                vidaJugador5 = vidaAnimalJugador;
                dañoJugador5 = dañoAnimalJugador;           
            }
            
            if (arreglo1 == 0) {
                vidaBot1 = vidaAnimalBot;
                dañoBot1 = dañoAnimalBot;                
            }
            
            if (arreglo1 == 1) {
                vidaBot2 = vidaAnimalBot;
                dañoBot2 = dañoAnimalBot;            
            }
            
            if (arreglo1 == 2) {
                vidaBot3 = vidaAnimalBot;
                dañoBot3 = dañoAnimalBot;             
            }
            
            if (arreglo1 == 3) {
                vidaBot4 = vidaAnimalBot;
                dañoBot4 = dañoAnimalBot;            
            }
            
            if (arreglo1 == 4) {
                vidaBot5 = vidaAnimalBot;
                dañoBot5 = dañoAnimalBot;             
            }
                    
            if ("------".equals(mascotaJugador[0])) {
                System.out.println("----Ganaste----");
                batalla = 0;
                partida = 1;
            }
            
            if ("------".equals(mascotaBot[4])) {
                batalla = 0;
                partida = 0;
            }
            
            if ("------".equals(mascotaJugador[0]) && "------".equals(mascotaBot[4])) {
                System.out.println();
                System.out.println("                ----Empate----");
                System.out.println("    Los 2 equipos quedaron si Animales vivos");
                batalla = 0;
                partida = 2;
            }
        }
        mascotaJugador[0] = archivo1;
        mascotaJugador[1] = archivo2;
        mascotaJugador[2] = archivo3;
        mascotaJugador[3] = archivo4;
        mascotaJugador[4] = archivo5;
        return partida;
    }
}    
