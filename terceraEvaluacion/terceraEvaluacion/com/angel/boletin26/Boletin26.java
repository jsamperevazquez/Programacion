package com.angel.boletin26;

import java.util.ArrayList;

/**
 * Creado por @autor: angel
 * El  30 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Boletin26 {
    public static void main(String[] args) {
        //Array de tipo Selección
        ArrayList<SeleccionFutbol> listaSeleccion = new ArrayList<>();

        //Objetos
        SeleccionFutbol futbolista1 = new Futbolista(1, "Marco", "Van Basten", 31, 9, "delantero");
        SeleccionFutbol entrenador1 = new Entrenador(1, "Johan", "Cruif", 54, 123);
        SeleccionFutbol masajista1 = new Masajista(1, "Juan", "Del Bosque", 59, "Fisio", 29);
        SeleccionFutbol seleccionador1 = new Seleccionador(1, "yo", "Mismo", 39);

        //Objetos a lista
        listaSeleccion.add(futbolista1);
        listaSeleccion.add(entrenador1);
        listaSeleccion.add(masajista1);
        listaSeleccion.add(seleccionador1);

        // Visualizo los objetos
        for (SeleccionFutbol ele : listaSeleccion) {
            System.out.println(ele);
        }

        // Compruebo el polimorfismo
        futbolista1.concentrarse();
        entrenador1.concentrarse();

    }

}
