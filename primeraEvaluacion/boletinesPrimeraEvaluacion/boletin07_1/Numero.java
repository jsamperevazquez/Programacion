package boletin07_1;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  09 nov., 2020
 * Clase para introducir método y comprobar si un número es positivo o no (valor absoluto y opuesto coinciden)
 **/
public class Numero {
    /**
     * Atributo número para introducir un valor de tipo entero
     */
    private int numero;

    //Creo los constructores

    /**
     * Método constructor por defecto
     */
    public Numero() {

    }

    /**
     * Método parametrizado
     *
     * @param num parámetro entero para dar valor a atributo numero.
     */
    public Numero(int num) {
        numero = num;
    }
    //Omito los setter y getters, puesto que el ejercicio no lo pide y no son necesarios

    //Creo el método para comprobar los positivos

    /**
     * Método para comprobar si el entero pasado por parámetro es positivo
     */
    public void comprobarNumero() {
        if (numero >= 0)
            JOptionPane.showMessageDialog(null, "El número " + numero + " es positivo");


        JOptionPane.showMessageDialog(null, "Fin del condicional");
    }

}
