/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

/**
 *
 * @author angel
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Taxi objetoTaxi = new Taxi("ASDF","1234","Audi",120);
        
        Autobus objetoAutobus= new Autobus();
        
        System.out.println("Taxi: " + objetoTaxi.toString());
        
        System.out.println("Autobus: " + objetoAutobus.toString());
   
    objetoAutobus.setMatricula("4567DFG");
    objetoAutobus.setModelo("Iveco");
    objetoAutobus.setNumeroPlazas(55);
    objetoAutobus.setPotencia(150);
    
        System.out.println("Autobus: " + objetoAutobus.toString());
    
    }
   
}
