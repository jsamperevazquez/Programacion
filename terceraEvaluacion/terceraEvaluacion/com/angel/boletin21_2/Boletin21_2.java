package com.angel.boletin21_2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Creado por @autor: angel
 * El  19 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Boletin21_2 {
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel DevolJpanel;
    private JTextArea textArea;
    private JButton nuevoButton;
    private JButton borrarButton;
    private JButton modificarButton;
    private JButton denegarButton;
    private JButton cancelarButton;
    private JButton salirButton;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Devoluciones del Cliente");
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new Boletin21_2().DevolJpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        Border borde= BorderFactory.createLineBorder(Color.BLACK);
        JTable table= new JTable(2,5);
        table.setVisible(true);
        textArea=new JTextArea();
        textArea.setBorder(borde);
        textArea.add(table);

    }
}
