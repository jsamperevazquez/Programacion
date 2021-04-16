package ejemploGui.Angel.ventana1;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  15 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class VentanaCopia extends JFrame{



    public void iniciar(){
        setTitle("PRIMERA VENTANA");
        // Damos las características al marco

        this.setSize(800,600); // Le damos tamaño
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Le decimos que al pulsar la x de la ventana cierre el programa
        this.setLocationRelativeTo(null); // poner la ventana en el centro
        this.setVisible(true); // La hacemos visible




    }







}
