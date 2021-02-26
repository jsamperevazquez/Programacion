package boletin18;

import libreriaAngel.PedirDatos;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  25 de feb. de 2021.
 **/
public class Correo {
    private static Correo correo;
    private String contenidoCorreo,emisor;
    boolean leido=false;
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


    public static void crearCorreo(){
     correo= new Correo(PedirDatos.pedirString("emisor"),PedirDatos.pedirString("contenido"),false);
    }
    public static void enviarCorreo (){
       Buzon.añadir(correo);
    }


    @Override
    public String toString() {
        return
                "contenidoCorreo='" + contenidoCorreo +" ,emisor "+emisor+
                ", leido=" + leido;
    }
}
