/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO_1_POLIMORFISMO;

/**
 *
 * @author ACER
 */
public class TestFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Object arr[] = {new Circulo(4),
                        new Cuadrado(10),
                        new Triangulo(10,5),
                        new Esfera(4),
                        new Cubo(8),
                        new Tetraedro(6)};
        
        for(Object a: arr){
            System.out.println(a);
        }
        
    }
    
    
}
