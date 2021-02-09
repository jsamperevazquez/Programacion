package ejemploMatriz;

import libreriaAngel.ValidarDatos;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  08 de feb. de 2021.
 **/
public class MetodosMatriz {
    int [][] tablaNotas;

    public int[][] crearMatriz(){
        int filas=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el número de filas"));
        int columnas= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el número de columnas"));
        tablaNotas = new int[filas][columnas];
        for (int i = 0; i <filas ; i++) {
            for (int j = 0; j <columnas ; j++) {
                tablaNotas[i][j]= ValidarDatos.validarIntMenorQueCero();


            }

        }
        return tablaNotas;
    }
    public void mostrarArray(int[][] tabla){
        for (int i = 0; i <tabla.length ; i++) {
            System.out.println("\n");
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j]+ " "); // Le quitamos el ln del print para que muestre toda la fila seguida mas un espacio en medio.

            }

        }
    }
    public void notaMediaAlumno(int [][] tabla){
        int acumulador=0;
        for (int i = 0; i <tabla.length ; i++) {
                acumulador=0;
            for (int j = 0; j < tabla[i].length ; j++) {
                acumulador=acumulador+tabla[i][j];

            }
            System.out.println("*** "+acumulador/ tabla.length);
        }
    }
    public void notaMediaMoudlo (int [][] tabla){
         int acumulador;
        for (int i = 0; i <tabla[0].length ; i++) {
            acumulador=0;
            for (int j = 0; j < tabla.length; j++) {
                acumulador=acumulador+tabla[i][j];

            }
            System.out.println(" *** " + acumulador/tabla.length);
        }
    }
    public void ordenarNotas (int [][] tabla, String []listaNombres, int[] listaMedias){


    }
    }

