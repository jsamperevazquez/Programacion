/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosconjoption;
    
/**
 *
 * @author angel
 */
import javax.swing.*;
public class DatosConJoption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Pedir string por JOptionPanel (Los datos recibidos siempre los toma como string, los demás tipos hay que cambiarlos)
        String nombre = JOptionPane.showInputDialog(null,"Introduce tu nombre");
        //Pedir un INT, hay que cambiarlo de String por defecto a int con el siguiente código
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la edad"));
        //Pedir un Float,hay que cambiarlo con este código
        float estatura=Float.parseFloat(JOptionPane.showInputDialog(null,"introduce tu estatura"));
        System.out.println("El alumno se llama " + nombre + " tiene " + edad +" años " + "y mide " + estatura);
    }
    
}
