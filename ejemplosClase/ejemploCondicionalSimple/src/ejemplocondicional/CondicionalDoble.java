/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocondicional;

/**
 *
 * @author angel
 */
public class CondicionalDoble {
  public void comparar(int edad){
      if (edad<=14){
          System.out.println("Es niño");
      }
      else if (edad<=18){
      
      System.out.println("Es adolescente ");
      }
      else if (edad<=30){
          System.out.println("Es joven");
      }
      else {
          System.out.println("adulto");
      }
  }
 public void operadorInterrogante(int edad){
     String mensaje = (edad >=18)?"Es mayor de edad":"Es menor de edad";
        System.out.println(mensaje);
 } 
  
  }  
