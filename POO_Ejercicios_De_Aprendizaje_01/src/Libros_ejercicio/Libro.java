/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros_ejercicio;

/**
 *
 * @author erik_
 */
public class Libro {
    public String ISBM;
    public String Titulo;
    public String Autor;
    public int NumeroDePaginas;

    public Libro() {
    }

    public Libro(String ISBM, String Titulo, String Autor, int NumeroDePaginas) {
        this.ISBM = ISBM;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBM=" + ISBM + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumeroDePaginas=" + NumeroDePaginas + '}';
    }

    
    
    
}
