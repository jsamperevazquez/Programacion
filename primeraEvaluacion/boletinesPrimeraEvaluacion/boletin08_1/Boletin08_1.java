package boletin08_1;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  11 de nov. de 2020.
 * Clase para instanciar objetos de tipo Productos
 * @version 0.0.1
 **/
public class Boletin08_1 {
    /**
     *
     * @param args JOptionPane para pedir los parámetros de nuestros objetos
     */
    public static void main(String[] args) {


        String nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del producto");
        int ventas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce las ventas anuales"));

        Productos articulo1 = new Productos(nombre, ventas);

        articulo1.tipoArticulo();

        nombre=JOptionPane.showInputDialog(null, "Introduce el nombre del producto");
        ventas=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce las ventas anuales"));

        Productos articulo2 = new Productos(nombre,ventas);
        articulo2.tipoArticulo();
    }
}