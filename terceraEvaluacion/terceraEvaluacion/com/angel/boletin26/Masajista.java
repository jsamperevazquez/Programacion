package com.angel.boletin26;

/**
 * Creado por @autor: angel
 * El  30 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Masajista extends SeleccionFutbol {
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

    // Métodos sobreescritos
    @Override
    public void viajar() {
        System.out.println("El masajista " + super.getNombre() + " " + super.getApellidos() + " viaja");
    }


    // Método de la clase
    public void darMasaje() {
        System.out.println("El masajista " + super.getNombre() + " " + super.getApellidos() + " esta dando masajes");
    }

    @Override
    public String toString() {
        return " Masajista : " + super.toString() +
                " titulacion= " + titulacion +
                " anosExperencia= " + anosExperencia;
    }
}
