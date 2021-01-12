package boletin08_2;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  11 de nov. de 2020.
 * Clase para instanciar objetos de tipo Figura
 *
 * @version 0.0.1
 **/
public class Boletin08_2 {
    public static void main(String[] args) {
        int numeroFigura = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número para figura \n" +
                "1-Cuadrado\n" +
                "2-Triángulo\n" +
                "3-Círculo"), JOptionPane.QUESTION_MESSAGE);

        Figura figura = new Figura(numeroFigura);
        figura.verSuperficie();

    }
}
