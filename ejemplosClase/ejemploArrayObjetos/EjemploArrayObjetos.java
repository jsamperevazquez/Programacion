package ejemploArrayObjetos;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  30 de ene. de 2021.
 **/
public class EjemploArrayObjetos {

    public static void main(String[] args) {
        int elementosArray = Integer.parseInt(JOptionPane.showInputDialog(null, "De cuantos elementos va a ser el array"));
        int eleccion = 0;
        Metodos objetoMetodos = new Metodos();
        Alumno[] lista = new Alumno[elementosArray];
        do {

            eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "**** MENU ****\n1- Crear Array\n2- Mostrar Array\n 3- Buscar alumno\n 4- Ordenar Directo\n 5- Ordenar Sort\n 0- Salir\n*** TECLEA OPCIÓN ***"));


            switch (eleccion) {
                case 1:
                    lista = objetoMetodos.crearArray(elementosArray);
                    break;

                case 2:
                    objetoMetodos.mostrarArray(lista);
                    break;
                case 3:
                    objetoMetodos.buscarAlumno(lista);
                    break;
                case 4:
                    objetoMetodos.ordenarDirecto(lista);
                    break;
                case 5:
                    objetoMetodos.ordenarSort(lista);
                    break;


                case 0:
                    break;
            }
        }
        while (eleccion != 0);

    }
}