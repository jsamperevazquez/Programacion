/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin06_3;

import java.util.Scanner;


/**
 * Clase con el fim de hallar el área y la longitud de una circunferencia.
 *
 * @author angel
 * @version 0.0.1
 */
public class Circulo {
    /**
     * Variable para pasar el valor del radio de la circunferencia
     */
    private double radio;
    /**
     * Constante pì con un valor predefinido
     */
    private final double pi = 3.1416;

    /**
     * Método constructor para crear objetos por defecto
     */
    public Circulo() {

    }

    /**
     * Método para pasar el parámetro radio
     *
     * @param rad valor del radio de nuestra circunferencia.
     */
    public Circulo(double rad) {
        radio = rad;
    }
    // Creamos métodos de acceso setter y getter 

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    // Creamos los diferentes métodos

    /**
     * Método para retornar el valor del área de la circunferencia.
     *
     * @return retorna valor área.
     */
    public double calcularArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio del circulo en cms");
        radio = sc.nextDouble();
        double area = Math.pow(radio, 2) * pi;
        //Imprimo el valor del área concatenado con String porque el programa termina aquí y no voy a usar el valor de calcularArea(), si no
        //tendría que crear un método para visualizar e imprimir a mayores de este y dejar solo el return.
        System.out.println("El área del círculo es de " + area + " cms^2");
        return area;
    }

    /**
     * Método para retornar el valor de la longitud de una circunferencia.
     *
     * @return
     */
    public double calcularLonxitude() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio del circulo en cms");
        radio = sc.nextDouble();
        double lonxitude = 2 * pi * radio;
        //Imprimo el valor del área concatenado con String porque el programa termina aquí y no voy a usar el valor de calcularLonxitude(), si no
        //tendría que crear un método para visualizar e imprimir a mayores de este y dejar solo el return.
        System.out.println("La longitud del circulo es de " + lonxitude + " cms^2");
        return lonxitude;
    }
}
