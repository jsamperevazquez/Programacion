package extra2_1;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  12 de nov. de 2020.
 * Clase para instanciar objetos en clase Cuota
 **/
public class Extra2 {
    public static void main(String[] args) {

       /* JOptionPane.showMessageDialog(null,"Bienvenido a Angel`s Padel");
        String nombre=JOptionPane.showInputDialog(null,"Introduce el nombre");
        int edad=Integer.parseInt(JOptionPane.showInputDialog(null,"introduce la edad "));
        Cuota socio1 =new Cuota(nombre,edad);
        socio1.comprobarCuota();

        */
        Cuota socio = new Cuota();
        socio.ingresarDatos(socio);
        socio.comprobarCuota();
    }
}
