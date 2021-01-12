package boletin07_3;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  09 de nov. de 2020.
 * Clase para instanciar objetos de clase Signo
 *
 * @version 0.0.1
 **/
public class Boletin07_3 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número"));
        Signo number = new Signo(numero);
        number.verSigno();
    }
}
