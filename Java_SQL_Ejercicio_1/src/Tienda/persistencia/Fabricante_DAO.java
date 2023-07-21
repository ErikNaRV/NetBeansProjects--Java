/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.persistencia;

import Tienda.entidades.Fabricante;

/**
 *
 * @author erik_
 */
public class Fabricante_DAO extends DAO {
    
    //Ingresar un producto a la base de datos.
    public void ingresarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el FABRICANTE");
            }
            String sql = "INSERT INTO fabricante (codigo, nombre) "
                    + "VALUES ( " + fabricante.getCodigo() + " , '" + fabricante.getNombre() + "')";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    
}
