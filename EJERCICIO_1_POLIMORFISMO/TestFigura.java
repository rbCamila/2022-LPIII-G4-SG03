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
        int countBi = 0;
        int countTri = 0;
        
        Object arr[] = {new Circulo(4),
                        new Cuadrado(10),
                        new Triangulo(10,5),
                        new Esfera(4),
                        new Cubo(8),
                        new Tetraedro(6)};
        
        for(Object a: arr){
            System.out.println(a);
        
        
            if(a instanceof FiguraBidimensional){
                countBi++;
            }

            if(a instanceof FiguraTridimensional){
                countTri++;
            }
        }
        System.out.println("En el arreglo FigurasGeometricas hay: "+ countBi +" figuras geometricas bidimensionales");
        System.out.println("En el arreglo FigurasGeometricas hay: "+ countTri +" figuras geometricas tridimensionales");

    }
    
    
}
