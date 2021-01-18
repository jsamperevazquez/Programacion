package boletin13;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  18 de ene. de 2021.
 **/
public class Felino extends Mamifero implements IPodeNadar{
    private String familiaFelino;

    public Felino(){

    }

    public Felino(int numeroPatas, String familiaAnimal, String familiaFelino) {
        super(numeroPatas, familiaAnimal);
        this.familiaFelino = familiaFelino;
    }

    @Override
    public float verDistancia() {
        float tiempo=Float.parseFloat(JOptionPane.showInputDialog(null,"Tiempo transcurrido en trayecto"));
        float velocidad=Float.parseFloat(JOptionPane.showInputDialog(null,"Velocidad media de tramo"));
        float distanciaRecorrida=velocidad/tiempo;
        return distanciaRecorrida;
    }
}
