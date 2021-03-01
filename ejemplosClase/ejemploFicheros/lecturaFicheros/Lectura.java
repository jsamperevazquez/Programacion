package ejemploFicheros.lecturaFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Creado por @autor: angel
 * El  25 de feb. de 2021.
 **/
public class Lectura {
    public static void leerLineas() {
        // File f = new File("C:\\Users\\angel\\OneDrive\\Escritorio\\enteros.txt"); // cogemos un archivo File para dar ruta. Con Windows las rutas van especificadas con \\ doble barra
        File f = new File("modulos.txt"); // esta es una ruta relativa. Parte desde la carpeta del proyecto. a diferencia de la ruta absoluta de la linea arriba.
        Scanner sc = null; //Declaro un objeto de tipo Scanner y lo inicializo en null para trabajar con él.
        String datos;
        try { //Comienzo el try porque los archivos hay dan excepciones de tipo IO y hay que tratarlas SIEMPRE
            sc = new Scanner(f); // asigno a sc un nuevos Scanner y le mando el archivo de tipo FILE
            while (sc.hasNextLine()) { // mientras haya lineas en el archivo
                datos = sc.nextLine(); // meto en datos el valor de cada linea
                System.out.println(datos);
            }
            //  sc.close(); si yo lo pongo aquí como hacen muchos manuales si no encuentra el File salta al catch y no pasa por esta linea.
        } catch (FileNotFoundException e) { // capturo la excepción de archivo no encontrado
            System.out.println("Error lectura linea" + e.toString());
        } finally { // Siempre hay que cerrar el archivo con .close() y hay que ponerlo con finally porque si no lo encuentra salta directamente a la excepción y no lo cerraría
            sc.close(); // cierro el archivo. Recordamos que el Finally se ejecuta siempre.
        }

    }

    public static void leerString() {
        File f = new File("C:\\Users\\angel\\OneDrive\\Escritorio\\enteros.txt"); // cogemos un archivo File para dar ruta. Con Windows las rutas van especificadas con \\ doble barra
        // File f = new File("modulos.txt"); // esta es una ruta relativa. Parte desde la carpeta del proyecto. a diferencia de la ruta absoluta de la linea arriba.
        Scanner sc = null; //Declaro un objeto de tipo Scanner y lo inicializo en null para trabajar con él.
        String datos;
        try { //Comienzo el try porque los archivos hay dan excepciones de tipo IO y hay que tratarlas SIEMPRE
            sc = new Scanner(f); // asigno a sc un nuevos Scanner y le mando el archivo de tipo FILE
            while (sc.hasNext()) { // mientras haya caracteres.
                datos = sc.next(); // Rompe por el espacio en blanco.
                System.out.println(datos);
            }
            //  sc.close(); si yo lo pongo aquí como hacen muchos manuales si no encuentra el File salta al catch y no pasa por esta linea.
        } catch (FileNotFoundException e) { // capturo la excepción de archivo no encontrado
            System.out.println("Error lectura linea" + e.toString());
        } finally { // Siempre hay que cerrar el archivo con .close() y hay que ponerlo con finally porque si no lo encuentra salta directamente a la excepción y no lo cerraría
            sc.close(); // cierro el archivo. Recordamos que el Finally se ejecuta siempre.
        }

    }

    public static void leerStringUsandoDelimitadores() {
        File f = new File("C:\\Users\\angel\\OneDrive\\Escritorio\\Nombres.txt"); // cogemos un archivo File para dar ruta. Con Windows las rutas van especificadas con \\ doble barra
        // File f = new File("modulos.txt"); // esta es una ruta relativa. Parte desde la carpeta del proyecto. a diferencia de la ruta absoluta de la linea arriba.
        Scanner sc = null; //Declaro un objeto de tipo Scanner y lo inicializo en null para trabajar con él.
        String datos;
        try { //Comienzo el try porque los archivos hay dan excepciones de tipo IO y hay que tratarlas SIEMPRE
            sc = new Scanner(f).useDelimiter(","); // asigno a sc un nuevos Scanner y le mando el archivo de tipo FILE y le pongo como separador una ","
            sc = new Scanner(f).useDelimiter("\\s*,\\s*"); // Con esto se le dice que antes o después de la "," puede haber cualquier otro caracter de escape
            while (sc.hasNext()) { // mientras haya caracteres.
                datos = sc.next(); // Rompe por el espacio en blanco.
                System.out.println(datos);
            }
            //  sc.close(); si yo lo pongo aquí como hacen muchos manuales si no encuentra el File salta al catch y no pasa por esta linea.
        } catch (FileNotFoundException e) { // capturo la excepción de archivo no encontrado
            System.out.println("Error lectura linea" + e.toString());
        } finally { // Siempre hay que cerrar el archivo con .close() y hay que ponerlo con finally porque si no lo encuentra salta directamente a la excepción y no lo cerraría
            sc.close(); // cierro el archivo. Recordamos que el Finally se ejecuta siempre.
        }

    }

    public static ArrayList<Integer> leerEnteros(File archivo) { // se puede recibir como parámetro el nombre del archivo o el objeto de tipo File. Si recibiese el nombre del archivo
        // tendría que crear un objeto de tipo File f = new File (nombre+ ".txt");
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = null;
        int numero;
        try {
            sc = new Scanner(archivo);
            while (sc.hasNextInt()) {
                numero = sc.nextInt();
                lista.add(numero);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer los números" + e.toString());
        } finally {
            sc.close();
        }
        return lista;
    }
}
