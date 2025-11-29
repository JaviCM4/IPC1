/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

import com.mycompany.juego.animales.*;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ControlDelJuego {
    private final ControlDelAnimal Jugador;
    private final Hormiga Hormiga;
    private final Pescado Pescado;
    private final Mosquito Mosquito;
    private final Grillo Grillo;
    private final Castor Castor;
    private final Caballo Caballo;
    private final Nutria Nutria;
    private final Escarabajo Escarabajo;
    private final Sapo Sapo;
    private final Dodo Dodo;
    private final Elefante Elefante;
    private final PuercoEspin PuercoEspin;
    private final PavoReal PavoReal;
    private final Rata Rata;
    private final Zorro Zorro;
    private final Araña Araña;
    private final Camello Camello;
    private final Mapache Mapache;
    private final Jirafa Jirafa;
    private final Tortuga Tortuga;
    private final Caracol Caracol;
    private final Oveja Oveja;
    private final Conejo Conejo;
    private final Lobo Lobo;
    private final Buey Buey;
    private final Canguro Canguro;
    private final Buho Buho;
    private final Venado Venado;
    private final Loro Loro;
    private final Hipopotamo Hipopotamo;
    private final Delfin Delfin;
    private final Puma Puma;
    private final Ballena Ballena;
    private final Ardilla Ardilla;
    private final Llama Llama;
    private final Foca Foca;
    private final Jaguar Jaguar;
    private final Escorpion Escorpion;
    private final Rinoceronte Rinoceronte;
    private final Mono Mono;
    private final Cocodrilo Cocodrilo;
    private final Vaca Vaca;
    private final Chompipe Chompipe;
    private final Panda Panda;
    private final Gato Gato;
    private final Tigre Tigre;
    private final Serpiente Serpiente;
    private final Mamut Mamut;
    private final Leopardo Leopardo;
    private final Gorila Gorila;
    private final Pulpo Pulpo;
    private final Mosca Mosca;
    private final Quetzal Quetzal;
    private final Camaleon Camaleon;    
    
    public ControlDelJuego() {
        Jugador = new ControlDelAnimal();
        Hormiga = new Hormiga();
        Pescado = new Pescado();
        Mosquito = new Mosquito();
        Grillo = new Grillo();
        Castor = new Castor();
        Caballo = new Caballo();
        Nutria = new Nutria();
        Escarabajo =new Escarabajo();
        Sapo = new Sapo();
        Dodo = new Dodo();
        Elefante = new Elefante();
        PuercoEspin = new PuercoEspin(); 
        PavoReal = new PavoReal();
        Rata = new Rata();
        Zorro = new Zorro();
        Araña = new Araña();
        Camello = new Camello();
        Mapache = new Mapache();
        Jirafa = new Jirafa();
        Tortuga = new Tortuga();
        Caracol = new Caracol();
        Oveja = new Oveja();
        Conejo = new Conejo();
        Lobo = new Lobo();
        Buey = new Buey();
        Canguro = new Canguro();
        Buho = new Buho();
        Venado = new Venado();
        Loro = new Loro();
        Hipopotamo = new Hipopotamo();
        Delfin = new Delfin();
        Puma = new Puma();
        Ballena = new Ballena();
        Ardilla = new Ardilla();
        Llama = new Llama();
        Foca = new Foca();
        Jaguar = new Jaguar();
        Escorpion = new Escorpion();
        Rinoceronte = new Rinoceronte();
        Mono = new Mono();
        Cocodrilo = new Cocodrilo();
        Vaca = new Vaca();
        Chompipe = new Chompipe();
        Panda = new Panda();
        Gato = new Gato();
        Tigre = new Tigre();
        Serpiente = new Serpiente();
        Mamut = new Mamut();
        Leopardo = new Leopardo();
        Gorila = new Gorila();
        Pulpo = new Pulpo();
        Mosca = new Mosca();
        Quetzal = new Quetzal();
        Camaleon = new Camaleon();        
    }
    
    public void jugarPartida() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 2) {
            System.out.println();
            System.out.println("Seleccione un Número");
            System.out.println("    1. Modo Arena");
            System.out.println("    2. Salir");
            opcion = scanner.nextInt();
            System.out.println();

            switch (opcion) {
                case 1 -> modoArena();
                case 2 -> System.out.println("------Gracias por Jugar------");
                default -> System.out.println("        Número no reconocido, vuelva a intentarlo");
            }
        }    
    }
    
    public void modoArena() {
        Scanner scanner = new Scanner(System.in);
        int partida = 0;
        int vida = 10;
        int victoria = 0;
        int ronda = 1;
        String mascotaJugador[] = new String[6];
        String mascotaBot[] = new String[6];
       
        mascotaJugador[0] = "------"; mascotaJugador[1] = "------"; mascotaJugador[2] = "------"; mascotaJugador[3] = "------"; mascotaJugador[4] = "------"; mascotaJugador[5] = "-";
        mascotaBot[5] = "-";
        
        while (vida > 0 && victoria != 10) {
            int oro = 10;
            int opcion = 0; 
            int aleatorio = 0;
            int aleatorio1 = 0;
            int aleatorio2 = 0;
            int aleatorio3 = 0;
            int aleatorio4 = 0;
            int aleatorio5 = 0;
            String equipo = null;
            
            System.out.println("¡¡¡Preparate para Luchar!!!");
            System.out.println();
            System.out.println("Vida: " + vida);
            System.out.println("Victorias: " + victoria);
            System.out.println("Ronda: " + ronda);
            
            while (opcion != 5) {
                System.out.println("Oro: " + oro);
                System.out.println();
                System.out.println("Tu Equipo"); 
                System.out.println(mascotaJugador[0] + " / " + mascotaJugador[1] + " / " + mascotaJugador[2] + " / " + mascotaJugador[3] + " / " + mascotaJugador[4]); 
                System.out.println();
                System.out.println("Seleccione un Número");
	        System.out.println("    1. Comprar Mascotas");
                System.out.println("    2. Comprar Comida");
		System.out.println("    3. Ordenar Mascotas");		
		System.out.println("    4. Vender Mascotas");
		System.out.println("    5. Luchar");
		opcion = scanner.nextInt();
		System.out.println();
                
                switch (opcion) {
                    case 1 -> oro = comprarMascota(mascotaJugador,ronda,oro);
                    case 2 -> oro = comprarComida(mascotaJugador,ronda,oro);
                    case 3 -> ordenarMascota(mascotaJugador);
                    case 4 -> oro = venderMascota(mascotaJugador,oro);
                    case 5 -> System.out.println("Cargado Batalla.....");
                    default -> System.out.println("        Número no reconocido, vuelva a intentarlo");
                }
                System.out.println();
            }
            
            if (ronda == 1) {
                aleatorio1 = (int) (Math.random()*8); 
                aleatorio2 = (int) (Math.random()*8); 
                aleatorio3 = (int) (Math.random()*8);  
                aleatorio4 = (int) (Math.random()*8); 
                aleatorio5 = (int) (Math.random()*8);                  
            }
            
            if (ronda == 2 || ronda == 3) {
                aleatorio1 = (int) (Math.random()*16); 
                aleatorio2 = (int) (Math.random()*16); 
                aleatorio3 = (int) (Math.random()*16);  
                aleatorio4 = (int) (Math.random()*16); 
                aleatorio5 = (int) (Math.random()*16);                  
            }
            
            if (ronda == 4 || ronda == 5) {
                aleatorio1 = (int) (Math.random()*27); 
                aleatorio2 = (int) (Math.random()*27); 
                aleatorio3 = (int) (Math.random()*27);  
                aleatorio4 = (int) (Math.random()*27); 
                aleatorio5 = (int) (Math.random()*27);                  
            }
            
            if (ronda == 6 || ronda == 7) {
                aleatorio1 = (int) (Math.random()*35); 
                aleatorio2 = (int) (Math.random()*35); 
                aleatorio3 = (int) (Math.random()*35);  
                aleatorio4 = (int) (Math.random()*35); 
                aleatorio5 = (int) (Math.random()*35);                  
            }

            if (ronda == 8 || ronda == 9) {
                aleatorio1 = (int) (Math.random()*43); 
                aleatorio2 = (int) (Math.random()*43); 
                aleatorio3 = (int) (Math.random()*43);  
                aleatorio4 = (int) (Math.random()*43); 
                aleatorio5 = (int) (Math.random()*43);                  
            }   
            
            if (ronda == 10 || ronda == 11) {
                aleatorio1 = (int) (Math.random()*52); 
                aleatorio2 = (int) (Math.random()*52); 
                aleatorio3 = (int) (Math.random()*52);  
                aleatorio4 = (int) (Math.random()*52); 
                aleatorio5 = (int) (Math.random()*52);             
            }
            
            if (ronda >= 12) {
                aleatorio1 = (int) (Math.random()*54); 
                aleatorio2 = (int) (Math.random()*54); 
                aleatorio3 = (int) (Math.random()*54);  
                aleatorio4 = (int) (Math.random()*54); 
                aleatorio5 = (int) (Math.random()*54);             
            } 
            
            for (int contador = 0; contador < 5; contador++) {                   
                    
                if (contador == 0) {
                    aleatorio = aleatorio1;
                }
                    
                if (contador == 1) {
                    aleatorio = aleatorio2;
                }
                  
                if (contador == 2) {
                    aleatorio = aleatorio3;
                }
                    
                if (contador == 3) {
                    aleatorio = aleatorio4;
                }
                    
                if (contador == 4) {
                    aleatorio = aleatorio5;
                }
                                       
                switch (aleatorio) {
                    case 0 -> equipo = "Hormiga";
                    case 1 -> equipo = "Pescado";
                    case 2 -> equipo = "Mosquito";
                    case 3 -> equipo = "Grillo";
                    case 4 -> equipo = "Castor";
                    case 5 -> equipo = "Caballo";
                    case 6 -> equipo = "Nutria";
                    case 7 -> equipo = "Escarabajo";
                    case 8 -> equipo = "Sapo";
                    case 9 -> equipo = "Dodo";
                    case 10 -> equipo = "Elefante";  
                    case 11 -> equipo = "PuercoEspin";
                    case 12 -> equipo = "PavoReal";
                    case 13 -> equipo = "Rata";
                    case 14 -> equipo = "Zorro";
                    case 15 -> equipo = "Araña";        
                    case 16 -> equipo = "Camello";
                    case 17 -> equipo = "Mapache";
                    case 18 -> equipo = "Jirafa";  
                    case 19 -> equipo = "Tortuga";
                    case 20 -> equipo = "Caracol";
                    case 21 -> equipo = "Oveja";
                    case 22 -> equipo = "Conejo";
                    case 23 -> equipo = "Lobo"; 
                    case 24 -> equipo = "Buey";
                    case 25 -> equipo = "Canguro";
                    case 26 -> equipo = "Buho";   
                    case 27 -> equipo = "Venado";
                    case 28 -> equipo = "Loro";
                    case 29 -> equipo = "Hipopotamo";
                    case 30 -> equipo = "Delfin";
                    case 31 -> equipo = "Puma"; 
                    case 32 -> equipo = "Ballena";
                    case 33 -> equipo = "Ardilla";
                    case 34 -> equipo = "Llama";    
                    case 35 -> equipo = "Foca";
                    case 36 -> equipo = "Jaguar";
                    case 37 -> equipo = "Escorpion";
                    case 38 -> equipo = "Rinoceronte"; 
                    case 39 -> equipo = "Mono";
                    case 40 -> equipo = "Cocodrilo";
                    case 41 -> equipo = "Vaca";
                    case 42 -> equipo = "Chimpance";
                    case 43 -> equipo = "Panda";
                    case 44 -> equipo = "Gato";    
                    case 45 -> equipo = "Tigre";
                    case 46 -> equipo = "Serpiente";
                    case 47 -> equipo = "Mamut";
                    case 48 -> equipo = "Leopardo"; 
                    case 49 -> equipo = "Gorila";
                    case 50 -> equipo = "Pulpo";
                    case 51 -> equipo = "Mosca"; 
                    case 52 -> equipo = "Quetzal";
                    case 53 -> equipo = "Camaleon";                        
                    default -> {
                    }
                }
                
                if (contador == 0 || contador == 1 || contador == 2 || contador == 3 || contador == 4) {
                    mascotaBot[contador] = equipo;
                }
            }
            partida = correrBatalla(mascotaJugador,mascotaBot);
            
            if (partida == 0) {
                victoria += 1;
            }
            
            if (partida == 1) {
                
                if (ronda == 1 || ronda == 2 || ronda == 3) {
                    vida -= 1;
                }
                
                if (ronda == 4 || ronda == 5 || ronda == 6) {
                    vida -= 2;
                }
                
                if (ronda >= 7) {
                    vida -= 3;
                }
            }
            ronda += 1;
        }
        
        if (vida == 0) {
            System.out.println();
            System.out.println("         Te quedaste sin vida");
            System.out.println("          ----Perdiste----");
            System.out.println("          Suerte la Proxima");
        }
        
        if (victoria == 10) {
            System.out.println();
            System.out.println("        Has logrado 10 victorias");
            System.out.println("            ----Ganaste----");
            System.out.println("           ¡¡¡Felicidades!!!");
        }
    }
    
    public int comprarMascota(String mascotaJugador[], int ronda, int oro) {
        Scanner scanner = new Scanner(System.in);
        int aleatorio = 0;
        int aleatorio1 = 0;
        int aleatorio2 = 0;
        int aleatorio3 = 0;
        int aleatorio4 = 0;
        int aleatorio5 = 0;
        String comprar = null;
        String compra = null;
        String compra1 = null;
        String compra2 = null;
        String compra3 = null;
        String compra4 = null;
        String compra5 = null;
        
        if (oro != 0 && oro != 1 && oro != 2) {
            System.out.println("Eliga el Número del Animal que desea Comprar");
            
            if (ronda == 1) {
                aleatorio1 = (int) (Math.random()*8); 
                aleatorio2 = (int) (Math.random()*8); 
                aleatorio3 = (int) (Math.random()*8);  
                aleatorio4 = (int) (Math.random()*8); 
                aleatorio5 = (int) (Math.random()*8);                  
            }
            
            if (ronda == 2 || ronda == 3) {
                aleatorio1 = (int) (Math.random()*16); 
                aleatorio2 = (int) (Math.random()*16); 
                aleatorio3 = (int) (Math.random()*16);  
                aleatorio4 = (int) (Math.random()*16); 
                aleatorio5 = (int) (Math.random()*16);                  
            }
            
            if (ronda == 4 || ronda == 5) {
                aleatorio1 = (int) (Math.random()*27); 
                aleatorio2 = (int) (Math.random()*27); 
                aleatorio3 = (int) (Math.random()*27);  
                aleatorio4 = (int) (Math.random()*27); 
                aleatorio5 = (int) (Math.random()*27);                  
            }
            
            if (ronda == 6 || ronda == 7) {
                aleatorio1 = (int) (Math.random()*35); 
                aleatorio2 = (int) (Math.random()*35); 
                aleatorio3 = (int) (Math.random()*35);  
                aleatorio4 = (int) (Math.random()*35); 
                aleatorio5 = (int) (Math.random()*35);                  
            }

            if (ronda == 8 || ronda == 9) {
                aleatorio1 = (int) (Math.random()*43); 
                aleatorio2 = (int) (Math.random()*43); 
                aleatorio3 = (int) (Math.random()*43);  
                aleatorio4 = (int) (Math.random()*43); 
                aleatorio5 = (int) (Math.random()*43);                  
            }   
            
            if (ronda == 10 || ronda == 11) {
                aleatorio1 = (int) (Math.random()*52); 
                aleatorio2 = (int) (Math.random()*52); 
                aleatorio3 = (int) (Math.random()*52);  
                aleatorio4 = (int) (Math.random()*52); 
                aleatorio5 = (int) (Math.random()*52);             
            }
            
            if (ronda >= 12) {
                aleatorio1 = (int) (Math.random()*54); 
                aleatorio2 = (int) (Math.random()*54); 
                aleatorio3 = (int) (Math.random()*54);  
                aleatorio4 = (int) (Math.random()*54); 
                aleatorio5 = (int) (Math.random()*54);             
            } 

            for (int contador = 0; contador < 5; contador++) {                   
                    
                if (contador == 0) {
                    aleatorio = aleatorio1;
                }
                    
                if (contador == 1) {
                    aleatorio = aleatorio2;
                }
                  
                if (contador == 2) {
                    aleatorio = aleatorio3;
                }
                    
                if (contador == 3) {
                    aleatorio = aleatorio4;
                }
                    
                if (contador == 4) {
                    aleatorio = aleatorio5;
                }
                                       
                switch (aleatorio) {
                    case 0 -> compra = "Hormiga";
                    case 1 -> compra = "Pescado";
                    case 2 -> compra = "Mosquito";
                    case 3 -> compra = "Grillo";
                    case 4 -> compra = "Castor";
                    case 5 -> compra = "Caballo";
                    case 6 -> compra = "Nutria";
                    case 7 -> compra = "Escarabajo";
                    case 8 -> compra = "Sapo";
                    case 9 -> compra = "Dodo";
                    case 10 -> compra = "Elefante";  
                    case 11 -> compra = "PuercoEspin";
                    case 12 -> compra = "PavoReal";
                    case 13 -> compra = "Rata";
                    case 14 -> compra = "Zorro";
                    case 15 -> compra = "Araña";        
                    case 16 -> compra = "Camello";
                    case 17 -> compra = "Mapache";
                    case 18 -> compra = "Jirafa";  
                    case 19 -> compra = "Tortuga";
                    case 20 -> compra = "Caracol";
                    case 21 -> compra = "Oveja";
                    case 22 -> compra = "Conejo";
                    case 23 -> compra = "Lobo"; 
                    case 24 -> compra = "Buey";
                    case 25 -> compra = "Canguro";
                    case 26 -> compra = "Buho";   
                    case 27 -> compra = "Venado";
                    case 28 -> compra = "Loro";
                    case 29 -> compra = "Hipopotamo";
                    case 30 -> compra = "Delfin";
                    case 31 -> compra = "Puma"; 
                    case 32 -> compra = "Ballena";
                    case 33 -> compra = "Ardilla";
                    case 34 -> compra = "Llama";    
                    case 35 -> compra = "Foca";
                    case 36 -> compra = "Jaguar";
                    case 37 -> compra = "Escorpion";
                    case 38 -> compra = "Rinoceronte"; 
                    case 39 -> compra = "Mono";
                    case 40 -> compra = "Cocodrilo";
                    case 41 -> compra = "Vaca";
                    case 42 -> compra = "Chimpance";
                    case 43 -> compra = "Panda";
                    case 44 -> compra = "Gato";    
                    case 45 -> compra = "Tigre";
                    case 46 -> compra = "Serpiente";
                    case 47 -> compra = "Mamut";
                    case 48 -> compra = "Leopardo"; 
                    case 49 -> compra = "Gorila";
                    case 50 -> compra = "Pulpo";
                    case 51 -> compra = "Mosca"; 
                    case 52 -> compra = "Quetzal";
                    case 53 -> compra = "Camaleon";                        
                    default -> {
                    }    
                }

                if (contador == 0) {
                    compra1 = compra;
                }
                    
                if (contador == 1) {
                    compra2 = compra;
                }
                    
                if (contador == 2) {
                    compra3 = compra;
                }
                    
                if (contador == 3) {
                    compra4 = compra;
                }
                   
                if (contador == 4) {
                    compra5 = compra;
                }                    
            }                 
            
            
            if (ronda == 1 || ronda == 2 || ronda == 3) {
                
                System.out.println("    1. " + compra1);
                System.out.println("    2. " + compra2);
                System.out.println("    3. " + compra3);
                int opcion = scanner.nextInt();  
                
                if (opcion == 1 || opcion == 2 || opcion == 3) {
                    
                    if (opcion == 1) {
                        comprar = compra1;
                    }
                
                    if (opcion == 2) {
                        comprar = compra2;
                    }
                
                    if (opcion == 3) {
                        comprar = compra3;
                    }

                    int agregarAlEquipo = 1;
                
                    for (int i = 0; i < 5; i++) {
                        
                        for (int j = 0; j < 5; j++) {
                            
                            if (comprar.equals(mascotaJugador[j])) {
                                // animalesIguales += 1;
                            }
                        }
                    
                        if (comprar.equals(mascotaJugador[i])) {
                            System.out.println("Tiene un Animal del mismo tipo en tu equipo, desea fusionarlo?");
                            System.out.println("Seleccione un número");
                            System.out.println("    1. Si");
                            System.out.println("    2. No");
                            int decision = scanner.nextInt();
                        
                            if (decision == 1) {
                                int subir = Jugador.fusionarAnimal(comprar,mascotaJugador);
                                
                                if (subir == 6) {
                                    System.out.println("        Animal elevado al máximo");
                                } else {
                                    oro = controlarOro(oro);
                                }
                                agregarAlEquipo = 0;
                                break;
                            }

                            if (decision == 2) {
                                break;
                            }

                            if (decision != 1 || decision != 2) {
                                System.out.println("        Número no reconocido, vuelva a intentarlo");
                                break;
                            }
                        }                            
                    }
                
                    if (agregarAlEquipo == 1) {
                    
                        for (int i = 0; i < 5; i++) {
                        
                            if ("------".equals(mascotaJugador[i])) {
                                mascotaJugador[i] = comprar;
                                oro = controlarOro(oro);                
                                break;
                            } 
                        
                            if (i == 4) {
                                System.out.println("        No tienes espacio en tu equipo para comprar otro Animal");
                                System.out.println();
                            }
                        } 
                    }
                } else {
                    System.out.println("        Número no reconocido, vuelva a intentarlo");
                    System.out.println();
                }                
            }
            
            if (ronda == 4 || ronda == 5 || ronda == 6) {
                System.out.println("    1. " + compra1);
                System.out.println("    2. " + compra2);
                System.out.println("    3. " + compra3);
                System.out.println("    4. " + compra4);                
                int opcion = scanner.nextInt(); 
                
                if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                    
                    if (opcion == 1) {
                        comprar = compra1;
                    }
                
                    if (opcion == 2) {
                        comprar = compra2;
                    }
                
                    if (opcion == 3) {
                        comprar = compra3;
                    }
                    
                    if (opcion == 4) {
                        comprar = compra4;
                    }

                    int agregarAlEquipo = 1;
                
                    for (int i = 0; i < 5; i++) {
                    
                        if (comprar.equals(mascotaJugador[i])) {
                            System.out.println("Tiene un Animal del mismo tipo en tu equipo, desea fusionarlo?");
                            System.out.println("Seleccione un número");
                            System.out.println("    1. Si");
                            System.out.println("    2. No");
                            int decision = scanner.nextInt();
                        
                            if (decision == 1) {
                                int subir = Jugador.fusionarAnimal(comprar,mascotaJugador);
                                
                                if (subir == 6) {
                                    System.out.println("        Animal elevado al máximo");
                                } else {
                                    oro = controlarOro(oro);
                                }
                                agregarAlEquipo = 0;
                                break;
                            }

                            if (decision == 2) {
                                break;
                            }

                            if (decision != 1 || decision != 2) {
                                System.out.println("        Número no reconocido, vuelva a intentarlo");
                                break;
                            }
                        }                            
                    }
                
                    if (agregarAlEquipo == 1) {
                    
                        for (int i = 0; i < 5; i++) {
                        
                            if ("------".equals(mascotaJugador[i])) {
                                mascotaJugador[i] = comprar;
                                oro = controlarOro(oro);            
                                break;
                            } 
                        
                            if (i == 4) {
                                System.out.println("        No tienes espacio en tu equipo para comprar otro Animal");
                                System.out.println();
                            }
                        } 
                    }
                } else {
                    System.out.println("        Número no reconocido, vuelva a intentarlo");
                    System.out.println();
                }                   
            }
            
            if (ronda >= 7) {
                System.out.println("    1. " + compra1);
                System.out.println("    2. " + compra2);
                System.out.println("    3. " + compra3);
                System.out.println("    4. " + compra4);     
                System.out.println("    5. " + compra5);                 
                int opcion = scanner.nextInt();   
                
                if (opcion == 1 || opcion == 2 || opcion == 3 ||opcion == 4  || opcion == 5) {
                    
                    if (opcion == 1) {
                        comprar = compra1;
                    }
                
                    if (opcion == 2) {
                        comprar = compra2;
                    }
                
                    if (opcion == 3) {
                        comprar = compra3;
                    }
                    
                    if (opcion == 4) {
                        comprar = compra4;
                    }
                    
                    if (opcion == 5) {
                        comprar = compra5;
                    }

                    int agregarAlEquipo = 1;
                
                    for (int i = 0; i < 5; i++) {
                    
                        if (comprar.equals(mascotaJugador[i])) {
                            System.out.println("Tiene un Animal del mismo tipo en tu equipo, desea fusionarlo?");
                            System.out.println("Seleccione un número");
                            System.out.println("    1. Si");
                            System.out.println("    2. No");
                            int decision = scanner.nextInt();
                        
                            if (decision == 1) {
                                int subir = Jugador.fusionarAnimal(comprar,mascotaJugador);
                                
                                if (subir == 6) {
                                    System.out.println("        Animal elevado al máximo");
                                } else {
                                    oro = controlarOro(oro);
                                }
                                agregarAlEquipo = 0;
                                break;
                            }

                            if (decision == 2) {
                                break;
                            }

                            if (decision != 1 || decision != 2) {
                                System.out.println("        Número no reconocido, vuelva a intentarlo");
                                break;
                            }
                        }                            
                    }
                
                    if (agregarAlEquipo == 1) {
                    
                        for (int i = 0; i < 5; i++) {
                        
                            if ("------".equals(mascotaJugador[i])) {
                                mascotaJugador[i] = comprar;
                                oro = controlarOro(oro);
                                break;
                            } 
                        
                            if (i == 4) {
                                System.out.println("        No tienes espacio en tu equipo para comprar otro Animal");
                                System.out.println();
                            }
                        } 
                    }
                } else {
                    System.out.println("        Número no reconocido, vuelva a intentarlo");
                    System.out.println();
                } 
            }            
        } else {
            System.out.println("        No tienes suficiente Oro para comprar Animales");	
            System.out.println();
        }
        return oro;
    }
    
    public int comprarComida(String mascotaJugador[], int ronda, int oro) {
        Scanner scanner = new Scanner(System.in);
        String compra = null;
        String compra1 = null;
        String compra2 = null;
        int aleatorio = 0;
        int aleatorio1 = 0;
        int aleatorio2 = 0;
        
        if (oro != 0 && oro != 1 && oro != 2) {
            System.out.println("Eliga el Número de la Comida que desea Comprar");
				
            if (ronda == 1) {
                aleatorio1 = (int) (Math.random()*3);
                aleatorio2 = (int) (Math.random()*3);
            }
            
            if (ronda == 2 || ronda == 3) {
                aleatorio1 = (int) (Math.random()*6);
                aleatorio2 = (int) (Math.random()*6);
            }
					
            if (ronda == 4 || ronda == 5) {
                aleatorio1 = (int) (Math.random()*10);
                aleatorio2 = (int) (Math.random()*10);
            }
					
            if (ronda == 6 || ronda == 7) {
                aleatorio1 = (int) (Math.random()*13);
                aleatorio2 = (int) (Math.random()*13);                         
            }
            
            if (ronda == 8 || ronda == 9) {
                aleatorio1 = (int) (Math.random()*15);
                aleatorio2 = (int) (Math.random()*15);
            } 
            
            if (ronda == 10 || ronda == 11) {
                aleatorio1 = (int) (Math.random()*17);
                aleatorio2 = (int) (Math.random()*17);
            }
				
            if (ronda >= 12) {
                aleatorio1 = (int) (Math.random()*18);
                aleatorio2 = (int) (Math.random()*18);
            }
            
            for (int contador = 0; contador < 2; contador++) {                   
                    
                if (contador == 0) {
                    aleatorio = aleatorio1;
                }
                    
                if (contador == 1) {
                    aleatorio = aleatorio2;
                }
                                       
                switch (aleatorio) {
                    case 0 -> compra = "Manzana";
                    case 1 -> compra = "Naranja";
                    case 2 -> compra = "Miel";
                    case 3 -> compra = "Pastelito";
                    case 4 -> compra = "HuesoDeCarne";
                    case 5 -> compra = "PastillaParaDormir";
                    case 6 -> compra = "Ajo";
                    case 7 -> compra = "Ensalada";
                    case 8 -> compra = "ComidaEnlatada";
                    case 9 -> compra = "Pera";     
                    case 10 -> compra = "Chile";
                    case 11 -> compra = "Chocolate";
                    case 12 -> compra = "Sushi";    
                    case 13 -> compra = "Melón";
                    case 14 -> compra = "Hongo"; 
                    case 15 -> compra = "Pizza";
                    case 16 -> compra = "Carne";
                    case 17 -> compra = "Gelatina";     
                    default -> {
                    }    
                }

                if (contador == 0) {
                    compra1 = compra;
                }

                if (contador == 1) {
                    compra2 = compra;
                }                 
            }     
            
            System.out.println("    1. " + compra1);
            System.out.println("    2. " + compra2);
            int opcion = scanner.nextInt();
                
            switch (opcion) {
                case 1 -> { String enviarComida = compra1;
                            Jugador.darComida(enviarComida, mascotaJugador);
                            oro = controlarOro(oro);
                    }
                case 2 -> { String enviarComida = compra2;
                            Jugador.darComida(enviarComida, mascotaJugador);
                            oro = controlarOro(oro);
                    }
                default -> System.out.println("        Número no reconocido, vuelva a intentarlo");
            }
				
        } else {
            System.out.println("        No tienes suficiente Oro para comprar Comida");
            System.out.println();
        }
        return oro;
    }
    
    public void ordenarMascota(String mascotaJugador[]) {
        Scanner scanner = new Scanner(System.in);
    	System.out.println("1. " + mascotaJugador[0] + "    2. " + mascotaJugador[1] + "    3. " + mascotaJugador[2] + "    4. " + mascotaJugador[3] + "    5. " + mascotaJugador[4]);
	System.out.println();
	System.out.println("Seleccione el Número del Animal que desea cambiar");
	int indice = scanner.nextInt();
	System.out.println("Ahora seleccione el Número del Animal por el que lo desea cambiar");
	int indice1 = scanner.nextInt();
	System.out.println();
			
	if (indice >= 1 && indice <= 5 && indice1 >= 0 && indice1 <= 5) {
            int cambio1 = indice - 1;
            int cambio2 = indice1 - 1; 
				
            String cambio = mascotaJugador[cambio1];
            mascotaJugador[cambio1] = mascotaJugador[cambio2];
            mascotaJugador[cambio2] = cambio;
				
            System.out.println(mascotaJugador[0] + "  /  " + mascotaJugador[1] + "  /  " + mascotaJugador[2] + "  /  " + mascotaJugador[3] + "  /  " + mascotaJugador[4]);
            System.out.println("Se realizo el cambio");				
        } else { 
            System.out.println("        Número no reconocido, vuelva a intentarlo");
            System.out.println("	No se realizo el cambio");				
        }
    }
    
    public int venderMascota(String mascotaJugador[], int oro) {
        int oroRecibido = Jugador.venderMascota(mascotaJugador);
        oro = oro + oroRecibido;
        return oro;
    }
    
    public int controlarOro(int oro) {
        int oro1 = oro;
        oro1 -= 3;     
        return oro1; 
    }
    
    public int correrBatalla(String mascotaJugador[], String mascotaBot[]) {
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
        int nivel = 0;
        int aumento = 0;
        int aumento1 = 0;
        int numeroHormiga = 5;
        int contadorHormiga = 0;
        int numeroGrillo = 5;
        int contadorGrillo = 0;
        int numeroGrilloBot = 5;
        int contadorGrilloBot = 0;
        int numeroCastor = 5;
        int contadorCastor = 0;
        int numeroRata = 5;
        int contadorRata = 0;
        int numeroAraña = 5;
        int contadorAraña = 0;
        int numeroTortuga = 5;
        int contadorTortuga = 0;
        int numeroOveja = 5;
        int contadorOveja = 0;
        int numeroOvejaBot = 5;
        int contadorOvejaBot = 0;
        int numeroVenado = 5;
        int contadorVenado = 0;
        int numeroMamut = 5;
        int contadorMamut = 0;
        String archivo1 = mascotaJugador[0];
        String archivo2 = mascotaJugador[1];
        String archivo3 = mascotaJugador[2];
        String archivo4 = mascotaJugador[3];
        String archivo5 = mascotaJugador[4];
        
        System.out.println("Enfrentamiento Entre: ");
        System.out.println(mascotaJugador[0] + " / " + mascotaJugador[1] + " / " + mascotaJugador[2] + " / " + mascotaJugador[3] + " / " + mascotaJugador[4] + "  vs  " + mascotaBot[0] + " / " + mascotaBot[1] + " / " + mascotaBot[2] + " / " + mascotaBot[3] + " / " + mascotaBot[4]);
        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            if ("Hormiga".equals(mascotaJugador[i])) {
                numeroHormiga = i;
            }     
            if ("Grillo".equals(mascotaJugador[i])) {
                numeroGrillo = i;
            }
            if ("Castor".equals(mascotaJugador[i])) {
                numeroCastor = i;
            }     
            if ("Araña".equals(mascotaJugador[i])) {
                numeroAraña = i;
            }
            if ("Rata".equals(mascotaJugador[i])) {
                numeroRata = i;
            }
            if ("Tortuga".equals(mascotaJugador[i])) {
                numeroTortuga = i;
            }
            if ("Oveja".equals(mascotaJugador[i])) {
                numeroOveja = i;
            }
            if ("Venado".equals(mascotaJugador[i])) {
                numeroVenado = i;
            }
            if ("Grillo".equals(mascotaBot[i])) {
                numeroGrilloBot = i;
            }
            if ("Oveja".equals(mascotaBot[i])) {
                numeroOvejaBot = i;
            }
        }
        
        for (int i = 0; i < 5; i++) {           
            if (!"------".equals(mascotaJugador[i])) {                 
                vidaJugador = Jugador.darVida(mascotaJugador[i]);
                dañoJugador = Jugador.darDaño(mascotaJugador[i]); 

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
            vidaBot = darVida1(mascotaBot[i]);
            dañoBot = darDaño1(mascotaBot[i]);
            
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
        
        for (int i = 0; i < 5; i++) {       
            if ("Mosquito".equals(mascotaJugador[i])) {
                nivel = Jugador.darNivel(mascotaJugador[i]);    
                System.out.println("Activando Piquete del Mosquito");
                
                if (nivel == 1) {
                    vidaBot2 -= 1;
                }                  
                if (nivel == 2) {
                    vidaBot1 -= 1;
                    vidaBot3 -= 1;
                }
                if (nivel == 3) {
                    vidaBot2 -= 1;
                    vidaBot4 -= 1;
                    vidaBot5 -= 1;
                }
            }    

            if ("Caballo".equals(mascotaJugador[i])) {
                nivel = Jugador.darNivel(mascotaJugador[i]); 
                System.out.println("Activando Rugido de Aliado del Caballo");
                int aleatorio = (int) (Math.random()*i);                

                if (nivel == 1) {
                    aumento1 = 1;
                }               
                if (nivel == 2) {
                    aumento1 = 2;
                }
                if (nivel == 3) {
                    aumento1 = 3;
                }
                
                if (i != 0) {
                    if (aleatorio == 0) {
                        dañoJugador1 += aumento1;
                    }                    
                }              
                if (aleatorio == 1) {
                    dañoJugador1 += aumento1;
                    dañoJugador2 += aumento1;
                }
                if (aleatorio == 2) {
                    dañoJugador1 += aumento1;
                    dañoJugador2 += aumento1;
                    dañoJugador3 += aumento1;
                }
                if (aleatorio == 3) {
                    dañoJugador1 += aumento1;
                    dañoJugador2 += aumento1;
                    dañoJugador3 += aumento1;
                    dañoJugador4 += aumento1;
                }
            }
            
            if ("Nutria".equals(mascotaJugador[i])) {
                nivel = Jugador.darNivel(mascotaJugador[i]);     
                System.out.println("Activando Ventaja Economica de la Nutria");
                int aleatorio = (int) (Math.random()*i); 
                
                if (nivel == 1) {
                    aumento = 1;
                }               
                if (nivel == 2) {
                    aumento = 2;                   
                }
                if (nivel == 3) {
                    aumento = 3;             
                }

                if (i != 0) {
                    if (aleatorio == 0) {
                        vidaJugador1 += aumento;
                        dañoJugador1 += aumento;
                    }                 
                }           
                if (aleatorio == 1) {
                    vidaJugador2 += aumento;
                    dañoJugador2 += aumento;
                } 
                if (aleatorio == 2) {
                    vidaJugador3 += aumento;
                    dañoJugador3 += aumento;
                } 
                if (aleatorio == 3) {
                    vidaJugador4 += aumento;
                    dañoJugador4 += aumento;
                }                                   
            }  
            
            if ("Sapo".equals(mascotaJugador[i])) {
                System.out.println("Activando Metamorfosis del Sapo");
                int vida = 0;
                int vidaAEvaluar = 0;
                
                for (int j = 0; j < 5; j++) {
                    if (j == 0) {
                        vidaAEvaluar = vidaJugador1;
                    }
                    if (j == 1) {
                        vidaAEvaluar = vidaJugador2;
                    }
                    if (j == 2) {
                        vidaAEvaluar = vidaJugador3;
                    }
                    if (j == 3) {
                        vidaAEvaluar = vidaJugador4;
                    }
                    if (j == 4) {
                        vidaAEvaluar = vidaJugador5;
                    }
                    if (vida < vidaAEvaluar) {
                        vida = vidaAEvaluar;
                    }
                }
                
                if (i == 0) {
                    vidaJugador1 = vida;
                }
                if (i == 1) {
                    vidaJugador2 = vida;
                }
                if (i == 2) {
                    vidaJugador3 = vida;
                }
                if (i == 3) {
                    vidaJugador4 = vida;
                }
                if (i == 4) {
                    vidaJugador5 = vida;
                }
            }
            
            if ("Dodo".equals(mascotaJugador[i])) {
                System.out.println("Activando la Division de poder del Dodo");
                if (i == 1) {
                    dañoJugador2 += 1; 
                }
                if (i == 2) {
                    dañoJugador3 += 1; 
                }
                if (i == 3) {
                    dañoJugador4 += 1; 
                }  
                if (i == 4) {
                    dañoJugador5 += 1;
                }
            }
            
            if ("Elefante".equals(mascotaJugador[i])) {
                nivel = Jugador.darNivel(mascotaJugador[i]);
                System.out.println("Activando el Daño Colateral del Elefante");

                if (nivel == 1) {
                    aumento1 = 1;
                }
                if (nivel == 2) {
                    aumento1 = 2;
                }
                if (nivel == 3) {
                    aumento1 = 3;
                }
                
                if (i == 4) {
                    vidaJugador4 -= aumento1;
                }
                if (i == 3) {
                    vidaJugador3 -= aumento1;                
                }
                if (i == 2) {
                    vidaJugador2 -= aumento1;                   
                }
                if (i == 1) {
                    vidaJugador1 -= aumento1;                 
                }
            }
            
            if ("PuercoEspin".equals(mascotaJugador[i])) {
                nivel = Jugador.darNivel(mascotaJugador[i]);
                
                if (nivel == 1) {
                    aumento = 2;
                }
                if (nivel == 2) {
                    aumento = 4;
                }
                if (nivel == 3) {
                    aumento = 6;
                }
                vidaJugador1 += aumento;
                vidaJugador2 += aumento;
                vidaJugador3 += aumento;
                vidaJugador4 += aumento;
                vidaJugador5 += aumento;
            }
            
            if ("Zorro".equals(mascotaJugador[i])) {
                nivel = Jugador.darNivel(mascotaJugador[i]);
                System.out.println("Activando Ataque Rapido del Zorro");
   
                if (nivel == 1) {
                    aumento = 2;
                }
                if (nivel == 2) {
                    aumento = 4;
                }
                if (nivel == 3) {
                    aumento = 6;
                }
                
                if (i == 0) {
                    dañoJugador1 += aumento; 
                }
                if (i == 1) {
                    dañoJugador2 += aumento; 
                }
                if (i == 2) {
                    dañoJugador3 += aumento; 
                }
                if (i == 3) {
                    dañoJugador4 += aumento; 
                }
                if (i == 4) {
                    dañoJugador5 += aumento; 
                }                
            }
            
            if ("Camello".equals(mascotaJugador[i])) {
                nivel = Jugador.darNivel(mascotaJugador[i]);
                System.out.println("Activando la Joroba del Camello");
                
                if (nivel == 1) {
                    aumento = 1;
                    aumento1 = 2;
                }
                if (nivel == 2) {
                    aumento = 2;
                    aumento1 = 4;
                }
                if (nivel == 3) {
                    aumento = 3;
                    aumento1 = 6;
                }
                
                if (i == 4) {
                    vidaJugador4 += aumento;
                    dañoJugador4 += aumento1;
                    vidaJugador3 += aumento;
                    dañoJugador3 += aumento1;
                    vidaJugador2 += aumento;
                    dañoJugador2 += aumento1;
                    vidaJugador1 += aumento;
                    dañoJugador1 += aumento1;
                }
                if (i == 3) {
                    vidaJugador3 += aumento;
                    dañoJugador3 += aumento1;
                    vidaJugador2 += aumento;
                    dañoJugador2 += aumento1; 
                    vidaJugador1 += aumento; 
                    dañoJugador1 += aumento1;
                }
                if (i == 2) {
                    vidaJugador2 += aumento;
                    dañoJugador2 += aumento1;
                    vidaJugador1 += aumento; 
                    dañoJugador1 += aumento1;
                }
                if (i == 1) {
                    vidaJugador1 += aumento;  
                    dañoJugador1 += aumento1;
                }
            }     
            
            if ("Mapache".equals(mascotaJugador[i])) {
                nivel = Jugador.darNivel(mascotaJugador[i]);
                System.out.println("Activando la Repaticion de Poder del Mapache");
                
                if (nivel == 1) {
                    aumento1 = 1;
                }
                if (nivel == 2) {
                    aumento1 = 2;
                }
                if (nivel == 3) {
                    aumento1 = 3;
                }
                
                if (i == 4) {
                    dañoJugador4 += aumento1;
                }
                if (i == 3) {
                    dañoJugador3 += aumento1;
                }
                if (i == 2) {
                    dañoJugador2 += aumento1;
                }
                if (i == 1) {
                    dañoJugador1 += aumento1;
                }
            }
            
            if ("Lobo".equals(mascotaJugador[i])) {
                nivel = Jugador.darNivel(mascotaJugador[i]);
                System.out.println("Activando el Aullido del Lobo");
                
                if (nivel == 1) {
                    aumento = 2;
                }
                if (nivel == 2) {
                    aumento = 3;
                }
                if (nivel == 3) {
                    aumento = 5;
                }
                
                if (i == 0) {
                    vidaJugador1 += aumento;
                    dañoJugador1 += aumento;
                }
            }
            
            if ("Buey".equals(mascotaJugador[i])) {
                System.out.println("Activando Mejor me Protejo del Buey");
            }
            
            if ("Hipopotamo".equals(mascotaJugador[i])) {
                nivel = Jugador.darNivel(mascotaJugador[i]);
                System.out.println("Activando Robustez del Hipopotamo");
                
                if (nivel == 1) {
                    aumento = 2;
                }
                if (nivel == 2) {
                    aumento = 4;
                }
                if (nivel == 3) {
                    aumento = 6;
                }
                
                if (i == 0) {
                    vidaJugador1 += aumento;
                    dañoJugador1 += aumento;
                }
                if (i == 1) {
                    vidaJugador2 += aumento;
                    dañoJugador2 += aumento;
                }
                if (i == 2) {
                    vidaJugador3 += aumento;
                    dañoJugador3 += aumento;
                }
                if (i == 3) {
                    vidaJugador4 += aumento;
                    dañoJugador4 += aumento;
                }
                if (i == 4) {
                    vidaJugador5 += aumento;
                    dañoJugador5 += aumento;
                }
            }
            
            if ("Delfin".equals(mascotaJugador[i])) {
                nivel = Jugador.darNivel(mascotaJugador[i]);
                System.out.println("Activando Salpicon del Delfin");
                int vida = 0;
                int vidaAEvaluar = 0;
                
                if (nivel == 1) {
                    aumento = 5; 
                }
                if (nivel == 2) {
                    aumento = 10;
                }
                if (nivel == 3) {
                    aumento = 15;
                }
                
                for (int j = 0; j < 5; j++) {
                    if (j == 0) {
                        vidaAEvaluar = vidaBot1;
                    }
                    if (j == 1) {
                        vidaAEvaluar = vidaBot2;
                    }
                    if (j == 2) {
                        vidaAEvaluar = vidaBot3;
                    }
                    if (j == 3) {
                        vidaAEvaluar = vidaBot4;
                    }
                    if (j == 4) {
                        vidaAEvaluar = vidaBot5;
                    }
                    if (vida > vidaAEvaluar) {
                        vida = vidaAEvaluar;
                    }
                } 
                
                if (vida == vidaBot1) {
                    vidaBot1 -= aumento;
                }
                if (vida == vidaBot2) {
                    vidaBot2 -= aumento;
                }
                if (vida == vidaBot3) {
                    vidaBot3 -= aumento;
                }
                if (vida == vidaBot4) {
                    vidaBot4 -= aumento;
                }
                if (vida == vidaBot5) {
                    vidaBot5 -= aumento;
                }
            }
            
            if ("Ballena".equals(mascotaJugador[i])) {
                System.out.println("Activando Succion de la Ballena");
            }
            
            if ("Escorpion".equals(mascotaJugador[i])) {
                System.out.println("Activando la Aguja del Escorpion");
                mascotaBot[0] = "------";
            }
            
            if ("Rinoceronte".equals(mascotaJugador[i])) {
                System.out.println("Activando Estampida del Rinoceronte");
                nivel = Jugador.darNivel(mascotaJugador[i]);
                
                if (nivel == 1) {
                    aumento1 = 4;
                }
                if (nivel == 2) {
                    aumento1 = 8;
                }
                if (nivel == 3) {
                    aumento1 = 12;
                }                
                vidaBot1 -= aumento1;
            }
            
            if ("Mono".equals(mascotaJugador[i])) {
                System.out.println("Activando Amistad del Mono");
                nivel = Jugador.darNivel(mascotaJugador[i]);
                
                if (nivel == 1) {
                    aumento = 2;
                    aumento1 = 3;
                }
                if (nivel == 2) {
                    aumento = 4;
                    aumento1 = 6;
                }
                if (nivel == 3) {
                    aumento = 6;
                    aumento1 = 9;
                }
                
                if (i == 0) {
                    vidaJugador2 += aumento;
                    dañoJugador2 += aumento1;
                }
                if (i == 1) {
                    vidaJugador3 += aumento;
                    dañoJugador3 += aumento1;
                }
                if (i == 2) {
                    vidaJugador4 += aumento;
                    dañoJugador4 += aumento1;
                }
                if (i == 3) {
                    vidaJugador5 += aumento;
                    dañoJugador5 += aumento1;
                }
            }
            
            if ("Cocodrilo".equals(mascotaJugador[i])) {
                System.out.println("Activando Mordida del Cocodrilo");
                nivel = Jugador.darNivel(mascotaJugador[i]);
                
                if (nivel == 1) {
                    aumento1 = 8;
                }
                if (nivel == 2) {
                    aumento1 = 16;
                }
                if (nivel == 3) {
                    aumento1 = 24;
                }
                vidaBot5 -= aumento1; 
            }
            
            if ("Chompipe".equals(mascotaJugador[i])) {
                System.out.println("Activando la Solidaridad del Chompipe");
                
                vidaJugador1 += 3;
                dañoJugador1 += 3;
            }
            
            if ("Serpiente".equals(mascotaJugador[i])) {
                System.out.println("Activando el Ataque Discreto de la Serpiente");
                nivel = Jugador.darNivel(mascotaJugador[i]);
                
                if (nivel == 1) {
                    aumento1 = 5;
                }
                if (nivel == 2) {
                    aumento1 = 10;
                }
                if (nivel == 3) {
                    aumento1 = 15;
                }
                
                vidaBot2 -= aumento1;
            }
            
            if ("Leopardo".equals(mascotaJugador[i])) {
                System.out.println("Activando Zarpazo del Leopardo");
                nivel = Jugador.darNivel(mascotaJugador[i]);
                
                if (nivel == 1) {
                    aumento = 1;
                    vidaBot1 -= aumento;
                }
                if (nivel == 2) {
                    aumento = 2;
                    vidaBot2 -= aumento;
                    vidaBot3 -= aumento;
                }
                if (nivel == 3) {
                    aumento = 3;
                    vidaBot3 -= aumento;
                    vidaBot4 -= aumento;
                    vidaBot5 -= aumento;
                }
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
                
                if ("------".equals(mascotaJugador[numeroHormiga])) {                    
                    if (contadorHormiga == 0) {
                        nivel = Jugador.darNivel("Hormiga"); 
                        System.out.println("Activando Compañerismo de la Hormiga");
                        int aleatorio = (int) (Math.random()*numeroHormiga);

                        if (nivel == 1) {
                            aumento = 1;
                            aumento1 = 2; 
                        }
                        if (nivel == 2) {
                            aumento = 2;
                            aumento1 = 4;
                        }
                        if (nivel == 3) {
                            aumento = 3;
                            aumento1 = 6;
                        } 

                        if (numeroHormiga != 0) {
                            if (aleatorio == 0) {
                                vidaJugador1 += aumento;
                                dañoJugador1 += aumento1;
                            }  
                        }    
                        if (aleatorio == 1) {
                            vidaJugador2 += aumento;
                            dañoJugador2 += aumento1;  
                        }
                        if (aleatorio == 2) {
                            vidaJugador3 += aumento;
                            dañoJugador3 += aumento1;  
                        }
                        if (aleatorio == 3) {
                            vidaJugador4 += aumento;
                            dañoJugador4 += aumento1;    
                        } 
                        contadorHormiga = 1;
                    }                    
                }
                
                if ("------".equals(mascotaJugador[numeroCastor])) {                   
                    if (contadorCastor == 0) {
                        nivel = Jugador.darNivel("Castor");
                        System.out.println("Activando la Represa del Castor"); 
                        int aleatorio = (int) (Math.random()*numeroCastor);

                        if (nivel == 1) {
                            aumento = 1;
                        }
                        if (nivel == 2) {
                            aumento = 2;
                        }
                        if (nivel == 3) {   
                            aumento = 3;
                        } 

                        if (numeroCastor != 0) {
                            if (aleatorio == 0) {
                                vidaJugador1 += aumento;
                            }    
                        }
                        if (aleatorio == 1) {
                            vidaJugador2 += aumento;
                        }
                        if (aleatorio == 2) {
                            vidaJugador3 += aumento;
                        }
                        if (aleatorio == 3) {
                            vidaJugador4 += aumento;
                        }
                        contadorCastor = 1;
                    } 
                }
                
                if ("------".equals(mascotaJugador[numeroTortuga])) {
                    if (contadorTortuga == 0) {
                        System.out.println("Activando Proteccion de la Tortuga");
                        
                        if (arreglo == 4) {
                            vidaJugador4 += 1; 
                        }
                        if (arreglo == 3) {
                            vidaJugador3 += 1;
                        }
                        if (arreglo == 2) {
                            vidaJugador2 += 1;
                        }
                        if (arreglo == 1) {
                            vidaJugador1 += 1;
                        }
                        contadorTortuga = 1;
                    }
                }
                
                if ("------".equals(mascotaJugador[numeroMamut])) {
                    if (contadorMamut == 0) {
                        System.out.println("Activando Fuerza de Compañeros del Mamut");
                        nivel = Jugador.darDaño("Mamut");
                        
                        if (nivel == 1) {
                            aumento = 2;
                        }
                        if (nivel == 2) {
                            aumento = 4;
                        }
                        if (nivel == 3) {
                            aumento = 6;
                        }
                        
                        if (arreglo == 1) {
                            vidaJugador1 += aumento;
                            dañoJugador1 += aumento;
                        }
                        if (arreglo == 2) {
                            vidaJugador2 += aumento;
                            dañoJugador2 += aumento;
                        }
                        if (arreglo == 3) {
                            vidaJugador3 += aumento;
                            dañoJugador3 += aumento;
                        }
                        if (arreglo == 4) {
                            vidaJugador4 += aumento;
                            dañoJugador4 += aumento;
                        }
                        contadorMamut = 1;
                    }
                }
            
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
            
            System.out.println();
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
                    System.out.println(contrincante + " recibio un ataque de " + dañoAnimalBot + " y quedo fuera de combate ya que quedo con " + vidaAnimalJugador + " de vida");
                    mascotaJugador[arreglo] = "------";
                    System.out.println();
                } else {
                    System.out.println(contrincante + " recibio un ataque de " + dañoAnimalBot + " pero resistio al ataque quedando con " + vidaAnimalJugador + " de vida");
                    System.out.println();
                }
                
                if (vidaAnimalBot <= 0) {
                    System.out.println(contrincante2 + " recibio un ataque de " + dañoAnimalJugador + " y quedo fuera de combate ya que quedo con " + vidaAnimalBot + " de vida");
                    System.out.println();
                    mascotaBot[arreglo1] = "------";           
                } else {
                    System.out.println(contrincante2 + " recibio un ataque de " + dañoAnimalJugador + " pero resistio al ataque quedando con " + vidaAnimalBot + " de vida");
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
            
            if ("------".equals(mascotaJugador[numeroGrillo])) {                  
                if (contadorGrillo == 0) {
                    nivel = Jugador.darNivel("Grillo");
                    System.out.println("Activando Zombificacion del Grillo"); 
                    mascotaJugador[arreglo] = "GrilloZombie";
                    
                    if (nivel == 1) {
                        aumento = 1;
                    }
                    if (nivel == 2) {
                        aumento = 2;
                    }
                    if (nivel == 3) {
                        aumento = 3;
                    }

                    if (arreglo == 0) {
                        vidaJugador1 = aumento;
                        dañoJugador1 = aumento;
                    }
                    if (arreglo == 1) {
                        vidaJugador2 = aumento;
                        dañoJugador2 = aumento;
                    }
                    if (arreglo == 2) {
                        vidaJugador3 = aumento;
                        dañoJugador3 = aumento;
                    }
                    if (arreglo == 3) {
                        vidaJugador4 = aumento;
                        dañoJugador4 = aumento; 
                    }
                    if (arreglo == 4) {
                        vidaJugador5 = aumento;
                        dañoJugador5 = aumento;
                    }  
                    contadorGrillo = 1;
                }
            }
            
            if ("------".equals(mascotaBot[numeroGrilloBot])) {                  
                if (contadorGrilloBot == 0) {
                    System.out.println("Activando Zombificacion del Grillo"); 
                    mascotaBot[arreglo1] = "GrilloZombie";
                    aumento = 1; 

                    if (arreglo1 == 0) {
                        vidaBot1 = aumento;
                        dañoBot1 = aumento;
                    }
                    if (arreglo1 == 1) {
                        vidaBot2 = aumento;
                        dañoBot2 = aumento;
                    }
                    if (arreglo1 == 2) {
                        vidaBot3 = aumento;
                        dañoBot3 = aumento;
                    }
                    if (arreglo1 == 3) {
                        vidaBot4 = aumento;
                        dañoBot4 = aumento; 
                    }
                    if (arreglo1 == 4) {
                        vidaBot5 = aumento;
                        dañoBot5 = aumento;
                    }  
                    contadorGrilloBot = 1;
                }
            }
               
            if (("------".equals(mascotaJugador[numeroRata]))) {                                      
                if (contadorRata == 0) {
                    nivel = Jugador.darNivel("Rata");
                    System.out.println("Activando Ayuda Hipocrita de la Rata"); 
                    mascotaJugador[arreglo] = "RataDos";    

                    if (nivel == 1) {
                        aumento = 1;
                    }
                    if (nivel == 2) {
                        aumento = 2;
                    }
                    if (nivel == 3) {
                        aumento = 3;
                    }
                    
                    if (arreglo == 0) {
                        vidaJugador1 = aumento;
                        dañoJugador1 = aumento;
                    }
                    if (arreglo == 1) {
                        vidaJugador2 = aumento;
                        dañoJugador2 = aumento;
                    }
                    if (arreglo == 2) {
                        vidaJugador3 = aumento;
                        dañoJugador3 = aumento;
                    }
                    if (arreglo == 3) {
                        vidaJugador4 = aumento;
                        dañoJugador4 = aumento; 
                    }
                    if (arreglo == 4) {
                        vidaJugador5 = aumento;
                        dañoJugador5 = aumento;
                    } 
                    contadorRata = 1;
                }
            }     
            
            if ("------".equals(mascotaJugador[numeroAraña])) {
                if (contadorAraña == 0) {
                    System.out.println("Actividad Liberacion de la Araña");
                    int aleatorio = (int) (Math.random()*27);
                    String compra = null;
                    
                    switch (aleatorio) {
                        case 0 -> compra = "Hormiga";
                        case 1 -> compra = "Pescado";
                        case 2 -> compra = "Mosquito";
                        case 3 -> compra = "Grillo";
                        case 4 -> compra = "Castor";
                        case 5 -> compra = "Caballo";
                        case 6 -> compra = "Nutria";
                        case 7 -> compra = "Escarabajo";
                        case 8 -> compra = "Sapo";
                        case 9 -> compra = "Dodo";
                        case 10 -> compra = "Elefante";  
                        case 11 -> compra = "Puerco Espin";
                        case 12 -> compra = "PavoReal";
                        case 13 -> compra = "Rata";
                        case 14 -> compra = "Zorro";
                        case 15 -> compra = "Araña";        
                        case 16 -> compra = "Camello";
                        case 17 -> compra = "Mapache";
                        case 18 -> compra = "Jirafa";  
                        case 19 -> compra = "Tortuga";
                        case 20 -> compra = "Caracol";
                        case 21 -> compra = "Oveja";
                        case 22 -> compra = "Conejo";
                        case 23 -> compra = "Lobo"; 
                        case 24 -> compra = "Buey";
                        case 25 -> compra = "Canguro";
                        case 26 -> compra = "Buho";   
                    }
                    mascotaJugador[arreglo] = compra;
                    
                    if (arreglo == 0) {
                        vidaJugador1 = 1;
                        dañoJugador1 = 1;
                    }
                    if (arreglo == 1) {
                        vidaJugador2 = 1;
                        dañoJugador2 = 1;
                    }
                    if (arreglo == 2) {
                        vidaJugador3 = 1;
                        dañoJugador3 = 1;
                    }
                    if (arreglo == 3) {
                        vidaJugador4 = 1;
                        dañoJugador4 = 1; 
                    }
                    if (arreglo == 4) {
                        vidaJugador5 = 1;
                        dañoJugador5 = 1;
                    }
                    contadorAraña = 1;
                }    
            }
            
            if ("------".equals(mascotaJugador[numeroOveja])) {
                if (contadorOveja == 0 || contadorOveja == 1) {
                    System.out.println("Actividad la Revolucion de la Oveja");
                    mascotaJugador[arreglo] = "Carnero";
                    
                    if (arreglo == 0) {
                        vidaJugador1 = 2;
                        dañoJugador1 = 2;
                    }
                    if (arreglo == 1) {
                        vidaJugador2 = 2;
                        dañoJugador2 = 2;
                    }
                    if (arreglo == 2) {
                        vidaJugador3 = 2;
                        dañoJugador3 = 2;
                    }
                    if (arreglo == 3) {
                        vidaJugador4 = 2;
                        dañoJugador4 = 2; 
                    }
                    if (arreglo == 4) {
                        vidaJugador5 = 2;
                        dañoJugador5 = 2;
                    } 
                    contadorOveja += 1;
                }
            }
            
            if ("------".equals(mascotaBot[numeroOvejaBot])) {
                if (contadorOvejaBot == 0 || contadorOvejaBot == 1) {
                    System.out.println("Actividad la Revolucion de la Oveja");
                    mascotaBot[arreglo1] = "Carnero";
                    
                    if (arreglo1 == 0) {
                        vidaBot1 = 2;
                        dañoBot1 = 2;
                    }
                    if (arreglo1 == 1) {
                        vidaBot2 = 2;
                        dañoBot2 = 2;
                    }
                    if (arreglo1 == 2) {
                        vidaBot3 = 2;
                        dañoBot3 = 2;
                    }
                    if (arreglo1 == 3) {
                        vidaBot4 = 2;
                        dañoBot4 = 2; 
                    }
                    if (arreglo1 == 4) {
                        vidaBot5 = 2;
                        dañoBot5 = 2;
                    } 
                    contadorOvejaBot += 1;
                }
            }
                        
            if ("------".equals(mascotaJugador[numeroVenado])) {
                if (contadorVenado == 0) {
                    nivel = Jugador.darNivel("Venado");
                    System.out.println("Actividad Venganza del Venado");
                    mascotaJugador[arreglo] = "Autobus";
                    
                    if (nivel == 1) {
                        aumento = 5;
                    }
                    if (nivel == 2) {
                        aumento = 10;
                    }
                    if (nivel == 3) {
                        aumento = 15;
                    }
                    
                    if (arreglo == 0) {
                        vidaJugador1 = aumento;
                        dañoJugador1 = aumento;
                    }
                    if (arreglo == 1) {
                        vidaJugador2 = aumento;
                        dañoJugador2 = aumento;
                    }
                    if (arreglo == 2) {
                        vidaJugador3 = aumento;
                        dañoJugador3 = aumento;
                    }
                    if (arreglo == 3) {
                        vidaJugador4 = aumento;
                        dañoJugador4 = aumento; 
                    }
                    if (arreglo == 4) {
                        vidaJugador5 = aumento;
                        dañoJugador5 = aumento;
                    } 
                    contadorVenado = 1;
                }
            }
            System.out.println();
            System.out.println("Mascotas usadas por cada Equipo");
            System.out.println();
            
            if (arreglo == 4) {
                System.out.println("    Una mascota de tu equipo peleo");
            }
            if (arreglo == 3) {
                System.out.println("    La pelea llego hasta la segunda posicion dentro de tu equipo");
            }
            if (arreglo == 2) {
                System.out.println("    La pelea llego hasta la tercera posicion dentro de tu equipo");
            }
            if (arreglo == 1) {
                System.out.println("    La pelea llego hasta la cuarta posicion dentro de tu equipo");
            }
            if (arreglo == 0) {
                System.out.println("    Todo tu equipo peleo");
            }
            if (arreglo1 == 0) {
                System.out.println("    1 mascota utilizada del equipo contrario");
            }
            if (arreglo1 == 1) {
                System.out.println("    2 mascotas utilizadas del equipo contrario");
            }
            if (arreglo1 == 2) {
                System.out.println("    3 mascotas utilizadas del equipo contrario");
            }
            if (arreglo1 == 3) {
                System.out.println("    4 mascotas utilizadas del equipo contrario");
            }
            if (arreglo1 == 4) {
                System.out.println("    5 mascotas utilizadas del equipo contrario");
            }
            System.out.println();
            
            if ("------".equals(mascotaBot[4]) && !"------".equals(mascotaJugador[0])) {
                System.out.println("                  ----Ganaste----"); 
                System.out.println("        Todo el equipo contrario fue vencido");
                System.out.println();
                batalla = 0;
                partida = 0;
            }            
            
            if ("------".equals(mascotaJugador[0]) && !"------".equals(mascotaBot[4])) {
                System.out.println("            ----Perdiste----");
                System.out.println("        Todo tu equipo fue vencido");
                System.out.println();
                batalla = 0;
                partida = 1;
            }
            
            if ("------".equals(mascotaJugador[0]) && "------".equals(mascotaBot[4])) {
                System.out.println();
                System.out.println("                     ----Empate----");
                System.out.println("        Los 2 equipos quedaron si Animales vivos");
                System.out.println();
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
    
    public int darVida1(String archivo) {
        int vida = 0;
        
        if ("Hormiga".equals(archivo)) {
            vida = Hormiga.mandarVida1();
        }
        if ("Pescado".equals(archivo)) {
            vida = Pescado.mandarVida1();
        }  
        if ("Mosquito".equals(archivo)) {
            vida = Mosquito.mandarVida1();
        }              
        if ("Grillo".equals(archivo)) {
            vida = Grillo.mandarVida1();
        }  
        if ("Castor".equals(archivo)) {
            vida = Castor.mandarVida1();
        }   
        if ("Caballo".equals(archivo)) {
            vida = Caballo.mandarVida1();
        }
        if ("Nutria".equals(archivo)) {
            vida = Nutria.mandarVida1();
        }   
        if ("Escarabajo".equals(archivo)) {
            vida = Escarabajo.mandarVida1();  
        }
        if ("Sapo".equals(archivo)) {
            vida = Sapo.mandarVida1();  
        }
        if ("Dodo".equals(archivo)) {
            vida = Dodo.mandarVida1();  
        }
        if ("Elefante".equals(archivo)) {
            vida = Elefante.mandarVida1();  
        }
        if ("PuercoEspin".equals(archivo)) {
            vida = PuercoEspin.mandarVida1();  
        }
        if ("PavoReal".equals(archivo)) {
            vida = PavoReal.mandarVida1();  
        }           
        if ("Rata".equals(archivo)) {
            vida = Rata.mandarVida1();  
        }      
        if ("Zorro".equals(archivo)) {
            vida = Zorro.mandarVida1();  
        }                
        if ("Araña".equals(archivo)) {
            vida = Araña.mandarVida1();  
        }  
        if ("Camello".equals(archivo)) {
            vida = Camello.mandarVida1();  
        }
        if ("Mapache".equals(archivo)) {
            vida = Mapache.mandarVida1();  
        }
        if ("Jirafa".equals(archivo)) {
            vida = Jirafa.mandarVida1();  
        }           
        if ("Tortuga".equals(archivo)) {
            vida = Tortuga.mandarVida1();  
        }      
        if ("Caracol".equals(archivo)) {
            vida = Caracol.mandarVida1();  
        }                
        if ("Oveja".equals(archivo)) {
            vida = Oveja.mandarVida1();  
        }   
        if ("Conejo".equals(archivo)) {
            vida = Conejo.mandarVida1();  
        }
        if ("Lobo".equals(archivo)) {
            vida = Lobo.mandarVida1();  
        }
        if ("Buey".equals(archivo)) {
            vida = Buey.mandarVida1();  
        }           
        if ("Canguro".equals(archivo)) {
            vida = Canguro.mandarVida1();  
        }      
        if ("Buho".equals(archivo)) {
            vida = Buho.mandarVida1();  
        }   
        if ("Venado".equals(archivo)) {
            vida = Venado.mandarVida1();  
        }           
        if ("Loro".equals(archivo)) {
            vida = Loro.mandarVida1();  
        }      
        if ("Hipopotamo".equals(archivo)) {
            vida = Hipopotamo.mandarVida1();  
        }                
        if ("Delfin".equals(archivo)) {
            vida = Delfin.mandarVida1();  
        }   
        if ("Puma".equals(archivo)) {
            vida = Puma.mandarVida1();  
        }
        if ("Ballena".equals(archivo)) {
            vida = Ballena.mandarVida1();  
        }
        if ("Ardilla".equals(archivo)) {
            vida = Ardilla.mandarVida1();  
        }           
        if ("Llama".equals(archivo)) {
            vida = Llama.mandarVida1();  
        }   
        if ("Foca".equals(archivo)) {
            vida = Foca.mandarVida1();  
        }    
        if ("Jaguar".equals(archivo)) {
            vida = Jaguar.mandarVida1();  
        }      
        if ("Escorpion".equals(archivo)) {
            vida = Escorpion.mandarVida1();  
        }                
        if ("Rinoceronte".equals(archivo)) {
            vida = Rinoceronte.mandarVida1();  
        }   
        if ("Mono".equals(archivo)) {
            vida = Mono.mandarVida1();  
        }
        if ("Cocodrilo".equals(archivo)) {
            vida = Cocodrilo.mandarVida1();  
        }
        if ("Vaca".equals(archivo)) {
            vida = Vaca.mandarVida1();  
        }           
        if ("Chompipe".equals(archivo)) {
            vida = Chompipe.mandarVida1();  
        }      
        if ("Panda".equals(archivo)) {
            vida = Panda.mandarVida1();  
        } 
        if ("Gato".equals(archivo)) {
            vida = Gato.mandarVida1();  
        }    
        if ("Tigre".equals(archivo)) {
            vida = Tigre.mandarVida1();  
        }      
        if ("Serpiente".equals(archivo)) {
            vida = Serpiente.mandarVida1();  
        }                
        if ("Mamut".equals(archivo)) {
            vida = Mamut.mandarVida1();  
        }   
        if ("Leopardo".equals(archivo)) {
            vida = Leopardo.mandarVida1();  
        }
        if ("Gorila".equals(archivo)) {
            vida = Gorila.mandarVida1();  
        }
        if ("Pulpo".equals(archivo)) {
            vida = Pulpo.mandarVida1();  
        }           
        if ("Mosca".equals(archivo)) {
            vida = Mosca.mandarVida1();  
        }      
        if ("Quetzal".equals(archivo)) {
            vida = Quetzal.mandarVida1();  
        } 
        if ("Camaleon".equals(archivo)) {
            vida = Camaleon.mandarVida1();  
        }        
        return vida;
    }
    
    public int darDaño1(String archivo) {
        int daño = 0;
        
        if ("Hormiga".equals(archivo)) {
            daño = Hormiga.mandarDaño1();
        }
        if ("Pescado".equals(archivo)) {
            daño = Pescado.mandarDaño1();
        }  
        if ("Mosquito".equals(archivo)) {
            daño = Mosquito.mandarDaño1();
        }              
        if ("Grillo".equals(archivo)) {
            daño = Grillo.mandarDaño1();
        }  
        if ("Castor".equals(archivo)) {
            daño = Castor.mandarDaño1();
        }   
        if ("Caballo".equals(archivo)) {
            daño = Caballo.mandarDaño1();
        }
        if ("Nutria".equals(archivo)) {
            daño = Nutria.mandarDaño1();
        }   
        if ("Escarabajo".equals(archivo)) {
            daño = Escarabajo.mandarDaño1();  
        }  
        if ("Sapo".equals(archivo)) {
            daño = Sapo.mandarDaño1();  
        }
        if ("Dodo".equals(archivo)) {
            daño = Dodo.mandarDaño1();  
        }
        if ("Elefante".equals(archivo)) {
            daño = Elefante.mandarDaño1();  
        }
        if ("PuercoEspin".equals(archivo)) {
            daño = PuercoEspin.mandarDaño1();  
        }
        if ("PavoReal".equals(archivo)) {
            daño = PavoReal.mandarDaño1();  
        }       
        if ("Rata".equals(archivo)) {
            daño = Rata.mandarDaño1();  
        }
        if ("Zorro".equals(archivo)) {
            daño = Zorro.mandarDaño1();  
        }        
        if ("Araña".equals(archivo)) {
            daño = Araña.mandarDaño1();  
        } 
        if ("Camello".equals(archivo)) {
            daño = Camello.mandarDaño1();  
        }
        if ("Mapache".equals(archivo)) {
            daño = Mapache.mandarDaño1();  
        }
        if ("Jirafa".equals(archivo)) {
            daño = Jirafa.mandarDaño1();  
        }           
        if ("Tortuga".equals(archivo)) {
            daño = Tortuga.mandarDaño1();  
        }      
        if ("Caracol".equals(archivo)) {
            daño = Caracol.mandarDaño1();  
        }                
        if ("Oveja".equals(archivo)) {
            daño = Oveja.mandarDaño1();  
        }   
        if ("Conejo".equals(archivo)) {
            daño = Conejo.mandarDaño1();  
        }
        if ("Lobo".equals(archivo)) {
            daño = Lobo.mandarDaño1();  
        }
        if ("Buey".equals(archivo)) {
            daño = Buey.mandarDaño1();  
        }           
        if ("Canguro".equals(archivo)) {
            daño = Canguro.mandarDaño1();  
        }      
        if ("Buho".equals(archivo)) {
            daño = Buho.mandarDaño1();  
        }    
        if ("Venado".equals(archivo)) {
            daño = Venado.mandarDaño1();  
        }      
        if ("Loro".equals(archivo)) {
            daño = Loro.mandarDaño1();  
        }                
        if ("Hipopotamo".equals(archivo)) {
            daño = Hipopotamo.mandarDaño1();  
        }   
        if ("Delfin".equals(archivo)) {
            daño = Delfin.mandarDaño1();  
        }
        if ("Puma".equals(archivo)) {
            daño = Puma.mandarDaño1();  
        }
        if ("Ballena".equals(archivo)) {
            daño = Ballena.mandarDaño1();  
        }           
        if ("Ardilla".equals(archivo)) {
            daño = Ardilla.mandarDaño1();  
        }      
        if ("Llama".equals(archivo)) {
            daño = Llama.mandarDaño1();  
        } 
        if ("Foca".equals(archivo)) {
            daño = Foca.mandarDaño1();  
        }    
        if ("Jaguar".equals(archivo)) {
            daño = Jaguar.mandarDaño1();  
        }      
        if ("Escorpion".equals(archivo)) {
            daño = Escorpion.mandarDaño1();  
        }                
        if ("Rinoceronte".equals(archivo)) {
            daño = Rinoceronte.mandarDaño1();  
        }   
        if ("Mono".equals(archivo)) {
            daño = Mono.mandarDaño1();  
        }
        if ("Cocodrilo".equals(archivo)) {
            daño = Cocodrilo.mandarDaño1();  
        }
        if ("Vaca".equals(archivo)) {
            daño = Vaca.mandarDaño1();  
        }           
        if ("Chompipe".equals(archivo)) {
            daño = Chompipe.mandarDaño1();  
        }      
        if ("Panda".equals(archivo)) {
            daño = Panda.mandarDaño1();  
        } 
        if ("Gato".equals(archivo)) {
            daño = Gato.mandarDaño1();  
        }    
        if ("Tigre".equals(archivo)) {
            daño = Tigre.mandarDaño1();  
        }      
        if ("Serpiente".equals(archivo)) {
            daño = Serpiente.mandarDaño1();  
        }                
        if ("Mamut".equals(archivo)) {
            daño = Mamut.mandarDaño1();  
        }   
        if ("Leopardo".equals(archivo)) {
            daño = Leopardo.mandarDaño1();  
        }
        if ("Gorila".equals(archivo)) {
            daño = Gorila.mandarDaño1();  
        }
        if ("Pulpo".equals(archivo)) {
            daño = Pulpo.mandarDaño1();  
        }           
        if ("Mosca".equals(archivo)) {
            daño = Mosca.mandarDaño1();  
        }      
        if ("Quetzal".equals(archivo)) {
            daño = Quetzal.mandarDaño1();  
        } 
        if ("Camaleon".equals(archivo)) {
            daño = Camaleon.mandarDaño1();  
        }
        return daño;
    }    
}