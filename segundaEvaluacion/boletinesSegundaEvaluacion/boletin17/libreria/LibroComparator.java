package boletin17.libreria;

import boletin17.libreria.Libro;

import java.util.Comparator;

/**
 * Creado por @autor: angel
 * El  24 de feb. de 2021.
 **/
public class LibroComparator implements Comparator<Libro> {
    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
    }
}
