package boletin12;

/**
 * Creado por @autor: Usuario
 * El 13/01/2021
 **/
public class Coche {
private String matricula;

public Coche(){
}

    @Override
    public String toString() {
        return "Matricula= " + matricula;
    }

    public Coche(String matricula){
    this.matricula=matricula;
}
}
