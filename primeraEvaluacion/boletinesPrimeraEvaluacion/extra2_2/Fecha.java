package extra2_2;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  13 de nov. de 2020.
 *Clase donde se instancian fechas para realizar método de comprobación de validez
 * @version 0.0.1
 **/
public class Fecha {
    /**
     * Variables para ingresar el día, mes y año
     */
    private int dia,mes,ano;
    /**
     * Booleana para retornar la validez de la fecha
     */
    private boolean fecha=false;
    /**
     * Variable auxiliar para dar valor máximo de días al mes
     */
    private int diaMaximo;

    /**
     * Constructor por defecto
     */
    public Fecha(){

    }

    /**
     * Constructor parametrizado
     * @param dia El día
     * @param mes El mes
     * @param ano El año
     */
    public Fecha (int dia,int mes, int ano){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;

    }

    /**
     * Método para comprobar si una fecha es válida o no
     * @param dia El día
     * @param mes El mes, se tiene en cuenta el posible año bisiesto en febrero (mes 2)
     * @param ano El año
     * @return
     */
    public boolean esFechaValida(int dia, int mes, int ano) {
    if (ano > 1600 && ano < 3000 && dia > 0 && dia < 32) {

        switch (mes) {
            case 1:
                diaMaximo = 31;
                break;
            case 3:
                diaMaximo = 31;
                break;
            case 5:
                diaMaximo = 31;
                break;
            case 7:
                diaMaximo = 31;
                break;
            case 9:
                diaMaximo = 31;
                break;
            case 11:
                diaMaximo = 31;
                break;
            case 2:
                if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))) {
                    diaMaximo = 29;
                    break;
                }
                    else {
                    diaMaximo = 28;
                    break;
                }
                    case 4:
                diaMaximo = 30;
                break;
            case 6:
                diaMaximo = 30;
                break;
            case 8:
                diaMaximo = 30;
                break;
            case 10:
                diaMaximo = 30;
                break;
            case 12:
                diaMaximo = 30;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mes incorrecto");
                break;
        }

    } else
        JOptionPane.showMessageDialog(null, "Fecha no válida");

    if (diaMaximo>=dia) {
        fecha = true;
        JOptionPane.showMessageDialog(null, "Fecha correcta");

    }
    else
        JOptionPane.showMessageDialog(null,"Fecha incorrecta");


    return fecha;
    }



}
