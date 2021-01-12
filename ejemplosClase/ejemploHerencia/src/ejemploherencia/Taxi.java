/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

/**
 *
 * @author angel
 */
public class Taxi extends Vehiculo {
    private String numeroLicencia;

    public Taxi() {
    }

    public Taxi(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public Taxi(String numeroLicencia, String matricula, String modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.numeroLicencia = numeroLicencia;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    @Override
    public String toString() {
        return  super.toString()+ " numeroLicencia=" + numeroLicencia;
    }

  
}
