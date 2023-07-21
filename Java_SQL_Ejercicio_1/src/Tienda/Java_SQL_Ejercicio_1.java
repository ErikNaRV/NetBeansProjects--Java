/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tienda;


import Tienda.servicios.Producto_servicio;
/**
 *
 * @author erik_
 */
public class Java_SQL_Ejercicio_1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        
        Producto_servicio Ps = new Producto_servicio();
        
        Ps.menuServicioProducto();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
////Lista el nombre de todos los productos que hay en la tabla producto.
//        System.out.println("\nLista el nombre de todos los productos que hay en la tabla producto.\n");
//        
//        Producto_DAO productoDAO = new Producto_DAO();
//        
//        productoDAO.consultas();
//        
//        for (Producto arg : productoDAO.consultarProductos()) {
//            System.out.println(arg.getNombre());
//        }
////Lista los nombres y los precios de todos los productos de la tabla producto.
//        System.out.println("\nLista los nombres y los precios de todos los productos de la tabla producto.\n");
//        
//        for (Producto arg : productoDAO.consultarProductosPrecio()) {
//            System.out.println(arg.getNombre() + " =======> " + arg.getPrecio());
//        }
//        
//        productoDAO.consultasPrecioNombre();
//
//        //Listar aquellos productos que su precio esté entre 120 y 202.
//        System.out.println("\nListar aquellos productos que su precio esté entre 120 y 202.\n");
//        
//        for (Producto arg : productoDAO.consultarProductosRangoPrecio()) {
//            System.out.println(arg.getNombre() + " =======> " + arg.getPrecio());
//        }
//        productoDAO.consultasPrecioNombreRango();
//
//        //Buscar y listar todos los Portátiles de la tabla producto. 
//        System.out.println("\nBuscar y listar todos los Portátiles de la tabla producto. \n");
//       
//        
//        for (Producto arg : productoDAO.consultarProductosLaptop()) {
//            
//            System.out.println(arg.getNombre());
//        }
//        
//        productoDAO.consultasPROLaptop();
//
//        // Listar el nombre y el precio del producto más barato.
//        System.out.println(" \nListar el nombre y el precio del producto más barato.\n");
//        
//        for (Producto arg : productoDAO.consultarProductosBarato()) {
//            
//            System.out.println(arg.getNombre() + " =======> " + arg.getPrecio());
//        }
//        
//        productoDAO.consultasPROBarato();

        //Ingresar un producto a la base de datos
//        System.out.println("\nIngresar un producto a la base de datos\n");
//                
//        Producto producto1 = new Producto(14, "Parlantes", 5, 1);
//        
//        productoDAO.ingresarProducto(producto1);
        
//        // Ingresar un fabricante a la base de datos
//        System.out.println("\nIngresar un fabricante a la base de datos\n");
//        
//        Fabricante_DAO fabricanteDAO = new Fabricante_DAO();
//                
//        Fabricante fabricante1 = new Fabricante(10,"HyperX");
//        
//        fabricanteDAO.ingresarFabricante(fabricante1);
        
        // Editar un producto con datos a elección.
//        
//        System.out.println("\nEditar un producto con datos a elección.\n");
//        
//     Producto producto1 = new Producto(14, "Set de Audio", 40, 5);
//     
//        productoDAO.modificarProducto(producto1);
        
       
        
        
        
    }
    
}
