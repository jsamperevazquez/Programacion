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
public class Cuenta {
 
    //Creo los atributos
    private String titular;
    private float cantidad;
    
   // Creo los constructores //Sobrecarga de métodos por haber más de uno.
    public Cuenta (String tit){
        titular=tit;
        }

    public Cuenta (String tit,float cant){
        titular=tit;
        cantidad=cant;
    }

    //Creo los métodos de acceso set, get y to String.
    
    public void setTitular (String titul){
       titular=titul;
        }
    public void setCantidad (float canti){
        cantidad=canti;
       }
    
    public String getTitular (){
        return titular;
    }
    public float getCantidad (){
        return cantidad;
    }

    //Creo los metodos especiales
    //método ingresar
    public void ingresar (double cantid){
        if (cantid <=0){
        System.out.println("Error cantidad negativa");
        }
        else cantidad=(float) (cantid + cantidad);
    }

    //método retirar
    public double retirar (double cantRet){
        cantidad=(float) (cantidad - cantRet);
        if (cantidad < 0 ){
            cantidad=0;
        }
        return cantidad;
    }
}
