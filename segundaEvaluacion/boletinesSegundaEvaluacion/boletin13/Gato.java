package boletin13;

/**
 * Creado por @autor: angel
 * El  18 de ene. de 2021.
 **/
public class Gato extends Felino{
    public String razaGato;

    public Gato(){}

    public Gato(int numeroPatas, String familiaAnimal, String familiaFelino, String razaGato){
        super(numeroPatas,familiaAnimal,familiaFelino);
        this.razaGato=razaGato;
    }
}
