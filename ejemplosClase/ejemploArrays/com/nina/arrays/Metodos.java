package ejemploArrays.com.nina.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Creado por @autor: angel
 * El  25 de ene. de 2021.
 **/
public class Metodos {

    public void mostrarArray(float []lista) {
        for (int i = 0; i <lista.length; i++) {
            System.out.println("temperatura " +(i+1) + "-------> " + lista[i]);
        }

    }
    public void mostrarArrayForEach (float[]lista){
        for(float tempe:lista){
            System.out.println("*** " + tempe);
        }
    }
    public void ordenarColeccion (float []lista){
        Arrays.sort(lista);
        for(float tempe:lista)
            System.out.println("Temperaura " + tempe);
    }
    public static void ordenarMetodoBurbuja(float []lista){
        for (int i = 0; i <lista.length-1 ; i++) {

            for (int j = i+1; j <lista.length ; j++) {
                if (lista[i]>lista[j]){
                    float auxiliar = lista[i];
                    lista[i]=lista[j];
                }
            }
        }


    }
}
