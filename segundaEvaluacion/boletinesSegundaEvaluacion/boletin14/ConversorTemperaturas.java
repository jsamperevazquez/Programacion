package boletin14;

/**
 * Creado por @autor: angel
 * El  21 de ene. de 2021.
 **/
public class ConversorTemperaturas {
public static final float TEMPERATURA_MINIMA =80F; // creo una constante estática de clase con el valor mínimo

    public ConversorTemperaturas() {
    }
    public float centigradosAFarenheit(float temperaturaCentigrados) throws TemperaturaErradaException{ // utilizo el throws para decir que el método no va a capturar la excepció (try)
        if (temperaturaCentigrados<TEMPERATURA_MINIMA)
            throw new TemperaturaErradaException("Introduzca una temperatura superior a 80º"); // creo creo una nueva excepción si la temperatura es inferior a 80º y le paso un mensaje personal porque lo tengo en así en el constructor de la clase que trata excepciones.
        else {
            return (temperaturaCentigrados * 1.8F) + 32.4F;
        }
        }
    public void centigradosAReamur (float celsius){
        try {  // Este método captura la excepción para tratarla
            float temperaturaReamur=0.8F*celsius;
            if (celsius<TEMPERATURA_MINIMA) {
                throw new TemperaturaErradaException(); // Creo un objeto en la clase por si salta la excepción poder ser tratada.
            }
            System.out.println("temperatura en celsius= " + temperaturaReamur); //Si no salta excepción ejecuta esta linea sin problema
                     }catch (TemperaturaErradaException es){ // si salta excepción creo el objeto es en nuestra clase
            System.out.println(es.getMessage()); // Imprimo el mensaje que tengo en la clase creado.
        }
    }
    }

