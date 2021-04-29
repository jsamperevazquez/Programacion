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

    // Setters y Getters
    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "----Deportivas----" +
                super.getMatricula()+
                +super.getEslora()+
                "potenciaCV=" + potenciaCV;
    }
}
