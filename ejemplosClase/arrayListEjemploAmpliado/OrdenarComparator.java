package arrayListEjemploAmpliado;

import java.util.Comparator;

/**
 * Creado por @autor: angel
 * El  23 de feb. de 2021.
 **/
public class OrdenarComparator implements Comparator<Alumno> {
    @Override
    public int compare(Alumno al1, Alumno al2) {
        // return al1.getNotaAlumno() - al2.getNotaAlumno();
        if (al1.getNotaAlumno()< al2.getNotaAlumno())
            return -1;
        else if (al1.getNotaAlumno()> al2.getNotaAlumno())
            return 1;
        else
            return 0;
    }
}
