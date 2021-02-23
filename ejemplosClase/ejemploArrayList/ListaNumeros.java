package ejemploArrayList;

import libreriaAngel.PedirDatos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Creado por @autor: angel
 * El  18 de feb. de 2021.
 **/
public class ListaNumeros {
    ArrayList<Integer> listaNumeros = new ArrayList<>();

    public void añadirElementos() { // método para añadir enteros a la lista
        int elemento = PedirDatos.pedirInt("Numero entero  para lista");
        listaNumeros.add(elemento);
    }

    public void mostrarListaFor() { // Método para visualizar con for i.
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println("*** " + listaNumeros.get(i));
        }
    }

    public void mostrarListaForEach() { // Método para visualizar con for each.
        for (Integer ele : listaNumeros)
            System.out.println("*** " + ele);
    }

    public void mostrarListaIterator() { // Método para visualizar lista con Iterator
        int elemento = 0;
        Iterator it = listaNumeros.iterator();
        while (it.hasNext()) {
            elemento = (int) it.next();
            System.out.println("///" + elemento);
            // También se puede hacer
            // System.out.println("///" + it.next());
        }
    }
    public void eliminar (){
        int elementoEliminar=PedirDatos.pedirInt("Elemento a eliminar");
        for (int i = 0; i <listaNumeros.size() ; i++) {
            if (listaNumeros.get(i)==elementoEliminar){
                listaNumeros.remove(i);
            }
        }

    }
    public void añadirPorPosicion(int posicion){
        int elemento = PedirDatos.pedirInt("Numero entero  para lista");
        listaNumeros.add(posicion,elemento);
    }
    public void eliminarMultiplos2 (){
        int elementoEliminar=0;
        for (int i = 0; i <listaNumeros.size() ; i++) {
            if (listaNumeros.get(i) % 2==0){
              listaNumeros.remove(listaNumeros.get(i));
            }
        }
    }
    public void multiplicarTodosElemntosx3(){
        int elemento=0;
        Iterator it = listaNumeros.iterator();
        while (it.hasNext()){
            elemento= (int) it.next();
            elemento=elemento*3;
            System.out.println("***" + elemento);
        }
    }
}