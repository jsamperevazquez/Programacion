package ejemploGui.Angel.Componentes;

import javax.swing.*;
import java.awt.*;

/**
 * Creado por @autor: angel
 * El  15 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Componentes{
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

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
    }


}
