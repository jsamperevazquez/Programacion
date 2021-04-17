package com.angel.boletin20;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import static java.awt.Color.*;

/**
 * Creado por @autor: angel
 * El  17 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Componentes {
    JFrame marco;
    JPanel panelSuperior;
    JLabel eitNombre;
    JLabel etiPass;
    JTextField lineaNombre;
    JTextField lineaPass;
    JButton bPresionar;
    JButton bLimpiar;
    JPanel panelInferior;
    JList area;
    JButton boton;
    JTextArea areaTexto;
    String [] elementos = {"ElementoLista1","  ","ElementoLista2","  ","ElementoLista3"};
    Border borde;
    public void iniciar(){
       //Instanciar
        marco= new JFrame("                 Boletín 20                 ");
        panelSuperior= new JPanel();
        eitNombre= new JLabel("NOMBRE");
        etiPass= new JLabel("PASSWORD");
        lineaNombre=new JTextField();
        lineaPass= new JPasswordField();
        bPresionar= new JButton("PRESIONAR");
        bLimpiar = new JButton("LIMPIAR");
        panelInferior= new JPanel();
        area= new JList(elementos);
        boton = new JButton("BOTON");
        areaTexto = new JTextArea();
        borde= BorderFactory.createLineBorder(BLACK);


        // Características
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);
        marco.setSize(900,900);
        panelSuperior.setLayout(null);
        panelSuperior.setSize(850,400);
        panelInferior.setLayout(null);
        panelInferior.setSize(850,400);
        eitNombre.setBounds(80,10,80,80);
        etiPass.setBounds(80,80,80,80);
        etiPass.setForeground(red);
        lineaNombre.setBounds(280,30,190,40);
        lineaPass.setBounds(280,100,190,40);
        bPresionar.setBounds(150,350,130,40);
        bPresionar.setBackground(RED.brighter());
        bLimpiar.setBounds(320,350,130,40);
        bLimpiar.setBackground(GREEN.darker());
        area.setBounds(40,450,200,250);
        boton.setBounds(300,550,100,50);
        boton.setBackground(YELLOW);
        areaTexto.setBounds(450,480,200,220);
        areaTexto.setBorder(borde);
        area.setBorder(borde);


        //Añadir componentes
        marco.add(panelSuperior);
        marco.add(panelInferior);
        panelSuperior.add(eitNombre);
        panelSuperior.add(etiPass);
        panelSuperior.add(lineaNombre);
        panelSuperior.add(lineaPass);
        panelSuperior.add(bPresionar);
        panelSuperior.add(bLimpiar);
        panelInferior.add(area);
        panelInferior.add(boton);
        panelInferior.add(areaTexto);







    }


}
