package com.angel.boletin23;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  21 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Boletin23 {
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton a8Button;
    private JButton button2;
    private JButton a7Button;
    private JButton a9Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button8;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button12;
    private JButton a0Button;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton acButton;
    private JButton offButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Boletin23");
        frame.setContentPane(new Boletin23().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

}
