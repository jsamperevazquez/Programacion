package ejemploFicheros.serializacion;

import ejemploFicheros.Alumno;
import libreriaAngel.PedirDatos;

import java.io.*;

/**
 * Creado por @autor: angel
 * El  03 de mar. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class LecturaEscrituraSerializable {
    public static void escribirSerializable(String nombreFichero){
        ObjectOutputStream escribir=null;

        try {
            escribir=new ObjectOutputStream(new FileOutputStream(nombreFichero));
            Alumno al1=new Alumno(PedirDatos.pedirString("nombre"),PedirDatos.pedirInt("nota"),PedirDatos.pedirString("DNI"));
            Alumno al2=new Alumno(PedirDatos.pedirString("nombre"),PedirDatos.pedirInt("nota"),PedirDatos.pedirString("DNI"));
            escribir.writeObject(al1);
            escribir.writeObject(al2);
        } catch (FileNotFoundException e) {
            System.out.println("Error en el fichero"+e.toString());
        }catch (IOException e){
            System.out.println("Error en escritura"+e.getMessage());
        }finally {
            try {
                escribir.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero"+e.getMessage());
            }
        }


    }
    public static void lecturaSerializable(String nombreFichero){
        ObjectInputStream lectura=null;


        try {
            lectura=new ObjectInputStream(new FileInputStream(nombreFichero));
            try {
                Alumno alumno= (Alumno) lectura.readObject();
                while (alumno!=null){
                    System.out.println(alumno);
                    alumno= (Alumno) lectura.readObject();
                }
            } catch (ClassNotFoundException e) {
                System.out.println("Error en la clase");;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error en el fichero de lectura"+e.getMessage());
        }catch (IOException e){
        }finally {
            try {
                lectura.close();
            } catch (IOException e) {
                System.out.println("Error en cierre"+e.getMessage());;
            }
        }
    }
}
