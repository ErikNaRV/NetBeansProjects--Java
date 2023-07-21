/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_practicos_herencia_02;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author erik_
 */
public class Ejercicios_practicos_Herencia_02 {

    /**
     * Vamos a crear una Lavadora y un Televisor y llamar a los métodos
     * necesarios para mostrar el precio final de los dos electrodomésticos.
     */
    public static void main(String[] args) {
        int precioElec =0;

        ArrayList<Electrodomestico> listaElectrodomestico = new ArrayList<>();

        Lavadora lavador = new Lavadora();
        lavador.crearLavadora();

        Televisor tele = new Televisor();
        tele.crearTelevisor();
        Lavadora lavador1 = new Lavadora();
         lavador1.crearLavadora();
        Televisor tele1 = new Televisor();
        tele1.crearTelevisor();
        listaElectrodomestico.add(tele);
        listaElectrodomestico.add(tele1);
        listaElectrodomestico.add(lavador);
        listaElectrodomestico.add(lavador1);
        for (Electrodomestico electrodomestico : listaElectrodomestico) {
            electrodomestico.precioFinal();
            precioElec= (int) (electrodomestico.getPrecio()+ precioElec);
        }
        System.out.println("El precio final de electrodomesticos es de :"+ precioElec);

    }

}
