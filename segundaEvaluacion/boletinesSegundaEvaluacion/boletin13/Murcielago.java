package boletin13;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  18 de ene. de 2021.
 **/
public class Murcielago extends Mamifero implements IPodeVoar{


    private String paisOrigen;

   public Murcielago(){}

    public Murcielago(int numeroPatas, String familiaAnimal, String paisOrigen) {
        super(numeroPatas, familiaAnimal);
        this.paisOrigen = paisOrigen;
    }
    @Override
    public float verAlturaVuelo() {
        float distanciaX=Float.parseFloat(JOptionPane.showInputDialog(null,"Distancia horizontal X en metros"));
        float angulo=Float.parseFloat(JOptionPane.showInputDialog(null,"Ángulo alfa"));
        float anguloRadianes=angulo * 0.017F;
        float alturaVuelo= (float) Math.tan(anguloRadianes)*distanciaX;
        JOptionPane.showMessageDialog(null,"Está a una altura de " +alturaVuelo + " metros");
        return alturaVuelo;
    }
}
