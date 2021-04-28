package ejemploPolimorfismo;

/**
 * Creado por @autor: angel
 * El  28 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public abstract class Animal {
    private String nombre;

    // Constructores (Es abstracta la clase pero usamos los constructores para darle valores iniciales a los atributos desde las subClases)
    public Animal() {
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return " nombre='" + nombre;
    }

    public abstract void hablar(); // Método abstracto
}
