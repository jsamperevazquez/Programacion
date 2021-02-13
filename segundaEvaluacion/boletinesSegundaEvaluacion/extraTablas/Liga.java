package extraTablas;

/**
 * Creado por @autor: angel
 * El  11 de feb. de 2021.
 **/
public class Liga {
    static String[] equipos = {"Barcelona", "Atletico", "R.Madrid", "R.Sociedad", "Sevilla", "Villareal", "Levante", "Betis", "Athletic", "Valencia", "Celta", "Granada", "Osasuna", "Valladolid", "Cadiz", "Alaves", "Eibar", "Elche", "Huesca", "Getafe"};
    static int[][] golesJornadas = new int[20][36];
    static int[] cantidadGoles = new int[20];

    public static String[] getEquipos() {
        return equipos;
    }

    public static void setEquipos(String[] equipos) {
        Liga.equipos = equipos;
    }

    public static int[][] getGolesJornadas() {
        return golesJornadas;
    }

    public static void setGolesJornadas(int[][] golesJornadas) {
        Liga.golesJornadas = golesJornadas;
    }

    public static int[][] crearTabla() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 36; j++) {
                golesJornadas[i][j] = (int) (Math.random() * (9 - 0) + 0);

            }

        }
        return golesJornadas;
    }

    public static void mostrarGoles(int[][] tabla) {
        for (int i = 0; i < 20; i++) {
            System.out.println("\n");
            System.out.print(equipos[i] + "         ");
            for (int j = 0; j < 36; j++) {
                System.out.print(golesJornadas[i][j] + " ");
            }

        }
    }

    public static int[] sumarGolesJornada() {
        int acumulador = 0;
        System.out.println("\n");
        for (int i = 0; i < golesJornadas.length; i++) {
            acumulador = 0;

            for (int j = 0; j < golesJornadas[i].length; j++) {

                acumulador = acumulador + golesJornadas[i][j];
                cantidadGoles[i] = acumulador;
            }
        }
        return cantidadGoles;
    }

    public static void ordenarMenorMayorGoles(int[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] > lista[j]) {
                    int auxiliar = lista[i];
                    String auxiliarEquipo = equipos[i];
                    lista[i] = lista[j];
                    equipos[i] = equipos[j];
                    lista[j] = auxiliar;
                    equipos[j] = auxiliarEquipo;
                }
            }
            System.out.println(" El " + equipos[i] + " ha marcado " + lista[i] + " goles");
        }
    }
}