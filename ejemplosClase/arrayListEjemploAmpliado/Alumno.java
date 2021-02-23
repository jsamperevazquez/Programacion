package arrayListEjemploAmpliado;

/**
 * Creado por @autor: angel
 * El  23 de feb. de 2021.
 **/
public class Alumno implements Comparable<Alumno> {

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
    public String toString() {
        return
                "nombreAlumno='" + nombreAlumno +
                " notaAlumno=" + notaAlumno +
                " dni='" + dni ;
    }

    @Override
    public int compareTo(Alumno al) {
        if (this.dni.compareToIgnoreCase(al.dni)>0){
            return 1;
        }else if (this.dni.compareToIgnoreCase(al.dni)<0){
            return -1;
        }else
            return 0;
    }
}
