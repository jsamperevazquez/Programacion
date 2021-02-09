package boletin15_04;
import libreriaAngel.*;
import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  05 de feb. de 2021.
 **/
public class Dni {
    public static final int numeroDividir=23;
    static int [] restoDivision;
    static int [] dnis;
    static int [] numeroDni= {3, 11, 20, 9, 22, 7, 4, 18, 13, 21, 19, 5, 12, 8, 16, 1, 15, 0, 17, 2, 10, 6, 14};
    static char[] dniLetra ={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    static int  moduloDivisionDni;
    static int dni;



    public static int [] hallarModuloDivision(){
        int tamaño=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce cuantos DNI vamos a analizar"));
        restoDivision=new int[tamaño];
        dnis = new int[tamaño];
        for (int i = 0; i <tamaño ; i++) {
            try {
                do {

                    dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número del dni sin letra"));
                    if (dni <=9999999 || dni >=100000000 )
                        JOptionPane.showMessageDialog(null,"Ese número de DNI no es válido,\n vuelve a introducirlo o déjalo vacío para no cubrir esa posición");
                }while (dni <=9999999 && dni >=100000000);
                }catch (NumberFormatException es){
                dni=0;
            }
            try {
                dnis[i]=dni;
                moduloDivisionDni = dni % 23;
                restoDivision[i] = moduloDivisionDni;
            }catch (ArithmeticException es){

                JOptionPane.showMessageDialog(null,"Posición saltada");

            }
        }
            return restoDivision;
    }
    public static void mostrarModulo(){

        for (int i = 0; i < restoDivision.length; i++) {
            JOptionPane.showMessageDialog(null,"Modulo de D.N.I "+restoDivision[i]);

        }
    }
    public static void mostrarLetraDni(int[] lista){
        for (int i = 0; i <lista.length ; i++) {
            for (int j = 0; j <restoDivision.length ; j++) {
                if (lista[i]==restoDivision[j])
                    JOptionPane.showMessageDialog(null,"La letra del dni " + dnis[j] + " es " + dniLetra[i]);


            }

        }

    }
}
