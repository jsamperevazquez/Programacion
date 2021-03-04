package ejemploFicheros;

/**
 * Creado por @autor: angel
 * El  23 de feb. de 2021.
 **/
public class Alumno  {

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
