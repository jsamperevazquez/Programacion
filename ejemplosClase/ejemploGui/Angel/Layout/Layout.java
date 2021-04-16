package ejemploGui.Angel.Layout;

import javax.swing.*;
import java.awt.*;

/**
 * Creado por @autor: angel
 * El  15 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Layout {
    JFrame marco;
    JPanel panel;
    JButton botom1,boton2,boton3,boton4,boton5;

    public void iniciar(){
        marco= new JFrame("Distribuidor de Componentes");
        panel= new JPanel();
        botom1= new JButton("Boton1");
        boton2 = new JButton("Boton2");
        boton3 = new JButton("Boton3");
        boton4= new JButton("Boton4");
        boton5= new JButton("Boton5");

        panel.setLayout(new FlowLayout(FlowLayout.LEFT,4,2));
        panel.add(botom1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);

    }
}
