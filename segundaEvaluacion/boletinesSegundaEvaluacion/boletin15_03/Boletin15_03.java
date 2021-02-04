package boletin15_03;

import libreriaAngel.PedirDatos;
import libreriaAngel.ValidarDatos;

/**
 * Creado por @autor: Angel
 * El 04/02/2021
 **/
public class Boletin15_03 {
    public static void main(String[] args) {
        int[] lista = new int[boletin15_03.Alumnos.tamanoDam];
        int contador = 0;
        for (int nota : lista) {
            do { //Valido la nota máxima, porque la mínima ya viene validada por el metodo de mi librería
                lista[contador] = ValidarDatos.validarIntMenorQueCero();
            } while (lista[contador] > 10);
            Alumnos.arrayNotas(lista); // Voy mandando al método de crear el array todos los datos que voy metiendo
            contador++;
        }
        Alumnos objetoAlumno = new Alumnos();
        objetoAlumno.arrayNombres();
        objetoAlumno.verArrayNombresyNotas();
        objetoAlumno.buscarNotaAlumnoDeterminado("juan");
        objetoAlumno.buscarNotaAlumno();
        objetoAlumno.alumnosAprobados();


    }
}
