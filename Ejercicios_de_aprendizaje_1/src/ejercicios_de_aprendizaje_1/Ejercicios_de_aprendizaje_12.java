/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicios_de_aprendizaje_1;
import java.util.Scanner;
/**
 *
 * @author erik_
 */
public class Ejercicios_de_aprendizaje_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int co = 0 ;
        int ic = 0 ;
        int I = 0 ;
        String CODIGO;
        System.out.println("Funcionamiento del dispositivo RS232");
        do{
            System.out.println("Ingrese un codigo");
             CODIGO = leer.next();
             
            if (CODIGO.equals("&&&&&")){
                I = 1;
            }else{
                if(CODIGO.length() == 5){
            
                if (CODIGO.substring(0,1).equals("X")){
            
                    if(CODIGO.substring(4,5).equals("O")){
                    
                        System.out.println("Correcto");
                        co = co + 1;
                
                        }else{
                        System.out.println("Incorrecto");
                        ic = ic + 1;
                        }
                    }else{
                        System.out.println("Incorrecto");
                        ic = ic + 1;
                        }   
                }else{
                    System.out.println("Incorrecto");
                    ic = ic + 1;
                }
            }
            
            
           
        }while(I == 0);
        
        System.out.println("La cantidad de codigos correctos fue de : "+co);
         System.out.println("La cantidad de codigos incorrecots fue de : "+ic);
        
        
        
        
    }
    
}
