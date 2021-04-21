package com.angel.boletin22;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.JTable;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Creado por @autor: angel
 * El  20 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Boletin22 extends JFrame {
    private JPanel panel;
    private JTextField nombreField;
    private JComboBox comboAsig;
    private JLabel nombreLabel;
    private JTextField apellidoField;
    private JLabel apellidoLabel;
    private JButton agregarTablaButton;
    private JTable tablaCurso;
    private DefaultTableModel modelo;

    private void createUIComponents() {
        JScrollPane scrollPane = new JScrollPane(); // Creo un JScrollPane para poder agregar el Jtable al form y poder usar desplazamiento vertical y horizontal
        tablaCurso = new JTable(); // instancio la tabla con las filas y columnas que hemos creado con anterioridad.
        tablaCurso.setVisible(true);
        // Template para la tabla
        modelo = new DefaultTableModel(); // Creo un nuevo template para diseñar la tabla
        // Añado las columnas
        modelo.addColumn("columnaNombre");
        modelo.addColumn("columnaApellido");
        modelo.addColumn("columnaCurso");
        modelo.addRow(new Object[]{"Nombre", "Apellido", "Curso"}); // Añado la fila con los valores del array Object

        tablaCurso.setModel(modelo); // Asigno el template a la JTable
        scrollPane.setViewportView(tablaCurso); // meto la tabla dentro del contenedor
        scrollPane.setBounds(20, 20, 200, 100);
        getContentPane().add(scrollPane);

        tablaCurso.setDefaultRenderer(Object.class, new MiRenderer()); // asocio tabla a clase incrustada (MiRenderer)

    }

    public Boletin22() {
        agregarTablaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                modelo.addRow(new Object[]{nombreField.getText(), apellidoField.getText(), comboAsig.getSelectedItem().toString()});
            }
        });
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
            if (nombreCelda.equalsIgnoreCase("nombre") && modelo.getRowCount()<2) { // pongo el color gris de la fila si tiene como valor "nombre"
                setBackground(Color.LIGHT_GRAY);
                setForeground(Color.BLACK);
                setHorizontalAlignment(SwingConstants.CENTER); // A las siguientes filas las pongo en blanco
            } else {
                setBackground(Color.WHITE);
                setForeground(Color.BLACK);
                setHorizontalAlignment(SwingConstants.CENTER);
            }
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }

    }
}
