/*
    Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
    tendremos una clase Pelicula con el título, director y duración de la película (en horas).
 */
package clases;

/**
 *
 * @author erik_
 */
public class Pelicula {
    
    public String titulo;
    public String director;
    public Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    
    
}
