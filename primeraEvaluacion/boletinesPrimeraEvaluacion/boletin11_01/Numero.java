package boletin11_01;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * Creado por @autor: Ángel
 * El 26/11/2020
 *
 * @version 1.0.0
 **/
public class Numero {
    /**
     * Número elegido por el jugador
     */
    private int numero;
    /**
     * Intentos que va a tener el jugador para adivinar
     */
    private int intento;
    /**
     * Nombre del jugador 1
     */
    private static String nombreJugador1;
    /**
     * Nombre del jugador 2
     */
    private static String nombreJugador2;

    /**
     * Método para introducir los nombres de los jugadores que van a jugar
     */
    public void introducirNombreJugadores() {
        nombreJugador1 = JOptionPane.showInputDialog(null, "Introduce tu nombre jugador 1");
        nombreJugador2 = JOptionPane.showInputDialog(null, "Introduce tu nombre jugador 2");
    }

    /**
     * Método para adivinar el número que el jugador 1 ha elegido
     */
    public void jugarAdivinar() {
        int eleccionJugador;
        int contadorIntentos;
        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog(null, nombreJugador1 + " introduce el número entre 1 y 50"));
        } while (numero < 1 || numero > 50);
        intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos intentos tendrá " + nombreJugador2 + " para adivinar"));
        contadorIntentos = intento;
        for (int i = 0; i < intento; i++) {
            eleccionJugador = Integer.parseInt(JOptionPane.showInputDialog(null, "Probemos suerte, elige tu número " + nombreJugador2));
            if (eleccionJugador > numero) {
                JOptionPane.showMessageDialog(null, "SIGUE INTENTANDO!!!\nEl número buscado es menor que el introducido");
                contadorIntentos--;
                JOptionPane.showMessageDialog(null, "Te quedan " + contadorIntentos + " intentos");

            } else if (eleccionJugador < numero) {
                JOptionPane.showMessageDialog(null, "SIGUE INTENTANDO!!!\nEl número buscado es mayor que el introducido");
                contadorIntentos--;
                JOptionPane.showMessageDialog(null, "Te quedan " + contadorIntentos + " intentos");
            } else {
                JOptionPane.showMessageDialog(null, "CORRECTO!!! Enhorabuena");
                break;
            }

        }
        JOptionPane.showMessageDialog(null, "Juego terminado, prueba de nuevo");

    }

}
