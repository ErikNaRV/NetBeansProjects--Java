/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.servicios;

import Tienda.entidades.Fabricante;
import Tienda.persistencia.Fabricante_DAO;

/**
 *
 * @author erik_
 */
public class Fabricante_servicio {
    Fabricante_DAO fabricanteDAO = new Fabricante_DAO();
    
    public void ingresarFabricante(Fabricante fabricante1) throws Exception{
        
      fabricanteDAO.ingresarFabricante(fabricante1);
        
      
    }
    
}
