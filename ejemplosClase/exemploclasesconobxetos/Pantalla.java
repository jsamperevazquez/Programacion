
package exemploclasesconobxetos;

public class Pantalla {
    private float pulgadas;
    
    public Pantalla(){
        
    }

    public Pantalla(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Pantalla{" + "pulgadas=" + pulgadas + '}';
    }
}
