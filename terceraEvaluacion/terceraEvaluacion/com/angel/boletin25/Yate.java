package com.angel.boletin25;

/**
 * Creado por @autor: angel
 * El  29 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Yate extends Barco{
    private float potenciaCV;
    private int numeroCamarotes;

    // Constructor
    public Yate(String matricula, int eslora, float potenciaCV, int numeroCamarotes) {
        super(matricula, eslora);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    // Setters y Getters

    public float getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public String toString() {
        return "----Yate----" +
                super.getMatricula()+
                super.getEslora()+
                "potenciaCV=" + potenciaCV +
                ", numeroCamarotes=" + numeroCamarotes;
    }
}
