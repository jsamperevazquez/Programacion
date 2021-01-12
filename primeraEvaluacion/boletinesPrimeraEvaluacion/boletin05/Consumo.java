/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin05;

import java.text.DecimalFormat;

/**
 * Clase para hacer diferentes pruebas en vehiculos
 *
 * @author angel
 * @version 0.0.1
 */
public class Consumo {
    /**
     * Kilometros recorridos por vehículo
     */
    private double kmRecorrido;
    /**
     * Precio estipulado de la gasolina
     */
    private double prezoGasolina = 1.57;
    /**
     * Velocidad media del vehículo
     */
    private float velMedia;
    /**
     * litros que consume el vehículo
     */
    private float litros;


    // Creo los constructores

    public Consumo() {
    }

    /**
     * Construcutor parametrizado con todos los atributos
     *
     * @param kR       son los Kms recorrdidos
     * @param lit      son los litros consumidos
     * @param velM     es la velocidad media del vehículo
     * @param pGasolin es el precio de la gasolina
     */
    public Consumo(double kR, float lit, float velM, double pGasolin) {
        kmRecorrido = kR;
        litros = lit;
        prezoGasolina = pGasolin;
        velMedia = velM;
    }
    // Creo los métodos Set y Get
    //SET

    public void setKms(double Kmreco) {
        kmRecorrido = Kmreco;
    }

    public void setLitros(float litrosC) {
        litros = litrosC;
    }

    public void setPGas(double prezoGas) {
        prezoGasolina = prezoGas;
    }

    //GET

    public double getkmRecorrido() {
        return kmRecorrido;
    }

    public float getlitros() {
        return litros;
    }

    public double getprezoGasolina() {
        return prezoGasolina;
    }

    public float getvelMedia() {
        return velMedia;
    }

    // Creo los métodos con instrucciones 

    /**
     * Método para medir el tiempo tardado en recorrer un espacio concreto.
     * Divide el espacio recorrido entre la velocidad
     *
     * @return retorna el tiempo medio
     */
    public double getTempo() {
        double tempo = kmRecorrido / velMedia;
        DecimalFormat formato2dec = new DecimalFormat("#.00");
        System.out.println("Ha tardado en hacer el recorrido: " + formato2dec.format(tempo) + " horas");
        return tempo;
    }

    /**
     * Método que retorna el consumo medio del vehiculo a los cien Kms
     * Multiplica los litros por cien y lo divide por el espacio recorrido
     *
     * @return retorna el consumo del vehículo
     */
    public double consumoMedio() {
        double consumo = litros * 100 / kmRecorrido;
        DecimalFormat formato2dec = new DecimalFormat("#.00");
        System.out.println("Ha hecho un consumo medio de: " + formato2dec.format(consumo) + " Litros a los 100 KMS");
        return consumo;
    }

    /**
     * Método que mide el consumo en €
     * Multiplica el precio de la gasolina por el consumo medio del vehículo.
     *
     * @return el coste total del trayecto recorrido.
     */
    public double consumoEuros() {
        //double costeEuros = (litros * 100 / kmRecorrido)* prezoGasolina;
        double costeEuros = prezoGasolina * consumoMedio();
        DecimalFormat formato2dec = new DecimalFormat("#.00");
        System.out.println("El coste en € a los 100 kms ha sido de:" + formato2dec.format(costeEuros) + " Euros");
        return costeEuros;
    }

}
