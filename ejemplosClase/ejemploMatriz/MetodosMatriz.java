package ejemploMatriz;


import libreriaAngel.ValidarDatos;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  08 de feb. de 2021.
 **/
public class
MetodosMatriz {
    int [][] tablaNotas;
    static int filasmedia;
    static int [] mediaAlumno;

    public int[][] crearMatriz(){
        int filas= ValidarDatos.validarIntMenorQueCero("Introduce número de filas");
        int columnas=ValidarDatos.validarIntMenorQueCero("Introduce número de columnas");
        filasmedia=filas;
        tablaNotas = new int[filas][columnas];
        mediaAlumno=new int[filas];
        for (int i = 0; i <filas ; i++) {
            for (int j = 0; j <columnas ; j++) {
                tablaNotas[i][j]= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la nota"));

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
                mediaAlumno[i]=acumulador/tabla.length;


            }
            System.out.println("*** "+acumulador/ tabla.length);
        }
    }
    public void notaMediaModulo(int [][] tabla){
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
        int auxNota=0;
        int aux2Nota=0;
        for (int i = 0; i <mediaAlumno.length -1; i++) {
            for (int j = i+1; j < tablaNotas.length; j++) {
                if (mediaAlumno[i]<mediaAlumno[j])
                    auxNota=mediaAlumno[i];
                    mediaAlumno[i]=mediaAlumno[j];
                    mediaAlumno[j]=auxNota;
                for (int k = 0; k <tabla[i].length ; k++) {
                    aux2Nota=tabla[j][k];
                    tabla[j][k]=tabla[j][k];
                    tabla[j][k]=aux2Nota;
                }


            }
            JOptionPane.showMessageDialog(null,"Las notas ordenadas son ");
            for (int j = 0; j <mediaAlumno.length ; j++) {
                JOptionPane.showMessageDialog(null,mediaAlumno[i]);
            }
        }

    }
    }

