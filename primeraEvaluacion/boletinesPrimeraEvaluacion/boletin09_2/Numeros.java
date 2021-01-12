package boletin09_2;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  23 de nov. de 2020.
 * Clase para crear método de sumas y productos
 *
 * @version 0.0.1
 **/

public class Numeros {
    /**
     * variable para obtener la suma
     */
    private int suma = 0;
    /**
     * Variable para obtener el producto
     */
    private double producto = 1;

    /**
     * Método que muestra la suma y el producto de los números enteros comprendidos entre el 10 y el 90
     */

    public void sumaProducto() {
        for (int i = 10; i <= 90; i++) {
            suma = suma + i;
            producto = producto * i;
        }
        System.out.println("Suma " + suma);
        System.out.println("Producto " + producto);
    }


}
