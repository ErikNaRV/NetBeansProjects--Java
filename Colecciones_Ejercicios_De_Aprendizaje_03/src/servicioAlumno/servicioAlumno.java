/*
   En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
    toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
    pregunta al usuario si quiere crear otro Alumno o no.
 */
package servicioAlumno;

import clases.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class servicioAlumno {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> Alumnos = new ArrayList<>();

    public void crearAlumno() {
        String op;

        do {

            Alumno A1 = new Alumno();
            System.out.println("------------------------------");
            System.out.println("-Ingrese el nombre del alumno-");
            System.out.println("------------------------------");
            A1.setNombre(leer.nextLine());
            System.out.println("------------------------------");
            System.out.println("-Ingrese las notas del alumno-");
            System.out.println("------------------------------");
            System.out.println("------------------------------");
            System.out.println("-------Ingrese la nota 1------");
            System.out.println("------------------------------");
            A1.setNotas(leer.nextInt());
            System.out.println("------------------------------");
            System.out.println("-------Ingrese la nota 2------");
            System.out.println("------------------------------");
            A1.setNotas(leer.nextInt());
            System.out.println("------------------------------");
            System.out.println("-------Ingrese la nota 3------");
            System.out.println("------------------------------");
            A1.setNotas(leer.nextInt());
            leer.nextLine();

            Alumnos.add(A1);
            System.out.println("---------------------------------");
            System.out.println("-Desea crear otro alumno (SI/NO)-");
            System.out.println("---------------------------------");
            op = leer.nextLine();

        } while (op.equalsIgnoreCase("si"));

        buscarAlumno();
    }

//    Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//    final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//    del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//    promedio final, devuelto por el método y mostrado en el main.
    public void buscarAlumno() {

        String alumnoNota;
        System.out.println("---------------------------------------------------------------");
        System.out.println("-Ingrese el nombre del alumno que desea calcular su nota final-");
        System.out.println("---------------------------------------------------------------");
        alumnoNota = leer.next();

        int e = 0;

        for (Alumno A : Alumnos) {
            String nombre = A.getNombre();

            if (nombre.equalsIgnoreCase(alumnoNota)) {
                int i = Alumnos.indexOf(A);

                System.out.println("La nota final es :" + notaFinal(i));
                e++;
            }

        }
        if (e == 0) {
            System.out.println("No se encontro el alumno");
        }

    }

    public double notaFinal(int i) {
        ArrayList<Integer> A = Alumnos.get(i).getNotas();
        int promedio = 0;

        for (int integer : A) {
            promedio += integer;
        }

        return (double) promedio / A.size();

    }

}
