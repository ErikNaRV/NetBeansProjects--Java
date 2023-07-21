/*
Crear una superclase llamada Electrodomestico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Electrodomestico {

    Scanner leer = new Scanner(System.in);

    protected double precio = 1000;
    protected String color;
    protected ArrayList<String> letrasConsumo = new ArrayList<>();
    protected ArrayList<String> coloresElectrodomestico = new ArrayList<>();
    protected String consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, String consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<String> getLetrasConsumo() {
        return letrasConsumo;
    }

    public void setLetrasConsumo(ArrayList<String> letrasConsumo) {
        this.letrasConsumo = letrasConsumo;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

//• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    public void llernarLista() {
        letrasConsumo.add("A");
        letrasConsumo.add("B");
        letrasConsumo.add("C");
        letrasConsumo.add("D");
        letrasConsumo.add("E");
        letrasConsumo.add("F");
    }

    public void llernarListaColores() {
        coloresElectrodomestico.add("Blanco");
        coloresElectrodomestico.add("Negro");
        coloresElectrodomestico.add("Rojo");
        coloresElectrodomestico.add("Azul");
        coloresElectrodomestico.add("Gris");
    }

    public void comprobarConsumoEnergetico(String letra) {

        if (letrasConsumo.contains(letra)) {

            consumoEnergetico = letra;

        } else {

            consumoEnergetico = "F";

        }
    }
//• Método comprobarColor(String color): comprueba que el color es correcto, y 
// si no lo es, usa el color blanco por defecto. Los colores disponibles para 
//los electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el 
//nombre está en mayúsculas o en minúsculas. Este método se invocará al crear 
//el objeto y no será visible.

    public void comprobarColor(String colorNew) {
        if (coloresElectrodomestico.contains(colorNew)) {

            color = colorNew;

        } else {

            color = "Blanco";

        }
    }
//• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.  

    public void crearElectrodomestico() {
        llernarLista();
        llernarListaColores();
//        System.out.println("Ingrese el precio del Electrodomestico");
        precio = 1000;
        System.out.println("Ingrese el color");
        comprobarColor(leer.next());
        System.out.println("Ingrese el consumo energético (letras entre A y F)");
        comprobarConsumoEnergetico(leer.next());
        System.out.println("Ingrese el peso");
        peso = leer.nextDouble();
    }
//• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios: 

    public void precioFinal() {

        if (consumoEnergetico.equalsIgnoreCase("A")) {
            precio = precio + 1000;
        } else if (consumoEnergetico.equalsIgnoreCase("B") ) {
            precio = precio + 800;
        } else if (consumoEnergetico.equalsIgnoreCase("C")) {
            precio = precio + 600;
        } else if (consumoEnergetico.equalsIgnoreCase("D")) {
            precio = precio + 500;
        } else if (consumoEnergetico.equalsIgnoreCase("E")) {
            precio = precio + 300;
        } else if (consumoEnergetico.equalsIgnoreCase("F")) {
            precio = precio + 100;
        }
        
        if (peso > 1 && peso < 19) {
            precio = precio + 100;
        } else if (peso > 20 && peso < 49) {
            precio = precio + 500;
        } else if (peso > 50 && peso < 79) {
            precio = precio + 800;
        } else if (peso > 80) {
            precio = precio + 1000;
        } 
        
            System.out.println("El precio final es de "+ precio);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Electrodomestico{");
        
        sb.append(", precio=").append(precio);
        sb.append(", color=").append(color);
        sb.append(", letrasConsumo=").append(letrasConsumo);
        sb.append(", coloresElectrodomestico=").append(coloresElectrodomestico);
        sb.append(", consumoEnergetico=").append(consumoEnergetico);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }

}
