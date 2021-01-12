package boletin08_1;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  11 de nov. de 2020.
 * Clase para crear los métodos de nuestros productos
 * @version 0.0.1
 *
 **/
public class Productos {
    /**
     * Nombre del producto de nuestro almacén
     */
    private String nombreArticulo;
    /**
     * Ventas que se han realizado en un año
     */
    private int ventasAnuales;

    /**
     * Método constructor por defecto
     */
    public Productos() {
    }

    /**
     * Método constructor parametrizado
     * @param nombreArticulo Nombre del artículo
     * @param ventasAnuales  Ventas anuales del artículo
     */
    public Productos(String nombreArticulo, int ventasAnuales) {
        this.nombreArticulo = nombreArticulo;
        this.ventasAnuales = ventasAnuales;
    }

    /**
     * Método que nos indica que tipo de artículo és en función de las ventas realizadas en un año
     */
    public void tipoArticulo() {
        if (ventasAnuales <= 0)
            JOptionPane.showMessageDialog(null, "Ese producto no se ha vendido");

        else if (ventasAnuales <= 100)
            JOptionPane.showMessageDialog(null, "Artículo de consumo bajo");

        else if (ventasAnuales <= 500)
            JOptionPane.showMessageDialog(null, "Artículo de consumo medio");

        else if (ventasAnuales <= 1000)
            JOptionPane.showMessageDialog(null, "Artículo de consumo alto");
        else
            JOptionPane.showMessageDialog(null, "Artículo de primera necesidad");
    }
}
