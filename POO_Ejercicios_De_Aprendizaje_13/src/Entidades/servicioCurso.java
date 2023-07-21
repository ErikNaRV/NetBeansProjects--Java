/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class servicioCurso {
   Scanner leer = new Scanner(System.in);
   Curso C1 = new Curso();
   
    public void cargarAlumnos(){
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del estudiante "+i+" :");
            C1.getAlumnos()[i]=leer.nextLine();
            
        }

    }
    
    public void crearCurso(){
        cargarAlumnos();
        System.out.println("Ingrese el nombre del curso : ");   
        C1.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese la cantidad de horas por dia: ");
        C1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana: ");
        C1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el precio por hora: ");
        C1.setPrecioPorHora(leer.nextDouble());
        System.out.println("Ingrese si su turno es M en la mañana o N en la noche :");
        if(leer.nextLine().toUpperCase() == "M"){
            C1.setTurno(true);
        }else if(leer.nextLine().toUpperCase() == "N"){
            C1.setTurno(false);
        }
        
    }
    
    public void calcularGananciaSemanal(){
        
        double g = C1.getCantidadDiasPorSemana()*C1.getCantidadHorasPorDia()*C1.getPrecioPorHora()*C1.getAlumnos().length;
        System.out.println("La ganancia semanal es de : "+g);
        
        
    }
           
}
