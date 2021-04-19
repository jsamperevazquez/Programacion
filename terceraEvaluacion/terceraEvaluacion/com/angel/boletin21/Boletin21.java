package com.angel.boletin21;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Creado por @autor: angel
 * El  19 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Boletin21 extends JFrame {


    private JPanel panel;
    private JLabel userNameLabel;
    private JTextField nueUserText;
    private JTextField fullNameText;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JTextField textField4;
    private JComboBox comboBox2;
    private JButton OKButton;
    private JButton cancelButton;
    private JLabel createNueUser;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Boletin21");
        frame.setContentPane(new Boletin21().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
