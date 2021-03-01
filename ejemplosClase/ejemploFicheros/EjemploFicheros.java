package ejemploFicheros;

import ejemploFicheros.lecturaFicheros.Lectura;

import java.io.File;
import java.util.ArrayList;

/**
 * Creado por @autor: angel
 * El  25 de feb. de 2021.
 **/
public class EjemploFicheros {
    public static void main(String[] args) {
        // Leemos linea completa
        // Lectura.leerLineas();

        // Leemos dato a dato
        // Lectura.leerString();

        // Lectura datos usando delimitadores.
        // Lectura.leerStringUsandoDelimitadores();

        // lectura de enteros y lo recogemos en un arrayList
        File f = new File("C:\\Users\\angel\\OneDrive\\Escritorio\\Numeros.txt"); // Creamos un nuevo objeto de tipo fichero.
        ArrayList<Integer> lista = Lectura.leerEnteros(f); //Creamos un nuevo ArrayList para recoger lo que retorna el método.
        for (Integer ele:lista){ // Visualizamos con un for each
            System.out.println(ele);
        }

    }
}
