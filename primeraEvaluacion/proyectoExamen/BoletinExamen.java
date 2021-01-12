package proyectoExamen;

/**
 * Creado por @autor: angel
 * El  17 de nov. de 2020.
 * Clase con método main para instanciar objetos de tipo Docentes
 * @version 0.0.1
 **/
public class BoletinExamen {
    public static void main(String[] args) {

        Docentes docente1 = new Docentes();
        docente1.infoDocente(docente1);
        docente1.calculoSueldoBruto(docente1);
        docente1.calcularSueldoNeto(docente1);

    }
}
