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

    // Métodos sobreescritos
    @Override
    public void concentrarse(){
        System.out.println("El entrenador " + super.getNombre()+" " + super.getApellidos()+ " se concentra");
    }

    @Override
    public void viajar(){
        System.out.println("El entrenador "+ super.getNombre() + " " +super.getApellidos() + " viaja");
    }



    // Método de clase
    public void planificarEntrenamiento(){
        System.out.println("El entrenador "+ super.getNombre() + " " +super.getApellidos() + " esta planeando entreno");
    }

    //toString de la clase
    @Override
    public String toString() {
        return  " Entrenador : " + super.toString() +
                " idFederacion= " + idFederacion;
    }
}
