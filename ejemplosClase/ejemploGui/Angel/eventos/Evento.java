package ejemploGui.Angel.eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Creado por @autor: angel
 * El  19 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Evento implements ActionListener {
    JFrame marco;
    JPanel panel;
    JButton bLimpiar,bEscribe;
    JLabel etiNome;
    JTextField lineaNombre;
    JTextArea areaTextoPersonal;

    public void iniciar(){
        // Instanciamos los componentes

        marco = new JFrame("Marco con componentes");
        panel = new JPanel();
        bLimpiar= new JButton("Limpiar");
        bEscribe=new JButton();
        etiNome= new JLabel("Nombre");
        lineaNombre = new JTextField();
        areaTextoPersonal= new JTextArea();

        // Le damos las características de los componentes


        marco.setSize(800,800);
        panel.setSize(750,750);
        panel.setLayout(null);  // Anulamos en Layout por defecto del panel
        bLimpiar.setBackground(Color.red);
        bLimpiar.setBounds(500,600,100,50); // En los Bounds el primer parámetro es el eje x, segundo eje y, tercero tamaño x, tamaño y.
        bEscribe.setBackground(Color.blue);
        bEscribe.setBounds(200,600,100,50);
        bEscribe.setText("ESC");
        bEscribe.setToolTipText("Copia lo que tenemos en la linea de texto en el area de texto"); // Ponemos  texto en pantalla al poner el puntero sobre el botón
        lineaNombre.setBounds(240,35,300,30);
        areaTextoPersonal.setBounds(300,150,200,300);
        areaTextoPersonal.setBackground(Color.lightGray);
        etiNome.setBounds(150,-25,50,150);


        // Añadimos componentes
        panel.add(etiNome);
        panel.add(lineaNombre);
        panel.add(areaTextoPersonal);
        panel.add(bEscribe);
        panel.add(bLimpiar);

        marco.add(panel);

        //Gestión de eventos

        bEscribe.addActionListener(this); // Resuelve el evento en la misma clase
        bLimpiar.addActionListener(this);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) { // actionPerformed()  es el método que se ejecuta ante un click.Este método recibe un ActionEvent. Este objeto ActionEvent es el que contiene diferente información
        if (actionEvent.getActionCommand()=="ESC") { //El nombre del botón que fue pulsado. Esto lo tenemos en el método .getActionCommand() y lo comparamos con el nombre del botón
            // También valdría : if (actionEvent.getSource() == bEscribe) // getSource devuelve un objeto
            String texto = lineaNombre.getText(); //Recojo el texto que hay en el textField y lo introduzco en un String
            areaTextoPersonal.setText(texto); //Asigno al area de texto el contenido del String
        }else {
            areaTextoPersonal.setText("");
            lineaNombre.setText("");
        }
        }

    }
