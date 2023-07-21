/*
 Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.


• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
*/
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class Juego {
    
    private ArrayList<Jugador> listaJuagadores = new ArrayList<>();
    private RevolverdeAgua Revolver;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private void llenarJuego(){
        
        int numJugadores;
        int cantidadJugadores;
        System.out.println("Ingrese el numero de jugadores");
        numJugadores =leer.nextInt();
        
        if(numJugadores> 6 || numJugadores<1){
            System.out.println("El numero ingresado esta fuera del limite,"
                    + "Se a colocado por default "+ "6 jugadores" );
            cantidadJugadores= 6;
        }else{
            
            System.out.println("La cantidad de jugadores se establecio en :"
                    + numJugadores);
            cantidadJugadores = numJugadores;
        }
                
        
        
        
    }
    
    
}
