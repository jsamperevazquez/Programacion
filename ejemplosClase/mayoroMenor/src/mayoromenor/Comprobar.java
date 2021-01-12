/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayoromenor;

/**
 *
 * @author angel
 */
public class Comprobar {
    public int numero1,numero2;

    public Comprobar() {
    }

    public Comprobar(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

     public void comparar(int numero1, int numero2){
         if(numero1>numero2)
             System.out.println("El "+ numero1+" es mayor que "+ numero2);
         else if (numero1<numero2)
             System.out.println("El "+ numero1+" es menor que "+ numero2);
         else System.out.println("Ambos número son iguales");
     }
}
