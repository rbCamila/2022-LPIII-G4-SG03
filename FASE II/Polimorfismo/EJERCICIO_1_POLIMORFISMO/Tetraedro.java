/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

/**
 *
 * @author ACER
 */
public class Tetraedro extends FiguraTridimensional{
    
    public double lado;
    
    public Tetraedro(double l){
        super("Tetraedro");
        lado = l;
    }

    @Override
    public double ObtenerArea() {
        return Math.sqrt(3) * lado * lado;
    }
    
    @Override
    public double ObtenerVolumen() {
        double r1, r2, r3, r4;
        r1 = Math.sqrt(2);
        r2 = Math.pow(lado,3);
        r3 = r1/12;
        r4 = r2*r3;
        return r4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    
    
    
}
