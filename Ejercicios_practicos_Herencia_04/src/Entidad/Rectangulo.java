/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 * Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 *
 * @author erik_
 */
public class Rectangulo implements calculosFormas {

    protected double base;
    protected double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        return base * altura;

    }

    @Override
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }

}
