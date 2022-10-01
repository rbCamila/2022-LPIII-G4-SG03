/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

/**
 *
 * @author ACER
 */
public abstract class FiguraTridimensional  {
    
    private String name;
    
    public abstract double ObtenerArea();
    
    public abstract double ObtenerVolumen();

    @Override
    public String toString() {
        return "FiguraTridimensional:  " +  name + "  -  Area = " + ObtenerArea() + "  -  Volumen = " + ObtenerVolumen();
    }

    public FiguraTridimensional(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    
}
