package com.angel.boletin22;

import javafx.scene.control.TableRow;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;

/**
 * Creado por @autor: angel
 * El  20 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Boletin22 extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JComboBox comboAsig;
    private JLabel nombreLabel;
    private JTextField textField2;
    private JLabel apellidoLabel;
    private JButton AGREGARTABLAButton;
    private JTable tablaCurso;

    private void createUIComponents() {
        TableCellRenderer renderizado;
        Object[] titulos = {"Nombre", "Apellido", "Curso"}; // Creo un array de tipo Object para no limitar con los diferentes nombres para las celdas
        Object comodin="";
        Object[][] celdas = new Object[2][titulos.length]; // Creo un array bidimensional con las celdas (filas y columnas) de la tabla
        JScrollPane scrollPane = new JScrollPane(); // Creo un JScrollPane para poder agregar el Jtable al form y poder usar desplazamiento vertical y horizontal
        tablaCurso = new JTable(celdas, titulos); // instancio la tabla con las filas y columnas que hemos creado con anterioridad.
        tablaCurso.setVisible(true);
        scrollPane.setViewportView(tablaCurso); // meto la tabla dentro del contenedor
        scrollPane.setBounds(20, 20, 200, 100);
        getContentPane().add(scrollPane);
        celdas[0][0] = titulos[0];
        celdas[0][1] = titulos[1];
        celdas[0][2] = titulos[2];
        celdas[1][0] = comodin; // Uso el comodín para que no me de nullpointer en el método de MiRender
        celdas[1][1] = comodin;
        celdas[1][2] = comodin;

        tablaCurso.setDefaultRenderer(Object.class, new MiRenderer()); // asocio tabla a clase incrustada (MiRenderer)

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Boletin22");
        frame.setContentPane(new Boletin22().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    class MiRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected,
                                                       boolean hasFocus,
                                                       int row,
                                                       int column) {
            String nombreCelda = (String) table.getValueAt(row, 0); // Casteo a String y obtengo valores de la tabla para poder comparar

            if (nombreCelda.equalsIgnoreCase("nombre")) {
                setBackground(Color.LIGHT_GRAY);
                setForeground(Color.BLACK);
                setHorizontalAlignment(SwingConstants.CENTER);
            }else if (!nombreCelda.equalsIgnoreCase("nombre"))
                setBackground(Color.WHITE);
            setForeground(Color.BLACK);
            setHorizontalAlignment(SwingConstants.CENTER);
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }

    }
}
