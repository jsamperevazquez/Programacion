package com.angel.boletin23;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


/**
 * Creado por @autor: angel
 * El  21 de abr. de 2021.
 * @version 1.0.36
 *
 */
public class Boletin23 {
    /**
     * Panel para agregar componentes
     */
    private JPanel panel1;
    /**
     * Display de la calculadora
     */
    private JTextField textArea1;
    /**
     * Bot�n num�rico 8 de la calculadora
     */
    private JButton a8Button;
    /**
     * Bot�n num�rico 2 de la calculadora
     */
    private JButton button2;
    /**
     * Bot�n num�rico 7 de la calculadora
     */
    private JButton a7Button;
    /**
     * Bot�n num�rico 9 de la calculadora
     */
    private JButton a9Button;
    /**
     * Bot�n num�rico 4 de la calculadora
     */
    private JButton a4Button;
    /**
     * Bot�n num�rico 5 de la calculadora
     */
    private JButton a5Button;
    /**
     * Bot�n num�rico 6 de la calculadora
     */
    private JButton a6Button;
    /**
     * Bot�n * de la calculadora
     */
    private JButton button8;
    /**
     * Bot�n num�rico 1 de la calculadora
     */
    private JButton a1Button;
    /**
     * Bot�n num�rico 2 de la calculadora
     */
    private JButton a2Button;
    /**
     * Bot�n num�rico 3 de la calculadora
     */
    private JButton a3Button;
    /**
     * Bot�n - de la calculadora
     */
    private JButton button12;
    /**
     * Bot�n num�rico 0 de la calculadora
     */
    private JButton a0Button;
    /**
     * Bot�n . de la calculadora
     */
    private JButton button14;
    /**
     * Bot�n = de la calculadora
     */
    private JButton button15;
    /**
     *Bot�n + de la calculadora
     */
    private JButton button16;
    /**
     * Bot�n ac de la calculadora
     */
    private JButton acButton;
    /**
     * Bot�n off de la calculadora
     */
    private JButton offButton;
    /**
     * Variable para acumular resultado
     */
    private static Double resultado;
    /**
     * Booleano para comprobar el primer n�mero
     */
    private boolean primerNumero;

    /**
     * M�todo constructor
     */
    public Boletin23() {
        primerNumero = true;
        ActionListener escucha = new insertarNumerosPantalla(); // Instancia en clase interna insertarNumerosPantalla
        ActionListener operador = new operaciones(); // Instancia en la clase interna operaciones

        // LLamamos al m�todo ponerEscuchaBot�n y enviamos los botones y el ActionListener deseado.
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

        // Creamos los Listener desde el form con los botones que deseamos controlar de modo independiente
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
                    primerNumero=false;
                } else {
                    // Ya hay n�mero en el Field
                    if (!validarPunto(textArea1.getText())) {
                        textArea1.setText(textArea1.getText().concat("."));

                    }
                }


            }
        });
    }


    /**
     * M�todo main Donde instanciamos el JFrame
     * @param args
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Boletin23().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400); // Le damos un tama�o deseado porque el pack() lo pone demasiado peque�o
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); //Situamos el frame en el centro de la pantalla


    }

    /**
     * M�todo que pone a la escucha los botones que recibe como par�metro
     * @param escucha  ActionListener detecta y maneja eventos de acci�n (ActionEvent)
     * @param boton JButon de java.swing
     */
    public void ponerEscuchaBoton(ActionListener escucha, JButton boton) {
        boton.addActionListener(escucha); // Ponemos a la escucha el bot�n que reciba como par�metro con el ActionListener que reciba
    }

    /**
     * M�todo para apagar la calculadora al darle al bot�n "off"
     * @throws InterruptedException Para el control de excepciones
     */
    public void apagarCalculadora() throws InterruptedException {
        /**
         * Los segundos que tardar� la calculadora en ser apagada
         */
        int segundos = 3;

        // Mientras los segundos no lleguen a 0
        while (segundos != 0) {
            Thread.sleep(1000); // Pausa el hilo de JAVA (sistema) durante 1000 ms
            segundos--; //Decrementamos los segundos en 1

        }
       // Cuando los segundos lleguen a 0 se sale de la app
        if (segundos == 0) {
            System.exit(0);
        }
    }

    /**
     * M�todo creado desde la paleta para ajustar (custom) los componentes deseados
     */
    private void createUIComponents() {
        // Instanciamos por obligaci�n al declarar custom los componentes seleccionados
        textArea1 = new JTextField("0"); // Le ponemos 0 como valor en el constructor
    }


    // Metodos de validaci�n

    /**
     * M�todo que se encarga de validar el . de la calculadora.
     * No podr� ponerse m�s de uno.
     * Si se pulsa como bot�n inicial toma el "0" como primer valor.
     * @param textoLabel con el valor que tine el Display de la calculadora en ese instante
     * @return booleano para comprobar si la cadena String contiene un .
     */
    public boolean validarPunto(String textoLabel) {
        /**
         * Booleano iniciado en false
         */
        boolean validacion = false;
        //Bucle para comprobar el tama�o del String del display
        for (int i = 0; i < textoLabel.length(); i++) {
            if (textoLabel.substring(i, i+1).equals(".")) { // Va comprobando uno a uno cada caracter del String con m�todo SubString
                validacion = true; // Si encuentra el . cambiamos el bool a true y rompemos el bucle
                break;
            }
        }
        return validacion;
    }

    /**
     * Clase interna que controlar� los eventos que insertan los n�meros en el Display de la calculadora.
     * Implementa la interface ActionListener con el m�todo actionPerformed (act�a al pulsar)
     * @version 0.0.12
     */
    class insertarNumerosPantalla implements ActionListener {
        /**
         * String que almacena entradas teclado calculadora
         */
        private String entrada;

        /**
         * M�todo de ActionListener para controlar los eventos de botones
         * @param actionEvent para acceder a m�todos
         */
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            // Asignamos al String los botones pulsados con getActionCommand()
            entrada = actionEvent.getActionCommand();
            if (primerNumero) { // si el primer n�mero es true
                textArea1.setText(""); // ponemos la pantalla en blanco
                primerNumero = false;
            }
            textArea1.setText(textArea1.getText().concat(entrada)); // Lo que tengo en la pantalla concatenado con el dato de entrada
        }
    }

    /**
     * Clase interna que controlar� los eventos para realizar los operaciones de la calculadora
     * @version 0.1.3
     */
    class operaciones implements ActionListener {
        /**
         * String con �ltima operaci�n marcada
         */
        private String ultimaOperacion = "=";
        /**
         * Double para almacenar el dato del display
         */
        private double datoConvertido;

        /**
         * M�todo de ActionListener para controlar los eventos de botones
         * @param actionEvent acceso a m�todos
         */
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            /**
             * String para almacenar valores de los botones pulsados
             */
            String operacion = actionEvent.getActionCommand();
            datoConvertido = Double.parseDouble(textArea1.getText()); // Pasamos a Double los datos recogidos del display de la calculadora
            calcular(datoConvertido); // LLamamos al m�todo calcular y le pasamos el datoConvertido
            ultimaOperacion = operacion; // Asignamos a ultimaOperacion el valor del bot�n de operaci�n pulsado
            primerNumero = true; // Dejamos de concatenar en el display


        }

        /**
         * M�todo para realizar todas las operaciones de la calculadora
         * @param numero que recoge del display de la calculadora en ese instante
         */
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
            textArea1.setText(resultado.toString()); // Escribimos en el display al pulsar cada bot�n de la operaci�n
        }

    }
}
