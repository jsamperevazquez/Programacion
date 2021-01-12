/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploinscodigo;

/**
 *
 * @author angel
 */
public class Coche {
    private float velocidade;
    private String cor;
    private float prezo;
    
    //Creo los constructores de manera automática con el botón derecho soble el codigo e insert code->constructor
    public Coche() {
    }

    public Coche(float velocidade, String cor, float prezo) {
        this.velocidade = velocidade;
        this.cor = cor;
        this.prezo = prezo;
    }
    
    // Creo los getters y setters de manera automática con el botón derecho->insert code->getter setters
    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }
    // Creamos el metodo Override to String que retorna todos los atributos de la clase por defecto
    @Override
    public String toString() {
        return "Coche{" + "velocidade=" + velocidade + ", cor=" + cor + ", prezo=" + prezo + '}';
    }
    
    
}
