/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Autor;
import Persistencia.DAOAutor;
import java.util.Scanner;



/**
 *
 * @author irina
 */
public class ServerAutor {
    DAOAutor dao ;
    Scanner scaner = new Scanner(System.in);

    public ServerAutor() {
        this.dao = new DAOAutor();
    }
    
    
    
    public void insertAutor(){

        Autor autor = new Autor();
        System.out.print(" INGRESE EL NOMBRE DEL AUTOR: ");
        autor.setNombre(scaner.nextLine());
        
        dao.guardar(autor);
        
    }
}
