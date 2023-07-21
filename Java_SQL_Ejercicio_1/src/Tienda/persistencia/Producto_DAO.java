/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.persistencia;

import Tienda.entidades.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author erik_
 */
public class Producto_DAO extends DAO {

    //Lista el nombre de todos los productos que hay en la tabla producto.
    public Collection<Producto> consultarProductos() throws Exception {

        try {

            String sql = "SELECT nombre FROM producto";
            consultarBase(sql);
            Producto product = null;
            Collection<Producto> products = new ArrayList();

            while (resultado.next()) {
                product = new Producto();
                product.setNombre(resultado.getString("nombre"));
                products.add(product);
            }
            desconectarBase();
            return products;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

//    public void consultas() throws SQLException, Exception {
//        try {
//            conectarBase(); // Llamada al método conectarBase() para establecer la conexión.
//
//            Statement statement = conexion.createStatement();
//            ResultSet set = statement.executeQuery("select nombre from producto");
//            while (set.next()) {
//                String nombre = set.getString("nombre");
//                System.out.println("Nombre Producto " + nombre);
//            }
//
//            set.close();
//            statement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            desconectarBase(); // Llamada al método desconectarBase() para cerrar la conexión.
//        }
//    }

    //Lista los nombres y los precios de todos los productos de la tabla producto.
    public Collection<Producto> consultarProductosPrecio() throws Exception {

        try {

            String sql = "SELECT nombre,precio FROM producto";
            consultarBase(sql);
            Producto product = null;
            Collection<Producto> products = new ArrayList();

            while (resultado.next()) {
                product = new Producto();
                product.setNombre(resultado.getString("nombre"));
                product.setPrecio(resultado.getDouble("precio"));
                products.add(product);
            }
            desconectarBase();
            return products;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public void consultasPrecioNombre() throws SQLException, Exception {
        try {
            conectarBase(); // Llamada al método conectarBase() para establecer la conexión.

            Statement statement = conexion.createStatement();
            ResultSet set = statement.executeQuery("select nombre,precio from producto");
            while (set.next()) {
                String nombre = set.getString("nombre");
                double precio = set.getDouble("precio");
                System.out.println("Nombre Producto:" + nombre + " " + "Precio:" + precio);
            }

            set.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            desconectarBase(); // Llamada al método desconectarBase() para cerrar la conexión.
        }
    }

    //Listar aquellos productos que su precio esté entre 120 y 202.
    public Collection<Producto> consultarProductosRangoPrecio() throws Exception {

        try {

            String sql = "SELECT nombre,precio FROM producto WHERE precio between 120 and 202";
            consultarBase(sql);
            Producto product = null;
            Collection<Producto> products = new ArrayList();

            while (resultado.next()) {
                product = new Producto();
                product.setNombre(resultado.getString("nombre"));
                product.setPrecio(resultado.getDouble("precio"));

                products.add(product);
            }
            desconectarBase();
            return products;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public void consultasPrecioNombreRango() throws SQLException, Exception {
        try {
            conectarBase(); // Llamada al método conectarBase() para establecer la conexión.

            Statement statement = conexion.createStatement();
            ResultSet set = statement.executeQuery("select nombre,precio from producto WHERE precio between 120 and 202");
            while (set.next()) {
                String nombre = set.getString("nombre");
                double precio = set.getDouble("precio");
                System.out.println("Nombre Producto:" + nombre + " " + "Precio:" + precio);
            }

            set.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            desconectarBase(); // Llamada al método desconectarBase() para cerrar la conexión.
        }
    }

    // Buscar y listar todos los Portátiles de la tabla producto. 
    public Collection<Producto> consultarProductosLaptop() throws Exception {

        try {

            String sql = "SELECT nombre FROM producto WHERE nombre LIKE '%Portátil%' ";
            consultarBase(sql);
            Producto product = null;
            Collection<Producto> products = new ArrayList();

            while (resultado.next()) {
                product = new Producto();
                product.setNombre(resultado.getString("nombre"));
                products.add(product);
            }
            desconectarBase();
            return products;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public void consultasPROLaptop() throws SQLException, Exception {
        try {
            conectarBase(); // Llamada al método conectarBase() para establecer la conexión.

            Statement statement = conexion.createStatement();
            ResultSet set = statement.executeQuery("select nombre from producto WHERE nombre like '%Portatil%'");
            while (set.next()) {
                String nombre = set.getString("nombre");

                System.out.println("Nombre Producto:" + nombre);
            }

            set.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            desconectarBase(); // Llamada al método desconectarBase() para cerrar la conexión.
        }
    }

    //Listar el nombre y el precio del producto más barato
    public Collection<Producto> consultarProductosBarato() throws Exception {

        try {

            String sql = "SELECT nombre,precio FROM producto order by precio ASC LIMIT 1 ";
            consultarBase(sql);
            Producto product = null;
            Collection<Producto> products = new ArrayList();

            while (resultado.next()) {
                product = new Producto();
                product.setNombre(resultado.getString("nombre"));
                product.setPrecio(resultado.getDouble("precio"));
                products.add(product);
            }
            desconectarBase();
            return products;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public void consultasPROBarato() throws SQLException, Exception {
        try {
            conectarBase(); // Llamada al método conectarBase() para establecer la conexión.

            Statement statement = conexion.createStatement();
            ResultSet set = statement.executeQuery("SELECT nombre,precio FROM producto order by precio ASC LIMIT 1");
            while (set.next()) {
                String nombre = set.getString("nombre");
                double precio = set.getDouble("precio");

                System.out.println("Nombre Producto:" + nombre + " " + "Precio:" + precio);
            }

            set.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            desconectarBase(); // Llamada al método desconectarBase() para cerrar la conexión.
        }
    }

    //Ingresar un producto a la base de datos.
    public void ingresarProducto(Producto product) throws Exception {
        try {
            if (product == null) {
                throw new Exception("Debe indicar el producto");
            }
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) "
                    + "VALUES ( " + product.getCodigo() + " , '" + product.getNombre() + "' ," + product.getPrecio()
                    + " ," + product.getCodigo_fabricante() + ")";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    // Editar un producto con datos a elección.
    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE producto SET "
                    + "codigo = " + producto.getCodigo() + ", "
                    + "nombre = '" + producto.getNombre() + "', "
                    + "precio = " + producto.getPrecio() + ", "
                    + "codigo_fabricante = " + producto.getCodigo_fabricante()
                    + " WHERE codigo = " + producto.getCodigo();
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

}
