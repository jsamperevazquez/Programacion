/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin06_3;

import java.util.Scanner;


/**
 *
 * @author angel
 */
public class Circulo {
    private double radio;
    public final double pi=3.1416;
    
    public Circulo(){
        
    }

    public Circulo(double rad){
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
    public double calcularArea(){
      Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el radio del circulo en cms");
        radio=sc.nextDouble();
        double area=Math.pow (radio,2)*pi;
        System.out.println("El área del círculo es de " + area + " cms^2" );
        return area;
    }
    public double calcularLonxitude (){
       Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el radio del circulo en cms");
        radio=sc.nextDouble();
        double lonxitude =  2*pi*radio;
        System.out.println("La longitud del circulo es de " + lonxitude + " cms^2");
       return lonxitude;
    }
}
