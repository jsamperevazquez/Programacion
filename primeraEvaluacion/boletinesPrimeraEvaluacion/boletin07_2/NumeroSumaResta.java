package boletin07_2;

import javax.swing.*;

/**
 *
 * Creado por @autor: angel
 * El  09 nov., 2020.
 * Clase para crear método y hacer comprobación con valores tipo short.
 * @version 0.0.1
 **/
public class NumeroSumaResta {

    private short numero1,numero2;

    //Creo los métodos constructores

    /**
     * Método constructor por defecto
     */
    public NumeroSumaResta() {
    }

    /**
     * Método constructor parametrizado
     * @param numero1   primer parámetro de tipo shot
     * @param numero2   segundo parámetro de tipo short
     */
    public NumeroSumaResta(short numero1, short numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Creo el método para hacer condicionales.

    /**
     * Método para comprobar si el primer parámetro es mayor o igual que el segundo.<br>
     *     En función de respuesta mostramos o no la resta de ambos
     */
    public void realizarOperacion(){

        if(numero1 >= numero2)
            JOptionPane.showMessageDialog(null,"La resta de " + numero1 + " menos "+ numero2 + " es igual a "+(numero1-numero2));

        JOptionPane.showMessageDialog(null,"La suma de " +numero1+" mas "+numero2+ " es igual a "+(numero1+numero2));
    }
}
