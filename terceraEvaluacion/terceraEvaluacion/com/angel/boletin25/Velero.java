package com.angel.boletin25;

/**
 * Creado por @autor: angel
 * El  29 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Velero extends Barco {
    private int numeroMastiles;


    // Constructor
    public Velero(String matricula, int eslora, int numeroMastiles) {
        super(matricula, eslora);
        this.numeroMastiles = numeroMastiles;
    }
    // Getters


    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    @Override
    public float calcularPrecioAmarre(){
        return (10*getEslora()) + (numeroMastiles * 8);
    }


    @Override
    public String toString() {
        return " Velero----  " + "matricula: " +
                super.getMatricula()+ " eslora: " +
                super.getEslora() + " metros" +
                "  numeroMastiles=  " + numeroMastiles;
    }
}
