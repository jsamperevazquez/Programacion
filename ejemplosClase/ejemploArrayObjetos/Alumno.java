package ejemploArrayObjetos;

/**
 * Creado por @autor: angel
 * El  30 de ene. de 2021.
 **/
public class Alumno implements Comparable {
    private String nombre;
    private int nota;
    private String dni;

    public Alumno() {
    }

    public Alumno(String nombre, int nota, String dni) {
        this.nombre = nombre;
        this.nota = nota;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return
                "nombre= " + nombre +
                " nota= " + nota +
                " dni= " + dni;
    }

    @Override
    public int compareTo(Object o) {
        Alumno al= (Alumno) o; // esto castea o a Alumno
        if (this.dni.compareToIgnoreCase(al.dni)<0)
            return -1;
        else if (dni.compareToIgnoreCase(al.dni)>0)
            return 1;
        else
            return 0;
    }
}
