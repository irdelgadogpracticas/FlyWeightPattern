/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author Acer
 */
public class Auto implements IVehiculo {

    public String color;
    public String patente;
    public String dueño;
    
    public Auto(String color, String patente, String dueño){
        this.color = color;
        this.patente = patente;
        this.dueño = dueño;
    }
    
    
    @Override
    public String mostrarDetalle() {
        return "Patente: " + this.patente + ", Color: " + this.color + " , Dueño: "+ this.dueño;
    }
    
}
