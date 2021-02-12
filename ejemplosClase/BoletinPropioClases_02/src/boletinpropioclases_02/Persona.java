/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletinpropioclases_02;

/**
 *
 * @author angel
 */
public class Persona {
 
   // Creo los atributos 
   private String nombre;
   private int edad;
   private String dni;
   private  static char sexoDefecto= 'H';
   private int altura;
   private float peso;

   // Creo los constructores
   public Persona(){   
   }
   public Persona (String nom,int ed,char sex){
       nombre=nom;
       edad=ed;
       if (sex=='M'){
          sexoDefecto=sex;
       }
   }
   public Persona (String nom, int ed,String nif,char sex,float pes,int alt){
   
   }
}
