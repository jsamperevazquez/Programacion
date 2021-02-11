package boletin16_02;

import libreriaAngel.PedirDatos;
import libreriaAngel.ValidarDatos;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  11 de feb. de 2021.
 **/
public class Persona {
    static int numeroPersonas;
    static final float alturaMediaEspaña=1.76f;
    static float[] conjuntoAlturas;
    static float alturaPersona;
    public static float[] crearConjuntoAlturas() {
        numeroPersonas = ValidarDatos.validarIntMenorQueCero("Número de personas a evaluar");
        conjuntoAlturas=new float[numeroPersonas];
        for (int i = 0; i < numeroPersonas; i++) {
            alturaPersona=Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce altura persona"));
            conjuntoAlturas[i] = alturaPersona;
        }
        return conjuntoAlturas;
    }

    public static void analizarAlturas(float[] lista) {
        int contadMasAltas = 0;
        int contadMasBajas = 0;
        int alturaMedia = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > alturaMediaEspaña)
                contadMasAltas++;
            else if (lista[i] < alturaMediaEspaña)
                contadMasBajas++;
            else
                alturaMedia++;

        }
        JOptionPane.showMessageDialog(null,"En el conjunto de personas evaluadas tenemos un total de " + contadMasAltas +" personas más altas de la media\n" +
                ", un total de "+ contadMasBajas + " personas más bajas y en la media " + alturaMedia);

    }

}
