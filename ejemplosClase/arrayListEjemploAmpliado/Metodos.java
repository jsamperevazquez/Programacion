package arrayListEjemploAmpliado;

import ejemploArrayList.ListaNumeros;
import libreriaAngel.PedirDatos;
import libreriaAngel.ValidarDatos;

import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Creado por @autor: angel
 * El  23 de feb. de 2021.
 **/
public class Metodos {

    public static void añadirElemento(ArrayList<Alumno> listaAlumno) {
        Alumno ele = pedirAlumno(" alumno a añadir :");
        listaAlumno.add(ele);

    }

    public static Alumno pedirAlumno(String mensaje) {
        String nombreAlumno = PedirDatos.pedirString("Introduce el nombre del alumno");
        int notaAlumno = ValidarDatos.validarIntMenorQueCero("Introduce la nota del alumno");
        String dni = PedirDatos.pedirString("Introduce el DNI del alumno");
        Alumno ojetoAlumno = new Alumno(nombreAlumno, notaAlumno, dni);
        return ojetoAlumno;
    }

    public static void enseñarAlumno(ArrayList<Alumno> listaAlumno) {
        Alumno al; // Declaro una variable de tipo Alumno,
        Iterator it = listaAlumno.iterator(); // Creo un objete llamado it y le digo que recorra listaAlumno.
        while (it.hasNext()) {
            al = (Alumno) it.next(); // Asigno a la variable al el valor de cada iteración.
            System.out.println("Alumno :\n" + al);

        }
    }

    public static void consultarNombre(ArrayList<Alumno> listaAlumno) {
        int encontrado=0; //no está en la lista
        String consulta = JOptionPane.showInputDialog(null, "Introduce el DNI del alumno");
        for (int i = 0; i <listaAlumno.size() ; i++) {
            if (consulta.equalsIgnoreCase(listaAlumno.get(i).getDni())){
                System.out.println("Alumno encontrado:\n"+listaAlumno.get(i).toString());
                encontrado=1;
            }
        }if (encontrado==0)
            System.out.println("El alumno no está en la lista");

    }
    public static void eliminarElemento(ArrayList<Alumno> listaAlumno){
        int encontrado=0; //Alumno no está en la lista
        String consulta = JOptionPane.showInputDialog(null, "Introduce el DNI del alumno");
        Iterator it =listaAlumno.iterator();
        while (it.hasNext()){ // Mientras haya un elemento en la lista
            Alumno al = (Alumno) it.next(); // next () devuelve un objeto Object por eso se castea a Alumno
            if (consulta.equalsIgnoreCase(al.getDni())){
                it.remove();
                encontrado=1;
            }
            if (encontrado==0)
                System.out.println("Alumno no está en la lista");
        }
    }
}
