/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

/**
 *
 * @author ACER
 */
public class Esfera extends FiguraTridimensional{
    
    private double radio;
    
    public Esfera(double r){
        super("Esfera");
        radio = r;
    }
    
    @Override
    public double ObtenerArea() {
        return (4*(3.14*radio));
    }
    
    @Override
    public double ObtenerVolumen() {
        return ((4/3) *(3.14*radio));
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
}
