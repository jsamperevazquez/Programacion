package boletin14;

/**
 * Creado por @autor: angel
 * El  21 de ene. de 2021.
 **/
public class ConversorTemperaturas {
public static final float TEMPERATURA_MINIMA =80F;

    public ConversorTemperaturas() {
    }
    public float centigradosAFarenheit(float temperaturaCentigrados){
        return (temperaturaCentigrados*1.8F) + 32.4F;
    }
}
