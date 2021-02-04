package boletin15_01;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  03 de feb. de 2021.
 * @version 0.0.1
 **/
public class Arrays {
    static final int tamañoArrayAleatorio = 6;

    static int[] crearArrayAleatorio() {
        int[] arrayAleatorio = new int[tamañoArrayAleatorio];
        for (int i = 0; i < tamañoArrayAleatorio; i++) {
            arrayAleatorio[i] = (int) (Math.random() * (51 - 1)) + 1;

        }
        return arrayAleatorio;
    }

    static void verArrayAleatorio(int lista[]) {
        for (int i =5; i >= 0 ; i--) {
            JOptionPane.showMessageDialog(null, "En el índice " + i + " está el valor " + lista[i]);
        }
    }
}
