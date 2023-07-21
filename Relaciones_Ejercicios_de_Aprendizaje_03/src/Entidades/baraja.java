/*
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author erik_
 */
public class baraja {

    private ArrayList<carta> baraja;
    private ArrayList<carta> desbaraja;

    Scanner leer = new Scanner(System.in);

    public baraja() {
        baraja = new ArrayList<>();
        desbaraja = new ArrayList<>();
    }

    public baraja(ArrayList<carta> baraja, ArrayList<carta> desbaraja) {
        this.baraja = baraja;
        this.desbaraja = desbaraja;
    }

    public ArrayList<carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<carta> getDesbaraja() {
        return desbaraja;
    }

    public void setDesbaraja(ArrayList<carta> desbaraja) {
        this.desbaraja = desbaraja;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void llenarBaraja() {

        for (int i = 0; i < 12; i++) {

            if (i != 7 && i != 8) {
                baraja.add(new carta((i + 1), "Espadas"));
                baraja.add(new carta((i + 1), "Oros"));
                baraja.add(new carta((i + 1), "Copas"));
                baraja.add(new carta((i + 1), "Bastos"));
            }
        }

    }

// • barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {

        Collections.shuffle(baraja);

    }
//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.   

    public void siguienteCarta() {

        System.out.println("Su carta es: " + baraja.get(0));
        desbaraja.add(baraja.get(0));
        baraja.remove(0);
        if (baraja.size() < 1 || baraja.size() < 0) {

            System.out.println("Ya no quedan cartas");

        }

    }
// • cartasDisponibles(): indica el número de cartas que aún se puede repartir.  

    public void cartasDisponibles() {

        System.out.println("Las cartas disponibles son : " + baraja.size());

    }
//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario. 

    public void darCartas() {

        System.out.println("Las cartas disponibles son : " + baraja.size());
        System.out.println("Designe el numero de cartas que desea : ");
        int numCartas = leer.nextInt();

        int i = 0;

        do {
            System.out.println("Su carta es: " + baraja.get(0));
            desbaraja.add(baraja.get(0));
            baraja.remove(0);
            if (baraja.size() < 1 || baraja.size() < 0) {

                System.out.println("Ya no quedan cartas");

            }
            i++;
        } while (i < numCartas);

    }
//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario

    public void cartasMonton() {

        if (desbaraja.size() < 1) {
            System.out.println("No se han retirado cartas");
        } else {
            System.out.println("Las cartas que salieron son: ");
            for (carta object : desbaraja) {
                System.out.println(object);
            }
        }

    }

// • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja() {

        if (baraja.size() < 1) {
            System.out.println("No hay mas cartas en la baraja");
        } else {
            System.out.println("//////////////");
            System.out.println("La baraja es :");
            for (carta object : baraja) {
                System.out.println(object);
            }
            System.out.println("//////////////");
        }

    }

    public void menu() {

        llenarBaraja();
        int op;

        do {
            System.out.println("**********Menu*********");
            System.out.println("*1.-Barajar           *");
            System.out.println("*2.-Siguiente Carta   *");
            System.out.println("*3.-Cartas Disponibles*");
            System.out.println("*4.-Dar Cartas        *");
            System.out.println("*5.-Monton            *");
            System.out.println("*6.-Mostrar baraja    *");
            System.out.println("*7.-Salir             *");
            System.out.println("***********************");

             op = leer.nextInt();
            switch (op) {
                case 1:

                    barajar();

                    break;
                case 2:
                    siguienteCarta();
                    break;
                case 3:
                    cartasDisponibles();
                    break;
                case 4:
                    darCartas();
                    break;
                case 5:
                    cartasMonton();
                    break;
                case 6:
                    mostrarBaraja();
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
                    break;

            }
        } while (op != 7);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("baraja{");
        sb.append("baraja=").append(baraja);
        sb.append('}');
        return sb.toString();
    }

}
