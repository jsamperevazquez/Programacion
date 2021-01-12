/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacondicional;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class ValorarEdad {
   private int años;
   private String nombre;

    public ValorarEdad() {
    }

    public ValorarEdad(int años, String nombre) {
        this.años = años;
        this.nombre = nombre;
    }
   
    public void verEdad (){
        if(años<14){
            JOptionPane.showMessageDialog(null, "Es un niño");
            
        }
        if (años >=15 && años <=18){
            JOptionPane.showMessageDialog(null, "es un adolescente");
        } 
        if (años >19 && años <= 30){
            JOptionPane.showMessageDialog(null, "Eres joven");
            
        }
        if (años > 30)
            JOptionPane.showMessageDialog(null, "Eres adulto");
    }
    }
  

