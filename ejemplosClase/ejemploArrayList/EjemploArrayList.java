package ejemploArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Creado por @autor: angel
 * El  18 de feb. de 2021.
 **/
public class EjemploArrayList {
    public static void main(String[] args) {
       /* ArrayList lista = new ArrayList();
        System.out.println("*** Creamos arrayList ***");
        lista.add(2);
        lista.add(" Programación ");
        lista.add(2.3f);
        lista.add(new Integer(5));
        System.out.println(lista);
    */
        ArrayList <Integer> lista = new ArrayList<Integer>(); // Te obliga a que los elementos de la lista sean Integer.
        ListaNumeros objeto1 = new ListaNumeros();
        for (int i = 0; i <4 ; i++) {
            objeto1.añadirElementos();
        }
       /** objeto1.mostrarListaIterator();
        System.out.println("Eliminamos un elemento");
        objeto1.eliminar();
        objeto1.mostrarListaForEach();
        System.out.println("Añadir número en posición 1");
        objeto1.añadirPorPosicion(1);
        objeto1.mostrarListaFor();
        objeto1.eliminarMultiplos2();
        System.out.println("Borro multiplos de 2");
        objeto1.mostrarListaFor();
        **/
        System.out.println("Multiplico todos los elemnetos por 3");
        objeto1.multiplicarTodosElemntosx3();

    }
}
