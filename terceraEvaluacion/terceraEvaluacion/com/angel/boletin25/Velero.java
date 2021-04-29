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
    // Setters y Getters
    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }



    @Override
    public String toString() {
        return "----Velero----" +
                super.getMatricula()+
                super.getEslora() +
                "numeroMastiles=" + numeroMastiles;
    }
}
