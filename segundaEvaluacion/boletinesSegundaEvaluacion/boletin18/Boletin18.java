package boletin18;

import libreriaAngel.ValidarDatos;

/**
 * Creado por @autor: angel
 * El  25 de feb. de 2021.
 **/
public class Boletin18 {
    public static void main(String[] args) {
        int opcion;

        do {
            opcion = ValidarDatos.validarIntMenorQueCero("****  MENÚ  *****\n" +
                    "Elige una opción: \n" +
                    "1---Crear y enviar correo\n" +
                    "2---Recoger correos en buzón\n"+
                    "3---Ver numero de correos de bandeja\n" +
                    "4---Ver primer correo sin leer\n" +
                    "4---salir");
            switch (opcion) {
                case 1:

                    Correo.crearCorreo();
                    break;
                case 2:
                    Buzon.añadir(Correo.correo);
                    break;
                case 3:
                    Buzon.numeroDeCorreos();
                    break;
                case 4:
                    Buzon.mostrarPrimeroNoLeido();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (opcion != 5);

    }
}
