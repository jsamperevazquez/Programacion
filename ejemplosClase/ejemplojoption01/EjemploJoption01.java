/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojoption01;

//Enunciado:  Cree un programa con JOptionPane que permita guardar el nombre del usuario, pedir 2 numero de tipo entero sumarlos y mostrar el resultado.

import javax.swing.*;


/**
 *
 * @author angel
 */

public class EjemploJoption01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1,num2,suma;
        String nombre;
        
    nombre = JOptionPane.showInputDialog("Inserte su nombre");
    num1=Float.parseFloat(JOptionPane.showInputDialog("Inserte el primer número"));
    num2=Float.parseFloat(JOptionPane.showInputDialog("Inserte el segundo número"));
    suma=num1+num2;
    JOptionPane.showMessageDialog(null,nombre+" La suma de " + num1+ " + " + num2 + " =" + suma);
    
    }
    
}
