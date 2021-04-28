package ejemploPolimorfismo;

import java.util.ArrayList;

/**
 * Creado por @autor: angel
 * El  28 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Metodos {
    public static void  habla(ArrayList<Animal> lista){
        for (Animal ele:lista){
            ele.hablar();
        }
    }
}
