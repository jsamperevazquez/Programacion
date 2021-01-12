/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjeto;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EjemploObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instancio un objeto tipo Rectangulo para poder acceder a la clase Rectangulo
        Rectangulo objRec1 = new Rectangulo();
        objRec1.visualizar();// Con esto accedemos al método visualizar y accedemos a los atributos del método.
        Rectangulo objRec2 = new Rectangulo (3f, 5f);
        objRec2.visualizar();
        //accedemos al atributo altura del metodo getter 
        float altura = objRec2.getAltura();
            System.out.println("La altura es: " + altura);
            
            
         //Damos otros valores con método setter
         
        objRec1.setBase(10f);
        objRec1.setAltura(11f);
        
        System.out.println("La nueva altura es: ");
        objRec1.visualizar();
        float base;
        float altura2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base del rectángulo");
        base = sc.nextFloat();
        
        System.out.println("Introduce la altura del rectángulo");
        altura2 = sc.nextFloat();
        
        float recoger = objRec2.calcularArea(base, altura2);
        System.out.println("El area del Rectángulo es " + recoger);
   
    
    }
    
}
