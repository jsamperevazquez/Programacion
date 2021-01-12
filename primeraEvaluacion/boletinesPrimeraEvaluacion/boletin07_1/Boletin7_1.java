package boletin07_1;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  09 nov., 2020
 * Clase para instanciar objetos en clase Numero y hacer comprobación.
 **/
public class Boletin7_1 {
    /**
     * @param args Creamos nuestros objetos en método main.
     */

    public static void main(String[] args) {

        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número a comprobar"));
        Numero numero1 = new Numero(number);
        numero1.comprobarNumero();
    }
}
