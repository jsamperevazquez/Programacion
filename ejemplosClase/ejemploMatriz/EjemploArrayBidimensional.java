package ejemploMatriz;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  08 de feb. de 2021.
 **/
public class EjemploArrayBidimensional {
    public static void main(String[] args) {
        String opcion;
        String [] nombresAlumnos={"Juan","Francisco","Pepe"};
        MetodosMatriz objetoMetodo = new MetodosMatriz();
        do {

            opcion = JOptionPane.showInputDialog(null, "***  MENÚ ***\n" +
                    "crear --- CREAR MATRIZ\n" +
                    "mostrar --- MOSTRAR MATRIZ\n" +
                    "mediaalumno --- MEDIA ALUMNO\n" +
                    "mediamodulo  --- MEDIA MODULO\n" +
                    "ordenarnotas --- ORDENAR NOTAS");
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
                    objetoMetodo.notaMediaModulo(objetoMetodo.tablaNotas);
                    break;
                case "ordenarnotas":
                    objetoMetodo.ordenarNotas(objetoMetodo.tablaNotas,nombresAlumnos,MetodosMatriz.mediaAlumno);

                    case "fin":
                    System.exit(0);
            }

        } while (opcion.equalsIgnoreCase("fin") == false);
    }
}
