/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Vane Proaño
 */
@Entity
public class Editorial implements Serializable{
    
       
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id;
    @Basic
    private String nombre;
    private boolean alta;

    public Editorial() {
        this.alta = true;
    }

    public Editorial(Integer id, String nombre, boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = true;
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

        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Editorial{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", alta=").append(alta);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
