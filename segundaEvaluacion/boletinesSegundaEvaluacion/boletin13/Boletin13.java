package boletin13;

/**
 * Creado por @autor: angel
 * El  19 de ene. de 2021.
 **/
public class Boletin13 {
    public static void main(String[] args) {
        Gato gato1 = new Gato(4,"Carnivoro","Felis silvestris catus","Siamés");
        gato1.verVelocidad();

        Murcielago murcielago1 = new Murcielago(2,"mamifero placentero","Panamá");
        murcielago1.verAlturaVuelo();

        Tigre tigre1 = new Tigre(4,"Carnivoro","Pantera tigris","Sumatra");
        tigre1.verDistancia();

    }
}
