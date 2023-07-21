/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Editorial;

import Persistencia.DAOEditorial;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class ServicioEditorial {

    DAOEditorial dao;
    Scanner scaner = new Scanner(System.in);

    public ServicioEditorial() {
        this.dao = new DAOEditorial();
    }

    public Editorial insertEditorial() {

        Editorial editorial = new Editorial();
        System.out.print(" INGRESE EL NOMBRE DE LA EDITORIAL: ");
        editorial.setNombre(scaner.nextLine());

        dao.guardar(editorial);
        return editorial;

    }
}
