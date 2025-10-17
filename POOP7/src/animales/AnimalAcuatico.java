/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;
/**
 *
 * @author gabri
 */
public class AnimalAcuatico extends Animal{
    private int numAletas;
    
    public AnimalAcuatico(){
    }

    public AnimalAcuatico(int numAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numAletas = numAletas;
    }

    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }
    
    public void nadar(){
        System.out.println("animal nadando");
    }
    
    public void comer(){
        System.out.println("comiendo peces");
    }

    @Override
    public String toString() {
        return "AnimalAcuatico{" + "numAletas=" + numAletas + '}';
    }
    
    
}
