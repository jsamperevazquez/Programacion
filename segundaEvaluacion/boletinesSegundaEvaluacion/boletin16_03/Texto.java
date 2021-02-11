package boletin16_03;

import javax.swing.*;
import java.util.Arrays;
/**
 * Creado por @autor: angel
 * El  11 de feb. de 2021.
 **/
public class Texto {
    static final String cadena="www.java-desde0.com";
    static String [] textodividido = cadena.split("-"); // Funcion split divide un String por el caracter que queramos.
    static String resultado;
    public Texto() {
    }

    public static void verTextoDividido(){
        JOptionPane.showMessageDialog(null,"Texto dividido: ");
        for (int i = 0; i <textodividido.length ; i++) {
            JOptionPane.showMessageDialog(null,textodividido[i]);
        }
    }
    public static String unirTexto(String [] texto, String delimitador) {
        resultado=Arrays.toString(texto).replace(",", delimitador).replaceAll("[\\[\\][\\s]]", ""); //función para unir partes del array String en un solo String. Con [\[\][\s]] eliminamos espacios retornos de carro,etc para juntar texto
        JOptionPane.showMessageDialog(null,resultado);
        return resultado;
    }
}
