/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjeto;

/**
 *
 * @author angel
 */
public class Rectangulo {
    //Atributos
    private float base;
    public float altura;
    
    //Constructores
    public Rectangulo() {
    }
    public Rectangulo(float b, float al) {
        base = b;
        altura = al;
    }
    
    //metododos de acceso setters y getters
    public void setBase(float b){
        base = b;
    }
    public float getBase(){
        return base;
    }
    public void setAltura(float al){
        altura=al;
    }
    public float getAltura(){
        return altura;
    }

    
    //Metodos
    public void visualizar(){
        System.out.println("base= " + base + "altura= " + altura);
    }
    
    public float calcularArea (float base,float altura){
        float area = base*altura;
            return area;
    }
}
    