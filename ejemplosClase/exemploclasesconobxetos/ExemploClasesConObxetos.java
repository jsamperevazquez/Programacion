
package exemploclasesconobxetos;

import javax.swing.JOptionPane;

public class ExemploClasesConObxetos {

    public static void main(String[] args) {
        float prezo = lerFloat("teclea prezo: ");
        float pulgadas = lerFloat("teclea pulgadas");
        String marca = lerString("teclea marca: ");
        String conexion = lerString("teclea conexion: ");  
        float velocidade = lerFloat("teclea velocidade: ");
        CPU c = new CPU(velocidade, marca);
        Pantalla p = new Pantalla(pulgadas);
        Rato r = new Rato(conexion);
        
        Ordenador obxOrd = new Ordenador(prezo,c,p,r);
        System.out.println(obxOrd);
        velocidade = lerFloat("velocidade = ");
        obxOrd.getCpu().setVelocidade(velocidade);
        System.out.println(obxOrd.toString());
    }
    
    public static String lerString(String mensaxe){
        return JOptionPane.showInputDialog(mensaxe);
    }
    
    public static float lerFloat(String mensaxe){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
    }
}
