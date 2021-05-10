package com.angel.extraExamen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Creado por @autor: angel
 * El  06 de may. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Loteria {

    // Declaración de componentes
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a10Button;
    private JButton a11Button;
    private JButton a12Button;
    private JButton a13Button;
    private JButton a14Button;
    private JButton a15Button;
    private JButton a16Button;
    private JButton a17Button;
    private JButton a18Button;
    private JButton a19Button;
    private JButton a20Button;
    private JButton a21Button;
    private JButton a22Button;
    private JButton a23Button;
    private JButton a24Button;
    private JButton a25Button;
    private JButton a26Button;
    private JButton a27Button;
    private JButton a28Button;
    private JButton a29Button;
    private JButton a30Button;
    private JButton a31Button;
    private JButton a32Button;
    private JButton a33Button;
    private JButton a34Button;
    private JButton a35Button;
    private JButton a36Button;
    private JButton a37Button;
    private JButton a38Button;
    private JButton a39Button;
    private JButton a40Button;
    private JButton a41Button;
    private JButton a42Button;
    private JButton a43Button;
    private JButton a44Button;
    private JButton a45Button;
    private JButton a46Button;
    private JButton a47Button;
    private JButton a48Button;
    private JButton a49Button;
    private JPanel panel;
    private JButton numerosAleatoriosButton;
    private JButton comprobarButton;
    private static ArrayList<JButton> listaBotones = new ArrayList<>();
    public Loteria() {

        // Creamos nuevos objeto de clase ActionListener
        ActionListener escucha = new numeros();

        // Ponemos a la escucha nuestros botones con nuestros eventos
        ponerEscuchaBotones(escucha,a1Button);
        ponerEscuchaBotones(escucha,a2Button);
        ponerEscuchaBotones(escucha,a3Button);
        ponerEscuchaBotones(escucha,a4Button);
        ponerEscuchaBotones(escucha,a5Button);
        ponerEscuchaBotones(escucha,a6Button);
        ponerEscuchaBotones(escucha,a7Button);
        ponerEscuchaBotones(escucha,a8Button);
        ponerEscuchaBotones(escucha,a9Button);
        ponerEscuchaBotones(escucha,a10Button);
        ponerEscuchaBotones(escucha,a11Button);
        ponerEscuchaBotones(escucha,a12Button);
        ponerEscuchaBotones(escucha,a13Button);
        ponerEscuchaBotones(escucha,a14Button);
        ponerEscuchaBotones(escucha,a15Button);
        ponerEscuchaBotones(escucha,a16Button);
        ponerEscuchaBotones(escucha,a17Button);
        ponerEscuchaBotones(escucha,a18Button);
        ponerEscuchaBotones(escucha,a19Button);
        ponerEscuchaBotones(escucha,a20Button);
        ponerEscuchaBotones(escucha,a21Button);
        ponerEscuchaBotones(escucha,a22Button);
        ponerEscuchaBotones(escucha,a23Button);
        ponerEscuchaBotones(escucha,a24Button);
        ponerEscuchaBotones(escucha,a25Button);
        ponerEscuchaBotones(escucha,a26Button);
        ponerEscuchaBotones(escucha,a27Button);
        ponerEscuchaBotones(escucha,a28Button);
        ponerEscuchaBotones(escucha,a29Button);
        ponerEscuchaBotones(escucha,a30Button);
        ponerEscuchaBotones(escucha,a31Button);
        ponerEscuchaBotones(escucha,a32Button);
        ponerEscuchaBotones(escucha,a33Button);
        ponerEscuchaBotones(escucha,a34Button);
        ponerEscuchaBotones(escucha,a35Button);
        ponerEscuchaBotones(escucha,a36Button);
        ponerEscuchaBotones(escucha,a37Button);
        ponerEscuchaBotones(escucha,a38Button);
        ponerEscuchaBotones(escucha,a39Button);
        ponerEscuchaBotones(escucha,a40Button);
        ponerEscuchaBotones(escucha,a41Button);
        ponerEscuchaBotones(escucha,a42Button);
        ponerEscuchaBotones(escucha,a43Button);
        ponerEscuchaBotones(escucha,a44Button);
        ponerEscuchaBotones(escucha,a45Button);
        ponerEscuchaBotones(escucha,a46Button);
        ponerEscuchaBotones(escucha,a47Button);
        ponerEscuchaBotones(escucha,a48Button);
        ponerEscuchaBotones(escucha,a49Button);

        // Añadimos los números al Array
        listaBotones.add(a1Button);
        listaBotones.add(a2Button);
        listaBotones.add(a3Button);
        listaBotones.add(a4Button);
        listaBotones.add(a5Button);
        listaBotones.add(a6Button);
        listaBotones.add(a7Button);
        listaBotones.add(a8Button);
        listaBotones.add(a9Button);
        listaBotones.add(a10Button);
        listaBotones.add(a11Button);
        listaBotones.add(a12Button);
        listaBotones.add(a13Button);
        listaBotones.add(a14Button);
        listaBotones.add(a15Button);
        listaBotones.add(a16Button);
        listaBotones.add(a17Button);
        listaBotones.add(a18Button);
        listaBotones.add(a19Button);
        listaBotones.add(a20Button);
        listaBotones.add(a21Button);
        listaBotones.add(a22Button);
        listaBotones.add(a23Button);
        listaBotones.add(a24Button);
        listaBotones.add(a25Button);
        listaBotones.add(a26Button);
        listaBotones.add(a27Button);
        listaBotones.add(a28Button);
        listaBotones.add(a29Button);
        listaBotones.add(a30Button);
        listaBotones.add(a31Button);
        listaBotones.add(a32Button);
        listaBotones.add(a33Button);
        listaBotones.add(a34Button);
        listaBotones.add(a35Button);
        listaBotones.add(a36Button);
        listaBotones.add(a37Button);
        listaBotones.add(a38Button);
        listaBotones.add(a39Button);
        listaBotones.add(a40Button);
        listaBotones.add(a41Button);
        listaBotones.add(a42Button);
        listaBotones.add(a43Button);
        listaBotones.add(a44Button);
        listaBotones.add(a45Button);
        listaBotones.add(a46Button);
        listaBotones.add(a47Button);
        listaBotones.add(a48Button);
        listaBotones.add(a49Button);

        // Creamos los eventos para los clicks de los botones
        a1Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a1Button.setBackground(Color.YELLOW);
            }
        });
        a2Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a2Button.setBackground(Color.YELLOW);
            }
        });
        a3Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a3Button.setBackground(Color.YELLOW);
            }
        });
        a4Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a4Button.setBackground(Color.YELLOW);
            }
        });
        a5Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a5Button.setBackground(Color.YELLOW);
            }
        });
        a6Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a6Button.setBackground(Color.YELLOW);
            }
        });
        a7Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a7Button.setBackground(Color.YELLOW);
            }
        });
        a8Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a8Button.setBackground(Color.YELLOW);
            }
        });
        a9Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a9Button.setBackground(Color.YELLOW);
            }
        });
        a10Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a10Button.setBackground(Color.YELLOW);
            }
        });
        a11Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a11Button.setBackground(Color.YELLOW);
            }
        });
        a12Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a12Button.setBackground(Color.YELLOW);
            }
        });
        a13Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a13Button.setBackground(Color.YELLOW);
            }
        });
        a14Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a14Button.setBackground(Color.YELLOW);
            }
        });
        a15Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a15Button.setBackground(Color.YELLOW);
            }
        });
        a16Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a16Button.setBackground(Color.YELLOW);
            }
        });
        a17Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a17Button.setBackground(Color.YELLOW);
            }
        });
        a18Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a18Button.setBackground(Color.YELLOW);
            }
        });
        a19Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a19Button.setBackground(Color.YELLOW);
            }
        });
        a20Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a20Button.setBackground(Color.YELLOW);
            }
        });
        a21Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a21Button.setBackground(Color.YELLOW);
            }
        });
        a22Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a22Button.setBackground(Color.YELLOW);
            }
        });
        a23Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a23Button.setBackground(Color.YELLOW);
            }
        });
        a24Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a24Button.setBackground(Color.YELLOW);
            }
        });
        a25Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a25Button.setBackground(Color.YELLOW);
            }
        });
        a26Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a26Button.setBackground(Color.YELLOW);
            }
        });
        a27Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a27Button.setBackground(Color.YELLOW);
            }
        });
        a28Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a28Button.setBackground(Color.YELLOW);
            }
        });
        a29Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a29Button.setBackground(Color.YELLOW);
            }
        });
        a30Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a30Button.setBackground(Color.YELLOW);
            }
        });
        a31Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a31Button.setBackground(Color.YELLOW);
            }
        });
        a32Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a32Button.setBackground(Color.YELLOW);
            }
        });
        a33Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a33Button.setBackground(Color.YELLOW);
            }
        });
        a34Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a34Button.setBackground(Color.YELLOW);
            }
        });
        a35Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a35Button.setBackground(Color.YELLOW);
            }
        });
        a36Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a36Button.setBackground(Color.YELLOW);
            }
        });
        a37Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a37Button.setBackground(Color.YELLOW);
            }
        });
        a38Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a38Button.setBackground(Color.YELLOW);
            }
        });
        a39Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a39Button.setBackground(Color.YELLOW);
            }
        });
        a40Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a40Button.setBackground(Color.YELLOW);
            }
        });
        a41Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a41Button.setBackground(Color.YELLOW);
            }
        });
        a42Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a42Button.setBackground(Color.YELLOW);
            }
        });
        a43Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a43Button.setBackground(Color.YELLOW);
            }
        });
        a44Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a44Button.setBackground(Color.YELLOW);
            }
        });
        a45Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a45Button.setBackground(Color.YELLOW);
            }
        });
        a46Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a46Button.setBackground(Color.YELLOW);
            }
        });
        a47Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a47Button.setBackground(Color.YELLOW);
            }
        });
        a48Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a48Button.setBackground(Color.YELLOW);
            }
        });
        a49Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                a49Button.setBackground(Color.YELLOW);
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Loteria");
        frame.setContentPane(new Loteria().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }
    
    // Creamos el método para poner a la escucha nuestros botones
    public void ponerEscuchaBotones(ActionListener actionListener, JButton boton){
        boton.addActionListener(actionListener);

    }


    class numeros implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {


        }
    }

}
