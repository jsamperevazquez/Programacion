package ejemploExcepciones;

/**
 * Creado por @autor: angel
 * El  21 de ene. de 2021.
 **/
public class EjemploExcepciones {
    public static void main(String[] args) {
        DivisionExc objetoDiv = new DivisionExc();
            try {
                objetoDiv.dividirPropagandoExcepciones(8,0);
            }catch (ArithmeticException es){
                System.out.println("error"+ es.getMessage());
            }
    }
}
