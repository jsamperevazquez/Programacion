package boletin15_03;

import libreriaAngel.PedirDatos;
import libreriaAngel.ValidarDatos;

import javax.swing.*;

/**
 * Creado por @autor: Usuario
 * El 04/02/2021
 **/
public class Alumnos {
    static final int tamanoDam=5;
    static int[] notaAlumno;
    static String[] nombresAlumnos;


    public static int[] getNotaAlumno() {
        return notaAlumno;
    }

    public static void setNotaAlumno(int[] notaAlumno) {
        boletin15_03.Alumnos.notaAlumno = notaAlumno;
    }

    public Alumnos() {
    }

    public static int getTamanoDam() {
        return tamanoDam;
    }

    public static int[] arrayNotas(int[] lista){
        notaAlumno= new int[tamanoDam];
        for (int i = 0; i <tamanoDam ; i++) {
            notaAlumno[i]=lista[i];
            System.out.println(notaAlumno[i]);
        }
        return  notaAlumno;
    }
    public  String[] arrayNombres(){
        nombresAlumnos = new String[tamanoDam];
        for (int i = 0; i <tamanoDam ; i++) {
            String nombreAlumno=(PedirDatos.pedirString("Introduce el nombre del alumno"));
            nombresAlumnos[i]=nombreAlumno;
            System.out.println(nombresAlumnos[i]);
        }
        return  nombresAlumnos;
    }
    public void buscarNotaAlumno(){
        String alumnoBuscado= JOptionPane.showInputDialog(null,"Nombre del Alumno que queremos buscar");
        int contador=0, encotrado=0;
        String [] listaRepes = new String[tamanoDam];
        for (int i = 0; i < tamanoDam; i++) {
            if (nombresAlumnos[i].equalsIgnoreCase(alumnoBuscado))
                System.out.println("La nota del alumno " + nombresAlumnos[i] + " es de un " + notaAlumno[i]);


        }

    }
}
