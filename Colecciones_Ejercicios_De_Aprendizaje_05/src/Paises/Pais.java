/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paises;

import java.util.HashSet;

/**
 *
 * @author erik_
 */
public class Pais {
    
    private HashSet<String> Paises = new HashSet<>();

    public Pais() {
    }

    public HashSet<String> getPaises() {
        return Paises;
    }

    public void setPaises(String pais) {
        this.Paises.add(pais);
    }

    @Override
    public String toString() {
        return "Pais{" + "Paises=" + Paises + '}';
    }
    
    
}
