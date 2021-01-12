package extra2_1;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  12 de nov. de 2020.
 **/
public class Cuota {
    /**
     * La cuota inicial del club sin descuentos
     */
    private float cuota = 800;
    /**
     * El nombre del socio del club
     */
    private String nombreSocio;
    /**
     * Variable para comprobar si el padre es socio
     */
    private String padre;
    /**
     * Edad del socio
     */


    private int edad;
    /**
     * Padre Socio sí
     */
    private String padreSi = "s";
    /**
     * Padre socio no
     */
    private String padreNo = "n";


    /**
     * Constructor por defecto
     */
    /**
     * Para
     */


    public Cuota() {

    }

    /**
     * Constructor parametrizado
     *
     * @param nombreSocio nombre del socio
     * @param edad        edad del socio
     */
    public Cuota(String nombreSocio, int edad) {
        this.nombreSocio = nombreSocio;
        this.edad = edad;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }


    public String getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método para ingresar los datos de los socios
     *
     * @param socio
     */
    public void ingresarDatos(Cuota socio) {
        nombreSocio = JOptionPane.showInputDialog(null, "Ingresa el nombre por favor");
        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la edad por favor"));
        }
        while (edad<0);
           if(edad<0)
               JOptionPane.showConfirmDialog(null,"Edad incorrecta, la edad no puede ser negativa");
        }

    /**
     * Método para comprobar la edad de los socios y poder generar la cuota adecuada.
     */
    public void comprobarCuota() {
        if (edad > 65)
            JOptionPane.showMessageDialog(null, "Tu cuota anual es de " + (cuota - cuota * 0.4) + " euros");
        else if (edad < 21) {
            //Creo un bucle while para controlar el S o N
            while (true) {

                padre = JOptionPane.showInputDialog(null, "Introduce si tu padre es Socio:\n S para sí\nN para no");
                if (padreSi.equalsIgnoreCase(padre) || padreNo.equalsIgnoreCase(padre)) {
                    JOptionPane.showMessageDialog(null, "Tienes derecho a descuento,espere a la cuota final");
                    break;
                } else
                    JOptionPane.showMessageDialog(null, "Dato no válido, vuelva a intentarlo");
            }

            if (padre.equalsIgnoreCase("s")) {
                JOptionPane.showMessageDialog(null, "tu cuota anual es de " + (cuota - cuota * 0.45) + " euros");
            } else if (padre.equalsIgnoreCase("n")) {
                JOptionPane.showMessageDialog(null, "tu cuota anual es de " + (cuota - cuota * 0.25) + " euros");
            }
        } else
            JOptionPane.showMessageDialog(null, "tu cuota anual es de " + cuota + " euros");

    }

}


