package boletin16_04;

import java.util.Locale;

/**
 * Creado por @autor: angel
 * El  11 de feb. de 2021.
 **/
public class Texto {
    static String texto = "javeros";

    public static String cambiar_A_Mayusculas() {
        texto = texto.toUpperCase(Locale.ROOT); // Con la función toUpperCase(Locale.ROOT) cambias el String a mayúsculas
        return texto;
    }

    public static String cambiar_A_Minusculas() {
        texto = texto.toLowerCase(Locale.ROOT);  //Con la función toLowerCase(Locale.ROOT) cambias el String a minúsculas
        return texto;
    }
}

