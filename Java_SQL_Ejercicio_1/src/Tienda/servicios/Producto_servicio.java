/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.servicios;

import Tienda.entidades.Fabricante;
import Tienda.entidades.Producto;
import Tienda.persistencia.Fabricante_DAO;
import Tienda.persistencia.Producto_DAO;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class Producto_servicio {

    Scanner leer = new Scanner(System.in);
    Producto producto1 = new Producto();
    Fabricante_DAO fabricanteDAO = new Fabricante_DAO();
    Fabricante fabricante1 = new Fabricante();

    public void menuServicioProducto() throws Exception {
        Producto_DAO productoDAO = new Producto_DAO();
        int op = 0;

        do {
            System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓-Menu-▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
            System.out.println("▒-------------------------Elija una opcion-----------------------------▒");
            System.out.println("▒1) Lista de los nombres de todos los productos .                      ▒\n"
                    + "▒2) Lista de los nombres y los precios de todos los productos.         ▒\n"
                    + "▒3) Lista de aquellos productos que su precio esté entre 120 y 202.    ▒\n"
                    + "▒4) Buscar y listar todos los Portátiles.                              ▒\n"
                    + "▒5) Listar el nombre y el precio del producto más barato.              ▒\n"
                    + "▒6) Ingresar un producto a la base de datos.                           ▒\n"
                    + "▒7) Ingresar un fabricante a la base de datos.                         ▒\n"
                    + "▒8) Editar un producto con datos a elección.                           ▒\n"
                    + "▒9) Salir.                                                             ▒\n"
                    +"▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");

            op = leer.nextInt();
            switch (op) {
                case 1:
                    //Lista el nombre de todos los productos que hay en la tabla producto.

                    productoDAO.consultarProductos();

                case 2:
                    //Lista los nombres y los precios de todos los productos de la tabla producto.

                    productoDAO.consultasPrecioNombre();

                    break;
                case 3:

                    //Listar aquellos productos que su precio esté entre 120 y 202.
                    productoDAO.consultasPrecioNombreRango();

                    break;
                case 4:

                    //Buscar y listar todos los Portátiles de la tabla producto. 
                    productoDAO.consultasPROLaptop();

                    break;
                case 5:

                    // Listar el nombre y el precio del producto más barato.
                    for (Producto arg : productoDAO.consultarProductosBarato()) {

                        System.out.println(arg.getNombre() + " =======> " + arg.getPrecio());
                    }

                    break;
                case 6:
                    //Ingresar un producto a la base de datos

                    System.out.println("\nIngresar un producto a la base de datos\n");
                    System.out.println("\nIngrese el codigo");
                    int Codigo1 = leer.nextInt();
                    System.out.println("\nIngrese el Nombre");
                    String Nombre1 = leer.next();
                    System.out.println("\nIngrese el Precio");
                    Double Precio = leer.nextDouble();
                    System.out.println("\nIngrese el Codigo de fabricante");
                    int CodF = leer.nextInt();

                    producto1.setCodigo(Codigo1);
                    producto1.setNombre(Nombre1);

                    producto1.setPrecio(Precio);
                    producto1.setCodigo_fabricante(CodF);

                    productoDAO.modificarProducto(producto1);
                    productoDAO.ingresarProducto(producto1);

                    break;
                case 7:
                    
                   Fabricante_DAO fabricanteDAO = new Fabricante_DAO();
                    System.out.println("Ingrese el codigo a remplazar");
                
                   fabricante1.setCodigo(leer.nextInt());
                   System.out.println("Ingrese el Nombre de fabricante a remplazar");
                   fabricante1.setNombre(leer.next());
                            
                   fabricanteDAO.ingresarFabricante(fabricante1);
                            
                            
                    break;
                case 8:

                    // Editar un producto con datos a elección.
                    System.out.println("\nEditar un producto con datos a elección.\n");

                    System.out.println("\nIngrese el nuevo codigo");
                    int Codigo2 = leer.nextInt();
                    System.out.println("\nIngrese el nuevo Nombre");
                    String Nombre2 = leer.next();
                    System.out.println("\nIngrese el nuevo Precio");
                    Double Precio2 = leer.nextDouble();
                    System.out.println("\nIngrese el nuevo Codigo de fabricante");
                    int CodF2 = leer.nextInt();

                    producto1.setCodigo(Codigo2);
                    producto1.setNombre(Nombre2);

                    producto1.setPrecio(Precio2);
                    producto1.setCodigo_fabricante(CodF2);

                    productoDAO.modificarProducto(producto1);

                    break;
                
            }
        } while (op != 9);

    }

}
