/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplovalidacion;

/**
 *
 * @author angel
 */
public class EjemploValidacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Validacion obj = new Validacion ();
    float recoger=obj.validarDato();
        System.out.println("Dato valido " + recoger);
        Validacion obj2= new Validacion(); 
    float recoger2=obj.validaWhile();
        System.out.println("Dato valido " + recoger2);
    }
   
    
}
