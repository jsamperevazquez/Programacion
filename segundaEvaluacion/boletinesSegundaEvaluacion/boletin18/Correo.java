package boletin18;

import libreriaAngel.PedirDatos;

/**
 * Creado por @autor: angel
 * El  25 de feb. de 2021.
 **/

/**
 * Clase para instanciar objetos de tipo correo
 */
public class Correo {
    /**
     * Atributo estático de tipo correo para poder hacer diferentes operaciones
     */
    private static Correo correo;
    /**
     * Atributo de clase String para recoger el contenido de los correos
     */
    private String contenidoCorreo;
    /**
     * Atributo de clase String para saber el emisor del correo
     */
    private String emisor;
    /**
     * Booleano para saber si un correo es leído o no (parte como no leído)
     */
    boolean leido=false;

    /**
     * Constructor por defecto
     */
    public Correo() {
    }

    /**
     * Constructor parametrizado
     * @param contenidoCorreo Cuerpo del correo
     * @param emisor emisor del correo
     * @param leido correo no leído
     */
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

    /**
     * Método para crear objetos de tipo correo
     */
    public static void crearCorreo(){
     correo= new Correo(PedirDatos.pedirString("emisor"),PedirDatos.pedirString("contenido"),false);
    }

    /**
     * Método para enviar el correo al buzón
     */
    public static void enviarCorreo (){
       Buzon.anadir(correo);
    }

    /**
     * Método toString
     * @return Sting con los parámetros del objeto
     */

    @Override
    public String toString() {
        return
                "contenidoCorreo='" + contenidoCorreo +" ,emisor "+emisor+
                ", leido=" + leido;
    }
}
