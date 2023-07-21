/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class servicioPersona {
    Persona PS = new Persona();
    
    public void crearPersona(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre :");
        PS.setNombre(leer.nextLine());
        
        System.out.print("Ingrese la fecha de nacimiento (en formato YYYY-MM-DD): ");
        PS.setFecha(LocalDate.parse(leer.nextLine()));
       
    
   
    }
    
    public int calcularEdad(){
        
        LocalDate fechaactual = LocalDate.now();
        
        Period periodo = Period.between(PS.getFecha(), fechaactual);
        System.out.println("La edad es :");
        System.out.println(periodo.getYears());
        
        return periodo.getYears();
        
    }
    public boolean menorQue(int edad){
        
        int edad1 = calcularEdad();
       
        return edad1<edad;
        
    }
    
    public void mostrarPersona(){
        System.out.println("La persona de nombre "+PS.getNombre()+" su fecha de nacimiento es "+PS.getFecha());
    }
}
