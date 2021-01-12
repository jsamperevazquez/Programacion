/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin03;

import javax.swing.*;
import java.text.DecimalFormat;//Esto es necesario de importar para poder ajustar el formato de los decimales
import java.util.Scanner;//Esto es necesario importar para poder solicitar datos por teclado

/**
 * Clase con programa para cambiar de euros a dólares.<br>
 * Cambiamos a la versión 0.0.2 pues se cambia petición con Scanner por JOptionP
 *
 * @author angel
 * @version 0.0.2
 */
public class Boletin03 {

    /**
     * Creamos dos variables de tipo double para pasarle la cantidad de euros a cambiar y otra para ingresar la cantidad de dólares una vez hecho el cambio
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cantidadEuros;
        double cantidadDolar;
        DecimalFormat formato2 = new DecimalFormat("#.##");// Con esto damos el formato que deseamos a los decimales (2 decimales) con variable formato2
        // Scanner entrada = new Scanner(System.in);// Con esto inicializamos la variable entrada como clase Scanner y decimos que es nuevo scanner de entrada de sistema.
        // System.out.println("Por favor ingresa la cantidad en euros \n");
        cantidadEuros = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de € para cambiar a $"));
        cantidadDolar = cantidadEuros * 1.18;
        //System.out.println(formato2.format(cantidadEuros) + " Euros son en Dolares " + formato2.format(cantidadDolar) + " dolares");// le damos formato con formato2.format()
        JOptionPane.showMessageDialog(null, formato2.format(cantidadEuros) + " Euros son en Dolares " + formato2.format(cantidadDolar) + " dolares");

    }

}
