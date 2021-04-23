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
     * Botón numérico 8 de la calculadora
     */
    private JButton a8Button;
    /**
     * Botón numérico 2 de la calculadora
     */
    private JButton button2;
    /**
     * Botón numérico 7 de la calculadora
     */
    private JButton a7Button;
    /**
     * Botón numérico 9 de la calculadora
     */
    private JButton a9Button;
    /**
     * Botón numérico 4 de la calculadora
     */
    private JButton a4Button;
    /**
     * Botón numérico 5 de la calculadora
     */
    private JButton a5Button;
    /**
     * Botón numérico 6 de la calculadora
     */
    private JButton a6Button;
    /**
     * Botón * de la calculadora
     */
    private JButton button8;
    /**
     * Botón numérico 1 de la calculadora
     */
    private JButton a1Button;
    /**
     * Botón numérico 2 de la calculadora
     */
    private JButton a2Button;
    /**
     * Botón numérico 3 de la calculadora
     */
    private JButton a3Button;
    /**
     * Botón - de la calculadora
     */
    private JButton button12;
    /**
     * Botón numérico 0 de la calculadora
     */
    private JButton a0Button;
    /**
     * Botón . de la calculadora
     */
    private JButton button14;
    /**
     * Botón = de la calculadora
     */
    private JButton button15;
    /**
     *Botón + de la calculadora
     */
    private JButton button16;
    /**
     * Botón ac de la calculadora
     */
    private JButton acButton;
    /**
     * Botón off de la calculadora
     */
    private JButton offButton;
    /**
     * Variable para acumular resultado
     */
    private static Double resultado;
    /**
     * Booleano para comprobar el primer número
     */
    private boolean primerNumero;

    /**
     * Método constructor
     */
    public Boletin23() {
        primerNumero = true;
        ActionListener escucha = new insertarNumerosPantalla(); // Instancia en clase interna insertarNumerosPantalla
        ActionListener operador = new operaciones(); // Instancia en la clase interna operaciones

        // LLamamos al método ponerEscuchaBotón y enviamos los botones y el ActionListener deseado.
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
                    // Ya hay número en el Field
                    if (!validarPunto(textArea1.getText())) {
                        textArea1.setText(textArea1.getText().concat("."));

                    }
                }


            }
        });
    }


    /**
     * Método main Donde instanciamos el JFrame
     * @param args
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Boletin23().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400); // Le damos un tamaño deseado porque el pack() lo pone demasiado pequeño
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); //Situamos el frame en el centro de la pantalla


    }

    /**
     * Método que pone a la escucha los botones que recibe como parámetro
     * @param escucha  ActionListener detecta y maneja eventos de acción (ActionEvent)
     * @param boton JButon de java.swing
     */
    public void ponerEscuchaBoton(ActionListener escucha, JButton boton) {
        boton.addActionListener(escucha); // Ponemos a la escucha el botón que reciba como parámetro con el ActionListener que reciba
    }

    /**
     * Método para apagar la calculadora al darle al botón "off"
     * @throws InterruptedException Para el control de excepciones
     */
    public void apagarCalculadora() throws InterruptedException {
        /**
         * Los segundos que tardará la calculadora en ser apagada
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
     * Método creado desde la paleta para ajustar (custom) los componentes deseados
     */
    private void createUIComponents() {
        // Instanciamos por obligación al declarar custom los componentes seleccionados
        textArea1 = new JTextField("0"); // Le ponemos 0 como valor en el constructor
    }


    // Metodos de validación

    /**
     * Método que se encarga de validar el . de la calculadora.
     * No podrá ponerse más de uno.
     * Si se pulsa como botón inicial toma el "0" como primer valor.
     * @param textoLabel con el valor que tine el Display de la calculadora en ese instante
     * @return booleano para comprobar si la cadena String contiene un .
     */
    public boolean validarPunto(String textoLabel) {
        /**
         * Booleano iniciado en false
         */
        boolean validacion = false;
        //Bucle para comprobar el tamaño del String del display
        for (int i = 0; i < textoLabel.length(); i++) {
            if (textoLabel.substring(i, i+1).equals(".")) { // Va comprobando uno a uno cada caracter del String con método SubString
                validacion = true; // Si encuentra el . cambiamos el bool a true y rompemos el bucle
                break;
            }
        }
        return validacion;
    }

    /**
     * Clase interna que controlará los eventos que insertan los números en el Display de la calculadora.
     * Implementa la interface ActionListener con el método actionPerformed (actúa al pulsar)
     * @version 0.0.12
     */
    class insertarNumerosPantalla implements ActionListener {
        /**
         * String que almacena entradas teclado calculadora
         */
        private String entrada;

        /**
         * Método de ActionListener para controlar los eventos de botones
         * @param actionEvent para acceder a métodos
         */
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            // Asignamos al String los botones pulsados con getActionCommand()
            entrada = actionEvent.getActionCommand();
            if (primerNumero) { // si el primer número es true
                textArea1.setText(""); // ponemos la pantalla en blanco
                primerNumero = false;
            }
            textArea1.setText(textArea1.getText().concat(entrada)); // Lo que tengo en la pantalla concatenado con el dato de entrada
        }
    }

    /**
     * Clase interna que controlará los eventos para realizar los operaciones de la calculadora
     * @version 0.1.3
     */
    class operaciones implements ActionListener {
        /**
         * String con última operación marcada
         */
        private String ultimaOperacion = "=";
        /**
         * Double para almacenar el dato del display
         */
        private double datoConvertido;

        /**
         * Método de ActionListener para controlar los eventos de botones
         * @param actionEvent acceso a métodos
         */
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            /**
             * String para almacenar valores de los botones pulsados
             */
            String operacion = actionEvent.getActionCommand();
            datoConvertido = Double.parseDouble(textArea1.getText()); // Pasamos a Double los datos recogidos del display de la calculadora
            calcular(datoConvertido); // LLamamos al método calcular y le pasamos el datoConvertido
            ultimaOperacion = operacion; // Asignamos a ultimaOperacion el valor del botón de operación pulsado
            primerNumero = true; // Dejamos de concatenar en el display


        }

        /**
         * Método para realizar todas las operaciones de la calculadora
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
            textArea1.setText(resultado.toString()); // Escribimos en el display al pulsar cada botón de la operación
        }

    }
}
