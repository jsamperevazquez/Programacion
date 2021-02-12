package extraTablas;

/**
 * Creado por @autor: angel
 * El  11 de feb. de 2021.
 **/
public class Liga {
    static String[] equipos={"Barcelona","Atletico","R.Madrid","R.Sociedad","Sevilla","Villareal","Levante","Betis","Athletic","Valencia","Celta","Granada","Osasuna","Valladolid","Cadiz","Alaves","Eibar","Elche","Huesca","Getafe"};
    static int [][] golesJornadas=new int[20][36];

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

    public static int[][] crearTabla(){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j <36 ; j++) {
                golesJornadas[i][j]=(int)(Math.random() * (9 - 0)+0);

            }

        }
   return golesJornadas;
    }
    public static void mostrarGoles(int[][] tabla){
        for (int i = 0; i <20 ; i++) {
            System.out.println("\n");
            System.out.print(equipos[i]+ "         ");
            for (int j = 0; j <36 ; j++) {
                System.out.print(golesJornadas[i][j] + " ");
            }

        }
    }
    public static void ordenarGolesMenorMayor(){
        int auxiliar=0;
        for (int i = 0; i <golesJornadas.length; i++) {
                auxiliar=0;
            for (int j = 0; j <golesJornadas[i].length ; j++) {
                auxiliar=auxiliar+golesJornadas[i][j];
            }
        }
    }
}
