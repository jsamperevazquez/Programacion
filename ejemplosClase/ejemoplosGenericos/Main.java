package ejemoplosGenericos;

import java.util.ArrayList;
import java.util.List;

/**
 * Creado por @autor: angel
 * El  07 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Main {
    public static void main(String[] args) {

        EjemplosGenericos<String> ejem1 = new EjemplosGenericos();

        ejem1.setDato("3");
        System.out.println(ejem1.getDato());

        EjemplosGenericos<Alumno> ejme2 = new EjemplosGenericos<>();
        ejme2.setDato(new Alumno("Angel",4,"345678"));
        System.out.println(ejme2.getDato());

        EjemplosGenericos<Autobus> ejem3= new EjemplosGenericos<>();
        ejem3.setDato(new Autobus(5,"aaa","Iveco",150));
        System.out.println(ejem3.getDato());

        EjemplosGenericos<Vehiculo> ejem4 = new EjemplosGenericos<>();
        ejem4.setDato(new Vehiculo("lll","citroen",120));
        System.out.println(ejem4.getDato());

        List<? extends Vehiculo> l= new ArrayList<Autobus>(); // Cualquiera que extienda de Vehículo
        List< ? super Autobus> li = new ArrayList<Autobus>(); // Cualquiera superclase de Autobús
    }
}
