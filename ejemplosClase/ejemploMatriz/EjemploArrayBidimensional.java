package ejemploMatriz;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  08 de feb. de 2021.
 **/
public class EjemploArrayBidimensional {
    public static void main(String[] args) {
        String opcion;
        MetodosMatriz objetoMetodo = new MetodosMatriz();
        do {

            opcion = JOptionPane.showInputDialog(null, "***  MENÚ ***\n" +
                    "crear --- CREAR MATRIZ\n" +
                    "mostrar --- MOSTRAR MATRIZ\n" +
                    "mediaalumno --- MEDIA ALUMNO\n" +
                    "mediamodulo  --- MEDIA MODULO");
            switch (opcion) {
                case "crear":
                    objetoMetodo.crearMatriz();
                    break;
                case "mostrar":
                    objetoMetodo.mostrarArray(objetoMetodo.tablaNotas);
                    break;
                case "mediaalumno":
                    objetoMetodo.notaMediaAlumno(objetoMetodo.tablaNotas);
                    break;
                case "mediamodulo":
                    objetoMetodo.notaMediaMoudlo(objetoMetodo.tablaNotas);
                    break;

                case "fin":
                    System.exit(0);
            }

        } while (opcion.equalsIgnoreCase("fin") == false);
    }
}
