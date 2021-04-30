package com.angel.boletin26;

/**
 * Creado por @autor: angel
 * El  30 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Entrenador extends SeleccionFutbol{

    private Integer idFederacion;

    // Constructor
    public Entrenador(Integer id, String nombre, String apellidos, Integer edad, Integer idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    //Getters
    public Integer getIdFederacion() {
        return idFederacion;
    }

    // Método de clase
    public void planificarEntrenamiento(){}

    //toString de la clase

    @Override
    public String toString() {
        return  " Entrenador : " + super.toString() +
                " idFederacion= " + idFederacion;
    }
}
