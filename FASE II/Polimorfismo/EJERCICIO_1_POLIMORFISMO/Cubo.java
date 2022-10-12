/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

/**
 *
 * @author ACER
 */
public class Cubo extends FiguraTridimensional{
    
    private int diametro;
    
    public Cubo(int d){
        super("Cubo");
        diametro = d;
    }

    @Override
    public double ObtenerArea() {
        return (6*(diametro*diametro));
    }
    
    @Override
    public double ObtenerVolumen() {
        return (diametro*(diametro*diametro));
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
}
