/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.HashMap;

/**
 *
 * @author erik_
 */
public class Producto {
    
    private  HashMap<String,Integer> producto = new HashMap<String,Integer>();

    public Producto() {
    }

    public HashMap<String, Integer> getProducto() {
        return producto;
    }

    public void setProducto(String nombre, Integer precio) {
        this.producto.put(nombre, precio);
    }

    @Override
    public String toString() {
        return   "Producto = "+"/" + producto + "\n/";
    }
    
    
    
}
