/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesabstractas;

/**
 *
 * @author angel
 */
public class EjemploClasesAbstractas {

    public static void main(String[] args) {
        Rectangulo rectangulo1= new Rectangulo(4, 5);
        Triangulo triangulo1= new Triangulo(5, 4);
        System.out.println(rectangulo1.calcularArea());
        System.out.println(triangulo1.calcularArea());
        System.out.println(rectangulo1.calcularPerimetro());
    }
    
}
