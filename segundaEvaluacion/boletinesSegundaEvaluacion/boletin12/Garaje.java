package boletin12;

/**
 * Creado por @autor: Usuario
 * El 13/01/2021
 **/
public class Garaje {
    private float tiempo;
    private Coche Coche;
    private  static int numeroCoches;
    public static final int COMPLETO=5;


    public Garaje() {
    }

    public Garaje(boletin12.Coche coche) {
        Coche = coche;
    }

    public Garaje(float tiempo, boletin12.Coche coche) {
        this.tiempo = tiempo;
        Coche = coche;
    }

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public boletin12.Coche getCoche() {
        return Coche;
    }

    public void setCoche(boletin12.Coche coche) {
        Coche = coche;
    }

    @Override
    public String toString() {
        return "Garaje{" +
                "tiempo=" + tiempo +
                ", Coche=" + Coche +
                '}';
    }

    public void comprobarSitio(){
        if (numeroCoches<COMPLETO) {
            System.out.println("Plazas disponibles");


        }

            else
            System.out.println("Completo");
    }

}
