/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arearectangulo;

/**
 *
 * @author angel
 */
public class AreaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base = 4.5f;// pongo f para que lo tome como float, porque si no lo tomaría como double
        float altura = (float) 2.5;// Esto es castear; se hace porque por defecto es double.
        float area;
        
        area = base*altura;
        System.out.println("El área del cuadrado es  " + area);
    }
    
}
