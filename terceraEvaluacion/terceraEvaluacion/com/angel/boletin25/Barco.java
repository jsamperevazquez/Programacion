package com.angel.boletin25;
import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  28 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public abstract class Barco {
    private String matricula;
    private int eslora;
    private static float precioAmarre;
    private  static float precioTotal;

    // Constructor por defecto
    public Barco() {
    }

    // Constructor parametrizado
    public Barco(String matricula, int eslora) {
        this.matricula = matricula;
        this.eslora = eslora;
    }


    //  Getters

    public String getMatricula() {
        return matricula;
    }

    public int getEslora() {
        return eslora;

    }
    // Métodos
    public abstract float calcularPrecioAmarre();

    public float precioTotalAlquiler(Barco barco, int diasEstancia){
       precioAmarre=barco.calcularPrecioAmarre();
        precioTotal= diasEstancia*barco.calcularPrecioAmarre();
       return precioTotal;
    }



    public void generarFactura(){
        System.out.println(" *******   FACTURA    *******     \n" +

                "----TIPO BARCO:"
                + this.toString());
        System.out.println("Precio de embarcacion por dia: " + precioAmarre + " Euros");
        System.out.println("Importe total : " + precioTotal + " Euros");
    }

    // To String
    @Override
    public String toString() {
        return
                "  matricula=  '" + matricula +
                "  eslora=  " + eslora +
                "  precioAmarre=  " + precioAmarre +
                " precioTotal= " + precioTotal;
    }
}
