/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

/**
 *
 * @author Camila
 */
public abstract class FiguraBidimensional {
   private String name;
   
   public abstract double ObtenerArea();

    @Override
    public String toString() {
        return "FiguraBidimensional: " + name + "  -  Area =" + ObtenerArea();
    }
    
    public FiguraBidimensional(String n){
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
