package boletin13;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  18 de ene. de 2021.
 **/
public class Papagayo extends Aves implements IPodeVoar{
    private String familiaPapagayo;
    public Papagayo(){
    }
    public Papagayo(String familiaPapagayo){
        super("Cuba");
        this.familiaPapagayo=familiaPapagayo;

    }
    @Override
    public float verAlturaVuelo() {
        float distanciaX=Float.parseFloat(JOptionPane.showInputDialog(null,"Distancia horizontal X"));
        float angulo=Float.parseFloat(JOptionPane.showInputDialog(null,"Ángulo alfa"));
        float anguloRadianes=angulo * 0.017F;
        float alturaVuelo= (float) Math.tan(anguloRadianes)*distanciaX;
        return alturaVuelo;
    }
}
