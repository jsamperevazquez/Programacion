package com.angel.boletin23;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public Boletin23() {
        ActionListener escucha = new eventos();
        ponerEscuchaBoton(escucha, a0Button);
        ponerEscuchaBoton(escucha, a1Button);
        ponerEscuchaBoton(escucha, a2Button);
        ponerEscuchaBoton(escucha, a3Button);
        ponerEscuchaBoton(escucha, a4Button);
        ponerEscuchaBoton(escucha, a5Button);
        ponerEscuchaBoton(escucha, a6Button);
        ponerEscuchaBoton(escucha, a7Button);
        ponerEscuchaBoton(escucha, a8Button);
        ponerEscuchaBoton(escucha, a9Button);
        acButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea1.setText(null);
            }
        });
        offButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    apagarCalculadora();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Boletin23().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);


    }

    public void ponerEscuchaBoton(ActionListener escucha, JButton boton) {
        boton.addActionListener(escucha);
    }
    public void apagarCalculadora() throws InterruptedException {
        int segundos=3;
        while (segundos!=0){
            Thread.sleep(500);
            segundos --;

        }
        if (segundos==0) {
            System.exit(0);
        }
    }


    class eventos implements ActionListener {
        private String entrada;

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            entrada = actionEvent.getActionCommand();
            textArea1.setText(textArea1.getText().concat(entrada)); // Lo que tengo en la pantalla concatenado con el dato de entrada
        }
    }
}
