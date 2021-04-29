package com.angel.boletin25;

/**
 * Creado por @autor: angel
 * El  29 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Deportivas extends Barco{

    private int potenciaCV;

    // Constructor
    public Deportivas(String matricula, int eslora, int potenciaCV) {
        super(matricula, eslora);
        this.potenciaCV = potenciaCV;
    }

    // Getters


    public int getPotenciaCV() {
        return potenciaCV;
    }

    @Override
    public float calcularPrecioAmarre(){
        return (10*getEslora()) + (potenciaCV * 2);
    }



    @Override
    public String toString() {
        return " Deportiva ----  " + "matricula: " +
                super.getMatricula()+ " eslora: " +
                super.getEslora() + " metros" +
                "  potenciaCV=  " + potenciaCV;
    }
}
