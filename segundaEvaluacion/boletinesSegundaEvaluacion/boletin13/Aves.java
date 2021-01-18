package boletin13;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  18 de ene. de 2021.
 **/
public class Aves implements IPodeCamiñar {
    private String paisOrigen;

    public Aves() {
    }

    public Aves(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return
                "paisOrigen= " + paisOrigen;
    }

    @Override
    public float verVelocidad() {
        float espacio= Float.parseFloat(JOptionPane.showInputDialog(null,"Espacio recorrido por el ave"));
        float tiempo=Float.parseFloat(JOptionPane.showInputDialog(null,"Velocidad del ave"));;
        float velocidad = espacio / tiempo;
        return velocidad;
    }
}