package com.angel.boletin21;

import com.toedter.calendar.JCalendar;

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
    private JCalendar cal;
    private JButton buscarFechaButton;
    private JLabel fullNameLabel;
    private JLabel userIDLabel;
    private JLabel groupLabel;
    private JLabel homeDirectoryLabel;
    private JLabel loginShellLabel;
    private JLabel passwordLabel;
    private JLabel confirmLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Boletin21");
        frame.setContentPane(new Boletin21().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        cal= new JCalendar(); //Creo yo el objeto porque marco la casilla en el form de
        userNameLabel = new JLabel();
        userNameLabel.setDisplayedMnemonic(KeyEvent.VK_N);
        fullNameLabel=new JLabel();
        fullNameLabel.setDisplayedMnemonic(KeyEvent.VK_F);
        userIDLabel=new JLabel();
        userIDLabel.setDisplayedMnemonic(KeyEvent.VK_U);
        groupLabel=new JLabel();
        groupLabel.setDisplayedMnemonic(KeyEvent.VK_G);
        homeDirectoryLabel=new JLabel();
        homeDirectoryLabel.setDisplayedMnemonic(KeyEvent.VK_H);
        loginShellLabel=new JLabel();
        loginShellLabel.setDisplayedMnemonic(KeyEvent.VK_S);
        passwordLabel=new JLabel();
        passwordLabel.setDisplayedMnemonic(KeyEvent.VK_P);
        confirmLabel=new JLabel();
        confirmLabel.setDisplayedMnemonic(KeyEvent.VK_O);






    }

}
