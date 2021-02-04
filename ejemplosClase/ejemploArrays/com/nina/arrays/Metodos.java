package ejemploArrays.com.nina.arrays;

import javax.swing.*;
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
    public float[] ordenarColeccion (float []lista){ // retorna float[] un array
        Arrays.sort(lista);
        for(float tempe:lista)
            System.out.println("Temperaura " + tempe);
        return lista;
    }

    public void ordenarDirecto(float []lista){
        for (int i = 0; i <lista.length -1 ; i++) {

            for (int j = i+1; j <lista.length ; j++) {
                if (lista[i]>lista[j]){
                    float auxiliar = lista[i];
                    lista[i]=lista[j];
                    lista[j]=auxiliar;

                }

            }
        }


    }
    public void buscarElementos(float[]lista){
        float elementoBuscado=Float.parseFloat(JOptionPane.showInputDialog(null,"Elemento a buscar"));
        int j=0, encontrado=0; // no se encuentra
        float []listaRepes = new float[lista.length];
        for (int i = 0; i < lista.length; i++) {
            if (elementoBuscado==lista[i]){
                encontrado=1;
                listaRepes[j]=lista[i];
                j++;
            }

        }
        if (encontrado == 0)
            System.out.println(elementoBuscado + " No está en la lista");
        else for (int i = 0; i <listaRepes.length ; i++) {
            System.out.println("***"+ listaRepes[i]);
            
        }
            
    }
}
