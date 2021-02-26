package boletin18;

import libreriaAngel.PedirDatos;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  25 de feb. de 2021.
 **/
public class Correo {

    static Correo correo;
    static String emisor;
    static String contenidoCorreo;
    static boolean leido=false;
    public Correo() {
    }

    public Correo(String contenidoCorreo,String emisor, boolean leido) {
        this.contenidoCorreo = contenidoCorreo;
        this.emisor = emisor;
        this.leido = leido;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public boolean getLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public String getContenidoCorreo() {
        return contenidoCorreo;
    }

    public void setContenidoCorreo(String contenidoCorreo) {
        this.contenidoCorreo = contenidoCorreo;
    }


    public static void crearEnviarCorreo(){
        emisor= PedirDatos.pedirString("Introduce el emisor del correo");
        contenidoCorreo=PedirDatos.pedirString("Introduce el cuerpo del correo");
        correo=new Correo(contenidoCorreo,emisor,leido);
        Buzon.añadirCorreo(correo);
        JOptionPane.showMessageDialog(null,"Correo enviado con éxito");
    }



    @Override
    public String toString() {
        return
                "contenidoCorreo='" + contenidoCorreo +" ,emisor "+emisor+
                ", leido=" + leido;
    }
}
