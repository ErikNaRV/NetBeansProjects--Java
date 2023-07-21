/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.InputMismatchException;

/**
 *
 * @author erik_
 */
public class DivisionNumero {

    private int num1;
    private int num2;

    public DivisionNumero() {
    }

    public DivisionNumero(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void division() throws ArithmeticException {

        double resultado;

        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("No es posible dividir entre 0");
        }
        resultado = num1 / num2;

        System.out.println("Resultado: " + resultado);

    }

    public void comprobarLetras(String num3, String num4) throws NumberFormatException {
        
        if(num3.matches("[0-9]+") && num4.matches("[0-9]+") ){
            num1 = Integer.parseInt(num3);
            num2 = Integer.parseInt(num4);
        }else{
           throw new NumberFormatException("No se permite lertas");
        }

    }
    public void comprobarDato(String numero)throws InputMismatchException{
         if(numero.matches("[0-9]+")){
             
           int numero5 = Integer.parseInt(numero);
            
        }else{
           throw new InputMismatchException("Tipo de dato erroneo");
        }
       
        
    }
}
