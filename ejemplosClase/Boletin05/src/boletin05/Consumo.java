/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin05;

import java.text.DecimalFormat;

/**
 *
 * @author angel
 */
public class Consumo {

    private double kmRecorrido;
    private double prezoGasolina = 1.57;
    private float velMedia,litros;
    
    
    // Creo los constructores
    
    public Consumo(){
    }
    
    public Consumo (double kR,float lit,float velM,double pGasolin){
        kmRecorrido = kR;
        litros = lit;
        prezoGasolina = pGasolin;
        velMedia = velM;
      }              
    // Creo los métodos Set y Get
    //SET
    public void setKms (double Kmreco){
        kmRecorrido = Kmreco;
    }
    public void setLitros (float litrosC){
        litros = litrosC;
    }
    public void setPGas (double prezoGas){
        prezoGasolina = prezoGas ;
    }

    //GET

    public double getkmRecorrido (){
        return kmRecorrido;
        }

    public float getlitros (){
        return litros;
        }

    public double getprezoGasolina (){
        return prezoGasolina;
    }
    public float getvelMedia (){
        return velMedia;        
    }

    // Creo los métodos con instrucciones 
    
    public double getTempo (){
        double tempo= kmRecorrido / velMedia;
        DecimalFormat formato2dec = new DecimalFormat("#.00");
        System.out.println("Ha tardado en hacer el recorrido: " + formato2dec.format(tempo) + " horas");
        return tempo;
    }
    public double consumoMedio (){
        double consumo = litros * 100 / kmRecorrido;
        DecimalFormat formato2dec = new DecimalFormat("#.00");
        System.out.println("Ha hecho un consumo medio de: " + formato2dec.format(consumo)+ " Litros a los 100 KMS");
        return consumo;
    }
    public double consumoEuros (){
        //double costeEuros = (litros * 100 / kmRecorrido)* prezoGasolina;
        double costeEuros =prezoGasolina * consumoMedio();
        DecimalFormat formato2dec = new DecimalFormat("#.00");
        System.out.println("El coste en € a los 100 kms ha sido de:" + formato2dec.format(costeEuros)+ " Euros");
        return costeEuros;
    }
        
}
