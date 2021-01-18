package boletin13;

/**
 * Creado por @autor: angel
 * El  18 de ene. de 2021.
 **/
public class Tigre extends Felino {
    private String claseTigre;

    public Tigre (){}

    public Tigre(int numeroPatas, String familiaAnimal, String familiaFelino, String claseTigre) {
        super(numeroPatas, familiaAnimal, familiaFelino);
        this.claseTigre = claseTigre;
    }
}
