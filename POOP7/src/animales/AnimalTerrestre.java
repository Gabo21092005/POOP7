/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author gabri
 */
public class AnimalTerrestre extends Animal {
    private int numPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(int numPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numPatas = numPatas;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    
    public void correr(){
        System.out.println("fium fium");
    }
    
    @Override
    public void comer(){
        System.out.println("comiendo hierba");
    }

    @Override
    public String toString() {
        return "AnimalTerrestre{" + "numPatas=" + numPatas + '}';
    }
    
}
