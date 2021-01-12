/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

/**
 *
 * @author angel
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
 //Creo mi clase principal main
    public static void main(String[] args) {
        
        //Instancio mi primer objeto en la clase Libro y no le añado valores
        Libro libro1= new Libro ();
        libro1.amosar();
        
        //Instancio mi segundo objeto en la clase Libro e introduzco valores
        Libro libro2 = new Libro("La sombra del viento","Carlos Ruiz Zafón",2001,571,9.5f);
        libro2.amosar();
        
        //Modifico los valores con método setter
        libro1.setTitulo("Reina roja");
        libro1.setAutor("Juan Gomez Jurado");
        libro1.setAno(2018);
        libro1.setNumPaginas(568);
        libro1.setValoracions(9.1f);
        
        //Recojo los valores con el método getter
        String recogerTitulo = libro1.getTitulo();
        String recogerAutor = libro1.getAutor();
        int recogerAno = libro1.getAno();
        short recogerPaginas=libro1.getNumPaginas();
        float recogerValoraciones=libro1.getValoracions();
        
        //visualizo 
        libro1.amosar();
       
        
        
    
    }
    
}
