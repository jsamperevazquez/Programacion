package com.angel.boletin26;

/**
 * Creado por @autor: angel
 * El  30 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Futbolista extends SeleccionFutbol{

    private Integer dorsal;
    private String demarcacion;

    // Constructor
    public Futbolista(Integer id, String nombre, String apellidos, Integer edad, Integer dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    // Getters
    public Integer getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    // Métodos de clase
    public void entrevista(){}

    // toString de la clase

    @Override
    public String toString() {
        return " futbolista: " + super.toString() +
                " dorsal= " + dorsal +
                " demarcacion= " + demarcacion ;
    }
}
