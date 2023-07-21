/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Persistencia.DAOAutor;
import java.util.Scanner;
import Entidades.Autor;
import Persistencia.DAO;
import Persistencia.DAOAutor;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class ServicioAutor {

    DAOAutor dao;

    Scanner scaner = new Scanner(System.in);

    public ServicioAutor() {
        this.dao = new DAOAutor();

    }

    public Autor insertAutor() {

        Autor autor = new Autor();
        System.out.print(" INGRESE EL NOMBRE DEL AUTOR: ");
        autor.setNombre(scaner.nextLine());

        dao.guardar(autor);
        return autor;

    }

    public void eliminarAutor() {

        System.out.println("Ingrese el Id del autor a eliminar: ");

        int IdEliminar = scaner.nextInt();

        dao.eliminar(IdEliminar);

    }

}
