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
                    "1---Crear correo\n" +
                    "2---Recoger correos en buzón\n" +
                    "3---Ver numero de correos de bandeja\n" +
                    "4---Ver primer correo sin leer\n" +
                    "5---Elimina correo no deseado\n" +
                    "6---salir");
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
                    Buzon.mostrarPrimeroNoLeido();
                    break;
                case 5:
                    int correoEliminar = ValidarDatos.validarIntMenorQueCero("Numero de correo a eliminar");
                    Buzon.elimina(correoEliminar);
                case 6:
                    System.exit(0);
            }
        } while (opcion != 6);

    }
}
