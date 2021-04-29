package com.angel.boletin25;

/**
 * Creado por @autor: angel
 * El  28 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Barco {
    private String matricula;
    private int eslora;
    private float precioAmarre;

    // Constructor por defecto
    public Barco() {
    }

    // Constructor parametrizado
    public Barco(String matricula, int eslora) {
        this.matricula = matricula;
        this.eslora = eslora;
    }


    // Setters y Getters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getEslora() {
        return eslora;

    }

    public void precioTipoBarco(float precioAmarre){
        this.precioAmarre += precioAmarre;
    }



    @Override
    public String toString() {
        return "       *******   FACTURA    *******     " +
                "----BARCO----" +
                "matricula='" + matricula +
                "eslora=" + eslora +
                "precioAmarre=" + precioAmarre;
    }
}
