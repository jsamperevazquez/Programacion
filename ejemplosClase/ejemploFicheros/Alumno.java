package ejemploFicheros;

import java.io.Serializable;

/**
 * Creado por @autor: angel
 * El  03 de mar. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Alumno implements Serializable { //siempre hay que implementar serializable para transformar a bytes

    private String nombreAlumno;
    private int notaAlumno;
    private String dni;

    public Alumno() {
    }

    public Alumno(String nombreAlumno, int notaAlumno, String dni) {
        this.nombreAlumno = nombreAlumno;
        this.notaAlumno = notaAlumno;
        this.dni = dni;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public int getNotaAlumno() {
        return notaAlumno;
    }

    public void setNotaAlumno(int notaAlumno) {
        this.notaAlumno = notaAlumno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() { //El toString() tiene que estar bien limpio porque es como nos va a meter los datos en el fichero
        return
                nombreAlumno +","
                +notaAlumno +","+
                dni ;
    }

}
