package com.angel.boletin22;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.JTable;
import java.awt.*;

/**
 * Creado por @autor: angel
 * El  20 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Boletin22 extends JFrame{
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
        Object [] titulos={"Nombre","Apellido","Curso"};
        Object [][] celdas= new Object[2][titulos.length];
        JScrollPane scrollPane= new JScrollPane();
        tablaCurso=new JTable(celdas,titulos);
        tablaCurso.setVisible(true);
        scrollPane.setViewportView(tablaCurso);
        scrollPane.setBounds(20,20,200,100);
        getContentPane().add(scrollPane);
        DefaultTableCellRenderer tcr= new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        celdas[0][0]=titulos[0];
        celdas[0][1]=titulos[1];
        celdas[0][2]=titulos[2];
        tablaCurso.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tablaCurso.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tablaCurso.getColumnModel().getColumn(2).setCellRenderer(tcr);


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Boletin22");
        frame.setContentPane(new Boletin22().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
