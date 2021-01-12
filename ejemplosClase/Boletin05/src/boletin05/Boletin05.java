/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin05;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Boletin05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // Declaro dos variables para recoger valores de Scanner y facilitar procesos
    double kmsRecor;
    float litrosCien;
        
    Consumo seatIbiza = new Consumo ();
    seatIbiza.setLitros(50);
    seatIbiza.setPGas(1.57);
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Introduce los Kilómetros que ha recorrido");
        kmsRecor = sc.nextDouble();
    
    System.out.println("Introduce el consumo que ha realizado en el trayecto");
        litrosCien=sc.nextFloat();
   Consumo renaultClio = new Consumo (kmsRecor,litrosCien,95.4f,1.57);
        
    renaultClio.getTempo();
    
    renaultClio.consumoMedio();
    renaultClio.consumoEuros(); 
    
    renaultClio.setLitros(6.7f);
        System.out.println("El nuevo consumo es de: " + renaultClio.getlitros()+ " litros a los 100 kms");
    }
    
}
