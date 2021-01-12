/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

/**
 *
 * @author angel
 */
public class Extra1 {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //Instancio un nuevo objeto (cliente1) dentro de la clase Cuenta    
        Conta cliente1 = new Conta ("Jose Ángel Sampere", "2043 4545 3232 4567",12.3f,60000);
        
    // LLamo al metodo Get para poder ver el titular de la cuenta 
       String nombreCliente= cliente1.getnombreCliente();
       System.out.println("Titular cuenta: " + nombreCliente);
       
    // LLamo al método ingreso para meter dinero (recordamos que si meto una cantidad negativa salta error)   
       cliente1.ingreso(320);
       
    // LLamo al método Get para poder visualizar la cantidad.  
       System.out.println("El nuevo saldo de la cuenta es de: " + cliente1.getSaldo());

       
    // Retiro dinero de cuenta con el método r() y llamo al método Get para comprobar
    
        cliente1.reintegro(1000);
        System.out.println("El nuevo saldo de la cuenta es de: " + cliente1.getSaldo());
   
    
        //Instancio otro objeto en la clase Cuenta con un solo atributo.
        
        Conta cliente2 = new Conta ("Jose María Aznar","1111 1111 1111 1111", 10, 1000);
    
        //Transfiero dinerito 
        
        cliente1.transferencia(1000);
        
        //Utilizo el metodo visualizar para ver los datos bancarios
        cliente1.visualizar();
        
        //Pruebo a ver si deja la cuenta a 0 si retiro más dinero de lo que hay.
        cliente1.reintegro(500000);
        System.out.println("El nuevo saldo de la cuenta es de: " + cliente1.getSaldo());
    }
    }
