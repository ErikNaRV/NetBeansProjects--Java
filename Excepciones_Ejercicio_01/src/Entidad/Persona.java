/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    Scanner leer = new Scanner(System.in);

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

//Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
    public void crearPersona() {

        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();

        String respuesta;
        do {

            System.out.println("Ingrese su genero: H-Hombre, M-Mujer), u O-Otro ");
            respuesta = leer.next().toUpperCase();

            switch (respuesta) {
                case "H":
                    sexo = "Hombre";
                    break;
                case "M":
                    sexo = "Mujer";
                    break;
                case "O":
                    sexo = "Otro";
                    break;
                default:
                    System.out.println("Respuesta incorrecta");
                    break;
            }

        } while (!respuesta.equals("H") && !respuesta.equals("M") && !respuesta.equals("O"));

        System.out.println("Ingrese su peso en kg");
        peso = leer.nextDouble();
        System.out.println("Ingrese su altura");
        altura = leer.nextDouble();

    }

// Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
//significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
//Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
//persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
//de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
    public int calcularIMC() {

        double pesoIdeal;

        pesoIdeal = peso / (Math.pow(altura, 2));

        if (pesoIdeal < 20) {

            return -1;

        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {

            return 0;

        } else {

            return 1;

        }

    }

//    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
    public boolean esMayorDeEdad() throws Exception {
        
        

        if (edad >= 18) {

            return true;
        } else {
             
            throw new Exception("La persona es menor de edad");

        }
        

    }

}
