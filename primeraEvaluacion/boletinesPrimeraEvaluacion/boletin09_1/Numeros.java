package boletin09_1;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  23 de nov. de 2020.
 * Clase para crear método de analizar números
 *
 * @version 0.0.1
 **/
public class Numeros {
    /**
     * variable de tipo entero para recibir el numero a analizar
     */
    private int numero;

    /**
     * Método que analiza si el número recibido es negativo, positivo o cero
     */

    public void analizarNumero() {
        int contadorPositivos=0,contadorNegativos=0,contadorCeros=0;
        for (int i = 0, j = 1; i < 10; i++, j++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            if (numero < 0) {
                contadorNegativos ++;
            }
                else if (numero > 0) {
                    contadorPositivos ++;
                }
                else
                contadorCeros ++;
        }
        JOptionPane.showMessageDialog(null,"La cantidad de positivos son: " + contadorPositivos + ", de negativos son: " + contadorNegativos + " y de 0 es :" + contadorCeros);
    }
}
