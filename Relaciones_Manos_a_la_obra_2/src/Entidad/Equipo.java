/*
 Luego otra clase Equipo que contenga una colección de jugadores.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author erik_
 */
public class Equipo {
    private ArrayList<Jugador> equipo;
    private Jugador jugador;

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Equipo() {
        equipo = new ArrayList<>();
    }

    public Equipo(ArrayList<Jugador> equipo, Jugador jugador) {
        this.equipo = equipo;
        this.jugador = jugador;
    }

    public Equipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }

    public ArrayList<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(Jugador equipo) {
        this.equipo.add(equipo);
    }
    
    
}
