/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jpa_libreria;

import Persistencia.DAO;
import Servicios.ServicioAutor;
import Servicios.ServicioEditorial;
import Servicios.ServicioLibro;

/**
 *
 * @author erik_
 */
public class JPA_Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DAO dao = new DAO();
        ServicioAutor serv = new ServicioAutor();
        ServicioEditorial servE = new ServicioEditorial();
        ServicioLibro servL = new ServicioLibro();
        
//        serv.insertAutor();
//        servE.insertEditorial();
//        servL.insertLibro();
//dao.corregir();
        serv.eliminarAutor();
        
    }
    
}
