/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin04;

/**
 * Clase para instanciar objetos de tipo libro diferentes parámetros
 *
 * @author angel
 */
//Declaramos atributos de la clase Libro
public class Libro {
    /**
     * Variable para recoger el título del libro
     */
    private String titulo;
    /**
     * Variable para recoger el autor del libro
     */
    private String autor;
    /**
     * Variable para recoger el año de publicación del libro
     */
    private int ano;
    /**
     * Variable para recoger el número de páginas del libro
     */
    private short numPaginas;
    /**
     * Variable para recoger las valoraciones del libro
     */
    private float valoracions;

    //Creamos los constructores
    //Creo un constructor vacio para no tener errores futuros

    /**
     * Constructor por defecto
     */
    public Libro() {
    }
    //Creo el constructor solicitado por ejercicio

    /**
     * Constructor parametrizado
     *
     * @param tit  título del libro
     * @param aut  autor del libro
     * @param an   año de publicación
     * @param numP número de páginas
     * @param val  valoraciones del libro
     */
    public Libro(String tit, String aut, int an, int numP, float val) {
        titulo = tit;
        autor = aut;
        ano = an;
        numPaginas = (short) numP;
        valoracions = val;

    }

    //Creo los diferentes métodos de acceso (setter y getter)
    public void setTitulo(String tit) {
        titulo = tit;
    }

    public void setAutor(String aut) {
        autor = aut;
    }

    public void setAno(int a) {
        ano = a;
    }

    public void setNumPaginas(int numPa) {
        numPaginas = (short) numPa;
    }

    public void setValoracions(float val) {
        valoracions = val;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public float getValoracions() {
        return valoracions;
    }

    // Creo el método amosar que no devuelva nada y pueda visualizar las características de un libro

    /**
     * Método para ver las diferentes características de cada libro.
     */
    public void amosar() {
        System.out.println("Características del libro:\nTítulo: " + titulo + "\nAutor: " + autor + "\nAno: " + ano + "\nNúmero de páxinas: " + numPaginas +
                "\nValoracións: " + valoracions);
    }

}
