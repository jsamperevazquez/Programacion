package com.angel.boletin23;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


/**
 * Creado por @autor: angel
 * El  21 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Boletin23 {
    private static boolean adelante;
    private JPanel panel1;
    private JTextField textArea1;
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
    private static Double resultado;
    private boolean primerNumero;

    public Boletin23() {
        primerNumero = true;
        adelante=false;
        ActionListener escucha = new insertarNumerosPantalla();
        ActionListener operador = new operaciones();
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
        ponerEscuchaBoton(operador, button2);
        ponerEscuchaBoton(operador, button8);
        ponerEscuchaBoton(operador, button12);
        ponerEscuchaBoton(operador, button15);
        ponerEscuchaBoton(operador, button16);
        acButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea1.setText(null);
                textArea1.setText("0");
                resultado = 0.0;
                primerNumero = true;
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
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String texto = textArea1.getText();
                if (texto.length() <= 1 && texto.equals("0")) {
                    // Hay el 0 en el textArea (valor por defecto)
                    textArea1.setText(textArea1.getText().concat("."));
                    adelante=true;
                } else {
                    // Ya hay número en el Field
                    if (!validarPunto(textArea1.getText())) {
                        textArea1.setText(textArea1.getText().concat("."));

                    }
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
        int segundos = 3;
        while (segundos != 0) {
            Thread.sleep(500);
            segundos--;

        }
        if (segundos == 0) {
            System.exit(0);
        }
    }

    private void createUIComponents() {
        textArea1 = new JTextField("0");
    }


    // Metodos de validación

    public boolean validarPunto(String textoLabel) {
        boolean validacion = false;

        for (int i = 0; i < textoLabel.length(); i++) {
            if (textoLabel.substring(i, i+1).equals(".")) {
                validacion = true;
                break;
            }
        }
        return validacion;
    }


    class insertarNumerosPantalla implements ActionListener {
        private String entrada;


        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            entrada = actionEvent.getActionCommand();
            if (primerNumero) {
                textArea1.setText("");
                primerNumero = false;
            }
            textArea1.setText(textArea1.getText().concat(entrada)); // Lo que tengo en la pantalla concatenado con el dato de entrada
        }
    }

    class operaciones implements ActionListener {
        private String ultimaOperacion = "=";
        private double datoConvertido;

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String operacion = actionEvent.getActionCommand();
            datoConvertido = Double.parseDouble(textArea1.getText());
            calcular(datoConvertido);
            ultimaOperacion = operacion;
            primerNumero = true;


        }

        public void calcular(Double numero) {
            switch (ultimaOperacion) {
                case "+":
                    resultado += numero;
                    break;
                case "-":
                    resultado -= numero;
                    break;
                case "*":
                    resultado *= numero;
                    break;
                case "/":
                    resultado /= numero;
                    break;
                case "=":
                    resultado = numero;
                    break;


            }
            textArea1.setText(resultado.toString());
        }

    }
}
