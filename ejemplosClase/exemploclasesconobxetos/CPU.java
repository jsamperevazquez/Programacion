
package exemploclasesconobxetos;

public class CPU {
    private float velocidade;
    private String marca;

    public CPU() {
    }

    public CPU(float velocidade, String marca) {
        this.velocidade = velocidade;
        this.marca = marca;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "CPU{" + "velocidade=" + velocidade + ", marca=" + marca + '}';
    }
}
