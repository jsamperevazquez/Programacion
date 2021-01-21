package ejemploExcepciones;

/**
 * Creado por @autor: angel
 * El  21 de ene. de 2021.
 **/
public class NuestraExcpcion extends Exception {
    public NuestraExcpcion(){
        super();
    }
    public NuestraExcpcion(String mensaje){
        super(" Tienes un error " + mensaje);
    }
}
