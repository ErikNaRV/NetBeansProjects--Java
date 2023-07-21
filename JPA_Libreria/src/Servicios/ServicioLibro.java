/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistencia.DAOAutor;
import Persistencia.DAOEditorial;
import Persistencia.DAOLibro;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class ServicioLibro {
    DAOLibro dao ;
    DAOAutor dao1 ;
    DAOEditorial dao2;
    Scanner scaner = new Scanner(System.in);

    public ServicioLibro() {
        this.dao = new DAOLibro();
        this.dao1 = new DAOAutor();
        this.dao2 = new DAOEditorial();
    }
    
    
    
    public void insertLibro(){

        Libro libro = new Libro();
        ServicioAutor SA1 = new ServicioAutor();
        ServicioEditorial SE2 = new ServicioEditorial();
        
        System.out.print(" INGRESE EL TITULO DEL LIBRO: ");
        libro.setTitulo(scaner.nextLine());
        System.out.print(" INGRESE EL AÑO DEL LIBRO: ");
        libro.setAnio(scaner.nextInt());
         System.out.print(" INGRESE EL AUTOR DEL LIBRO: ");
        libro.setAutor(SA1.insertAutor());
         System.out.print(" INGRESE LA EDITORIAL DEL LIBRO: ");
        libro.setEditorial(SE2.insertEditorial());
        dao.guardar(libro); 
    }
    
    
}
