/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpiii_G04_4_3;

/**
 *
 * @author CAMILA
 */
public class Coordenada {
    private int x;
    private int y;
    
    
    public Coordenada(){
        this.x = 0;
        this.y = 0;
    }
    
    public Coordenada(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public Coordenada(Coordenada c){
    }
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    
    public static double distancia(Coordenada c1, Coordenada c2){
        double X;
        double Y;
        
        
        double X2;
        double Y2;
        
        
        double X3;
        double Y3;
        
        X = c1.getX();
        Y = c1.getY();
        
        X2 = c2.getX();
        Y2 = c2.getY();
        
        
        X2 = Math.pow(X2-X, 2);
        Y3 = Math.pow(Y2-Y, 2);
        
        double result = 0.0;
        
        result = Math.sqrt(X2 + Y3);
        return result;
    }
    
    public double distancia(Coordenada c){
        double X;
        double Y;
        
        X = c.getX();
        Y = c.getY();
        X = Math.pow(X, 2);
        Y = Math.pow(Y, 2);
        
        double result = 0.0;
        
        result = Math.sqrt(X+Y);
        return result;
    }
    
    @Override
    public String toString() {
        return "Coordenadas" + " x = " + x + ", y = " + y + '}';
    }
    
    
    
}
