package ejemploPolimorfismo;

import java.util.ArrayList;

/**
 * Creado por @autor: angel
 * El  28 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class EjemploPolimorfismo {
    public static void main(String[] args) {


        // Creamos un arrayList para tener una lista con todos los animales
        ArrayList<Animal> listaAnimales = new ArrayList();

        //Instancio en clase Perro
        Perro perro = new Perro("Tobi", "Pastor Alemán");

        // Instancio en clase Perro y gato pero con referencia a Animal
        Animal perro2 = new Perro("bobi", "Palleiro");
        Animal gato = new Gato("Michi", "pintas");

        // añadimos los animales
        listaAnimales.add(perro);
        listaAnimales.add(perro2);
        listaAnimales.add(gato);

        for (int i = 0; i <listaAnimales.size() ; i++) {
            System.out.println("listaAnimales = " + listaAnimales);

        }
        System.out.println(listaAnimales);
        for (Animal ele:listaAnimales){
           ele.hablar(); // LLamamos al método hablar de cada animal (polimorfismo)
        }
        Metodos.habla(listaAnimales);
    }
}
