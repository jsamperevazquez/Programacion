/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin06_2;

/**
 *
 * @author Usuario
 */
public class Boletin06_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Instancio mis objetos
       Satelite prueba= new Satelite();
       Satelite hispasat = new Satelite(36.4,-30.1,36000);
       Satelite meteosat = new Satelite(0,0,40000);
       
       
       //Llamo a los diferentes métodos
       prueba.verPosicion();
       hispasat.verPosicion();
       meteosat.verPosicion();
    }
    
}
