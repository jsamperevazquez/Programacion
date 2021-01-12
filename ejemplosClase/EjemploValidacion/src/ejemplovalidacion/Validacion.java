/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplovalidacion;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class Validacion {
 
    public float validarDato(){
    float dato;
    do{
    dato=Float.parseFloat(JOptionPane.showInputDialog("Introduce un valor positivo"));
    
    }
    while (dato<=0);
    
    return dato;
    } 

    public float validaWhile(){
    float dato2;
    dato2= Float.parseFloat(JOptionPane.showInputDialog("Introduce un valor positivo"));
    while(dato2<=0){
    dato2= Float.parseFloat(JOptionPane.showInputDialog("Introduce un valor positivo"));
    }
    return dato2;
    }

}
