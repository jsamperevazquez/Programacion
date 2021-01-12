package boletin09_4;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  24 de nov. de 2020.
 * Clase para crear métodos con números
 **/
public class Numero {
    /**
     * Variable para recibir el numero en cuestión
     */
    public int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Método que devuelve el número solicitado
     *
     * @return número que ingresa usuario
     */
    public int pedirNumero() {
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numero (0 para terminar programa)"));
        return numero;
    }

    /**
     * Método para visualizar la tabla de multiplicar de  numero que es ingresado, y el 0 termina bucle
     *
     * @param number recibe un entero como parámetro que es el primer número a visualizar
     */
    public void tablaMultiplicar(int number) {
        do {
            if (number == 0) {
                JOptionPane.showMessageDialog(null, "Programa terminado por usuario");
                break;
            }
            for (int i = 1; i < 11; i++) {
                int tablaMultiplicar = number * i;
                System.out.println(number + " x " + i + " = " + tablaMultiplicar);
            }
            pedirNumero();
            number = numero;
            if (number == 0)
                JOptionPane.showMessageDialog(null, "Programa terminado por usuario");


        }
        while (number != 0);
    }
}
