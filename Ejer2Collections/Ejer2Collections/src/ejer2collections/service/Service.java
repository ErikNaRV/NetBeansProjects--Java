package ejer2collections.service;

import ejer2collections.Raza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Service {

    Scanner read = new Scanner(System.in);
    Raza dog = new Raza();

    public void  CrearRaza() {
        String decision = "";
        do {
            System.out.println("Ingrese la raza del perro ");
            dog.setRaza(read.nextLine());
            dog.setRazas(dog.getRaza());
            System.out.println("¿Quiere guardar otra raza de perro? \n s/n");
            decision = read.nextLine();

            do {
                if (!decision.equalsIgnoreCase("s") && !decision.equalsIgnoreCase("n")) {
                    System.out.println("letra incorrecta, vuelva a ingresar la letra");
                    decision = read.next();
                } else {
                    break;
                }
            } while (true);

        } while (decision.equalsIgnoreCase("s"));
        System.out.println("Gracias por registrar su raza, vuelva pronto");
        Imprimir();

        
         eliminarRaza(dog.getRazas());
    }
    
    public void  eliminarRaza(ArrayList<String>j){
        
        Iterator<String> i = j.iterator();
        System.out.println("¿qué raza desea eliminar?");
        String w = read.nextLine();
        while (i.hasNext()){
            if(i.next().equalsIgnoreCase(w)){
                i.remove();
            }
            
        }
        Collections.sort(j);
//        System.out.println(j);
        Imprimir();
    }
    
    public void Imprimir(){
        for (String razaP : dog.getRazas()) {
            System.out.println("Raza: " + razaP);

        }
    }

}
