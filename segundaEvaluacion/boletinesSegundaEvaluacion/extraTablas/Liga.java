package extraTablas;

/**
 * Creado por @autor: angel
 * El  11 de feb. de 2021.
 **/
public class Liga {
    static String[] equipos = {"Barcelona", "Atletico", "R.Madrid", "R.Sociedad", "Sevilla", "Villareal", "Levante", "Betis", "Athletic", "Valencia", "Celta", "Granada", "Osasuna", "Valladolid", "Cadiz", "Alaves", "Eibar", "Elche", "Huesca", "Getafe"};
    static int[][] golesJornadas = new int[20][36];
    static int[] cantidadGoles = new int[20];
    static String [] equiposMasGoleadores=new String[36];
    static int[] maxGolesJornada=new int[36];
    static int mayor,menor,filaMayor,filaMenor,colMayor,colMenor;
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

    public static int[] sumarGolesTodasJornada() {
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

    public static void ordenarMenorMayorGolesTotales(int[] lista) {
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
    public static void buscarMayorGolesJornada(int [][] tabla, String [] lista){
        mayor=menor=tabla[0][0];
        filaMayor = filaMenor = colMenor = colMayor=0;
        int auxiliar=0;
        String auxiliarEquipo="";
        int contador=0;
        System.out.println("\n");
        for (int j = 0; j < 36; j++) {
            for (int i = 0; i <20 ; i++) {
                if (tabla[i][j]>mayor|| tabla[i][j]==mayor) {
                mayor=tabla[i][j];
                auxiliarEquipo=lista[i];
                }
                }
            System.out.println("El equipo que más goles ha marcado en la jornada" + (j+1) + " ha sido el " + auxiliarEquipo + " Con " + mayor + " goles");
            }
        }


            }


