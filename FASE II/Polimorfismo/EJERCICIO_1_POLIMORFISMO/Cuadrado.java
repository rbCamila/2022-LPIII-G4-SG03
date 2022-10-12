/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

/**
 *
 * @author ACER
 */
public class Cuadrado extends FiguraBidimensional{
    
    private double lado;
    
    public Cuadrado (double l){
        super("Cuadrado");
        lado = l;
    }

    
    @Override
    public double ObtenerArea() {
        return (lado * lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
