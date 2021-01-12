package boletin11_02;

import javax.swing.*;


/**
 * Creado por @autor: angel
 * El  26 de nov. de 2020.
 * Clase para crear método con juego números
 * @version 0.0.1
 **/

public class Jugador {

    /**
     * Nombre que va a introducir el jugador
     */
    public static String nombreJugador;

    /**
     * Método para inserter el nombre del jugador
     * @return Devuelve el nombre del jugador
     */
    public String introducirNombreJugador() {
        nombreJugador = JOptionPane.showInputDialog(null, "Introduce tu nombre");
        return nombreJugador;
    }

    /**
     * Método que genera un número aleatorio con la clase Math y el jugador tiene que tratar de adivinarlo
     */
    public void jugarAdivinar() {
        int eleccionJugador;
        int contadorIntentos;
        int numero;
        contadorIntentos = 0;
        numero = (int) (Math.random() * 50 + 1);

        do {
            eleccionJugador = Integer.parseInt(JOptionPane.showInputDialog(null, "Probemos suerte, elige tu número " +nombreJugador ));
            if (numero - eleccionJugador > 20 || eleccionJugador - numero > 20) {
                JOptionPane.showMessageDialog(null, "SIGUE INTENTANDO!!!\nEstás muy lejos del número");
                contadorIntentos++;
                JOptionPane.showMessageDialog(null, "LLevas " + contadorIntentos + " intentos");

            } else if (numero - eleccionJugador <= 20 && numero - eleccionJugador >= 10 || eleccionJugador - numero <= 20 && eleccionJugador - numero >= 10) {
                JOptionPane.showMessageDialog(null, "SIGUE INTENTANDO!!!\nEstás lejos del número");
                contadorIntentos++;
                JOptionPane.showMessageDialog(null, "LLevas" + contadorIntentos + " intentos");

            } else if (numero - eleccionJugador < 10 && numero - eleccionJugador > 5 || eleccionJugador - numero < 10 && eleccionJugador - numero > 5) {
                JOptionPane.showMessageDialog(null, "SIGUE INTENTANDO!!!\nEstás cerca del número");
                contadorIntentos++;
                JOptionPane.showMessageDialog(null, "LLevas" + contadorIntentos + " intentos");
            }else if (numero - eleccionJugador <=5 && numero!=eleccionJugador || eleccionJugador - numero <= 5 && numero!=eleccionJugador){
                JOptionPane.showMessageDialog(null, "SIGUE INTENTANDO!!!\nEstás muy cerca del número");
                contadorIntentos++;
                JOptionPane.showMessageDialog(null, "LLevas" + contadorIntentos + " intentos");

            } else if (numero == eleccionJugador){
                JOptionPane.showMessageDialog(null, "CORRECTO!!! Enhorabuena\nLo has encontrado en "+ contadorIntentos + " intentos");
                contadorIntentos++;
                break;
            }
        } while (eleccionJugador != numero);
    JOptionPane.showMessageDialog(null,"Fin del juego, ¿Otra partidita?");
    }


}




