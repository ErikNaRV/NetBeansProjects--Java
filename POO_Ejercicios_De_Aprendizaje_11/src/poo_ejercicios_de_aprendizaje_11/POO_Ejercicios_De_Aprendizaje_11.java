/*
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package poo_ejercicios_de_aprendizaje_11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class POO_Ejercicios_De_Aprendizaje_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
       int dia ;
       int mes;
       int anio;
       
        System.out.println("Ingrese dia/mes/año");
        
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();
        
        LocalDate fecha = LocalDate.of(anio,mes,dia);
        System.out.println("La fecha es :");
        System.out.println(fecha);
        
        LocalDate fechaActual = LocalDate.now();
        
        System.out.println("La fecha actual es :");
        System.out.println(fechaActual);
        
        long D = ChronoUnit.YEARS.between(fecha, fechaActual) ;
        
        System.out.println("La diferencia es de ");
        System.out.println(D+ " años");
       
    }
    
}
