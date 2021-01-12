package boletin09_5;

import java.util.Scanner;

/**
 * Creado por @autor: angel
 * El  24 de nov. de 2020.
 * Clase para instanciar trabajadores en Empresa
 * @version 0.0.1
 **/
/*
Codifica un programa que  Lea o soldo de cada un dos traballadores dunha empresa e obteña o número deles que ganan entre 1000 e 1750 €,
ámbolos dous incluidos e, a porcentaje de traballadores que ganan menos de 1000 €.
Tendo en conta que non se coñece con antelación o numero de traballadores da empresa e non se admiten os soldos negativos.( utiliza como condidión de fin un soldo 0 ).
 */

public class Boletin9_5 {
    public static void main(String[] args) {
        Empresa trabajador = new Empresa();
        trabajador.introducirSueldoTrabajador();
        trabajador.contarSueldoTrabajadores();
        Empresa trabajador2 = new Empresa();
        trabajador2.introducirSueldoTrabajador();
        trabajador2.contarSueldoTrabajadores();
        Empresa trabajador3 =new Empresa();
        trabajador3.introducirSueldoTrabajador();
        trabajador3.contarSueldoTrabajadores();
        trabajador.visualizarDatos();

    }


}


