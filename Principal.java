/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lpiii_G04_4_3;

/**
 *
 * @author CAMILA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo(4,5);    
        Manejador m1 = new Manejador();
        
        System.out.println("El área del rectángulo es: " + Manejador.Area(r1));
        System.out.println("El perimetro del rectangulo es: " + Manejador.Perimetro(r1));
        
        Manejador.MoverX(r1, 5);
        
        Manejador.MoverY(r1, 2);
        
        System.out.println(r1.toString());
        
        Rectangulo ColorA = new Rectangulo(1,2);
        System.out.println("Rectangulo de color Amarillo: " + ColorA.toString());
        
        Rectangulo ColorR = new Rectangulo(3,5);
        System.out.println("Rectangulo de color Rojo: " + ColorR.toString());
        
        Rectangulo ColorV = new Rectangulo(2,4);
        System.out.println("Rectangulo de color Verde: " + ColorV.toString());
    }
    
}
