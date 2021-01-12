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
public class Metodos {
        /* Conocido el nombre, edad y peso de una persona, escribir sus datos, si es mayor de edad y pesa más de 70 KG.
                                                         
    */

 
    
    public Float pedirFloat(){
        
       return Float.parseFloat(JOptionPane.showInputDialog(null,"Teclea peso"));
        
    }
    public String pedirString(){
        return JOptionPane.showInputDialog(null,"Teclea Nombre");
            
    }
}
