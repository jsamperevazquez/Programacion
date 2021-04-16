package ejemploGui.Angel.ventana1;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  15 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Ventana {

    JFrame marco;

    public void iniciar(){
        marco = new JFrame("PRIMERA VENTANA"); // Creamos el marco
        // Damos las características al marco

        marco.setSize(800,600); // Le damos tamaño
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Le decimos que al pulsar la x de la ventana cierre el programa
        marco.setLocationRelativeTo(null); // poner la ventana en el centro
        marco.setVisible(true); // La hacemos visible




    }







}
