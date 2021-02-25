package boletin17.libreria;

/**
 * Creado por @autor: angel
 * El  23 de feb. de 2021.
 **/
public class Libro {
    private String titulo, autor, ISBN;
    private float precio;
    private int numeroUnidades;

    public Libro() {
    }

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
