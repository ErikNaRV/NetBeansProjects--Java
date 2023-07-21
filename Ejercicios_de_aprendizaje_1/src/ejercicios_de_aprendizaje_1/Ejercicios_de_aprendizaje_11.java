/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
        System.out.println("Ingrese dos numero enteros positivos");
        int i = 1;
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int op = 0;
        do{
           System.out.println("------Menu-----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            op = leer.nextInt(); 
             
            switch(op){
            case 1:
                suma(num1,num2);
                break;
            case 2:
                resta(num1,num2);
                break;
            case 3:
                multiplicacion(num1,num2);
                break;
                
            case 4:
                divicion(num1,num2);
                break;
            case 5 :
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String SN = leer.next().toUpperCase();
                if(SN.equals("S")){
                    i =0 ;
                }else{
                 break;   
                }
                
        }
        }while(i == 1);
       
        
        
       
       
       
       
       
    }
    
    public static void suma (int num1,int num2){
        int s = num1 + num2;
        System.out.println(s);
    }
     public static void resta (int num1,int num2){
        int r = num1 - num2;
        System.out.println(r);
    }
      public static void multiplicacion (int num1,int num2){
        int m = num1 * num2;
        System.out.println(m);
    }
       public static void divicion (int num1,int num2){
        float di = num1 / num2;
        System.out.println(di);
    }
    
}
