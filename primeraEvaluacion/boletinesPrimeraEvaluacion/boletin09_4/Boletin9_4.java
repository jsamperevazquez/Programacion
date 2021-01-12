package boletin09_4;

/**
 * Creado por @autor: angel
 * El  24 de nov. de 2020.
 * Clase principal con método main para instanciar objetos de tipo Número
 **/
public class Boletin9_4 {
    public static void main(String[] args) {
        int recoger;
        Numero numero1 = new Numero();
        recoger = numero1.pedirNumero();
        numero1.tablaMultiplicar(recoger);
    }
}
