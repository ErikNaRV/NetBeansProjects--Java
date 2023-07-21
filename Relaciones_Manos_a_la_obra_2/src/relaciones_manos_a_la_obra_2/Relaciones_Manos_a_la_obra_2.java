/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package relaciones_manos_a_la_obra_2;

import Entidad.Equipo;
import Entidad.Jugador;

/**
 *
 * @author erik_
 */
public class Relaciones_Manos_a_la_obra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo e = new Equipo();
        e.setEquipo(new Jugador("Ronaldo","Perez",2,12));
        e.setEquipo(new Jugador("Pepe","Perez",1,15));
        e.setEquipo(new Jugador("Juan","Perez",8,2));
        
        for (Jugador Eq : e.getEquipo()) {
            System.out.println(Eq.toString());
        }
        
        
        
    }
    
}
