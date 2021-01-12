/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;
import java.text.DecimalFormat;//Esto es necesario de importar para poder ajustar el formato de los decimales
import java.util.Scanner;//Esto es necesario importar para poder solicitar datos por teclado
/**
 *
 * @author angel
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double cantidadEuros;
       double cantidadDolar;
       DecimalFormat formato2 = new DecimalFormat("#.##");// Con esto damos el formato que deseamos a los decimales (2 decimales) con variable formato2
       Scanner entrada = new Scanner(System.in);// Con esto inicializamos la variable entrada como clase Scanner y decimos que es nuevo scanner de entrada de sistema.
       System.out.println("Ponfavor ingresa la cantidad en euros \n");
       cantidadEuros = entrada.nextDouble();
       cantidadDolar = cantidadEuros * 1.18;
       System.out.println(formato2.format(cantidadEuros) + " Euros son en Dolares " + formato2.format(cantidadDolar) + " dolares");// le damos formato con formato2.format()
       
       
      

    }
    
}
