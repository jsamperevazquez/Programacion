package boletin14;

/**
 * Creado por @autor: angel
 * El  21 de ene. de 2021.
 **/
public class Boletin14 {
    public static void main(String[] args) {
        ConversorTemperaturas temperatura1 = new ConversorTemperaturas();
        ConversorTemperaturas temperatura2 = new ConversorTemperaturas();
        try { // capturo la excepción
            System.out.println("Estos grados son en Farenheit "+temperatura1.centigradosAFarenheit(78));
        }catch (TemperaturaErradaException error){ // Siempre con try tiene que ir seguido el catch con un objeto del tipo de la clase
            System.out.println(error.getMessage()); //Imprimo el error que recojo con la cláusula getm() que tengo en super().
        }

    temperatura2.centigradosAReamur(46F);
    }
}
