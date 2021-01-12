package boletin09_3;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  24 de nov. de 2020.
 * Clase para crear métodos sobre rectángulos
 *
 * @version 0.0.2
 **/
public class Validacion {
    /**
     * Base del rectángulo
     */
    private float base;
    /**
     * Altura del rectángulo
     */
    private float altura;

    /**
     * Método para solicitar los datos del rectángulo
     */
    private static Validacion instance=null;

    private Validacion(){
    }

    public static Validacion getInstance(){
        if (instance==null){
            instance = new Validacion();
        }

        return instance;
    }

    @Override
    public String toString() {
        return "Validacion{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public void pedirDatos() {
        base = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la base del rectángulo en cms "));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la altura del rectángulo en cms"));

    }

    /**
     * Método que impide meter datos negativos en la base y altura del rectángulo con un Do While
     *
     * @param rectangulo recibe un objeto de la Clase como parámetro
     */

    public void validar(Validacion rectangulo) {
        do {
            if (base <= 0 || altura <= 0) {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos, los valores tienen que se positivos");
                rectangulo.pedirDatos();

            }
        }
        while (base <= 0 || altura <= 0);
        float area = base * altura;
        JOptionPane.showMessageDialog(null, "El área del rectángulo es de " + area + " cms");
    }
}
