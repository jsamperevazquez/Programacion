package ejemploArrays.com.nina.arrays;

/**
 * Creado por @autor: angel
 * El  25 de ene. de 2021.
 **/
public class EjemploArrays {
    public static void main(String[] args) {
        float [] temoeraturas = {8,10,12,3.5F,5};
        Metodos objetoMetodos = new Metodos();
        objetoMetodos.ordenarDirecto(temoeraturas);
        objetoMetodos.mostrarArray(temoeraturas);
        //objetoMetodos.mostrarArrayForEach(temoeraturas);
        //objetoMetodos.ordenarColeccion(temoeraturas);

    }

}
