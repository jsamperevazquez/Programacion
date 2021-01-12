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
public class EjemploObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instancio un objeto tipo Rectangulo para poder acceder a la clase Rectangulo
        Rectangulo objRec1 = new Rectangulo();
        float altura=objRec1.altura;
        System.out.println("altura --- " + altura);// Se puede ver la altura porque está declarada como public en la clase Rectángulo, la base está como privada y solo es accesible en la propia clase.
        objRec1.visualizar();// Con esto accedemos al método visualizar y accedemos a los atributos del método.
    }
    
}
