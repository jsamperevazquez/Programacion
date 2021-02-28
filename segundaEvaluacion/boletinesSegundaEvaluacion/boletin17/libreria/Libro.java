package boletin17.libreria;

/**
 * Creado por @autor: angel
 * El  23 de feb. de 2021.
 **/

/**
 * Clase para instanciar objetos de tipo libro
 */
public class Libro {
    /**
     * Título del libro
     */
    private String titulo;
    /**
     * Autor del libro
     */
    private String autor;
    /**
     * ISBN del conjunto de libros
     */
    private String ISBN;
    /**
     * Precio del libro
     */
    private float precio;
    /**
     * Número de unidades de cada libro
     */
    private int numeroUnidades;

    /**
     * Constructor por defecto
     */
    public Libro() {
    }

    /**
     * Constructor parametrizado
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param precio precio del libro
     * @param numeroUnidades número de unidades del libro
     */
    public Libro(String titulo, String autor, float precio, int numeroUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = String.valueOf((int) (Math.random() * (10000 - 1000)) + 1000);
        this.precio = precio;
        this.numeroUnidades = numeroUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }


    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }

    /**
     * Método toStrin
     * @return String
     */
    @Override
    public String toString() {
        return
                "titulo='" + titulo +
                        ", autor='" + autor +
                        ", ISBN='" + ISBN +
                        ", precio=" + precio +
                        ", numeroUnidades=" + numeroUnidades;
    }
}
