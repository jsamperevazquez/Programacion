package boletin18;

import libreriaAngel.PedirDatos;
import libreriaAngel.ValidarDatos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Creado por @autor: angel
 * El  25 de feb. de 2021.
 **/
public class Buzon {
    static ArrayList<Correo> buzonCorreo = new ArrayList<>();

    public int numeroDeCorreos(){
        JOptionPane.showMessageDialog(null,"Tinenes " + buzonCorreo.size() +" correos en el buzón");
        return buzonCorreo.size();
    }
    public static void añadir (Correo c){
        buzonCorreo.add(c);
    }

    public static void leerCorreo(ArrayList<Correo> lista){
        Iterator it =buzonCorreo.iterator();
        Correo correo;
        while (it.hasNext()){
            correo=(Correo) it.next();
            System.out.println(correo);
            correo.setLeido(true);
        }
    }

    public static boolean porLeer(){
        Iterator it = buzonCorreo.iterator();
        int correoNoLeido=0;
        Correo correo;
        while (it.hasNext()){
            correo=(Correo)it.next();
            if (correo.getLeido()==false){
                correoNoLeido ++;
            }
            JOptionPane.showMessageDialog(null,"Hay " + correoNoLeido + " correos no leídos");
        }
        if (correoNoLeido != 0)
            return false;
        else
            return true;
    }
    public static String mostrarPrimeroNoLeido(){
        Iterator it = buzonCorreo.iterator();
        int noLeido=0;
        Correo primerCorreoSinLeer = (Correo) it.next();
        while (it.hasNext()){
            if (primerCorreoSinLeer.getLeido()==false) {
                JOptionPane.showMessageDialog(null,primerCorreoSinLeer);
                break;
            }else
                JOptionPane.showMessageDialog(null,"No hay correos sin leer");
        }
        return primerCorreoSinLeer.getContenidoCorreo();
    }
    public static String mostrar(int k){
        for (int i = 0; i <buzonCorreo.size() ; i++) {
            if (i == k) {
                System.out.println(buzonCorreo.get(k));
                return buzonCorreo.get(k).getContenidoCorreo();
            }
            
            else
                return "No existe dicho correo ";
        }
    }

}
