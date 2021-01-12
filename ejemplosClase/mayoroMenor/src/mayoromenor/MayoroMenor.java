/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayoromenor;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class MayoroMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        num1=sc.nextInt();
        
        System.out.println("Introduce otro número");
        num2=sc.nextInt();
        
        Comprobar obj1 = new Comprobar();
        obj1.comparar(num1, num2);
      
    }
    
}
