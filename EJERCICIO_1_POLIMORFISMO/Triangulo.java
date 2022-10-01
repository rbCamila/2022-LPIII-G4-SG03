/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

/**
 *
 * @author ACER
 */
public class Triangulo extends FiguraBidimensional {
    
    private double base;
    private double altura;
    
    public Triangulo (double b, double h){
        super("Rectangulo");
        base = b;
        altura = h;
    }

    @Override
    public double ObtenerArea() {
        return (base * altura)/2;
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
}
