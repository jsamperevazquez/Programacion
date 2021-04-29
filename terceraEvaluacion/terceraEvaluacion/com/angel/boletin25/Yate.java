package com.angel.boletin25;

/**
 * Creado por @autor: angel
 * El  29 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Yate extends Barco{
    private int  potenciaCV;
    private int numeroCamarotes;

    // Constructor
    public Yate(String matricula, int eslora, int potenciaCV, int numeroCamarotes) {
        super(matricula, eslora);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    // Setters y Getters

    public float getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }


    @Override
    public float calcularPrecioAmarre() {
        return ((super.getEslora()*10) + 2*potenciaCV + 25*getNumeroCamarotes());
    }

    @Override
    public String toString() {
        return " Yate ----  " + "matricula: " +
                super.getMatricula()+ " eslora: " +
                super.getEslora() + " metros" +
                "  potenciaCV=  " + potenciaCV +
                " numeroCamarotes=  " + numeroCamarotes;
    }
}
