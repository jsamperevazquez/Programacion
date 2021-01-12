package boletin07_4;

import javax.swing.*;
import java.lang.reflect.Array;

/**
 * Creado por @autor: angel
 * El  09 de nov. de 2020.
 * Clase para crear métodos para analizar masas de diferentes personas.
 *
 * @version 0.0.1
 **/
public class Persona {
    /**
     * Creo el atributo nombre para ingresar el nombre de cada persona
     */
    private String nombre;
    /**
     * Creo el atributo masa para ingresar la masa de cada persona
     */
    private float masa;

    //Creo métodos constructores

    public Persona() {
    }

    public Persona(String nombre, float masa) {
        this.nombre = nombre;
        this.masa = masa;
    }
    //Creo métodos para retornar valores


    public String getNombre() {

        return nombre;
    }

    public float getMasa() {

        return masa;
    }

    /**
     * Método para comparar el peso de dos personas pasadas como parámetros
     * @param persona1
     * @param persona2
     */
    public void compararPeso(Persona persona1,Persona persona2){
        if (persona1.getMasa()==persona2.getMasa())
            JOptionPane.showMessageDialog(null,"Ambas personas son del mismo peso");
        else if (persona1.getMasa()>persona2.getMasa())
            JOptionPane.showMessageDialog(null,persona1.getNombre()+"Pesa más que "+persona2.getNombre()+" con una diferencia de "+(persona1.getMasa()-persona2.getMasa())+" Kgs");
        else
            JOptionPane.showMessageDialog(null,persona2.getNombre()+"Pesa más que "+persona1.getNombre()+" con una diferencia de "+(persona2.getMasa()-persona1.getMasa())+" Kgs");

    }

    }

