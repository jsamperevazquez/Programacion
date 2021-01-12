/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesabstractas;

/**
 *
 * @author angel
 */
public  class Triangulo extends Poligono {

    public Triangulo(float base, float altura) {
        super(base, altura);
    }
    
   public float calcularArea(){
    return (super.getBase()*super.getAltura()/2) ;
   }
   
    
}
