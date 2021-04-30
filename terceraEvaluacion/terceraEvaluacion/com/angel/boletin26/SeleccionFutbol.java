package com.angel.boletin26;

/**
 * Creado por @autor: angel
 * El  30 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
   private Integer id;
   private String nombre;
   private String apellidos;
   private Integer edad;

    // Constructores
    public SeleccionFutbol() {
    }

    public SeleccionFutbol(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Integer getEdad() {
        return edad;
    }



    // Métodos implementados de la interface
    @Override
    public void concentrarse() {

    }

    @Override
    public void viajar() {

    }

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido() {

    }

    // toString()
    @Override
    public String toString() {
        return
                "id= " + id +
                "nombre= " + nombre +
                "apellidos= " + apellidos +
                "edad= " + edad ;
    }
}
