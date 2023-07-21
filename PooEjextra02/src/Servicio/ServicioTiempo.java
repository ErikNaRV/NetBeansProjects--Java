/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Tiempo;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ServicioTiempo {
    Tiempo t = new Tiempo();
    Scanner consola = new Scanner(System.in);
    
    public void crearTiempo(){
        System.out.println("Ingrese la hora");  
        t.setHora(consola.nextInt());
        System.out.println("Ingrese los minutos");
        t.setMinutos(consola.nextInt());
        System.out.println("Ingrese los segundos");
        t.setSegundos(consola.nextInt());    
        
    }
    public void imprimirHoraCompleta(){
        System.out.println("La hora ingresada es: "+t.getHora()
        +":"+t.getMinutos()+":"+t.getSegundos());
        
        for (int i = 0; i < 10; i++) {
          simularHora();  
          System.out.println("La hora actual es: "+t.getHora()
          +":"+t.getMinutos()+":"+t.getSegundos());
        }
    }
    
    public void simularHora() {
        t.setSegundos(t.getSegundos() + 1);
        if (t.getSegundos() > 59) {
            t.setSegundos(0);
            t.setMinutos(t.getMinutos() + 1);
            if (t.getMinutos() > 59) {
                t.setMinutos(0);
                t.setHora(t.getHora() + 1);
                if (t.getHora() > 23) {
                    t.setHora(0);
                }
            }
        }
    }

}
