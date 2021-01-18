package boletin13;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  18 de ene. de 2021.
 **/
public class Mamifero implements IPodeCamiñar{
    private int numeroPatas;
    private String tipoMamifero;

    public Mamifero() {
    }

    public Mamifero(int numeroPatas, String familiaAnimal) {
        this.numeroPatas = numeroPatas;
        this.tipoMamifero = familiaAnimal;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getTipoMamifero() {
        return tipoMamifero;
    }

    public void setTipoMamifero(String tipoMamifero) {
        this.tipoMamifero = tipoMamifero;
    }

    @Override
    public String toString() {
        return
                "numeroPatas= " + numeroPatas +
                "familiaAnimal= " + tipoMamifero;
    }

    @Override
    public float verVelocidad() {
        float espacio= Float.parseFloat(JOptionPane.showInputDialog(null,"Espacio recorrido por el mamífero"));
        float tiempo=Float.parseFloat(JOptionPane.showInputDialog(null,"Velocidad del mamífero"));;
        float velocidad=espacio/tiempo;
        return velocidad;
    }
}
