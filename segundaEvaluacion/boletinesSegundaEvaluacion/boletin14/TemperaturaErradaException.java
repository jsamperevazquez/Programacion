package boletin14;

/**
 * Creado por @autor: angel
 * El  21 de ene. de 2021.
 **/
public class TemperaturaErradaException extends Exception{ // Creo la clase para nuestras propias excepciones, la cual desciende de Extension
    public TemperaturaErradaException(){
        super("La temperatura no puede ser inferior a 80º "); // pongo un mensaje para que salte siempre en caso de error
    }
    public TemperaturaErradaException(String mensaje){ // Creo un constructor que recibe un mensaje String para hacerlo más entendible
        super(mensaje); // De la superclase hereda el mensaje que recoge al darse el error.
    }
}
