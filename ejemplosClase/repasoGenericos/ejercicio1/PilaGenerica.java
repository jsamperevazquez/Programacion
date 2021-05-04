package repasoGenericos.ejercicio1;

import java.util.LinkedList;

/**
 * Creado por @autor: angel
 * El  04 de may. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class PilaGenerica <E>{
    private LinkedList<E> lista;

   //Constructores
    public PilaGenerica() {
    lista = new LinkedList<E>();
    }

    public PilaGenerica(LinkedList lista) {
        this.lista = lista;
    }

    // Setters y getters
    public LinkedList getLista() {
        return lista;
    }

    public void setLista(LinkedList lista) {
        this.lista = lista;
    }
    public boolean estaVacia(){
        return lista.isEmpty();
    }
    public E extraer(){
        return  lista.removeFirst();
    }
    public E primero(){
        return lista.getFirst();
    }
    public void anadir(E objeto,String lugar){
        do {
            System.out.println("Solo puede ser principio o final");
        }while (lugar !="principio" || lugar !="final");
        if (lugar=="principio")
            lista.addFirst(objeto);
        else
            lista.addLast(objeto);
    }
    public String toString(){
        return lista.toString();
    }
}

