/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploinscodigo;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class ExemploInsCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float velocidad;
        String color;
        float precio;
        
        Coche obj1 = new Coche (220,"verde",12000);
        Scanner sc = new Scanner (System.in);
        //Meto primero el escanner con nextLine para que no de problemas de ejecución
        System.out.println("Introduce la el color del coche");
        color=sc.nextLine();
        
        
        System.out.println("Introduce la velocidad max del coche");
        velocidad=sc.nextFloat();
        
       
        System.out.println("Introduce precio del coche");
        precio=sc.nextFloat();
        
        Coche obj2= new Coche (velocidad,color,precio);
        
        
       
        
        
        System.out.println(obj1.toString());
        System.out.println(obj1);
        
        
        System.out.println(obj2.toString());
        
    }
    
}
