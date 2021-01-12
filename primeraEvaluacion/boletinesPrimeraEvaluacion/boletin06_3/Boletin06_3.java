/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin06_3;


/**
 * Clase para instanciar objetos en la subclase Circulo
 *
 * @author angel
 * @version 0.0.1
 */
public class Boletin06_3 {

    /**
     * @param args instanciamos los objetos circ1 y circ2 en la clase Circulo y llamamos a dos métodos
     */
    public static void main(String[] args) {

        //Instanciamos objetos y llamamos métodos
        Circulo circ1 = new Circulo();
        Circulo circ2 = new Circulo();
        circ1.calcularArea();
        circ2.calcularLonxitude();


    }

}
