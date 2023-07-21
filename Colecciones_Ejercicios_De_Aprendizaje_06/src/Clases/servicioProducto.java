/*
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
    eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
    Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
    Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Clases;


import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class servicioProducto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Producto p = new Producto();

    public void crearProducto() {//introducir un elemento
        String op;
        String llave;
        Integer pu;

        do {

            System.out.println("******************************************");
            System.out.println("*Ingrese el Nombre del Producto y su valor*");
            System.out.println("*******************************************");
            System.out.println(" ");
            System.out.print("Nombre :");
            llave = leer.next();

            System.out.print("Precio :");
            pu = leer.nextInt();

            p.setProducto(llave, pu);
            leer.nextLine();

            System.out.println("******************************************");
            System.out.println("*Desea ingresar un nuevo producto (Si/No)*");
            System.out.println("******************************************");
            System.out.println(" ");

            op = leer.next();
            do {
                if (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no")) {
                    System.out.println("La opcion no es valida ingresela de nuevo");
                    op = leer.next();
                }
            } while (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no"));

        } while (op.equalsIgnoreCase("si"));

    }

    public void menu() {
        int opMenu;
        boolean S = false;
        do{
        System.out.println("///////////////Menu////////////////");
        System.out.println("/------1.- Ingresar producto------/");
        System.out.println("/------2.- Modificar Precio-------/");
        System.out.println("/------3.- Eliminar Producto------/");
        System.out.println("/-4.- Mostrar Lista de Productos--/");
        System.out.println("/------------5.- Salir------------/");
        System.out.println("///////////////////////////////////");
        opMenu = leer.nextInt();
        leer.nextLine();
        switch (opMenu) {
            case 1:
                crearProducto();
                break;
            case 2:
                modificarPrecio();
                break;
            case 3:
                eliminarProducto();
                break;
            case 4:
                mostrarProducto();
                break;
            case 5:
               S = true;
                break;

        }
        }while(S==false);
    }

    public void modificarPrecio() {
        String opcion;
        Integer nuevoPrecio;

        System.out.println("*************************************************************");
        System.out.println("*Ingrese el Nombre del Producto que desea modificar su valor*");
        System.out.println("*************************************************************");
        opcion = leer.nextLine();
        System.out.println("*************************************************************");
        System.out.println("*********Ingrese el nuevo valor de " + opcion + " ***********");
        System.out.println("*************************************************************");
        nuevoPrecio = leer.nextInt();
        

        if (p.getProducto().containsKey(opcion)) {
            p.getProducto().replace(opcion, nuevoPrecio);
        }

    }

    public void eliminarProducto() {
        String productoEliminar;

        System.out.println("*************************************************************");
        System.out.println("******Ingrese el Nombre del Producto que desea eliminar******");
        System.out.println("*************************************************************");
        
        productoEliminar = leer.nextLine();

        p.getProducto().remove(productoEliminar);

    }

    public void mostrarProducto() {

        System.out.println("************************************");
        System.out.println("*****La lista de productos es*******");
        System.out.println("************************************");

        System.out.println(p.getProducto().toString() + "\n");

    }
}
