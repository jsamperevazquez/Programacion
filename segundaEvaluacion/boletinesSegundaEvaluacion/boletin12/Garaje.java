package boletin12;

import javax.swing.*;

/**
 * Creado por @autor: Angel
 * El 13/01/2021
 * @version 0.0.1
 * Clase para controlar vehículos que entran en el garaje.
 **/
public class Garaje {
    /**
     * Tiempo que permanece el cliente en el garaje
     */
    private float tiempo;
    /**
     * Coche que entra en el garaje
     */
    private Coche Coche;
    /**
     * Número de coches que hay en el garaje
     */
    private static int numeroCoches;
    /**
     * Número máximo de plazas del garaje
     */
    public static final int COMPLETO = 5;


    public Garaje() {
    }

    public Garaje(boletin12.Coche coche) {
        Coche = coche;
    }

    public Garaje(float tiempo, boletin12.Coche coche) {
        this.tiempo = tiempo;
        Coche = coche;
    }


    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public boletin12.Coche getCoche() {
        return Coche;
    }

    public void setCoche(boletin12.Coche coche) {
        Coche = coche;
    }

    @Override
    public String toString() {
        return "Garaje{" +
                "tiempo=" + tiempo +
                ", Coche=" + Coche +
                '}';
    }

    /**
     * Metodo para comprobar si existe disponibilidad de plazas
     * @param coche recibe como parámetro el coche que va a comprobar disponibilidad.
     */
    public void comprobarSitio(Coche coche) {
        if (numeroCoches < COMPLETO) {
            JOptionPane.showMessageDialog(null, "Plazas disponibles = " + (COMPLETO - numeroCoches));
            numeroCoches++;
            JOptionPane.showMessageDialog(null, "Coche" + Coche + " ingresado en garaje");

        } else
            JOptionPane.showMessageDialog(null,"Garaje Completo");
    }

    /**
     * Método para calcular el precio por el tiempo que lleva en el garaje.
     * @return retorna el precio total.
     */
    public float calcularPrecio() {

        float tiempoCliente;
        float precioFinal = 0;
        if (numeroCoches<COMPLETO) {
            do {
                tiempoCliente = Float.parseFloat(JOptionPane.showInputDialog("Minutos ha estado cliente en garaje"));

                if (tiempoCliente > 0 && tiempoCliente <= 180) {
                    precioFinal = (tiempoCliente / 60) * 1.5F;
                } else if (tiempoCliente > 180) {
                    precioFinal = ((tiempoCliente - 180) / 60) * 0.20F + 3;
                } else
                    JOptionPane.showMessageDialog(null, "Datos incorrectos");
            } while (tiempoCliente < 0);
            JOptionPane.showMessageDialog(null, "Factura:\n" +
                    Coche
                    + "\nTiempo total: "
                    + tiempoCliente + "\nPrecio: "
                    + precioFinal);
        }else JOptionPane.showMessageDialog(null,"Lo sentimos pero como ya le hemos dicho estamos completos");

        return precioFinal;
    }
}
