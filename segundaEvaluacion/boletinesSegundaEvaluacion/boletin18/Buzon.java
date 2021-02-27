package boletin18;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Creado por @autor: angel
 * El  25 de feb. de 2021.
 **/

/**
 * Clase para llevar el control de los correos de un buzón electrónico
 */
public class Buzon {
    /**
     *  Colección estática para guardar los correos que lleguen al buzón
     */
    static ArrayList<Correo> buzonCorreo = new ArrayList<>();

    /**
     *  Método para saber el número de correos que tenemos en el buzón
     * @return devuelve el tamaño del arraylist que tenemos
     */
    public static int numeroDeCorreos() {
        JOptionPane.showMessageDialog(null, "Tinenes " + buzonCorreo.size() + " correos en el buzón");
        return buzonCorreo.size();
    }

    /**
     * Método para añadir al arrayList un correo que recibe como parámetro
     * @param c es un correo de la clase Correo
     */
    public static void anadir(Correo c) {
        buzonCorreo.add(c);
    }

    /**
     * Método por si queremos leer todos los correos del buzón.(Habría que añadirlo al menú principal)
     * @param lista recibe el arrayList buzonCorre
     */
    public static void leerCorreo(ArrayList<Correo> lista) {
        Iterator it = buzonCorreo.iterator();
        Correo correo;
        while (it.hasNext()) {
            correo = (Correo) it.next();
            System.out.println(correo);
            correo.setLeido(true);
        }
    }

    /**
     * Método que devuelve el número de correos que tenemos sin leer en el buzón de correos.
     * @return un booleano para saber si hay o no correos sin leer.
     */

    public static boolean porLeer() {
        Iterator it = buzonCorreo.iterator();
        int correoNoLeido = 0;
        Correo correo;
        while (it.hasNext()) {
            correo = (Correo) it.next();
            if (correo.getLeido() == false) {
                correoNoLeido++;
            }

        }
        JOptionPane.showMessageDialog(null, "Hay " + correoNoLeido + " correos no leídos");
        if (correoNoLeido != 0)
            return false;
        else
            return true;
    }

    /**
     * Método para mostrar el primer correo que aparezca en nuestro buzón como no leído
     * @return El contenido del corro como String
     */
    public static String mostrarPrimeroNoLeido() {
        Correo primerCorreoSinLeer=new Correo();
        Iterator it = buzonCorreo.iterator();
        int noLeido = 0;

        while (it.hasNext()) {
            primerCorreoSinLeer = (Correo) it.next();
            if (primerCorreoSinLeer.getLeido() == false) {
                primerCorreoSinLeer.setLeido(true);
                noLeido=1;
                JOptionPane.showMessageDialog(null, primerCorreoSinLeer);
                break;
            }

        }
        if (noLeido==0)
            JOptionPane.showMessageDialog(null, "No hay correos sin leer");
        return primerCorreoSinLeer.getContenidoCorreo();
    }

    /**
     * Método para eliminar un correo del buzón en función del índice que le pasemos como parámetro
     * @param k el índice del bucle
     */

    public static void elimina(int k) {
        int i;
        int comprobar = 0;
        for (i = 0; i < buzonCorreo.size(); i++) {
            if (i == k) {
                comprobar ++;
                buzonCorreo.remove(k);
                JOptionPane.showMessageDialog(null,"Correo eliminado con éxito");
            }
        }
        if (comprobar == 0)
            JOptionPane.showMessageDialog(null,"No existe ese correo");

    }

    /**
     * Método toString
     * @return El string
     */
    @Override
    public String toString() {
        return "Buzon{}";
    }
}
