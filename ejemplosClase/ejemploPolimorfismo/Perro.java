package ejemploPolimorfismo;

/**
 * Creado por @autor: angel
 * El  28 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Perro extends Animal{
    private String raza;

    //Constructor (El constructor de la superClase no se hereda)

    public Perro(String nombre, String raza) {
        super(nombre); // Con estas sentencia damos valor al atributo de la superClase
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void andar(){
        System.out.println("El perro anda");
    }
    @Override
    public void hablar() {
        System.out.println("Guau guau");

    }
    // To String
    @Override
    public String toString() {
        return
                super.toString() +
                " raza= '" + raza;
    }
}
