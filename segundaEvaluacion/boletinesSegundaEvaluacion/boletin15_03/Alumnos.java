package boletin15_03;

import libreriaAngel.PedirDatos;
import libreriaAngel.ValidarDatos;

import javax.swing.*;

/**
 * Creado por @autor: Angel
 * El 04/02/2021
 **/
public class Alumnos {
    static final int tamanoDam = 30;
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

    public static int[] arrayNotas(int[] lista) {
        notaAlumno = new int[tamanoDam];
        for (int i = 0; i < tamanoDam; i++) {
            notaAlumno[i] = lista[i];
        }
        return notaAlumno;
    }

    public String[] arrayNombres() {
        nombresAlumnos = new String[tamanoDam];
        for (int i = 0; i < tamanoDam; i++) {
            String nombreAlumno = (PedirDatos.pedirString("Introduce el nombre del alumno"));
            nombresAlumnos[i] = nombreAlumno;
        }
        return nombresAlumnos;
    }

    public void buscarNotaAlumnoDeterminado(String alumno) {
        int alumnoEncontrado = 0;
        for (int i = 0; i < tamanoDam; i++) {
            if (nombresAlumnos[i].equalsIgnoreCase(alumno)) {
                JOptionPane.showMessageDialog(null, "La nota del alumno " + nombresAlumnos[i] + " es de un " + notaAlumno[i]);
                alumnoEncontrado++;
            }

        }
        if (alumnoEncontrado == 0)
            JOptionPane.showMessageDialog(null, "El alumno no está en la lista");
    }

    public void verArrayNombresyNotas() {
        for (int i = 0; i < tamanoDam; i++) {
            JOptionPane.showMessageDialog(null, "El alumno " + nombresAlumnos[i] + " tiene una nota de " + notaAlumno[i]);
        }
    }

    public void buscarNotaAlumno() {
        String alumnoBuscado = JOptionPane.showInputDialog(null, "Nombre del Alumno que queremos buscar");
        int encontrado = 0;
        for (int i = 0; i < tamanoDam; i++) {
            if (nombresAlumnos[i].equalsIgnoreCase(alumnoBuscado)) {
                JOptionPane.showMessageDialog(null, "La nota del alumno " + nombresAlumnos[i] + " es de un " + notaAlumno[i]);
                encontrado++;
            }

        }
        if (encontrado == 0)
            JOptionPane.showMessageDialog(null, "El alumno no está en la lista");
    }

    public void alumnosAprobados() {
        int contadorAprobados = 0;
        for (int i = 0; i < tamanoDam; i++) {
            if (notaAlumno[i] >= 5) {
                contadorAprobados++;

            }
        }
        String[] listaAprobados = new String[contadorAprobados];
        for (int i = 0, j = 0; i < tamanoDam; i++) {
            if (notaAlumno[i] >= 5) {
                listaAprobados[j] = nombresAlumnos[i];
                JOptionPane.showMessageDialog(null, listaAprobados[j] + " , es un alumno aprobado");
                j++;

            }
        }
    }

    public void ordenarporNotas(int[] lista) {
        int auxNota;
        String auxNombre;
        for (int i = 0; i < tamanoDam - 1; i++) {
            for (int j = i + 1; j < tamanoDam; j++) {
                if (notaAlumno[i] > notaAlumno[j]) {
                    auxNota = notaAlumno[i];
                    auxNombre = nombresAlumnos[i];
                    notaAlumno[i] = notaAlumno[j];
                    nombresAlumnos[i] = nombresAlumnos[j];
                    notaAlumno[j] = auxNota;
                    nombresAlumnos[j] = auxNombre;
                }
                }

            }
        System.out.println("***** Lista ordenada por notas de menor a mayor ******");
    }
}
