package ejemploFicheros.escrituraFicheros;

import ejemploFicheros.Alumno;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Creado por @autor: angel
 * El  03 de mar. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Escritura {
    public static void  escribirNumeros(String nombreArchivo){
        File archivo= new File(nombreArchivo + ".txt");
        PrintWriter escribir=null;
        try {
            escribir = new PrintWriter(archivo); // Con esta sentencia se abre flujo en modo escritura (sí no existe lo crea y si existe OJO lo sobreescribe)
            escribir.println(1);
            escribir.println(2);
            escribir.println(3);
            escribir.println(4);
        } catch (FileNotFoundException e) {
            System.out.println("Error en la escritura" + e.toString());
        }finally {
            escribir.close();
        }
    }
    public static File escribirFrases(String nombreFichero, ArrayList<Integer>lista){
        PrintWriter escribir=null;
        File archivo;
        archivo=new File(nombreFichero+".txt");
        try {
            escribir=new PrintWriter(archivo);
            for (Integer num:lista){
                escribir.print(num);
            }

        }catch (FileNotFoundException e) {
            System.out.println("Error de lectura "+e.toString());
        }finally {
            escribir.close();
        }
        return archivo;
    }
    public static File escribirObjetos (String nombreFichero, ArrayList<Alumno> lista){
        PrintWriter f=null;
        File fichero;
        fichero=new File(nombreFichero+".txt");
        try {
        f=new PrintWriter(fichero);
            for (Alumno persona:lista)
            f.println(persona); // Escribe como está en el toString()
        } catch (FileNotFoundException e) {
            System.out.println("Error en la escritura"+ e.toString());
        }finally {
            f.close();
        }
        return fichero;

    }
}
