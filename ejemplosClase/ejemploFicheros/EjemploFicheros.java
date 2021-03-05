package ejemploFicheros;

import ejemploFicheros.escrituraFicheros.Escritura;
import ejemploFicheros.lecturaFicheros.Lectura;
import ejemploFicheros.serializacion.LecturaEscrituraSerializable;
import jdk.nashorn.internal.scripts.JO;
import libreriaAngel.LeerDatos;
import libreriaAngel.PedirDatos;
import libreriaAngel.ValidarDatos;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;

/**
 * Creado por @autor: angel
 * El  03 de mar. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class EjemploFicheros {
    public static void main(String[] args) {
        // Leemos linea completa
        // Lectura.leerLineas();

        // Leemos dato a dato
        // Lectura.leerString();

        // Lectura datos usando delimitadores.
        // Lectura.leerStringUsandoDelimitadores();

        // lectura de enteros y lo recogemos en un arrayList
        //File f = new File("C:\\Users\\angel\\OneDrive\\Escritorio\\Numeros.txt"); // Creamos un nuevo objeto de tipo fichero.
        //ArrayList<Integer> lista = Lectura.leerEnteros(f); //Creamos un nuevo ArrayList para recoger lo que retorna el método.
        //for (Integer ele:lista){ // Visualizamos con un for each
        //  System.out.println(ele);
        //}

        // Leemos objetos y los metemos en una colección
        // Lectura.leerAlumnado("C:\\Users\\angel\\OneDrive\\Escritorio\\Alumnos");


        // Método de escritura
        // Escribir números
        // Escritura.escribirNumeros("C:\\Users\\angel\\OneDrive\\Escritorio\\numeroEscritura"); // como ya le ponemos la extensión en el método ya no es necesario mandarlo

      /*  String nombreFichero= JOptionPane.showInputDialog(null,"Nombre del fichero sin .txt");
        ArrayList<Integer> lista= new ArrayList<>();
        lista.add(19);
        lista.add(22);
        lista.add(36);
        File file= Escritura.escribirFrases(nombreFichero,lista);
*/
/*
        ArrayList<Alumno> listaAlumno = new ArrayList<>();
        Alumno alumno1 = new Alumno(PedirDatos.pedirString("nombre"), PedirDatos.pedirInt("nota"), PedirDatos.pedirString("dni"));
        listaAlumno.add(alumno1);
        listaAlumno.add(new Alumno(PedirDatos.pedirString("nombre"), PedirDatos.pedirInt("nota"), PedirDatos.pedirString("dni")));
        listaAlumno.add(new Alumno(PedirDatos.pedirString("nombre"), PedirDatos.pedirInt("nota"), PedirDatos.pedirString("dni")));
        File f = Escritura.escribirObjetos("datos", listaAlumno);
        Lectura.leerAlumnado("datos");
        Escritura.añadir("datos");
  */
       // Lectura.leerAlumnado("datos");

        LecturaEscrituraSerializable.escribirSerializable("alumnoSer");
        LecturaEscrituraSerializable.lecturaSerializable("alumnoSer");
    }
}
