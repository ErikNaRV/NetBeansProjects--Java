/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author erik_
 */
@Entity
public class Autor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String nombre;
    private boolean alta;
    
    

    public Autor() {
        this.alta = true;
    }

    public Autor(int id, String nombre, boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autor{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", alta=").append(alta);
        sb.append('}');
        return sb.toString();
    }

   
    
    
    
    
}
