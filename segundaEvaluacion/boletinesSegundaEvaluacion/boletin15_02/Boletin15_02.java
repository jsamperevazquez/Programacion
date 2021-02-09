package boletin15_02;
import libreriaAngel.*;

/**
 * Creado por @autor: angel
 * El  04 de feb. de 2021.
 **/
public class Boletin15_02 {
    public static void main(String[] args) {
        Alumnos objetoAlumno = new Alumnos();
        int[] lista = new int[Alumnos.tamanoDam];
        int contador = 0;
        for (int nota : lista) {

            lista[contador] = ValidarDatos.validarIntMenorQueCero();
            Alumnos.arrayNotas(lista);
            contador++;
        }
        // llamo a los métodos.
        objetoAlumno.aprobadosSuspensos();
        objetoAlumno.notamediaClase();
        objetoAlumno.notaMayor();
    }
}
