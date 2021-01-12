package boletin11_01;

/**
 * Creado por @autor: Ángel
 * El 26/11/2020
 *
 * @version 1.0.0
 **/
/*
1-	Codifica un programa que permita o seguinte xogo  para adiviñar un número .
O primeiro xogador  teclea ( utilizando a clase JoptionPane ), un número a adiviñar ( entre 1 e 50 )
 e o número máximo de intentos que ten o segundo xogador para dar con el .
 O programa irá sacando por pantaia mensaxes que orienten o segundo xogador sobre se o número tecleado e maior ou menor que o número a adiviñar .
 Fai o programa repetitivo.

* */
public class Boletin11_01 {
    public static void main(String[] args) {
        Numero jugadores = new Numero();
        jugadores.introducirNombreJugadores();
        jugadores.jugarAdivinar();
    }
}
