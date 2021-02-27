package boletin18;

import libreriaAngel.ValidarDatos;

/**
 * Creado por @autor: angel
 * El  25 de feb. de 2021.
 **/
public class Boletin18 {
    /**
     *
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        /**
         * Variable para el control de la opción del swith case
         */
        int opcion;
        /**
         * Menú para elegir las diferentes opciones con los correos electrónicos
         */
        do {
            opcion = ValidarDatos.validarIntMenorQueCero("****  MENÚ  *****\n" +
                    "Elige una opción: \n" +
                    "1---Crear correo\n" +
                    "2---Recoger correos en buzón\n" +
                    "3---Ver numero de correos de bandeja\n" +
                    "4---Comprobar si hay correos sin leer\n" +
                    "5---Ver primer correo sin leer\n" +
                    "7---Elimina correo no deseado\n" +
                    "7---salir");
            switch (opcion) {
                case 1:
                    Correo.crearCorreo();
                    break;
                case 2:
                    Correo.enviarCorreo();
                    break;
                case 3:
                    Buzon.numeroDeCorreos();
                    break;
                case 4:
                    boolean comprobarSinLeer;
                    comprobarSinLeer=Buzon.porLeer();
                    break;
                case 5:
                    String recoger;
                    recoger=Buzon.mostrarPrimeroNoLeido();
                    break;
                case 6:
                    int correoEliminar = ValidarDatos.validarIntMenorQueCero("Numero de correo a eliminar");
                    Buzon.elimina(correoEliminar);
                case 7:
                    System.exit(0);
            }
        } while (opcion != 7);

    }
}
