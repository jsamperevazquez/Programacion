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
public class CondicionalMultiple {
    public void enseñarDiaSemana(int dia){
        if(dia >=1 && dia <=7){
            switch(dia){
                case 1: System.out.println("Lunes");
                    break;
                case 2: System.out.println("Martes");
                    break;
                case 3: System.out.println("Miercoles");
                    break;
                case 4: System.out.println("Jueves");
                    break;
                case 5: System.out.println("Viernes");
                    break;
                case 6: System.out.println("Sábado");
                    break;
                case 7: System.out.println("Domingo");
                  
                   
            }
        }
        else System.out.println("Dato erroneo");
    }
    public void enseñarDiaSemana2(int dia2){
    
            switch(dia2){
                case 1: System.out.println("Lunes");
                    break;
                case 2: System.out.println("Martes");
                    break;
                case 3: System.out.println("Miercoles");
                    break;
                case 4: System.out.println("Jueves");
                    break;
                case 5: System.out.println("Viernes");
                    break;
                case 6: System.out.println("Sábado");
                    break;
                case 7: System.out.println("Domingo");
                    break;
                
                default: System.out.println("Error de datos");
                    
            }
    }
    
}
