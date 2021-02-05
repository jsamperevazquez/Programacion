package boletin15_04;
import libreriaAngel.*;
import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  05 de feb. de 2021.
 **/
public class Dni {
    public static final int numeroDividir=23;
    static int [] grupoDni;


    public static int[] hallarLetraDni(){
        grupoDni= new int[8];
        for (int i = 0; i <grupoDni.length ; i++) {
            int dni=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el número del dni sin letra"));


        }
            return grupoDni;
    }
}
