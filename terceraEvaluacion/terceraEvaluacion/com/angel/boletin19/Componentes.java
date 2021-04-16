package com.angel.boletin19;

import javax.swing.*;
import java.awt.*;

/**
 * Creado por @autor: angel
 * El  16 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Componentes{

    // Declaración de componentes
    JFrame marco;
    JPanel panel;
    JButton bPremer;
    JButton bLimpar;
    JLabel etiNombre;
    JLabel etiPass;
    JTextField campoNombre;
    JPasswordField campoPass;
    JTextArea areaTexto;

    //Instanciar componentes con método de inicio

    public void iniciar(){
        marco = new JFrame("  **** Boletín 19 ****");
        panel= new JPanel();
        bPremer= new JButton("PRESIONAR");
        bLimpar = new JButton("LIMPIAR");
        etiNombre=new JLabel("Nombre");
        etiPass= new JLabel("Password");
        campoNombre= new JTextField();
        campoPass= new JPasswordField();
        areaTexto= new JTextArea();

    // Damos Características a componentes
        // Marco
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(800,800);
        marco.setLocationRelativeTo(null);

        //Panel
        panel.setLayout(null);
        panel.setSize(750,750);

        //Botones
        bPremer.setBackground(Color.CYAN);
        bPremer.setBounds(200,500,180,50);
        bLimpar.setBackground(Color.red);
        bLimpar.setToolTipText("Elimina el texto del area definida");
        bLimpar.setBounds(450,500,180,50);

        //Etiquetas
        etiNombre.setBounds(150,-20,50,150);
        etiPass.setBounds(150,50,80,150);

        //Lineas de texto
        campoNombre.setBounds(340,35,250,50);
        campoPass.setBounds(340,100,250,50);

        //Area de texto
        areaTexto.setBackground(Color.LIGHT_GRAY);
        areaTexto.setBounds(160,200,400,150);


     // Añadimos los componentes
        marco.add(panel);
        panel.add(bPremer);
        panel.add(bLimpar);
        panel.add(etiNombre);
        panel.add(etiPass);
        panel.add(campoNombre);
        panel.add(campoPass);
        panel.add(areaTexto);

    }

}
