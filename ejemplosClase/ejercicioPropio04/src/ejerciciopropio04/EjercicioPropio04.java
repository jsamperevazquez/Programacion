/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopropio04;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EjercicioPropio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        Scanner num = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        
        
        do{
           numero = num.nextInt();
           System.out.println("El número introducido es diferente a 0");
           System.out.println("Porfavor prueba otro número");
         }
             while (numero != 0);
        System.out.println("El numero introducido es 0, correcto"); 
    }
    
}
