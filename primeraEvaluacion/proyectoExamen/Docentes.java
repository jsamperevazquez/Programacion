package proyectoExamen;

import javax.print.Doc;
import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  17 de nov. de 2020.
 * Clase para calcular sueldos de los docentes de la facultad
 * @version 0.0.1
 **/
public class Docentes {
    private String codigo,categoria,estudioPostGrado;
    private int anosAntiguedad;
    private double horasClase,sueldoBruto,sueldoNeto;
    public final static double MONTOAFP=0.13;
    public final static double MONTOSEGUROSALUD=0.05;

    /**
     * Método constructor por defecto
     */
    public Docentes(){

    }

    /**
     * Metodo constructor parametrizado
     * @param codigo Código del docente
     * @param estudioPostGrado Estudios de post Grado realizados
     * @param anosAntiguedad Años de antigüedad en la facultad
     * @param horasClase Horas de clase mensuales
     * @param sueldoBruto Sueldo con las bonificaciones sin los descuentos
     * @param sueldoNeto Sueldo bruto menos las deducciones
     */
    public Docentes(String codigo, String estudioPostGrado, int anosAntiguedad, double horasClase, double sueldoBruto, double sueldoNeto) {
        this.codigo = codigo;
        this.estudioPostGrado = estudioPostGrado;
        this.anosAntiguedad = anosAntiguedad;
        this.horasClase = horasClase;
        this.sueldoBruto = sueldoBruto;
        this.sueldoNeto = sueldoNeto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstudioPostGrado() {
        return estudioPostGrado;
    }

    public void setEstudioPostGrado(String estudioPostGrado) {
        this.estudioPostGrado = estudioPostGrado;
    }

    public int getAnosAntiguedad() {
        return anosAntiguedad;
    }

    public void setAnosAntiguedad(int anosAntiguedad) {
        this.anosAntiguedad = anosAntiguedad;
    }

    public double getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(double horasClase) {
        this.horasClase = horasClase;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public double getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    /**
     * Método para ingresar la información necesaria para realizar los cálculos de sueldos
     * @param docente recibe el objeto de la Clase principal
     */
    public void infoDocente(Docentes docente){

        while (true){
            categoria=JOptionPane.showInputDialog(null,"Introduzca la categoría del docente:\nPrincipal\nAsociado\nAuxiliar");
            if (categoria.equalsIgnoreCase("Principal") || categoria.equalsIgnoreCase("Asociado")|| categoria.equalsIgnoreCase("Auxiliar"))
                break;
            else
                JOptionPane.showMessageDialog(null,"Datos incorrectos, vuelva a introducir los datos");
        }

        anosAntiguedad=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca los años de antigüedad"));

        while(true){
            estudioPostGrado=JOptionPane.showInputDialog(null,"Introduzca las estudios de PostGrado:\nDoctorado\nMaestría\nAmbas\nNinguno");
            if(estudioPostGrado.equalsIgnoreCase("ninguno")||estudioPostGrado.equalsIgnoreCase("Maestría")||estudioPostGrado.equalsIgnoreCase("Doctorado")||estudioPostGrado.equalsIgnoreCase("Ambas"))
            break;
            else
                JOptionPane.showMessageDialog(null,"Datos incorrectos, vuelva a introducir los datos");
        }
            horasClase=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce las horas de clase"));
     }

    /**
     * Calculo del sueldo bruto en función de la categoría, estudios postgrado y años de antigüedad.
     * @param docente recibe un objeto de la clase principal como parámetro.
     * @return retorna el valor del sueldo bruto.
     */
    public double calculoSueldoBruto(Docentes docente){
        int numCategoria = 0;
        double pagoParcial;
        int pagoHora;
        double bonifPostGrado;
        double bonifAntiguedad;

        if (categoria.equalsIgnoreCase("Principal") && estudioPostGrado.equalsIgnoreCase("Doctorado") && anosAntiguedad>=8)
            numCategoria=1;
        else if (categoria.equalsIgnoreCase("Principal") && estudioPostGrado.equalsIgnoreCase("Doctorado") && anosAntiguedad<7)
            numCategoria=2;
        else if (categoria.equalsIgnoreCase("Principal") && estudioPostGrado.equalsIgnoreCase("Maestría") && anosAntiguedad>=8)
            numCategoria=3;
        else if (categoria.equalsIgnoreCase("Principal") && estudioPostGrado.equalsIgnoreCase("Maestría") && anosAntiguedad<7)
            numCategoria=4;
        else if (categoria.equalsIgnoreCase("Principal") && estudioPostGrado.equalsIgnoreCase("Ambas") && anosAntiguedad>=8)
            numCategoria=5;
        else if (categoria.equalsIgnoreCase("Principal") && estudioPostGrado.equalsIgnoreCase("Ambas") && anosAntiguedad<7)
            numCategoria=6;
        else if (categoria.equalsIgnoreCase("Asociado") && estudioPostGrado.equalsIgnoreCase("Doctorado") && anosAntiguedad>=8)
            numCategoria=7;
        else if (categoria.equalsIgnoreCase("Asociado") && estudioPostGrado.equalsIgnoreCase("Doctorado") && anosAntiguedad<7)
            numCategoria=8;
        else if (categoria.equalsIgnoreCase("Asociado") && estudioPostGrado.equalsIgnoreCase("Maestría") && anosAntiguedad>=8)
            numCategoria=9;
        else if (categoria.equalsIgnoreCase("Asociado") && estudioPostGrado.equalsIgnoreCase("Maestría") && anosAntiguedad<7)
            numCategoria=10;
        else if (categoria.equalsIgnoreCase("Asociado") && estudioPostGrado.equalsIgnoreCase("Ambas") && anosAntiguedad>=8)
            numCategoria=11;
        else if (categoria.equalsIgnoreCase("Asociado") && estudioPostGrado.equalsIgnoreCase("Ambas") && anosAntiguedad<7)
            numCategoria=12;
        else if (categoria.equalsIgnoreCase("Auxiliar") && estudioPostGrado.equalsIgnoreCase("Doctorado") && anosAntiguedad>=8)
            numCategoria=13;
        else if (categoria.equalsIgnoreCase("Auxiliar") && estudioPostGrado.equalsIgnoreCase("Doctorado") && anosAntiguedad<7)
            numCategoria=14;
        else if (categoria.equalsIgnoreCase("Auxiliar") && estudioPostGrado.equalsIgnoreCase("Maestría") && anosAntiguedad>=8)
            numCategoria=15;
        else if (categoria.equalsIgnoreCase("Auxiliar") && estudioPostGrado.equalsIgnoreCase("Maestría")&& anosAntiguedad<7)
            numCategoria=16;
        else if (categoria.equalsIgnoreCase("Auxiliar") && estudioPostGrado.equalsIgnoreCase("Ambas") && anosAntiguedad>=8)
            numCategoria=17;
        else if (categoria.equalsIgnoreCase("Auxiliar") && estudioPostGrado.equalsIgnoreCase("Ambas") && anosAntiguedad<7)
            numCategoria=18;
        else if (categoria.equalsIgnoreCase("Principal") && estudioPostGrado.equalsIgnoreCase("Ninguno"))
            numCategoria=19;
        else if (categoria.equalsIgnoreCase("Asociado") && estudioPostGrado.equalsIgnoreCase("Ninguno"))
            numCategoria=20;
        else if (categoria.equalsIgnoreCase("Auxiliar") && estudioPostGrado.equalsIgnoreCase("Ninguno"))
            numCategoria=21;


        switch (numCategoria){
            case 1:
                pagoParcial=horasClase*25;
                sueldoBruto=pagoParcial+(pagoParcial*0.27);
                break;
            case 2:
                pagoParcial=horasClase*25;
                sueldoBruto=pagoParcial+(pagoParcial*0.2);
                break;
            case 3:
                pagoParcial=horasClase*25;
                sueldoBruto=pagoParcial+(pagoParcial*0.24);
                break;
            case 4:
                pagoParcial=horasClase*25;
                sueldoBruto=pagoParcial+(pagoParcial*0.22);
                break;
            case 5:
                pagoParcial=horasClase*25;
                sueldoBruto=pagoParcial+(pagoParcial*0.32);
                break;
            case 6:
                pagoParcial=horasClase*25;
                sueldoBruto=pagoParcial+(pagoParcial*0.30);
                break;
            case 7:
                pagoParcial=horasClase*18;
                sueldoBruto=pagoParcial+(pagoParcial*0.21);
                break;
            case 8:
                pagoParcial=horasClase*18;
                sueldoBruto=pagoParcial+(pagoParcial*0.19);
                break;
            case 9:
                pagoParcial=horasClase*18;
                sueldoBruto=pagoParcial+(pagoParcial*0.16);
                break;
            case 10:
                pagoParcial=horasClase*18;
                sueldoBruto=pagoParcial+(pagoParcial*0.14);
                break;
            case 11:
                pagoParcial=horasClase*18;
                sueldoBruto=pagoParcial+(pagoParcial*0.26);
                break;
            case 12:
                pagoParcial=horasClase*18;
                sueldoBruto=pagoParcial+(pagoParcial*0.24);
                break;
            case 13:
                pagoParcial=horasClase*15;
                sueldoBruto=pagoParcial+(pagoParcial*0.17);
                break;
            case 14:
                pagoParcial=horasClase*15;
                sueldoBruto=pagoParcial+(pagoParcial*0.14);
                break;
            case 15:
                pagoParcial=horasClase*15;
                sueldoBruto=pagoParcial+(pagoParcial*0.13);
                break;
            case 16:
                pagoParcial=horasClase*15;
                sueldoBruto=pagoParcial+(pagoParcial*0.10);
                break;
            case 17:
                pagoParcial=horasClase*15;
                sueldoBruto=pagoParcial+(pagoParcial*0.07);
                break;
            case 18:
                pagoParcial=horasClase*15;
                sueldoBruto=pagoParcial+(pagoParcial*0.04);
                break;
            case 19:
                pagoParcial=horasClase*25;
                sueldoBruto=pagoParcial;
                break;
            case 20:
                pagoParcial=horasClase*18;
                sueldoBruto=pagoParcial;
                break;
            case 21:
                pagoParcial=horasClase*15;
                sueldoBruto=pagoParcial;
                break;
        }
        JOptionPane.showMessageDialog(null,"El sueldo bruto del docente es de " + sueldoBruto + " Euros");
        return sueldoBruto;

    }

    /**
     * Método para calcular el sueldo neto del docente
     * @param docente recibe un objeto de la clase principal como parámetro.
     * @return devuelve el valor de sueldo Neto.
     */
    public double calcularSueldoNeto(Docentes docente){
        sueldoNeto=sueldoBruto-(sueldoBruto*MONTOAFP)-(sueldoBruto*MONTOSEGUROSALUD);
        JOptionPane.showMessageDialog(null,"El Sueldo neto del docente es de " + sueldoNeto + " Euros");
        return  sueldoNeto;
    }
}
