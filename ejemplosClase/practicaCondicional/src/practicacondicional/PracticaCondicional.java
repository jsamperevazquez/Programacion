/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacondicional;

/**
 *
 * @author angel
 */
public class PracticaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Conocido el nombre y edad de una persona indicar si es niño,adolescente,joven o adulto, según la siguiente tabla:
            <14 años niño niño
            15 a 18 adolescente
            19 a 30 joven 
            >30 adulto
        
        */
        ValorarEdad persona1 = new ValorarEdad(21,"Pepe");
        persona1.verEdad();
        
    }
    
}
