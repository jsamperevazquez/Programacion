
package exemploclasesconobxetos;

public class Ordenador {
    private float prezo;
    private CPU cpu = new CPU();
    private Pantalla pantalla = new Pantalla();
    private Rato raton = new Rato();

    public Ordenador() {
    }

    public Ordenador(float prezo, CPU c, Pantalla p, Rato raton) {
        this.prezo = prezo;
        cpu = c;
        pantalla = p;
        this.raton = raton;
    }

    public float getPrezo() {
        return prezo;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public Rato getRaton() {
        return raton;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public void setRaton(Rato raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "prezo=" + prezo + ", cpu=" + cpu + ", pantalla=" + pantalla + ", raton=" + raton + '}';
    }
}
