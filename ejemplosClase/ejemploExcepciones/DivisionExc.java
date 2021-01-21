package ejemploExcepciones;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  21 de ene. de 2021.
 **/
public class DivisionExc {
    private int numerador,denominador;

    public DivisionExc() {
    }

    public DivisionExc(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public void dividirSinCapturarExcepciones(int numerador,int denominador){
        System.out.println("Resultado sin tratar excpciones " + numerador/denominador);

    }
    public void dividirCapturandoExcepciones(int numerador,int denominador){
       try {


           System.out.println("antes de la division");
           System.out.println("Resultado tratando excpciones " + numerador / denominador);
           System.out.println("después de la división");
       }catch (ArithmeticException es){
           System.out.println("Error 1 " + toString() );
       }

    }

    public void dividirCapturandoExcepciones2(int denominador){
        try {


            System.out.println("antes de la division");
            int numerador=Integer.parseInt(JOptionPane.showInputDialog(null,"Numerador"));
            System.out.println("Resultado tratando excpciones " + numerador / denominador);
            System.out.println("después de la división");
        }catch (ArithmeticException es){
            System.out.println("Error 1 " + es.toString() );
        }catch (Exception es){
            System.out.println("error 2 "+ es.getMessage());
        }

    }
    public void dividirUsandoFinally (int numerador,int denominador){
        try {


            System.out.println("antes de la division");
            System.out.println("Resultado tratando excpciones " + numerador / denominador);
            System.out.println("después de la división");
        }catch (ArithmeticException es){
            System.out.println("Error 1 " + es.toString() );
        }finally {
            System.out.println("Dentro del finally");
        }

    }
    public void dividirPropagandoExcepciones (int numerador, int denominador) throws ArithmeticException{
        System.out.println("Antes de propagar");
        if (denominador==0)
            throw new ArithmeticException(" No dividir entre 0");
        else
            System.out.println("Resultado de la división " + numerador/denominador);
    }
    public void dividirNuestraExcepcion (int numerador, int denominador) throws NuestraExcpcion{
        System.out.println(" Antes de propagar la excepción");
        if (denominador==0)
            throw new NuestraExcpcion(" No dividir un entero entre 0 ");
        else
            System.out.println("Resultado de la división " + numerador/denominador);


    }
}
