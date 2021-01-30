package ejemploArrayObjetos;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  30 de ene. de 2021.
 **/
public class Metodos {
    public Alumno[] crearArray(int tamaño){
        String nombre,dni;
        int nota;
        Alumno [] listaAlumnos = new Alumno [tamaño];
        for (int i = 0; i <tamaño ; i++) {
            nombre=pedirString();
            dni=pedirString();
            nota=pedirNota();
            listaAlumnos[i]= new Alumno(nombre,nota,dni);

        }
        return listaAlumnos;
    }

    public String pedirString (){
        return (JOptionPane.showInputDialog(null,"Dato"));
    }
    public int pedirNota (){
        int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "nota"));

        do {

        }while (nota <0 || nota>10 );
        return nota;
    }
    public void mostrarArray(Alumno[]lista){
        for (Alumno ele:lista)
            System.out.println(ele);
    }
    public void buscarAlumno(Alumno []lista){
        String dniBuscar=JOptionPane.showInputDialog(null,"Introduce el dni del alumno");
        int contador=0, encontrado=0;
        Alumno[] listaRepes= new Alumno[lista.length];
        for (int i = 0; i <lista.length ; i++) {
            if (dniBuscar.equals(lista[i].getDni())){
                encontrado=1;
                listaRepes[contador]=lista[i];
                contador++;

            }
            if (encontrado==0)
                System.out.println("El DNI no está en la lista");
            else{
                for (int k = 0; k <lista.length ; k++) {
                    System.out.println("El dni solicitado es del alumno " + listaRepes[k]);

                }
            }

        }
    }
}
