package boletin07_4;

import javax.swing.*;

/**
 * Clase con método main para instaciar objetos de tipo persona
 * Creado por @autor: angel
 * El  09 de nov. de 2020.
 *
 * @version 0.0.1
 **/
public class Boletin07_4 {
    public static void main(String[] args) {
        String nombre;
        float peso;
        nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre");
        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce tu peso"));
        Persona persona1 = new Persona(nombre, peso);
        nombre = JOptionPane.showInputDialog(null, "Introduce tu nombre");
        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce tu peso"));
        Persona persona2 = new Persona(nombre, peso);
        /*
        if (persona1.getMasa() > persona2.getMasa())
            JOptionPane.showMessageDialog(null, persona1.getNombre() + " Pesa más que " + persona2.getNombre() + " con una diferencia de " + (persona1.getMasa() - persona2.getMasa()) + " KG");
        else
            JOptionPane.showMessageDialog(null, persona2.getNombre() + " Pesa más que " + persona1.getNombre() + " con una diferencia de " + (persona2.getMasa() - persona1.getMasa()) + " KG");
        */
        persona1.compararPeso(persona1,persona2);


    }
}
