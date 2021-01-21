package ejemploExcepciones;

/**
 * Creado por @autor: angel
 * El  21 de ene. de 2021.
 **/
public class EjemploExcepciones {
    public static void main(String[] args) {
        DivisionExc objetoDiv = new DivisionExc();
        try {
            objetoDiv.dividirNuestraExcepcion(6, 0);
        }catch (NuestraExcpcion es){
            System.out.println(es.getMessage());
        }
        }
}
