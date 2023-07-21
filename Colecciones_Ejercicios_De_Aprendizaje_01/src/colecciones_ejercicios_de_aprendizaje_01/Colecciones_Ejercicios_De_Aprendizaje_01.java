/*
    1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
    programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    salir, se mostrará todos los perros guardados en el ArrayList.
 */
package colecciones_ejercicios_de_aprendizaje_01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class Colecciones_Ejercicios_De_Aprendizaje_01 {

    /**
     * @param args the command line arguments
     */
    private static final Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> perros = new ArrayList<>();

        int op;

        do {
            op = menu();
            switch (op) {
                case 1:
                    System.out.println("Ingrese una raza de perro");
                    perros.add(leer.next());
                    break;
                case 2:
                    System.out.println("TERMINA EL PROGRAMA");
                    System.out.println(perros);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (op !=2);
 

    }

    public static int menu() {

        System.out.println("1.-Agregar razas");
        System.out.println("2.-Salir");
        System.out.println("Elija una opcion");
        return leer.nextInt();

    }
}
