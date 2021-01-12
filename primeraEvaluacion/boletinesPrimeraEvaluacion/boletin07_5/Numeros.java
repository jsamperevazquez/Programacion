package boletin07_5;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  10 de nov. de 2020.
 * Clase con método para analizar número
 **/
public class Numeros {
    // Creo los tres atributos de la clase
    int numero1, numero2, numero3;

    //Creo los constructores

    /**
     * Método constructor por defecto.
     */
    public Numeros() {

    }

    /**
     * Método constructor parametrizado
     *
     * @param numero1 primer número para dar valor al atributo numero1
     * @param numero2 segundo número para dar valor al atributo numero2
     * @param numero3 tercer número para dar valor al atributo numero3
     */
    public Numeros(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;

    }
    // Creo el método para comprobar mayor de los 3

    /**
     * Método que no retorna valor, con condición para analizar cual es el mayor de los 3
     */
    public void verMayor() {
        if (numero1 > numero2 && numero1 > numero3) {
            JOptionPane.showMessageDialog(null, "El número mayor es " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            JOptionPane.showMessageDialog(null, "El número mayor es " + numero2);
        } else
            JOptionPane.showMessageDialog(null, "El número mayor es " + numero3);
    }
}
