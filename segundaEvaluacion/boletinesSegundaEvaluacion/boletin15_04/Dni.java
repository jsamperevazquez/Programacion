package boletin15_04;
import libreriaAngel.*;
import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  05 de feb. de 2021.
 **/
public class Dni {
    public static final int numeroDividir=23;
    static int [] restoDivision = new int[23];
    static int [] numeroDni= new int[23];
    static  char[] dniLetra= new char[23];
    static int  moduloDivisionDni;
    /**
    dniLetra={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    numeroDni={3, 11, 20, 9, 22, 7, 4, 18, 13, 21, 19, 5, 12, 8, 16, 1, 15, 0, 17, 2, 10, 6, 14};
    **/
    public static int [] hallarModuloDivision(){

        for (int i = 0; i <dniLetra.length ; i++) {
            int dni=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el número del dni sin letra"));
            moduloDivisionDni=dni%23;
            restoDivision[i]=moduloDivisionDni;

        }
            return restoDivision;
    }
}
