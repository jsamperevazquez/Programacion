package boletin12;

import javax.swing.*;

/**
 * Creado por @autor: Usuario
 * El 13/01/2021
 **/
public class Garaje {
    private float tiempo;
    private Coche Coche;
    private  static int numeroCoches;
    public static final int COMPLETO=5;


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

    public void comprobarSitio(Coche coche) {
        if (numeroCoches < COMPLETO) {
            JOptionPane.showMessageDialog(null,"Plazas disponibles = " + (COMPLETO - numeroCoches));
            numeroCoches++;
            JOptionPane.showMessageDialog(null,"Coche" + Coche + " ingresado en garaje");

        } else
            System.out.println("Completo");
    }
    public float calcularPrecio(){
        float tiempoCliente;
        float precioFinal=0;
        tiempoCliente=Float.parseFloat(JOptionPane.showInputDialog("Minutos ha estado cliente en garaje"));
        if (tiempoCliente<=180){
            precioFinal=(tiempoCliente/60)*1.5F;
        }
        else if (tiempoCliente>180){
            precioFinal=((tiempoCliente-180)/60) * 0.20F + 3;
        }
         JOptionPane.showMessageDialog(null,"Factura:\n" +
             Coche
                 + "\nTiempo total: "
                 + tiempoCliente+ "\nPrecio: "
                 + precioFinal);
        return precioFinal;
    }
}
