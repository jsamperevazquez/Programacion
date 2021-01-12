package boletin09_3;

/**
 * Creado por @autor: angel
 * El  24 de nov. de 2020.
 * Clase principal con método main para instanciar objetos de tipo Validación
 **/
public class Boletin9_3 {
    public static void main(String[] args) {
        // Validacion rectangulo1 = new Validacion();
        Validacion rectangulo = Validacion.getInstance();
        rectangulo.pedirDatos();
        rectangulo.validar(rectangulo);
        Validacion rectangulo2= Validacion.getInstance();
        rectangulo2.pedirDatos();
        rectangulo2.validar(rectangulo2);
        System.out.println(rectangulo);
    }
}
