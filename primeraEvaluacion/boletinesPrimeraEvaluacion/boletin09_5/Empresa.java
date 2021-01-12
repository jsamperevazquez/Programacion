package boletin09_5;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  24 de nov. de 2020.
 * Clase para contar y hacer porcentaje en función del sueldo
 **/
public class Empresa {
    /**
     * Sueldo del trabajador
     */
    private float sueldoTrabajador;
    /**
     * Contador del número de trabajadores
     */
    private static int numeroTrabajadores = 0;
    /**
     * Contadores para los sueldos
     */
    private static int contador1000_1750, contadorMenos1000;


    public Empresa() {

    }

    public Empresa(int sueldoTrabajador) {
        this.sueldoTrabajador = sueldoTrabajador;

    }

    /**
     * Método para introducir los sueldos de los trabajadores
     *
     * @return retorna el sueldo del trabajador
     */
    public float introducirSueldoTrabajador() {

        do {

            sueldoTrabajador = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce el sueldo del trabajador (0 para ignorar trabajador)"));
            if (sueldoTrabajador < 0)
                JOptionPane.showMessageDialog(null, "El sueldo no puede ser negativo");
        } while (sueldoTrabajador < 0);
        numeroTrabajadores++;
        return sueldoTrabajador;
    }

    /**
     * Método para contar los operarios que cobran entre un rango de € o otro
     */
    public void contarSueldoTrabajadores() {
        do {
            if (sueldoTrabajador == 0) {
                JOptionPane.showMessageDialog(null, "Trabajador ignorado por usuario");
                break;
            } else if (sueldoTrabajador >= 1000 && sueldoTrabajador <= 1750) {
                contador1000_1750++;
                break;
            }else if (sueldoTrabajador < 1000) {
                contadorMenos1000++;
                break;
            }
        } while (sueldoTrabajador != 0);
    }


    /**
     * Método para visualizar los datos de los trabajadores en función de su sueldo.
     */
    public void visualizarDatos() {
        double visualizar;
        JOptionPane.showMessageDialog(null, "El numero de trabajadores con sueldos entre 1000 y 1750 es de " + contador1000_1750);
        System.out.println(contadorMenos1000);
        visualizar = contadorMenos1000 * 100 / numeroTrabajadores;
        JOptionPane.showMessageDialog(null, "El porcentaje de trabajadores que ganan menos de 1000 € es del " + visualizar + " %");

    }
}




