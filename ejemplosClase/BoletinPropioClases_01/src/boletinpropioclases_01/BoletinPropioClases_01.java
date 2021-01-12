/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletinpropioclases_01;

/**
 *
 * @author angel
 */
public class BoletinPropioClases_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //Instancio un nuevo objeto (cliente1) dentro de la clase Cuenta    
        Cuenta cliente1 = new Cuenta ("Jose Ángel Sampere", 3000);
        
    // LLamo al metodo Get para poder ver el titular de la cuenta 
       String verTitular= cliente1.getTitular();
       System.out.println("Titular cuenta: " + verTitular);
       
    // LLamo al método ingresar para meter dinero (recordamos que si meto una cantidad negativa salta error)   
       cliente1.ingresar(320);
       
    // LLamo al método Get para poder visualizar la cantidad.  
       System.out.println("El nuevo saldo de la cuenta es de: " + cliente1.getCantidad());

       
    // Retiro dinero de cuenta con el método retirar() y llamo al método Get para comprobar
    
        cliente1.retirar(500);
        System.out.println("El nuevo saldo de la cuenta es de: " + cliente1.getCantidad());
    
    //Pruebo a ver si deja la cuenta a 0 si retiro más dinero de lo que hay.
        cliente1.retirar(5000);
        System.out.println("El nuevo saldo de la cuenta es de: " + cliente1.getCantidad());
    
        //Instancio otro objeto en la clase Cuenta con un solo atributo.
        
        Cuenta cliente2 = new Cuenta ("Jose María Aznar");
        
        //visualizo y compruebo que solo tiene un atributo porque he creado otra clase que permite meter solo un parámetro.
        String verTitular2= cliente2.getTitular();
        System.out.println("Titular cuenta: " + verTitular2);
    
    }
}
