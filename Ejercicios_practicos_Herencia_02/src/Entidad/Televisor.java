/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
 */
package Entidad;

/**
 *
 * @author erik_
 */
public class Televisor extends Electrodomestico {
    
    protected double resolucion ;
    protected boolean sintonizadorTDT;

    public Televisor() {
       
    }

    public Televisor(double precio, String color, String consumoEnergetico, double peso,double resolucion,boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
//• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.   
    
    public void crearTelevisor(){
        System.out.println("**********Televisor**********");
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion del televisor");
        resolucion = leer.nextDouble();
        System.out.println("Determine si el televisor tiene Sintonizador TDT (SI/NO)");
        String decision = leer.next();
        if(decision.equalsIgnoreCase("si")){
            sintonizadorTDT = true;
        }else{
            sintonizadorTDT = false;
        }
        
    }
//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.

    @Override
    public void precioFinal() {
        
        if(resolucion > 40){
            precio = precio + (precio*0.3);
        }
        if(sintonizadorTDT){
            precio = precio + 500;
        }
        super.precioFinal();
    }
    
    
    
    
}
