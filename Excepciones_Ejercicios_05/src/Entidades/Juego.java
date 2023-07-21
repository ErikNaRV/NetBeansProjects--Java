/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class Juego {
    
    private int numero = (int) (Math.random()*500)+1;
    private String  respuesta;
    private int respuestaFinal;
    private int i;
    Scanner leer = new Scanner(System.in);

    public Juego() {
    }

    public Juego(String respuesta, int respuestaFinal, int i) {
        this.respuesta = respuesta;
        this.respuestaFinal = respuestaFinal;
        this.i = i;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getRespuestaFinal() {
        return respuestaFinal;
    }

    public void setRespuestaFinal(int respuestaFinal) {
        this.respuestaFinal = respuestaFinal;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

 
   
    
    
    public boolean crearJuego(){
        
        comprobarLetras();

        if(respuestaFinal == numero){
            System.out.println("GANASTE");
            System.out.println("Numero de intentos: "+ i);
            
            return false;
            
        }else{
            if(respuestaFinal > numero){
                System.out.println("El numero ingresado es mayor a la respuesta");
            }else{
                System.out.println("El numero ingresado es menor a la respuesta");
            }
            i++;
            return true;
        }
        
    
        
    }
    
     public void comprobarLetras() throws NumberFormatException {
        System.out.println("Adivine el numero secreto");
        respuesta = leer.next();
       
        if(respuesta.matches("[0-9]+") ){
            respuestaFinal = Integer.parseInt(respuesta);
        }else{
            i++;
           throw new NumberFormatException("No se permite lertas");
        }

    }
    
    
}
