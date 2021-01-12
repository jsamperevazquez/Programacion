/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocondicional;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class EjemploCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* int edad;
       int edad2;
       Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la edad");
        edad=sc.nextInt();
        CondicionalSimple obj1 = new CondicionalSimple(edad);
        obj1.mayorEdad(edad);
        
        CondicionalDoble obj2 = new CondicionalDoble();
        System.out.println("Introduce la edad");
        edad2=sc.nextInt();
        obj2.comparar(edad2);
       
      CondicionalDoble obj3 = new CondicionalDoble ();
      obj3.comparar(16);
    */
      int numero=Integer.parseInt(JOptionPane.showInputDialog("Teclea el día"));
      
      CondicionalMultiple obj4 = new CondicionalMultiple();
      // obj4.enseñarDiaSemana(numero);
      obj4.enseñarDiaSemana2(numero);
    }
    
}
