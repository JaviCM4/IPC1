/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego.animales;

import com.mycompany.juego.comidas.*;

/**
 *
 * @author DELL
 */
public class Panda extends Animal {
    private final Manzana Manzana;
    private final Naranja Naranja;
    private final Pastelito Pastelito;
    private final HuesoDeCarne HuesoDeCarne;
    private final PastillaParaDormir PastillaParaDormir;
    private final Ajo Ajo;
    private final Ensalada Ensalada;
    private final Pera Pera;
    private final Chile Chile;
    private final Chocolate Chocolate;
    private final Sushi Sushi;
    private final Hongo Hongo;
    private final Pizza Pizza;
    private final Carne Carne;
    
    public Panda() {
        Manzana = new Manzana();
        Naranja = new Naranja();
        Pastelito = new Pastelito();
        HuesoDeCarne = new HuesoDeCarne();
        PastillaParaDormir = new PastillaParaDormir();
        Ensalada = new Ensalada();
        Ajo = new Ajo();
        Pera = new Pera();
        Chile = new Chile();
        Chocolate = new Chocolate();
        Sushi = new Sushi();
        Hongo = new Hongo();
        Pizza = new Pizza();
        Carne = new Carne();
        vida = 5;
        daño = 5;
        nivel = 1;
        experiencia = 1;
        controlNivel = 0;
        tipo = "Mamifero/Solitario";
    }

    public void recibirComida(String enviarComida, String mascotaJugador[]) {
         String comida = enviarComida;
        
        if ("Manzana".equals(comida)) {
            vida = Manzana.activarEfecto(vida);
            daño = Manzana.activarEfecto1(daño);
        }
        if ("Naranja".equals(comida)) {
            daño = Naranja.activarEfecto1(daño);
            System.out.println(daño);
        }
        if ("Pastelito".equals(comida)) {
            vida = Pastelito.activarEfecto(vida);
            daño = Pastelito.activarEfecto1(daño);
        }
        if ("HuesoDeCarne".equals(comida)) {
            daño = HuesoDeCarne.activarEfecto1(daño);
        }
        if ("PastillaParaDormir".equals(comida)) {
            PastillaParaDormir.activarEfecto(mascotaJugador);
        }
        if ("Ajo".equals(comida)) {
            vida = Ajo.activarEfecto(vida);
        }
        if ("Ensalada".equals(comida)) {
            vida = Ensalada.activarEfecto(vida);
            daño = Ensalada.activarEfecto1(daño);        
        }
        if ("Pera".equals(comida)) {
            vida = Pera.activarEfecto(vida);
            daño = Pera.activarEfecto1(daño);
        }
        if ("Chile".equals(comida)) {
            daño = Chile.activarEfecto1(daño);
        }
        if ("Chocolate".equals(comida)) {
            experiencia = Chocolate.activarEfecto(experiencia);
        }
        if ("Suschi".equals(comida)) {
            vida = Sushi.activarEfecto(vida);
            daño = Sushi.activarEfecto1(daño);         
        }
        if ("Melon".equals(comida)) {
            System.out.println("        Aplicando Escudo");
        }
        if ("Hongo".equals(comida)) {
            vida = Hongo.activarEfecto(vida);
        }
        if ("Pizza".equals(comida)) {
            vida = Pizza.activarEfecto(vida);
            daño = Pizza.activarEfecto1(daño);        
        }
        if ("Carne".equals(comida)) {
            daño = Carne.activarEfecto1(daño);
        }
    }
    
    public int subirDeNivel(String mascotaJugador[]) {
        
        switch (controlNivel) {
            case 0 -> {
                vida += 1;
                daño += 1;
                experiencia += 1; 
                controlNivel += 1;
            }
            case 1 -> {
                vida += 1;
                daño += 1;
                experiencia += 1; 
                controlNivel += 1;
                nivel += 1; 
                
                for (int i = 0; i < 5; i++) {
                    
                    if ("Pescado".equals(mascotaJugador[i])) {
                        System.out.println("Activando Power-up del Pescado");
                        System.out.println();
                        vida += 1;
                        vida += 1;
                    }
                }
                System.out.println("    Panda elevada a nivel 2");                
            }
            case 2 -> {
                vida += 1;
                daño += 1;
                experiencia += 1; 
                controlNivel += 1; 
            }
            case 3 -> {
                vida += 1;
                daño += 1;
                experiencia += 1; 
                controlNivel += 1;               
            }
            case 4 -> {
                vida += 1;
                daño += 1;
                experiencia += 1; 
                controlNivel += 1;
                nivel += 1; 
                
                for (int i = 0; i < 5; i++) {
                    
                    if ("Pescado".equals(mascotaJugador[i])) {
                        System.out.println("Activando Power-up del Pescado");
                        System.out.println();
                        vida += 2;
                        vida += 2;
                    }
                }
                System.out.println("    Panda elevada a nivel 3");
            } 
            case 5 -> {
                controlNivel += 1;          
            }
            default -> {
            }
        }
        
        if (controlNivel < 6) {
            System.out.println("    +1 de Vida");
            System.out.println("    +1 de Daño");
            System.out.println("    +1 de Experiencia");        
        }
        
        return controlNivel;
    }
    
    public int venderAnimal() {
        int oro1 = 0;
        
        if (nivel == 1) {
            oro1 = 1;
            nivel = 1;
            System.out.println("    Devolviendo 1 de oro");
        }       
        if (nivel == 2) {
            oro1 = 2;
            nivel = 1; 
            System.out.println("    Devolviendo 2 de oro");
        }
        if (nivel == 3) {
            oro1 = 3;
            nivel = 1;   
            System.out.println("    Devolviendo 3 de oro");
        } 
        return oro1;
    }
    
    public int mandarVida() {
        return vida;
    }
    
    public int mandarDaño() {
        return daño;
    }
    
    public int mandarNivel() {
        return nivel;
    }
    
    public int mandarVida1() {
        int aleatorio = (int) (Math.random()*3);
        int vida1 = 0;
        
        if (aleatorio == 0) {
            vida1 = 5;
        }       
        if (aleatorio == 1) {
            vida1 = 6;
        }
        if (aleatorio == 2) {
            vida1 = 7;
        }
        return vida1;    
    }
    
    public int mandarDaño1() {
        int aleatorio = (int) (Math.random()*3);
        int daño1 = 0;
        
        if (aleatorio == 0) {
            daño1 = 5;
        }
        if (aleatorio == 1) {
            daño1 = 6;
        }
        if (aleatorio == 2) {
            daño1 = 7;
        }
        return daño1;
    }
}
