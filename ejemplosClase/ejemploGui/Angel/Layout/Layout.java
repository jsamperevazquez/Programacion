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
    JButton botom1, boton2, boton3, boton4, boton5;

    public void iniciar() {
        marco = new JFrame("DISTRIBUIDOR DE COMPONENTES");
        marco.setSize(450, 300);
        panel = new JPanel();
        botom1 = new JButton("Boton1");
        boton2 = new JButton("Boton2");
        boton3 = new JButton("Boton3");
        boton4 = new JButton("Boton4");
        boton5 = new JButton("Boton5");
    }

    public void ejemFlowLayout() {
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 8, 5));
        panel.add(botom1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
    }

    public void ejemBoxLayout() {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // le decimos que aplique boxLayout al panel con el eje y
        panel.add(botom1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
    }

    public void borderLayout() {
        panel.setLayout(new BorderLayout());
        panel.add(botom1,BorderLayout.NORTH);
        panel.add(boton2,BorderLayout.SOUTH);
        panel.add(boton3,BorderLayout.CENTER);
        panel.add(boton4,BorderLayout.EAST);
        panel.add(boton5,BorderLayout.WEST);
        marco.add(panel);


    }
    public void gridLayout(){
        panel.setLayout(new GridLayout(2,3));  //La tabla del layout tendrá 2 filas y 3 columnas
        panel.add(botom1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);

    }

    public void cerrarVentana() {
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);

    }
}
