/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin06;

import javax.swing.*;

/**
 * Una clase dedicada a coches y diferentes funciones
 *
 * @author angel
 * @version 0.0.1
 */
public class Coche {
    /**
     * Creamos la variable para el atributo privado velocidad.
     */
    private int velocidade;
//Creamos el metodo constructor que manda el boletín    

    /**
     * Creamos el metodo constructor e iniciamos la variable velocidad en 0
     */
    public Coche() {
        velocidade = 0;
    }
//Creo los métodos 

    /**
     * Metodo para asignar una velocidad en un momento preciso, retorna velocidad
     *
     * @param vel variable vel para pasar valor de velocidad al parámetro
     * @return retorna la velocidad del vehículo
     */
    public int getVelocidade(int vel) {
        velocidade = vel;
        return velocidade;
    }

    /**
     * Método para incrementar el valor velocidad del coche.
     *
     * @param valor el valor que le vamos a sumar a la velocidad actual.
     */
    public void acelerar(int valor) {
        velocidade = velocidade + valor;
    }

    /**
     * Método para reducir el valor de la velocidad del coche.
     *
     * @param menos el valor que queremos restar a la velocidad actual del coche
     */
    public void frenar(int menos) {
        velocidade = velocidade - menos;
    }

    /**
     * Método para poder ver la velocidad el instante deseado.<br>
     * LLeva condicional a mayores con diferentes formatos no más que para hacer un poco el tonto.
     */
    public void verVeloc() {
        System.out.println("Ahora vas a una  velicidad de " + velocidade + "KM/h");
        if (velocidade > 120) {
            //System.err.println("OJO CON LAS MULTAS CHAVALOTE QUE NO TE DEJO MÁS EL COCHE"); // Con esto imprimo en color rojo
            JOptionPane.showMessageDialog(null, "Chalado sube el pedal, no vuelves a tocar el coche", "velocidad", JOptionPane.ERROR_MESSAGE);
        } else if (velocidade > 110 && velocidade <= 119) {
            //System.out.println("\033[33m SUBE EL PEDAL QUE TE LA ESTÁS GANANDO"); //imprimo en color amarilloCon este código
            //Creo una ventana emergente con un dialogo de JOptionP y un icono de warning
            JOptionPane.showMessageDialog(null, "SUBE EL PEDAL QUE TE LA ESTÁS GANANDO", "Velocidad", JOptionPane.WARNING_MESSAGE);
        } else JOptionPane.showMessageDialog(null, "Eres una persona responsable");
        //System.out.println("\033[32m Eres una persona responsable al volante");
    }
}
