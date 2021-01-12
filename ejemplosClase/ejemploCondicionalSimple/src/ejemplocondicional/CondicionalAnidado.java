/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocondicional;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class CondicionalAnidado {
public void enseñarDatos(String nombre, int edad, float peso){
    
    if(edad>=18){
        if(peso>70){
            JOptionPane.showMessageDialog(null,"Nombre: " + nombre + " años y pesa :" + peso);
        }
    }
    JOptionPane.showMessageDialog(null,"Termina la condición");
}
           
}
