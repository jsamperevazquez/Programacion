package boletin08_2;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  11 de nov. de 2020.
 * Clase para parametrizar y crear métodos
 **/
public class Figura {
    /**
     * Atributo de la clase para elegir el numero en el menú
     */
    private int numeroFigura;
    /**
     * Creo que no pi no necesita mucha explicación (pobre Euler)
     */
    public final static double pi = 3.14;

    /**
     * Constructor por defecto
     */
    public Figura() {

    }

    /**
     * Constructor parametrizado
     *
     * @param numeroFigura Para recoger el número elegido en el menú
     */
    public Figura(int numeroFigura) {
        this.numeroFigura = numeroFigura;

    }

    /**
     * Método con Switch case para mostrar la superficie de la figura elegida en el menú
     */
    public void verSuperficie() {
        switch (numeroFigura) {
            case 1:
                JOptionPane.showMessageDialog(null, "La figura elegida es el cuadrado");
                float lado = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce el valor del lado"));
                float area = (float) Math.pow(lado, 2);
                JOptionPane.showMessageDialog(null, "La superficie del cuadrado es de " + area + " cms");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "La figura elegida es el Triangulo");
                float base = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la base"));
                float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la altura"));
                float area2 = base * altura / 2;
                JOptionPane.showMessageDialog(null, "La superficie del cuadrado es de " + area2 + " cms");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "La figura elegida es el Círculo");
                float radio = Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio de la circunferencia"));
                float area3 = (float) pi * (radio * radio);
                JOptionPane.showMessageDialog(null, "La superficie de la circunferencia es de " + area3 + "cms");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Pero mira que te lo he puesto bien claro en la pantalla!!!!!! ");
                break;
        }


    }
}
