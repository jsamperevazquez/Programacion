/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocondicional;

/**
 *
 * @author angel
 */
public class CondicionalSimple {
    private int edad;

    public CondicionalSimple() {
    }

    public CondicionalSimple(int edad) {
        this.edad = edad;
    }
    
    public void mayorEdad(int edad){
        if (edad >=18){
            System.out.println("Es mayor de edad");
            
        }
        System.out.println("Termina el condicional");
    }
}
