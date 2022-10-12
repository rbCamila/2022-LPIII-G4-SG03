/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO_REFUERZO;

/**
 *
 * @author ACER
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        double [] v = new double[15];
        acceso(v,16); 
    }
    
    public static double acceso(double[] v, int j) throws Exception{
        try{
            if(j >= 0 && j <= v.length)
                return v[j];
            else
                throw new Exception("El indice" + j + "no existe el vector");
        
        }
        catch (Exception exc) { 
               throw exc;     
         }
    }
    
}
