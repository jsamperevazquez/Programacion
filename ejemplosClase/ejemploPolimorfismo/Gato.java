package ejemploPolimorfismo;

/**
 * Creado por @autor: angel
 * El  28 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Gato extends Animal{
   private String color;

    // Constructor
    public Gato(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    @Override
    public void hablar() {
        System.out.println("Miau miau");
    }

    @Override
    public String toString() {
        return
                super.toString()+
                " color = '" + color;
    }
}
