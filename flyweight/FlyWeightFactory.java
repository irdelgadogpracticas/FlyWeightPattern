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
public class FlyWeightFactory {
    IVehiculo auto;
    
    public void listarAutos(String color[], String patentes[], String dueños[]){
        for (int i = 0; i < dueños.length; i++) {
            auto = new Auto(color[i], patentes[i], dueños[i]);   
            System.out.println("Datos del auto\n" + auto.mostrarDetalle());  
        }
    }
}
