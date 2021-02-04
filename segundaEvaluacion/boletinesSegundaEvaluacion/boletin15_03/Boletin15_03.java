package boletin15_03;

import libreriaAngel.PedirDatos;
import libreriaAngel.ValidarDatos;

/**
 * Creado por @autor: Usuario
 * El 04/02/2021
 **/
public class Boletin15_03 {
    public static void main(String[] args) {
        int[] lista = new int[boletin15_03.Alumnos.tamanoDam];
        int contador = 0;
        for (int nota : lista) {

            lista[contador] = ValidarDatos.validarIntMenorQueCero();
            Alumnos.arrayNotas(lista);
            contador++;
        }
        Alumnos objetoAlumno = new Alumnos();
        objetoAlumno.arrayNombres(PedirDatos.pedirString("Introduce el nombre del alumno"));

    }
}
