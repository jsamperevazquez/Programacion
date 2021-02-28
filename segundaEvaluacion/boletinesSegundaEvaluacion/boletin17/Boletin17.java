package boletin17;

import boletin17.libreria.Libreria;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  23 de feb. de 2021.
 **/

/**
 * Clase con metodo principal
 */
public class Boletin17 {
    public static void main(String[] args) {
        /**
         * Array con los botones del menú de opciones de JOption
         */
        String[] botones = {"Añadir libro", "Vender Libro", "Mostrar Stock", "Buscar Libro", "Salir"};
        /**
         * Para escoger la opción en el menú
          */
        int opcion;
        /**
         * Bucle para escoger entre las diferentes opciones del menú
         */
        do {
            opcion = JOptionPane.showOptionDialog(null, "Selecciona opción", "Libreria Sampere", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);

            switch (opcion) {
                case 0:
                    Libreria.añadirLibros();
                    break;
                case 1:
                    Libreria.venderLibros(Libreria.listaLibros);
                    break;
                case 2:
                    Libreria.mostrarLibros(Libreria.listaLibros);
                    break;
                case 3:
                    Libreria.buscarLibro(Libreria.listaLibros);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro servicio");
                    System.exit(0);
            }

        } while (opcion != 4);

    }
}
