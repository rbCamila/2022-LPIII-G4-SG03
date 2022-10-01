/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

/**
 *
 * @author Camila
 */
public class Circulo extends FiguraBidimensional {
    
    private int radio;
    
    public Circulo (int r){
        super("Circulo");
        radio = r;
    }

    @Override
    public double ObtenerArea() {
        return Math.PI * (radio * radio);
    }
    
    public int getRadio(){
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }  
}
