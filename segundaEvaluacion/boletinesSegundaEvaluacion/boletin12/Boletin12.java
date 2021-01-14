package boletin12;

/**
 * Creado por @autor: Angel
 * @version 0.0.1
 * El 13/01/2021
 * Clase para instanciar objetos en las dos clases del paquete
 **/
public class Boletin12 {
    public static void main(String[] args) {
        Coche coche1 = new Coche("3265GPC");
        Garaje cliente1 = new Garaje(coche1);
        cliente1.comprobarSitio(coche1);
        Coche coche2 = new Coche("2356LRT");
        Garaje cliente2 = new Garaje(coche2);
        cliente2.comprobarSitio(coche2);
        cliente1.calcularPrecio();
        Coche coche3 = new Coche("8745JST");
        Coche coche4 = new Coche("2354CRT");
        Coche coche5 = new Coche("6189CSW");
        Coche coche6 = new Coche("9845DSQ");
        Garaje cliente3 = new Garaje(coche3);
        Garaje cliente4 = new Garaje(coche4);
        Garaje cliente5 = new Garaje(coche5);
        Garaje cliente6 = new Garaje(coche6);
        cliente3.comprobarSitio(coche3);
        cliente4.comprobarSitio(coche4);
        cliente5.comprobarSitio(coche5);
        cliente6.comprobarSitio(coche6);
        cliente6.calcularPrecio();

    }
}
