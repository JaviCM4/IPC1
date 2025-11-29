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
public class ControlDelAnimal {
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
    
    public ControlDelAnimal() {
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
    
    public void darComida(String enviarComida, String mascotaJugador[]) { 
        Scanner scanner = new Scanner(System.in);
        String animal = null; 
        
        if ("Ensalada".equals(enviarComida) || "Sushi".equals(enviarComida) || "Pizza".equals(enviarComida)) {
            
            if ("Ensalada".equals(enviarComida)) {
                System.out.println("Dandole Ensalada a 2 de tus animales de equipo");
                
                for (int i = 0; i < 2; i++) {
                    int aleatorio = (int) (Math.random()*5);
                    
                    if (aleatorio == 0) {
                        animal = mascotaJugador[0];
                    }
                    
                    if (aleatorio == 1) {
                        animal = mascotaJugador[1];                    
                    }
                    
                    if (aleatorio == 2) {
                        animal = mascotaJugador[2];                    
                    }
                    
                    if (aleatorio == 3) {
                        animal = mascotaJugador[3];                    
                    }
                    
                    if (aleatorio == 4) {
                        animal = mascotaJugador[4];                    
                    }
                    
                    if ("Hormiga".equals(animal)) {
                        Hormiga.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Pescado".equals(animal)) {
                        Pescado.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Mosquito".equals(animal)) {
                        Mosquito.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Grillo".equals(animal)) {
                        Grillo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Castor".equals(animal)) {
                        Castor.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Caballo".equals(animal)) {
                        Caballo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Nutria".equals(animal)) {
                        Nutria.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Escarabajo".equals(animal)) {
                        Escarabajo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Sapo".equals(animal)) {
                        Sapo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Dodo".equals(animal)) {
                        Dodo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Elefante".equals(animal)) {
                        Elefante.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("PuercoEspin".equals(animal)) {
                        PuercoEspin.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("PavoReal".equals(animal)) {
                        PavoReal.recibirComida(enviarComida,mascotaJugador);
                    }    

                    if ("Rata".equals(animal)) {
                        Rata.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Zorro".equals(animal)) {
                        Zorro.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Araña".equals(animal)) {
                        Araña.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Camello".equals(animal)) {
                        Camello.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Mapache".equals(animal)) {
                        Mapache.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Jirafa".equals(animal)) {
                        Jirafa.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Tortuga".equals(animal)) {
                        Tortuga.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Caracol".equals(animal)) {
                        Caracol.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Oveja".equals(animal)) {
                        Oveja.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Conejo".equals(animal)) {
                        Conejo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Lobo".equals(animal)) {
                        Lobo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Buey".equals(animal)) {
                        Buey.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Canguro".equals(animal)) {
                        Canguro.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Buho".equals(animal)) {
                        Buho.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Venado".equals(animal)) {
                        Venado.recibirComida(enviarComida,mascotaJugador);
                    }  

                    if ("Loro".equals(animal)) {
                        Loro.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Hipopotamo".equals(animal)) {
                        Hipopotamo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Delfin".equals(animal)) {
                        Delfin.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Puma".equals(animal)) {
                        Puma.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Ballena".equals(animal)) {
                        Ballena.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Ardilla".equals(animal)) {
                        Ardilla.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Llama".equals(animal)) {
                        Llama.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Foca".equals(animal)) {
                        Foca.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Jaguar".equals(animal)) {
                        Jaguar.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Escorpion".equals(animal)) {
                        Escorpion.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Rinoceronte".equals(animal)) {
                        Rinoceronte.recibirComida(enviarComida,mascotaJugador);
                    }       

                    if ("Mono".equals(animal)) {
                        Mono.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Cocodrilo".equals(animal)) {
                        Cocodrilo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Vaca".equals(animal)) {
                        Vaca.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Chompipe".equals(animal)) {
                        Chompipe.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Panda".equals(animal)) {
                        Panda.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Gato".equals(animal)) {
                        Gato.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Tigre".equals(animal)) {
                        Tigre.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Serpiente".equals(animal)) {
                        Serpiente.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Mamut".equals(animal)) {
                        Mamut.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Leopardo".equals(animal)) {
                        Leopardo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Gorila".equals(animal)) {
                        Gorila.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Pulpo".equals(animal)) {
                        Pulpo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Mosca".equals(animal)) {
                        Mosca.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Quetzal".equals(animal)) {
                        Quetzal.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Camaleon".equals(animal)) {
                        Camaleon.recibirComida(enviarComida,mascotaJugador);
                    }
                }
            }
            
            if ("Sushi".equals(enviarComida)) {
                System.out.println("Dandole Sushi a 3 de tus animales de equipo");                
                
                for (int i = 0; i < 3; i++) {
                    int aleatorio = (int) (Math.random()*5);
                    
                    if (aleatorio == 0) {
                        animal = mascotaJugador[0];
                    }
                    
                    if (aleatorio == 1) {
                        animal = mascotaJugador[1];                    
                    }
                    
                    if (aleatorio == 2) {
                        animal = mascotaJugador[2];                    
                    }
                    
                    if (aleatorio == 3) {
                        animal = mascotaJugador[3];                    
                    }
                    
                    if (aleatorio == 4) {
                        animal = mascotaJugador[4];                    
                    }
                    
                    if ("Hormiga".equals(animal)) {
                        Hormiga.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Pescado".equals(animal)) {
                        Pescado.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Mosquito".equals(animal)) {
                        Mosquito.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Grillo".equals(animal)) {
                        Grillo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Castor".equals(animal)) {
                        Castor.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Caballo".equals(animal)) {
                        Caballo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Nutria".equals(animal)) {
                        Nutria.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Escarabajo".equals(animal)) {
                        Escarabajo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Sapo".equals(animal)) {
                        Sapo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Dodo".equals(animal)) {
                        Dodo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Elefante".equals(animal)) {
                        Elefante.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("PuercoEspin".equals(animal)) {
                        PuercoEspin.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("PavoReal".equals(animal)) {
                        PavoReal.recibirComida(enviarComida,mascotaJugador);
                    }    

                    if ("Rata".equals(animal)) {
                        Rata.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Zorro".equals(animal)) {
                        Zorro.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Araña".equals(animal)) {
                        Araña.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Camello".equals(animal)) {
                        Camello.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Mapache".equals(animal)) {
                        Mapache.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Jirafa".equals(animal)) {
                        Jirafa.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Tortuga".equals(animal)) {
                        Tortuga.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Caracol".equals(animal)) {
                        Caracol.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Oveja".equals(animal)) {
                        Oveja.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Conejo".equals(animal)) {
                        Conejo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Lobo".equals(animal)) {
                        Lobo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Buey".equals(animal)) {
                        Buey.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Canguro".equals(animal)) {
                        Canguro.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Buho".equals(animal)) {
                        Buho.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Venado".equals(animal)) {
                        Venado.recibirComida(enviarComida,mascotaJugador);
                    }  

                    if ("Loro".equals(animal)) {
                        Loro.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Hipopotamo".equals(animal)) {
                        Hipopotamo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Delfin".equals(animal)) {
                        Delfin.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Puma".equals(animal)) {
                        Puma.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Ballena".equals(animal)) {
                        Ballena.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Ardilla".equals(animal)) {
                        Ardilla.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Llama".equals(animal)) {
                        Llama.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Foca".equals(animal)) {
                        Foca.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Jaguar".equals(animal)) {
                        Jaguar.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Escorpion".equals(animal)) {
                        Escorpion.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Rinoceronte".equals(animal)) {
                        Rinoceronte.recibirComida(enviarComida,mascotaJugador);
                    }       

                    if ("Mono".equals(animal)) {
                        Mono.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Cocodrilo".equals(animal)) {
                        Cocodrilo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Vaca".equals(animal)) {
                        Vaca.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Chompipe".equals(animal)) {
                        Chompipe.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Panda".equals(animal)) {
                        Panda.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Gato".equals(animal)) {
                        Gato.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Tigre".equals(animal)) {
                        Tigre.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Serpiente".equals(animal)) {
                        Serpiente.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Mamut".equals(animal)) {
                        Mamut.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Leopardo".equals(animal)) {
                        Leopardo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Gorila".equals(animal)) {
                        Gorila.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Pulpo".equals(animal)) {
                        Pulpo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Mosca".equals(animal)) {
                        Mosca.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Quetzal".equals(animal)) {
                        Quetzal.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Camaleon".equals(animal)) {
                        Camaleon.recibirComida(enviarComida,mascotaJugador);
                    }
                }            
            }
            
            if ("Pizza".equals(enviarComida)) {
                System.out.println("Dandole Pizza a 2 de tus animales de equipo");
                
                for (int i = 0; i < 2; i++) {
                    int aleatorio = (int) (Math.random()*5);
                    
                    if (aleatorio == 0) {
                        animal = mascotaJugador[0];
                    }
                    
                    if (aleatorio == 1) {
                        animal = mascotaJugador[1];                    
                    }
                    
                    if (aleatorio == 2) {
                        animal = mascotaJugador[2];                    
                    }
                    
                    if (aleatorio == 3) {
                        animal = mascotaJugador[3];                    
                    }
                    
                    if (aleatorio == 4) {
                        animal = mascotaJugador[4];                    
                    }
                    
                    if ("Hormiga".equals(animal)) {
                        Hormiga.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Pescado".equals(animal)) {
                        Pescado.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Mosquito".equals(animal)) {
                        Mosquito.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Grillo".equals(animal)) {
                        Grillo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Castor".equals(animal)) {
                        Castor.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Caballo".equals(animal)) {
                        Caballo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Nutria".equals(animal)) {
                        Nutria.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Escarabajo".equals(animal)) {
                        Escarabajo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Sapo".equals(animal)) {
                        Sapo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Dodo".equals(animal)) {
                        Dodo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Elefante".equals(animal)) {
                        Elefante.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("PuercoEspin".equals(animal)) {
                        PuercoEspin.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("PavoReal".equals(animal)) {
                        PavoReal.recibirComida(enviarComida,mascotaJugador);
                    }    

                    if ("Rata".equals(animal)) {
                        Rata.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Zorro".equals(animal)) {
                        Zorro.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Araña".equals(animal)) {
                        Araña.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Camello".equals(animal)) {
                        Camello.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Mapache".equals(animal)) {
                        Mapache.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Jirafa".equals(animal)) {
                        Jirafa.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Tortuga".equals(animal)) {
                        Tortuga.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Caracol".equals(animal)) {
                        Caracol.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Oveja".equals(animal)) {
                        Oveja.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Conejo".equals(animal)) {
                        Conejo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Lobo".equals(animal)) {
                        Lobo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Buey".equals(animal)) {
                        Buey.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Canguro".equals(animal)) {
                        Canguro.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Buho".equals(animal)) {
                        Buho.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Venado".equals(animal)) {
                        Venado.recibirComida(enviarComida,mascotaJugador);
                    }  

                    if ("Loro".equals(animal)) {
                        Loro.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Hipopotamo".equals(animal)) {
                        Hipopotamo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Delfin".equals(animal)) {
                        Delfin.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Puma".equals(animal)) {
                        Puma.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Ballena".equals(animal)) {
                        Ballena.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Ardilla".equals(animal)) {
                        Ardilla.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Llama".equals(animal)) {
                        Llama.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Foca".equals(animal)) {
                        Foca.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Jaguar".equals(animal)) {
                        Jaguar.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Escorpion".equals(animal)) {
                        Escorpion.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Rinoceronte".equals(animal)) {
                        Rinoceronte.recibirComida(enviarComida,mascotaJugador);
                    }       

                    if ("Mono".equals(animal)) {
                        Mono.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Cocodrilo".equals(animal)) {
                        Cocodrilo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Vaca".equals(animal)) {
                        Vaca.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Chompipe".equals(animal)) {
                        Chompipe.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Panda".equals(animal)) {
                        Panda.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Gato".equals(animal)) {
                        Gato.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Tigre".equals(animal)) {
                        Tigre.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Serpiente".equals(animal)) {
                        Serpiente.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Mamut".equals(animal)) {
                        Mamut.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Leopardo".equals(animal)) {
                        Leopardo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Gorila".equals(animal)) {
                        Gorila.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Pulpo".equals(animal)) {
                        Pulpo.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Mosca".equals(animal)) {
                        Mosca.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Quetzal".equals(animal)) {
                        Quetzal.recibirComida(enviarComida,mascotaJugador);
                    }

                    if ("Camaleon".equals(animal)) {
                        Camaleon.recibirComida(enviarComida,mascotaJugador);
                    }
                }            
            }
        }
        
        if (!"Ensalada".equals(enviarComida) && !"Sushi".equals(enviarComida) && !"Pizza".equals(enviarComida)) {
        
            System.out.println("Seleccione el Animal al que desea darle la Comida");
            System.out.println("1. " + mascotaJugador[0] + "    2. " + mascotaJugador[1] + "    3. " + mascotaJugador[2] + "    4. " + mascotaJugador[3] + "    5. " + mascotaJugador[4]);
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                animal = mascotaJugador[0];
            }

            if (opcion == 2) {
                animal = mascotaJugador[1];        
            }

            if (opcion == 3) {
                animal = mascotaJugador[2];        
            }

            if (opcion == 4) {
                animal = mascotaJugador[3];        
            }

            if (opcion == 5) {
                animal = mascotaJugador[4];        
            }        

            if ("Hormiga".equals(animal)) {
                Hormiga.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Pescado".equals(animal)) {
                Pescado.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Mosquito".equals(animal)) {
                Mosquito.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Grillo".equals(animal)) {
                Grillo.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Castor".equals(animal)) {
                Castor.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Caballo".equals(animal)) {
                Caballo.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Nutria".equals(animal)) {
                Nutria.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Escarabajo".equals(animal)) {
                Escarabajo.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Sapo".equals(animal)) {
                Sapo.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Dodo".equals(animal)) {
                Dodo.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Elefante".equals(animal)) {
                Elefante.recibirComida(enviarComida,mascotaJugador);
            }

            if ("PuercoEspin".equals(animal)) {
                PuercoEspin.recibirComida(enviarComida,mascotaJugador);
            }

            if ("PavoReal".equals(animal)) {
                PavoReal.recibirComida(enviarComida,mascotaJugador);
            }    

            if ("Rata".equals(animal)) {
                Rata.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Zorro".equals(animal)) {
                Zorro.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Araña".equals(animal)) {
                Araña.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Camello".equals(animal)) {
                Camello.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Mapache".equals(animal)) {
                Mapache.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Jirafa".equals(animal)) {
                Jirafa.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Tortuga".equals(animal)) {
                Tortuga.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Caracol".equals(animal)) {
                Caracol.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Oveja".equals(animal)) {
                Oveja.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Conejo".equals(animal)) {
                Conejo.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Lobo".equals(animal)) {
                Lobo.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Buey".equals(animal)) {
                Buey.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Canguro".equals(animal)) {
                Canguro.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Buho".equals(animal)) {
                Buho.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Venado".equals(animal)) {
                Venado.recibirComida(enviarComida,mascotaJugador);
            }  

            if ("Loro".equals(animal)) {
                Loro.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Hipopotamo".equals(animal)) {
                Hipopotamo.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Delfin".equals(animal)) {
                Delfin.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Puma".equals(animal)) {
                Puma.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Ballena".equals(animal)) {
                Ballena.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Ardilla".equals(animal)) {
                Ardilla.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Llama".equals(animal)) {
                Llama.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Foca".equals(animal)) {
                Foca.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Jaguar".equals(animal)) {
                Jaguar.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Escorpion".equals(animal)) {
                Escorpion.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Rinoceronte".equals(animal)) {
                Rinoceronte.recibirComida(enviarComida,mascotaJugador);
            }       

            if ("Mono".equals(animal)) {
                Mono.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Cocodrilo".equals(animal)) {
                Cocodrilo.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Vaca".equals(animal)) {
                Vaca.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Chompipe".equals(animal)) {
                Chompipe.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Panda".equals(animal)) {
                Panda.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Gato".equals(animal)) {
                Gato.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Tigre".equals(animal)) {
                Tigre.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Serpiente".equals(animal)) {
                Serpiente.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Mamut".equals(animal)) {
                Mamut.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Leopardo".equals(animal)) {
                Leopardo.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Gorila".equals(animal)) {
                Gorila.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Pulpo".equals(animal)) {
                Pulpo.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Mosca".equals(animal)) {
                Mosca.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Quetzal".equals(animal)) {
                Quetzal.recibirComida(enviarComida,mascotaJugador);
            }

            if ("Camaleon".equals(animal)) {
                Camaleon.recibirComida(enviarComida,mascotaJugador);
            }
        }    
    }
    
    public int fusionarAnimal(String comprar, String mascotaJugador[]) {
        int subir = 0;
        
        if ("Hormiga".equals(comprar)) {
            subir = Hormiga.subirDeNivel(mascotaJugador);
        }
        
        if ("Pescado".equals(comprar)) {
            subir = Pescado.subirDeNivel(mascotaJugador);
        }
        
        if ("Mosquito".equals(comprar)) {
            subir = Mosquito.subirDeNivel(mascotaJugador);
        }
        
        if ("Grilo".equals(comprar)) {
            subir = Grillo.subirDeNivel(mascotaJugador);
        }
        
        if ("Castor".equals(comprar)) {
            subir = Castor.subirDeNivel(mascotaJugador);
        }
        
        if ("Caballo".equals(comprar)) {
            subir = Caballo.subirDeNivel(mascotaJugador);
        }

        if ("Nutria".equals(comprar)) {
            subir = Nutria.subirDeNivel(mascotaJugador);
        }        

        if ("Escarabajo".equals(comprar)) {
            subir = Escarabajo.subirDeNivel(mascotaJugador);
        }
        
        if ("Sapo".equals(comprar)) {
            subir = Sapo.subirDeNivel(mascotaJugador);
        }
   
        if ("Dodo".equals(comprar)) {
            subir = Dodo.subirDeNivel(mascotaJugador);
        } 
        
        if ("Elefante".equals(comprar)) {
            subir = Elefante.subirDeNivel(mascotaJugador);
        } 
        
        if ("Puerco Espin".equals(comprar)) {
            subir = PuercoEspin.subirDeNivel(mascotaJugador);
        }  

        if ("PavoReal".equals(comprar)) {
            subir = PavoReal.subirDeNivel(mascotaJugador);
        }  

        if ("Rata".equals(comprar)) {
            subir = Rata.subirDeNivel(mascotaJugador);
        }  

        if ("Zorro".equals(comprar)) {
            subir = Zorro.subirDeNivel(mascotaJugador);
        }  

        if ("Araña".equals(comprar)) {
            subir = Araña.subirDeNivel(mascotaJugador);
        }  

        if ("Camello".equals(comprar)) {
            subir = Camello.subirDeNivel(mascotaJugador);
        }  

        if ("Mapache".equals(comprar)) {
            subir = Mapache.subirDeNivel(mascotaJugador);
        }  

        if ("Jirafa".equals(comprar)) {
            subir = Jirafa.subirDeNivel(mascotaJugador);
        }  

        if ("Tortuga".equals(comprar)) {
            subir = Tortuga.subirDeNivel(mascotaJugador);
        }
        
        if ("Caracol".equals(comprar)) {
            subir = Caracol.subirDeNivel(mascotaJugador);
        }  

        if ("Oveja".equals(comprar)) {
            subir = Oveja.subirDeNivel(mascotaJugador);
        }  

        if ("Conejo".equals(comprar)) {
            subir = Conejo.subirDeNivel(mascotaJugador);
        }  

        if ("Lobo".equals(comprar)) {
            subir = Lobo.subirDeNivel(mascotaJugador);
        }  

        if ("Buey".equals(comprar)) {
            subir = Buey.subirDeNivel(mascotaJugador);
        }  

        if ("Canguro".equals(comprar)) {
            subir = Canguro.subirDeNivel(mascotaJugador);
        }  

        if ("Buho".equals(comprar)) {
            subir = Buho.subirDeNivel(mascotaJugador);
        }  

        if ("Venado".equals(comprar)) {
            subir = Venado.subirDeNivel(mascotaJugador);
        }  

        if ("Loro".equals(comprar)) {
            subir = Loro.subirDeNivel(mascotaJugador);
        }  

        if ("Hipopotamo".equals(comprar)) {
            subir = Hipopotamo.subirDeNivel(mascotaJugador);
        }  

        if ("Delfin".equals(comprar)) {
            subir = Delfin.subirDeNivel(mascotaJugador);
        }  

        if ("Puma".equals(comprar)) {
            subir = Puma.subirDeNivel(mascotaJugador);
        }  

        if ("Ballena".equals(comprar)) {
            subir = Ballena.subirDeNivel(mascotaJugador);
        }  

        if ("Ardilla".equals(comprar)) {
            subir = Ardilla.subirDeNivel(mascotaJugador);
        } 
        
        if ("Llama".equals(comprar)) {
            subir = Llama.subirDeNivel(mascotaJugador);
        }  

        if ("Foca".equals(comprar)) {
            subir = Foca.subirDeNivel(mascotaJugador);
        }  

        if ("Jaguar".equals(comprar)) {
            subir = Jaguar.subirDeNivel(mascotaJugador);
        }  

        if ("Escorpion".equals(comprar)) {
            subir = Escorpion.subirDeNivel(mascotaJugador);
        }  

        if ("Rinoceronte".equals(comprar)) {
            subir = Rinoceronte.subirDeNivel(mascotaJugador);
        }  

        if ("Mono".equals(comprar)) {
            subir = Mono.subirDeNivel(mascotaJugador);
        }  

        if ("Cocodrilo".equals(comprar)) {
            subir = Cocodrilo.subirDeNivel(mascotaJugador);
        }  

        if ("Vaca".equals(comprar)) {
            subir = Vaca.subirDeNivel(mascotaJugador);
        }  

        if ("Chompipe".equals(comprar)) {
            subir = Chompipe.subirDeNivel(mascotaJugador);
        }  

        if ("Panda".equals(comprar)) {
            subir = Panda.subirDeNivel(mascotaJugador);
        }  

        if ("Gato".equals(comprar)) {
            subir = Gato.subirDeNivel(mascotaJugador);
        }  

        if ("Tigre".equals(comprar)) {
            subir = Tigre.subirDeNivel(mascotaJugador);
        }  

        if ("Serpiente".equals(comprar)) {
            subir = Serpiente.subirDeNivel(mascotaJugador);
        }  

        if ("Mamut".equals(comprar)) {
            subir = Mamut.subirDeNivel(mascotaJugador);
        }  

        if ("Leopardo".equals(comprar)) {
            subir = Leopardo.subirDeNivel(mascotaJugador);
        }  

        if ("Gorila".equals(comprar)) {
            subir = Gorila.subirDeNivel(mascotaJugador);
        }    
        
        if ("Pulpo".equals(comprar)) {
            subir = Pulpo.subirDeNivel(mascotaJugador);
        }  

        if ("Mosca".equals(comprar)) {
            subir = Mosca.subirDeNivel(mascotaJugador);
        }  
        
        if ("Quetzal".equals(comprar)) {
            subir = Quetzal.subirDeNivel(mascotaJugador);
        } 
        
        if ("Camaleon".equals(comprar)) {
            subir = Camaleon.subirDeNivel(mascotaJugador);
        }  
        return subir;
    }
    
    public int venderMascota(String mascotaJugador[]) {
        Scanner scanner = new Scanner(System.in);
        String animal = null;
        int oroRegresado = 0;
        System.out.println("Selecione el número del Animal que desea vender");
        System.out.println("    1. " + mascotaJugador[0] + "    2. " + mascotaJugador[1] + "    3. " + mascotaJugador[2] + "    4. " + mascotaJugador[3] + "    5. " + mascotaJugador[4]);
        int opcion = scanner.nextInt();
        
        if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5) {
            
            if (opcion == 1) {
                animal = mascotaJugador[0];
                mascotaJugador[0] = mascotaJugador[1];
                mascotaJugador[1] = mascotaJugador[2];
                mascotaJugador[2] = mascotaJugador[3];
                mascotaJugador[3] = mascotaJugador[4];
                mascotaJugador[4] = "------";  
            }

            if (opcion == 2) {
                animal = mascotaJugador[1];
                mascotaJugador[1] = mascotaJugador[2];
                mascotaJugador[2] = mascotaJugador[3];
                mascotaJugador[3] = mascotaJugador[4];
                mascotaJugador[4] = "------";            
            }

            if (opcion == 3) {
                animal = mascotaJugador[2];
                mascotaJugador[2] = mascotaJugador[3];
                mascotaJugador[3] = mascotaJugador[4];
                mascotaJugador[4] = "------";             
            }

            if (opcion == 4) {
                animal = mascotaJugador[3];
                mascotaJugador[3] = mascotaJugador[4];
                mascotaJugador[4] = "------";              
            }

            if (opcion == 5) {
                animal = mascotaJugador[4];
                mascotaJugador[4] = "------";               
            }
        } else {
            System.out.println("        Numéro no reconocido, vuelva a intentarlo");
        }    

        if ("Hormiga".equals(animal)) {
            oroRegresado = Hormiga.venderAnimal();
        }
            
        if ("Pescado".equals(animal)) {
            oroRegresado = Pescado.venderAnimal();
        }
          
        if ("Mosquito".equals(animal)) {
            oroRegresado = Mosquito.venderAnimal();
        }

        if ("Grillo".equals(animal)) {
            oroRegresado = Grillo.venderAnimal();
        }

        if ("Castor".equals(animal)) {
            oroRegresado = Castor.venderAnimal();
        }
        
        if ("Caballo".equals(animal)) {
            oroRegresado = Caballo.venderAnimal();
        }

        if ("Nutria".equals(animal)) {
            oroRegresado = Nutria.venderAnimal();
        }
        
        if ("Escarabajo".equals(animal)) {
            oroRegresado = Escarabajo.venderAnimal();
        }

        if ("Sapo".equals(animal)) {
            oroRegresado = Sapo.venderAnimal();
        }

        if ("Dodo".equals(animal)) {
            oroRegresado = Dodo.venderAnimal();
        }

        if ("Elefante".equals(animal)) {
            oroRegresado = Elefante.venderAnimal();
        }

        if ("PuercoEspin".equals(animal)) {
            oroRegresado = PuercoEspin.venderAnimal();
        }

        if ("PavoReal".equals(animal)) {
            oroRegresado = PavoReal.venderAnimal();
        }    
            
        if ("Rata".equals(animal)) {
            oroRegresado = Rata.venderAnimal();
        }

        if ("Zorro".equals(animal)) {
            oroRegresado = Zorro.venderAnimal();
        }

        if ("Araña".equals(animal)) {
            oroRegresado = Araña.venderAnimal();
        }

        if ("Camello".equals(animal)) {
            oroRegresado = Camello.venderAnimal();
        }

        if ("Mapache".equals(animal)) {
            oroRegresado = Mapache.venderAnimal();
        }

        if ("Jirafa".equals(animal)) {
            oroRegresado = Jirafa.venderAnimal();
        }
 
        if ("Tortuga".equals(animal)) {
            oroRegresado = Tortuga.venderAnimal();
        }

        if ("Caracol".equals(animal)) {
            oroRegresado = Caracol.venderAnimal();
        }

        if ("Oveja".equals(animal)) {
            oroRegresado = Oveja.venderAnimal();
        }

        if ("Conejo".equals(animal)) {
            oroRegresado = Conejo.venderAnimal();
        }

        if ("Lobo".equals(animal)) {
            oroRegresado = Lobo.venderAnimal();
        }

        if ("Buey".equals(animal)) {
            oroRegresado = Buey.venderAnimal();
        }

        if ("Canguro".equals(animal)) {
            oroRegresado = Canguro.venderAnimal();
        }

        if ("Buho".equals(animal)) {
            oroRegresado = Buho.venderAnimal();
        }

        if ("Venado".equals(animal)) {
            oroRegresado = Venado.venderAnimal();
        }  
            
        if ("Loro".equals(animal)) {
            oroRegresado = Loro.venderAnimal();
        }

        if ("Hipopotamo".equals(animal)) {
            oroRegresado = Hipopotamo.venderAnimal();
        }

        if ("Delfin".equals(animal)) {
            oroRegresado = Delfin.venderAnimal();
        }

        if ("Puma".equals(animal)) {
           oroRegresado = Puma.venderAnimal();
        }

        if ("Ballena".equals(animal)) {
            oroRegresado = Ballena.venderAnimal();
        }

        if ("Ardilla".equals(animal)) {
            oroRegresado = Ardilla.venderAnimal();
        }

        if ("Llama".equals(animal)) {
            oroRegresado = Llama.venderAnimal();
        }

        if ("Foca".equals(animal)) {
            oroRegresado = Foca.venderAnimal();
        }

        if ("Jaguar".equals(animal)) {
            oroRegresado = Jaguar.venderAnimal();
        }
            
        if ("Escorpion".equals(animal)) {
            oroRegresado = Escorpion.venderAnimal();
        }
            
        if ("Rinoceronte".equals(animal)) {
            oroRegresado = Rinoceronte.venderAnimal();
        }       
            
        if ("Mono".equals(animal)) {
            oroRegresado = Mono.venderAnimal();
        }

        if ("Cocodrilo".equals(animal)) {
            oroRegresado = Cocodrilo.venderAnimal();
        }

        if ("Vaca".equals(animal)) {
            oroRegresado = Vaca.venderAnimal();
        }

        if ("Chompipe".equals(animal)) {
            oroRegresado = Chompipe.venderAnimal();
        }

        if ("Panda".equals(animal)) {
            oroRegresado = Panda.venderAnimal();
        }

        if ("Gato".equals(animal)) {
            oroRegresado = Gato.venderAnimal();
        }

        if ("Tigre".equals(animal)) {
            oroRegresado = Tigre.venderAnimal();
        }

        if ("Serpiente".equals(animal)) {
            oroRegresado = Serpiente.venderAnimal();
        }           
            
        if ("Mamut".equals(animal)) {
            oroRegresado = Mamut.venderAnimal();
        }

        if ("Leopardo".equals(animal)) {
            oroRegresado = Leopardo.venderAnimal();
        }

        if ("Gorila".equals(animal)) {
            oroRegresado = Gorila.venderAnimal();
        }

        if ("Pulpo".equals(animal)) {
            oroRegresado = Pulpo.venderAnimal();
        }

        if ("Mosca".equals(animal)) {
            oroRegresado = Mosca.venderAnimal();
        }

        if ("Quetzal".equals(animal)) {
            oroRegresado = Quetzal.venderAnimal();
        }
            
        if ("Camaleon".equals(animal)) {
            oroRegresado = Camaleon.venderAnimal();
        }            
        return oroRegresado;
    }
    
    public int darVida(String archivo) {
        int vida = 0;
        
        if ("Hormiga".equals(archivo)) {
            vida = Hormiga.mandarVida();
        }        
        if ("Pescado".equals(archivo)) {
            vida = Pescado.mandarVida();
        }  
        if ("Mosquito".equals(archivo)) {
            vida = Mosquito.mandarVida();
        }              
        if ("Grillo".equals(archivo)) {
            vida = Grillo.mandarVida();
        }  
        if ("Castor".equals(archivo)) {
            vida = Castor.mandarVida();
        }   
        if ("Caballo".equals(archivo)) {
            vida = Caballo.mandarVida();           
        }
        if ("Nutria".equals(archivo)) {
            vida = Nutria.mandarVida();
        }   
        if ("Escarabajo".equals(archivo)) {
            vida = Escarabajo.mandarVida();           
        }    
        if ("Sapo".equals(archivo)) {
            vida = Sapo.mandarVida();
        }
        if ("Dodo".equals(archivo)) {
            vida = Dodo.mandarVida();
        }
        if ("Elefante".equals(archivo)) {
            vida = Elefante.mandarVida();
        }
        if ("PuercoEspin".equals(archivo)) {
            vida = PuercoEspin.mandarVida();
        }    
        if ("PavoReal".equals(archivo)) {
            vida = PavoReal.mandarVida();
        }
        if ("Rata".equals(archivo)) {
            vida = Rata.mandarVida();
        }
        if ("Zorro".equals(archivo)) {
            vida = Zorro.mandarVida();
        }
        if ("Araña".equals(archivo)) {
            vida = Araña.mandarVida();
        }    
        if ("Camello".equals(archivo)) {
            vida = Camello.mandarVida();
        }
        if ("Mapache".equals(archivo)) {
            vida = Mapache.mandarVida();
        }
        if ("Jirafa".equals(archivo)) {
            vida = Jirafa.mandarVida();
        }   
        if ("Tortuga".equals(archivo)) {
            vida = Tortuga.mandarVida();
        }
        if ("Caracol".equals(archivo)) {
            vida = Caracol.mandarVida();
        }
        if ("Oveja".equals(archivo)) {
            vida = Oveja.mandarVida();
        }
        if ("Conejo".equals(archivo)) {
            vida = Conejo.mandarVida();
        } 
        if ("Lobo".equals(archivo)) {
            vida = Lobo.mandarVida();
        }
        if ("Buey".equals(archivo)) {
            vida = Buey.mandarVida();
        }
        if ("Canguro".equals(archivo)) {
            vida = Canguro.mandarVida();
        }
        if ("Buho".equals(archivo)) {
            vida = Buho.mandarVida();
        }   
        if ("Venado".equals(archivo)) {
            vida = Venado.mandarVida();
        }
        if ("Loro".equals(archivo)) {
            vida = Loro.mandarVida();
        }
        if ("Hipopotamo".equals(archivo)) {
            vida = Hipopotamo.mandarVida();
        } 
        if ("Delfin".equals(archivo)) {
            vida = Delfin.mandarVida();
        }
        if ("Puma".equals(archivo)) {
            vida = Puma.mandarVida();
        }
        if ("Ballena".equals(archivo)) {
            vida = Ballena.mandarVida();
        }
        if ("Ardilla".equals(archivo)) {
            vida = Ardilla.mandarVida();
        }        
        if ("Llama".equals(archivo)) {
            vida = Llama.mandarVida();
        }    
        if ("Foca".equals(archivo)) {
            vida = Foca.mandarVida();
        }
        if ("Jaguar".equals(archivo)) {
            vida = Jaguar.mandarVida();
        } 
        if ("Escorpion".equals(archivo)) {
            vida = Escorpion.mandarVida();
        }
        if ("Rinoceronte".equals(archivo)) {
            vida = Rinoceronte.mandarVida();
        }
        if ("Mono".equals(archivo)) {
            vida = Mono.mandarVida();
        }
        if ("Cocodrilo".equals(archivo)) {
            vida = Cocodrilo.mandarVida();
        }   
        if ("Vaca".equals(archivo)) {
            vida = Vaca.mandarVida();
        } 
        if ("Chompipe".equals(archivo)) {
            vida = Chompipe.mandarVida();
        }
        if ("Panda".equals(archivo)) {
            vida = Panda.mandarVida();
        }
        if ("Gato".equals(archivo)) {
            vida = Gato.mandarVida();
        }
        if ("Tigre".equals(archivo)) {
            vida = Tigre.mandarVida();
        }  
        if ("Serpiente".equals(archivo)) {
            vida = Serpiente.mandarVida();
        } 
        if ("Mamut".equals(archivo)) {
            vida = Mamut.mandarVida();
        }
        if ("Leopardo".equals(archivo)) {
            vida = Leopardo.mandarVida();
        }   
        if ("Gorila".equals(archivo)) {
            vida = Gorila.mandarVida();
        }         
        if ("Pulpo".equals(archivo)) {
            vida = Pulpo.mandarVida();
        } 
        if ("Mosca".equals(archivo)) {
            vida = Mosca.mandarVida();
        }
        if ("Quetzal".equals(archivo)) {
            vida = Quetzal.mandarVida();
        }           
        if ("Camaleon".equals(archivo)) {
            vida = Camaleon.mandarVida();
        } 
        return vida;
    }
        
    public int darDaño(String archivo) {
        int daño = 0;
        
        if ("Hormiga".equals(archivo)) {
            daño = Hormiga.mandarDaño();
        }        
        if ("Pescado".equals(archivo)) {
            daño = Pescado.mandarDaño();
        }  
        if ("Mosquito".equals(archivo)) {
            daño = Mosquito.mandarDaño();
        }              
        if ("Grillo".equals(archivo)) {
            daño = Grillo.mandarDaño();
        }  
        if ("Castor".equals(archivo)) {
            daño = Castor.mandarDaño();
        }   
        if ("Caballo".equals(archivo)) {
            daño = Caballo.mandarDaño();           
        }
        if ("Nutria".equals(archivo)) {
            daño = Nutria.mandarDaño();
        }  
        if ("Escarabajo".equals(archivo)) {
            daño = Escarabajo.mandarDaño();           
        } 
        if ("Sapo".equals(archivo)) {
            daño = Sapo.mandarDaño();
        }
        if ("Dodo".equals(archivo)) {
            daño = Dodo.mandarDaño();
        }
        if ("Elefante".equals(archivo)) {
            daño = Elefante.mandarDaño();
        }
        if ("PuercoEspin".equals(archivo)) {
            daño = PuercoEspin.mandarDaño();
        }    
        if ("PavoReal".equals(archivo)) {
            daño = PavoReal.mandarDaño();
        }
        if ("Rata".equals(archivo)) {
            daño = Rata.mandarDaño();
        }
        if ("Zorro".equals(archivo)) {
            daño = Zorro.mandarDaño();
        }
        if ("Araña".equals(archivo)) {
            daño = Araña.mandarDaño();
        } 
        if ("Camello".equals(archivo)) {
            daño = Camello.mandarDaño();
        }
        if ("Mapache".equals(archivo)) {
            daño = Mapache.mandarDaño();
        }
        if ("Jirafa".equals(archivo)) {
            daño = Jirafa.mandarDaño();
        }    
        if ("Tortuga".equals(archivo)) {
            daño = Tortuga.mandarDaño();
        }
        if ("Caracol".equals(archivo)) {
            daño = Caracol.mandarDaño();
        }
        if ("Oveja".equals(archivo)) {
            daño = Oveja.mandarDaño();
        }
        if ("Conejo".equals(archivo)) {
            daño = Conejo.mandarDaño();
        } 
        if ("Lobo".equals(archivo)) {
            daño = Lobo.mandarDaño();
        }
        if ("Buey".equals(archivo)) {
            daño = Buey.mandarDaño();
        }
        if ("Canguro".equals(archivo)) {
            daño = Canguro.mandarDaño();
        }
        if ("Buho".equals(archivo)) {
            daño = Buho.mandarDaño();
        }
        if ("Venado".equals(archivo)) {
            daño = Venado.mandarDaño();
        }
        if ("Loro".equals(archivo)) {
            daño = Loro.mandarDaño();
        }
        if ("Hipopotamo".equals(archivo)) {
            daño = Hipopotamo.mandarDaño();
        } 
        if ("Delfin".equals(archivo)) {
            daño = Delfin.mandarDaño();
        }
        if ("Puma".equals(archivo)) {
            daño = Puma.mandarDaño();
        }
        if ("Ballena".equals(archivo)) {
            daño = Ballena.mandarDaño();
        }
        if ("Ardilla".equals(archivo)) {
            daño = Ardilla.mandarDaño();
        }   
        if ("Llama".equals(archivo)) {
            daño = Llama.mandarDaño();
        } 
        if ("Foca".equals(archivo)) {
            daño = Foca.mandarDaño();
        }
        if ("Jaguar".equals(archivo)) {
            daño = Jaguar.mandarDaño();
        } 
        if ("Escorpion".equals(archivo)) {
            daño = Escorpion.mandarDaño();
        }
        if ("Rinoceronte".equals(archivo)) {
            daño = Rinoceronte.mandarDaño();
        }
        if ("Mono".equals(archivo)) {
            daño = Mono.mandarDaño();
        }
        if ("Cocodrilo".equals(archivo)) {
            daño = Cocodrilo.mandarDaño();
        }   
        if ("Vaca".equals(archivo)) {
            daño = Vaca.mandarDaño();
        } 
        if ("Chompipe".equals(archivo)) {
            daño = Chompipe.mandarDaño();
        }
        if ("Panda".equals(archivo)) {
            daño = Panda.mandarDaño();
        }
        if ("Gato".equals(archivo)) {
            daño = Gato.mandarDaño();
        }
        if ("Tigre".equals(archivo)) {
            daño = Tigre.mandarDaño();
        }   
        if ("Serpiente".equals(archivo)) {
            daño = Serpiente.mandarDaño();
        } 
        if ("Mamut".equals(archivo)) {
            daño = Mamut.mandarDaño();
        }
        if ("Leopardo".equals(archivo)) {
            daño = Leopardo.mandarDaño();
        }   
        if ("Gorila".equals(archivo)) {
            daño = Gorila.mandarDaño();
        }         
        if ("Pulpo".equals(archivo)) {
            daño = Pulpo.mandarDaño();
        } 
        if ("Mosca".equals(archivo)) {
            daño = Mosca.mandarDaño();
        }
        if ("Quetzal".equals(archivo)) {
            daño = Quetzal.mandarDaño();
        }           
        if ("Camaleon".equals(archivo)) {
            daño = Camaleon.mandarDaño();
        } 
        return daño;
    }  
    
    public int darNivel(String animal) {
        int nivel = 0;
        
        if ("Hormiga".equals(animal)) {
            nivel = Hormiga.mandarNivel();
        }       
        if ("Pescado".equals(animal)) {
            nivel = Pescado.mandarNivel();
        }
        if ("Mosquito".equals(animal)) {
            nivel = Mosquito.mandarNivel();
        }
        if ("Grillo".equals(animal)) {
            nivel = Grillo.mandarNivel();
        }
        if ("Castor".equals(animal)) {
            nivel = Castor.mandarNivel();
        }
        if ("Caballo".equals(animal)) {
            nivel = Caballo.mandarNivel();
        }
        if ("Nutria".equals(animal)) {
            nivel = Nutria.mandarNivel();
        }
        if ("Escarabajo".equals(animal)) {
            nivel = Escarabajo.mandarNivel();
        } 
        if ("Sapo".equals(animal)) {
            nivel = Sapo.mandarNivel();
        }
        if ("Dodo".equals(animal)) {
            nivel = Dodo.mandarNivel();
        }
        if ("Elefante".equals(animal)) {
            nivel = Elefante.mandarNivel();
        }
        if ("PuercoEspin".equals(animal)) {
            nivel = PuercoEspin.mandarNivel();
        }    
        if ("PavoReal".equals(animal)) {
            nivel = PavoReal.mandarNivel();
        }
        if ("Rata".equals(animal)) {
            nivel = Rata.mandarNivel();
        }
        if ("Zorro".equals(animal)) {
            nivel = Zorro.mandarNivel();
        }
        if ("Araña".equals(animal)) {
            nivel = Araña.mandarNivel();
        }     
        if ("Camello".equals(animal)) {
            nivel = Camello.mandarNivel();
        }
        if ("Mapache".equals(animal)) {
            nivel = Mapache.mandarNivel();
        }
        if ("Jirafa".equals(animal)) {
            nivel = Jirafa.mandarNivel();
        }    
        if ("Tortuga".equals(animal)) {
            nivel = Tortuga.mandarNivel();
        }
        if ("Caracol".equals(animal)) {
            nivel = Caracol.mandarNivel();
        }
        if ("Oveja".equals(animal)) {
            nivel = Oveja.mandarNivel();
        }
        if ("Conejo".equals(animal)) {
            nivel = Conejo.mandarNivel();
        } 
        if ("Lobo".equals(animal)) {
            nivel = Lobo.mandarNivel();
        }
        if ("Buey".equals(animal)) {
            nivel = Buey.mandarNivel();
        }
        if ("Canguro".equals(animal)) {
            nivel = Canguro.mandarNivel();
        }
        if ("Buho".equals(animal)) {
            nivel = Buho.mandarNivel();
        }    
        if ("Venado".equals(animal)) {
            nivel = Venado.mandarNivel();
        }
        if ("Loro".equals(animal)) {
            nivel = Loro.mandarNivel();
        }
        if ("Hipopotamo".equals(animal)) {
            nivel = Hipopotamo.mandarNivel();
        } 
        if ("Delfin".equals(animal)) {
            nivel = Delfin.mandarNivel();
        }
        if ("Puma".equals(animal)) {
            nivel = Puma.mandarNivel();
        }
        if ("Ballena".equals(animal)) {
            nivel = Ballena.mandarNivel();
        }
        if ("Ardilla".equals(animal)) {
            nivel = Ardilla.mandarNivel();
        }   
        if ("Llama".equals(animal)) {
            nivel = Llama.mandarNivel();
        }
        if ("Foca".equals(animal)) {
            nivel = Foca.mandarNivel();
        }
        if ("Jaguar".equals(animal)) {
            nivel = Jaguar.mandarNivel();
        } 
        if ("Escorpion".equals(animal)) {
            nivel = Escorpion.mandarNivel();
        }
        if ("Rinoceronte".equals(animal)) {
            nivel = Rinoceronte.mandarNivel();
        }
        if ("Mono".equals(animal)) {
            nivel = Mono.mandarNivel();
        }
        if ("Cocodrilo".equals(animal)) {
            nivel = Cocodrilo.mandarNivel();
        }   
        if ("Vaca".equals(animal)) {
            nivel = Vaca.mandarNivel();
        } 
        if ("Chompipe".equals(animal)) {
            nivel = Chompipe.mandarNivel();
        }
        if ("Panda".equals(animal)) {
            nivel = Panda.mandarNivel();
        }
        if ("Gato".equals(animal)) {
            nivel = Gato.mandarNivel();
        }
        if ("Tigre".equals(animal)) {
            nivel = Tigre.mandarNivel();
        }   
        if ("Serpiente".equals(animal)) {
            nivel = Serpiente.mandarNivel();
        } 
        if ("Mamut".equals(animal)) {
            nivel = Mamut.mandarNivel();
        }
        if ("Leopardo".equals(animal)) {
            nivel = Leopardo.mandarNivel();
        }  
        if ("Gorila".equals(animal)) {
            nivel = Gorila.mandarNivel();
        }         
        if ("Pulpo".equals(animal)) {
            nivel = Pulpo.mandarNivel();
        } 
        if ("Mosca".equals(animal)) {
            nivel = Mosca.mandarNivel();
        }
        if ("Quetzal".equals(animal)) {
            nivel = Quetzal.mandarNivel();
        }          
        if ("Camaleon".equals(animal)) {
            nivel = Camaleon.mandarNivel();
        } 
        return nivel;
    }
}
