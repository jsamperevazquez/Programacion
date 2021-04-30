package com.angel.boletin26;

/**
 * Creado por @autor: angel
 * El  30 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Seleccionador extends SeleccionFutbol{


    // Constructor
    public Seleccionador(Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
    }

    // Método de clase
    public void seleccionarJugador(){
        System.out.println("El seleccionador " + super.getNombre()+"" + super.getApellidos()+ " selecciona jugadores");
    }

    //toString()

    @Override
    public String toString() {
        return super.toString();
    }
}
