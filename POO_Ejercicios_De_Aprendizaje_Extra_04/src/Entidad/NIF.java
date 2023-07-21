/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author erik_
 */
public class NIF {

    private long DNI;
    private String[] letra = new String[23];

    public NIF() {
    }

    public NIF(long DNI) {
        this.DNI = DNI;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String[] getLetra() {
        return letra;
    }

    public void setLetra(String[] letra) {
        this.letra = letra;
    }

}
