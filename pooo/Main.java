/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioAprendizaje05;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta C1=new Cuenta();
        C1.crearCuenta();
        int opcion=0;
        do{
            
            System.out.println("SISTEMA BANCARIO");
            System.out.println("Favor elija la opción deseada: ");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Extracción rápida");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos");
            System.out.println("6. Salir");
            
            opcion=leer.nextInt();
            
            switch (opcion){
                case 1: System.out.print("Ingrese el valor a depositar: ") ;C1.ingresar(leer.nextDouble()); break;
                case 2: System.out.print("Ingrese el valor a retirar: ") ;C1.retirar(leer.nextDouble()); break;
                case 3: System.out.print("Extracción rápida. Ingrese el valor a retirar: ") ;C1.extraccionRapida(leer.nextDouble()); break;
                case 4: System.out.println("El saldo de su cuenta es: "+C1.consultarSaldo() +" dólares");break;
                case 5: System.out.println("Los datos de su cuenta son los siguientes: "+C1.consultarDatos());break;
                case 6: System.out.println("Muchas gracias por usar este sistema"); break;
                default: System.out.println("Opción no válida");
            }   
            
        }while(opcion!=6);
    }
            
}
