/*
 A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
 */
package Entidad;

/**
 *
 * @author erik_
 */
public class Lavadora extends Electrodomestico {
    
    protected double carga = 0 ;

    public Lavadora() {
        
        
    }

    public Lavadora(double precio, String color, String consumoEnergetico, double peso,double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
//• Método get y set del atributo carga.
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
//• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.   
    
    public void crearLavadora(){
        System.out.println("*********Lavadora********");
        super.crearElectrodomestico();
        System.out.println("Especifique la carga de la lavadora");
        carga = leer.nextDouble();
    }

//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodomestico también deben afectar al precio.

    @Override
    public void precioFinal() {
        
        
        if(carga >= 30){
            precio = precio + 500;
        }
        super.precioFinal();
    }
    
    
    
    
}
