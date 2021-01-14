package boletin12;

/**
 * Creado por @autor: Usuario
 * El 13/01/2021
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

    }
}
