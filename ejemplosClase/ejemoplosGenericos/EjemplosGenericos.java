package ejemoplosGenericos;

/**
 * Creado por @autor: angel
 * El  07 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class EjemplosGenericos <T>{
    private T dato;

    public void setDato(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }
}
