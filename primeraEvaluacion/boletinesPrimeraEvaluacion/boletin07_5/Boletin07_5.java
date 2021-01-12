package boletin07_5;

import javax.swing.*;

/**
 * Clase con método main para instanciar objetos de tipo Numeros
 * Creado por @autor: angel
 * El  10 de nov. de 2020.
 *
 * @version 0.0.1
 **/
public class Boletin07_5 {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el segundo número"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el tercer número"));

        Numeros conjuntoNumeros = new Numeros(numero1, numero2, numero3);
        conjuntoNumeros.verMayor();
    }
}
