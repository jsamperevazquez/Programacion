/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Conta {
  //Creo los atributos
    private String nombreCliente;
    private String numeroCuenta; 
    private double tipoInterese;
    private float saldo;
           
   // Creo los constructores //Sobrecarga de métodos por haber más de uno.
    public Conta (){
        }

    public Conta (String nomC,String numC,double tipI,float sd){
        nombreCliente=nomC;
        numeroCuenta=numC;
        tipoInterese=tipI;
        saldo=sd;
    }

    //Creo los métodos de acceso set, get
    //Set
    public void setnombreCliente (String titul){
       nombreCliente=titul;
        }
    public void setnumeroCuenta (String numCuent){
        numeroCuenta=numCuent;
       }
    public void settipoInterese (double tipoI){
        tipoInterese=tipoI;
    } 
    public void setSaldo(float sald){
    
        saldo=sald;
    }
    
    //Get
    
    public String getnombreCliente (){
        return nombreCliente;
    }
    public String getnumeroCuenta (){
        return numeroCuenta;
    }
    public double gettipoInterese(){
        return tipoInterese;
    }
    public float getSaldo(){
        return saldo;
    }
    


    //Creo los metodos especiales
    //método ingreso
    public void ingreso (double cantid){
        if (cantid <=0){
        System.out.println("Error cantidad negativa");
        }
        else saldo=(float) (cantid + saldo);
    }

    //método reintegro
    public double reintegro (double cantRet){
        saldo=(float) (saldo - cantRet);
        if (saldo < 0 ){
            saldo=0;
        }
        return saldo;
    }
    
    //métododo Trnasferencia
    
    public double transferencia (double cantTransf){
        System.out.println("Ingrese la cuenta del afortunado");
        Scanner cuenD = new Scanner (System.in);
        
        String cuentaDestino=cuenD.nextLine();
        System.out.println("Ingrese la cantidad de dinerillo");
        Scanner cantr = new Scanner (System.in);
        
        cantTransf=cantr.nextDouble();
        if (cantTransf>saldo){
        System.out.println("Lo siento amiguete pero esto no es una ONG, no puedes dar lo que no tienes");
        }
        else if (cantTransf <0){
        System.out.println("amijiño eres un pouqiño rata, non podes ingresar menos de nada");
        }
        else saldo=(float) (saldo - cantTransf);
        System.out.println("Tu nuevo saldo de cuenta es de: " + saldo);
        return saldo;
    }
  
    // A mayores voy a crear un método para poder ver datos de los clientes y cuentas 
    public void visualizar(){
    System.out.println("Características de la cuenta:\nTitular: " + nombreCliente + "\nNº Conta: " + numeroCuenta + "\nTipo Interese: " + tipoInterese + "\nSaldo Cuenta: " + saldo);
}
    
}
