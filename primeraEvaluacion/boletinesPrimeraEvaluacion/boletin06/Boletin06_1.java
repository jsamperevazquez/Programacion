/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin06;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin06_1 {
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     //Instancio un objeto de la clase Coche
       Coche coche1 = new Coche ();
    
    // Creo un objeto de la clase Scanner para introducir por teclado la velocidad
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce a la velocidad que va el vehículo");
        int veloci = sc.nextInt();   
    
    // Doy la velocidad actual con el metodo elegido
        coche1.getVelocidade(veloci);
    
    // Acelero el coche con el metodo acelerar y compruebo velocidad
        coche1.acelerar(40);
            coche1.verVeloc();
  
    // Freno el coche con el método frenar y compruebo
        coche1.frenar(20);
            coche1.verVeloc();
    
    
    }
    
}
