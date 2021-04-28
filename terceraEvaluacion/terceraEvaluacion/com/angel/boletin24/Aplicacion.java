package com.angel.boletin24;

/**
 * Creado por @autor: angel
 * El  28 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Aplicacion {
    public static void main(String[] args) {
        Una obj1 = new Una();
        Dos obj2 = new Dos();
        Tres obj3 = new Tres();
        Cuatro obj4 = new Cuatro();


        System.out.println("obj1.test = "+ obj1.test());


        System.out.println("obj1.result1 = " + obj1.result1());


        System.out.println("obj2.test = "+obj2.test());


        System.out.println("obj2.result1 = "+obj3.result1());


        System.out.println("obj3.test = " +obj3.test());


        System.out.println("obj4.result1 = "+obj4.result1());


        System.out.println("obj3.result2 = " +obj3.result2());


        System.out.println("obj4.result2 = " +obj4.result2());

        System.out.println("obj3.result3 = " +obj3.result3());


        System.out.println("obj4.result3 = " +obj4.result3());

    }
}
