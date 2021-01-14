package boletin12;

/**
 * Creado por @autor: Angel
 * El 13/01/2021
 * Clase para instanciar objetos de tipo coche
 **/
public class Coche {
    /**
     * Matrícula del coche
     */
    private String matricula;

    public Coche() {
    }

    @Override
    public String toString() {
        return "Matricula= " + matricula;
    }

    public Coche(String matricula) {
        this.matricula = matricula;
    }
}
