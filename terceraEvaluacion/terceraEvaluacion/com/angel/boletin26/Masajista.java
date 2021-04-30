package com.angel.boletin26;

/**
 * Creado por @autor: angel
 * El  30 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private Integer anosExperencia;

    // Constructor
    public Masajista(Integer id, String nombre, String apellidos, Integer edad, String titulacion, Integer anosExperencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anosExperencia = anosExperencia;
    }

    // Getters
    public String getTitulacion() {
        return titulacion;
    }

    public Integer getAnosExperencia() {
        return anosExperencia;
    }

    // Método de la clase
    public void darMasaje(){}

    @Override
    public String toString() {
        return  " Masajista : " + super.toString() +
                "titulacion= " + titulacion +
                "anosExperencia= " + anosExperencia;
    }
}
