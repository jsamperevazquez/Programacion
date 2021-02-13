package extraTablas;

/**
 * Creado por @autor: angel
 * El  11 de feb. de 2021.
 **/
public class ExtraTablas {
    public static void main(String[] args) {
        Liga.crearTabla();
        Liga.mostrarGoles(Liga.golesJornadas);
        Liga.sumarGolesJornada();
        Liga.ordenarMenorMayorGoles(Liga.cantidadGoles);

    }
}
