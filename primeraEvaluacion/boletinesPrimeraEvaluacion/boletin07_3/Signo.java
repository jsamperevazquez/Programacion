package boletin07_3;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  09 de nov. de 2020.
 *
 * @version 0.0.1
 **/
public class Signo {
    /**
     * Atributo de tipo int para ingresar un numero en método
     */
    private int numero;

    //Creo los constructores

    /**
     * Constructor por defecto
     */
    public Signo() {
    }

    /**
     * Constructor parametrizado
     *
     * @param numero .Parámetro de tipo int para pasar a método constructor
     */
    public Signo(int numero) {
        this.numero = numero;
    }
    //Creo método

    /**
     * Método sin retorno para comprobar si el número es positivo,negativo o 0.
     */
    public void verSigno() {
        if (numero > 0)
            JOptionPane.showMessageDialog(null, "El " + numero + " es + ");
        else if (numero < 0)
            JOptionPane.showMessageDialog(null, "El " + numero + " es - ");

        else
            JOptionPane.showMessageDialog(null, "El " + numero + " es 0");

    }
}
