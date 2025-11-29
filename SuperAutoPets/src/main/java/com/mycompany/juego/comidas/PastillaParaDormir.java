/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego.comidas;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PastillaParaDormir extends Comida {
    
    public void activarEfecto(String mascotaJugador[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el animal al que desea darle la pastilla");
        System.out.println("1. " + mascotaJugador[0] + "    2. " + mascotaJugador[1] + "    3. " + mascotaJugador[2] + "    4. " + mascotaJugador[3] + "    5. " + mascotaJugador[4]); 
        int opcion = scanner.nextInt();
        
        if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5) {
            
            if (opcion == 1) {
                System.out.println("Dandole la pastilla al: " + mascotaJugador[0]);
                mascotaJugador[0] = mascotaJugador[1];
                mascotaJugador[1] = mascotaJugador[2];
                mascotaJugador[2] = mascotaJugador[3];
                mascotaJugador[3] = mascotaJugador[4];
                mascotaJugador[4] = "------";  
            }

            if (opcion == 2) {
                System.out.println("Dandole la pastilla al: " + mascotaJugador[1]);
                mascotaJugador[1] = mascotaJugador[2];
                mascotaJugador[2] = mascotaJugador[3];
                mascotaJugador[3] = mascotaJugador[4];
                mascotaJugador[4] = "------";            
            }

            if (opcion == 3) {
                System.out.println("Dandole la pastilla al: " + mascotaJugador[2]);
                mascotaJugador[2] = mascotaJugador[3];
                mascotaJugador[3] = mascotaJugador[4];
                mascotaJugador[4] = "------";             
            }

            if (opcion == 4) {
                System.out.println("Dandole la pastilla al: " + mascotaJugador[3]);
                mascotaJugador[3] = mascotaJugador[4];
                mascotaJugador[4] = "------";              
            }

            if (opcion == 5) {
                System.out.println("Dandole la pastilla al: " + mascotaJugador[4]);
                mascotaJugador[4] = "------";               
            }
        } else {
            System.out.println("        Numéro no reconocido, vuelva a intentarlo");
        }   
    }
}
