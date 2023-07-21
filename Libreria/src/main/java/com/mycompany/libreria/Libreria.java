/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libreria;

import Servicios.ServerAutor;
import javax.persistence.Persistence;

/**
 *
 * @author irina
 */
public class Libreria {

    public static void main(String[] args) {
        ServerAutor serv = new ServerAutor();
        
        serv.insertAutor();
    }
}
