package davlg.eggPoo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author david
 */
public class ejecutarArreglos {

    /**
     * 10. Realizar un programa en Java donde se creen dos arreglos: el primero
     * será un arreglo A de 50 números reales, y el segundo B, un arreglo de 20
     * números, también reales. El programa deberá inicializar el arreglo A con
     * números aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe
     * ordenar de menor a mayor y copiar los primeros 10 números ordenados al
     * arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el
     * valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
     * elementos y el combinado de 20.
     */
    public static void main(String[] args) {

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        System.out.println(" Arreglo generado aleatoriamente ");
        Random rand = new Random();
        Arrays.setAll(arregloA, i -> rand.nextDouble());
        System.out.println();
        for (double element : arregloA) {
            System.out.printf("    %.3f\n", element);
        }

        System.out.println();
        Arrays.sort(arregloA);
        System.out.println(" Luego de ordenar, arregloA: ");
        System.out.println();
        for (double element : arregloA) {
            System.out.printf("    %.3f\n", element);
        }

        System.out.println();
        System.arraycopy(Arrays.copyOf(arregloA, 10), 0,
                arregloB, 0, 10);
        Arrays.fill(arregloB, 10, 20, 0.5);
        System.out.println(" Llenado de arregloB: ");
        System.out.println();
        for (double element : arregloB) {
            System.out.printf("    %.3f\n", element);
        }
        System.out.println();
    }

}
