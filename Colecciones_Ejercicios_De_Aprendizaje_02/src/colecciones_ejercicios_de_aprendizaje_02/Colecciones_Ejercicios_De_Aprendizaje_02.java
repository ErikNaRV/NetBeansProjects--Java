/*
    2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
    un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
    está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
    ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
    la lista ordenada.
 */
package colecciones_ejercicios_de_aprendizaje_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class Colecciones_Ejercicios_De_Aprendizaje_02 {

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
                    System.out.println("Ingrese la raza a eliminar");
                    String borrarRaza = leer.next();
                    Iterator p = perros.iterator();
                    int i =0;
                    while (p.hasNext()) {
                        if (p.next().equals(borrarRaza)) {

                            p.remove();
                            i++;
                        }
                        
                    }
                    if(i>0){
                        System.out.println("Si se encontro la raza y se removio");
                       
                    }else{
                        System.out.println("No se encontro la raza y no se removio");
                    }
                                        
                    System.out.println(perros);
                    break;
                case 3:
                    System.out.println("TERMINA EL PROGRAMA");
                    System.out.println(perros);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (op != 2);

    }

    public static int menu() {

        System.out.println("1.-Agregar razas");
        System.out.println("2.-Eliminar una raza");
        System.out.println("3.-Salir");
        System.out.println("Elija una opcion");
        return leer.nextInt();

    }

}
