/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!.
 */
package poo_ejercicios_de_aprendizaje_extra_05;

import Entidades.Variable;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class POO_Ejercicios_De_Aprendizaje_Extra_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Variable V1 = new Variable();
        boolean respuesta = false;
        String mesusuario;
        
        
        do {

            System.out.println("Ingrese el mes secreto");
            mesusuario = leer.nextLine();

            respuesta = V1.mesSecreto(mesusuario);

        } while (respuesta == false);

    }

}
