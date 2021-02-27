package boletin18;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Creado por @autor: angel
 * El  25 de feb. de 2021.
 **/
public class Buzon {
    static ArrayList<Correo> buzonCorreo = new ArrayList<>();

    public static int numeroDeCorreos() {
        JOptionPane.showMessageDialog(null, "Tinenes " + buzonCorreo.size() + " correos en el buzón");
        return buzonCorreo.size();
    }

    public static void añadir(Correo c) {
        buzonCorreo.add(c);
    }

    public static void leerCorreo(ArrayList<Correo> lista) {
        Iterator it = buzonCorreo.iterator();
        Correo correo;
        while (it.hasNext()) {
            correo = (Correo) it.next();
            System.out.println(correo);
            correo.setLeido(true);
        }
    }

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
    @Override
    public String toString() {
        return "Buzon{}";
    }
}
