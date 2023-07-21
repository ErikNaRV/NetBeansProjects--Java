/*
Jugador que contenga nombre, apellido, posición
y número.
 */
package Entidad;

/**
 *
 * @author erik_
 */
public class Jugador {
    
    private String nombre;
    private String apellido;
    private Integer posicion;
    
    private Integer numero;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, Integer posicion, Integer numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jugador{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", posicion=").append(posicion);
        sb.append(", numero=").append(numero);
        sb.append('}');
        return sb.toString();
    }

    
    
}
