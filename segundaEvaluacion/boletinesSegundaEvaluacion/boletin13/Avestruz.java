package boletin13;

/**
 * Creado por @autor: angel
 * El  18 de ene. de 2021.
 **/
public class Avestruz extends Aves implements IPodeCamiñar {
    private float largoPatas;

    public Avestruz() {
    }
    public Avestruz(Float largoPatas){
        super("Australia");
        this.largoPatas=largoPatas;
    }
}
