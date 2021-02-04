package boletin15_02;

import java.util.Arrays;

/**
 * Creado por @autor: angel
 * El  04 de feb. de 2021.
 **/
public class Alumnos {
    static final int tamanoDam=8;
    static int[] notaAlumno;

    public static int[] getNotaAlumno() {
        return notaAlumno;
    }

    public static void setNotaAlumno(int[] notaAlumno) {
        Alumnos.notaAlumno = notaAlumno;
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
        }
        return  notaAlumno;
    }
    public void aprobadosSuspensos(){
        int contadorAprobados=0,contadorSuspensos=0;
        for (int i = 0; i <tamanoDam ; i++) {
            if (notaAlumno[i]>=5)
                contadorAprobados ++;
            else
                contadorSuspensos ++;
        }
        System.out.println("El numero de aprobados es de " + contadorAprobados + " y suspensos " +contadorSuspensos);
    }
    public void notamediaClase(){
        float media=0;
        for (int i = 0; i <tamanoDam ; i++) {
            media=media+notaAlumno[i];
        }
        media=media/tamanoDam;
        System.out.println("La nota media de la asignatura de programación de DAM es de " + media);
    }
    public void notaMayor(){
        int [] notas = new int[tamanoDam];
        for (int i = 0; i <tamanoDam ; i++) {
            notas[i]=notaAlumno[i];
        }
        Arrays.sort(notas);
        System.out.println("La nota más alta es de un  " +notas[tamanoDam - 1]);
    }
}
