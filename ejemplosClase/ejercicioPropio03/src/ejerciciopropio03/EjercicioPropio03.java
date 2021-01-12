/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopropio03;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EjercicioPropio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        System.out.println("Introduce un número");
        Scanner num =new Scanner(System.in);
        
        
        numero = num.nextInt();
        if (numero%2==0){
            System.out.println("El número " + numero+ " es par");
        }
        else if (numero%2 != 0){
            System.out.println("El número " + numero + " es impar");
        }
        else {
            System.out.println("El dato introducido es incorrecto");
        }
    
    }
    
}
