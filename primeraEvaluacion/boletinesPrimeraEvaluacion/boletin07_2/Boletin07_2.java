package boletin07_2;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  09 nov., 2020
 * Clase con método main para instanciar objetos de tipo NumeroSumaResta
 **/

public class Boletin07_2 {


    public static void main(String[] args) {
      short numero1=Short.parseShort(JOptionPane.showInputDialog(null,"Introduce el primer numero"));
      short numero2=Short.parseShort(JOptionPane.showInputDialog(null,"Introduce el segundo numero"));

      //Instancio mi objeto en clase NumeroSumaResta
      NumeroSumaResta numbers = new NumeroSumaResta(numero1,numero2);

      //LLamo al método de la clase
      numbers.realizarOperacion();
    }
}
