/*
 Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Entidades;

/**
 *
 * @author erik_
 */
public class RevolverdeAgua {
    private int posicionActual;
    private int posicionAgua;

    public RevolverdeAgua() {
    }

    public RevolverdeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
//• llenarRevolver(): le pone los valores de posición actual y de posición del 
// agua. Los valores deben ser aleatorios.
    
    public void llernarRevolver(){
     posicionActual = (int) (Math.random()*6+1);
     
     posicionAgua = (int) (Math.random()*6+1);
        
        
    }
//• mojar(): devuelve true si la posición del agua coincide con la posición 
// actual 
    
    
    public boolean mojar(){
        
        return posicionAgua==posicionActual;
        
    }
// • siguienteChorro(): cambia a la siguiente posición del tambor   
    
    public void siguienteChorro(){
        if(posicionActual== 6){
            posicionActual = 1;
        }else{
            posicionActual++;
        }
        
        
    }
//• toString(): muestra información del revolver (posición actual y donde 
// está el agua)  

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Revolver_de_agua{");
        sb.append("posicionActual=").append(posicionActual);
        sb.append(", posicionAgua=").append(posicionAgua);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
