package arrayListEjemploAmpliado;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Creado por @autor: angel
 * El  23 de feb. de 2021.
 **/
public class ArrayEjemploAmpliado {
    public static void main(String[] args) {
        ArrayList <Alumno> lista = new ArrayList<>();
        String opcion;
        do{
            opcion=JOptionPane.showInputDialog(null,"***  MENÚ *** \n1--> AÑADIR ELEMENTO\n 2--> MOSTRAR\n 3--> CONSULTA\n4-->ELIMINAR ALUMNO\n 5-->SALIR");
            switch (opcion){
                case "1" : Metodos.añadirElemento(lista);
                break;

                case "2" : Metodos.enseñarAlumno(lista);
                break;

                case "3" : Metodos.consultarNombre(lista);
                break;

                case "4" : Metodos.eliminarElemento(lista);
                break;

                case "5" : System.exit(0);
                break;
            }

        }while ( ! opcion.equals("5"));

    }
}
