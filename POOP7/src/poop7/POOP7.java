/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

import animales.Perro;
import animales.Ballena;
import animales.Pajaro;
/**
 *
 * @author gabri
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          // ---------- PERRO ----------
        Perro perro1 = new Perro("Negro", 4, "Junior", "Alemania", "Café");
        perro1.hacerTrucos();
        perro1.correr();
        perro1.sonido("Guau guau");
        perro1.comer();
        System.out.println(perro1.toString());
        System.out.println("--------------------------");
        
        Ballena ballena1 = new Ballena(32, 2, "Willy", "Pacífico", "Gris");
        ballena1.pelearConPinocho();
        ballena1.nadar();
        ballena1.sonido("Woooooo");
        ballena1.comer();
        System.out.println(ballena1.toString());
        System.out.println("--------------------------");
        
        Pajaro pajaro1 = new Pajaro("Pico corto", 2, "Piolín", "Brasil", "Amarillo");
        pajaro1.recolectarRamas();
        pajaro1.volar();
        pajaro1.sonido("Pío pío");
        pajaro1.comer();
        System.out.println(pajaro1.toString());
        System.out.println("--------------------------");
     
    }
}
                
    
    

