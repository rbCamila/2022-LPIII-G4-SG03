/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO_REFUERZO;

/**
 *
 * @author ACER
 */
public class prueba {   
    
    private String[] 
    alumnos = { "Pedro", "Juan", "Helena", "Mónica","Sebastián" };  
    private int[] notas = { 7, 4, 6, 7, 8 };   
    
    public String controlDeNotas() {     
        for (int i = 0; i < notas.length; i++) {       
            System.out.println(notas[i]);       
            assert (notas[i] > 5) : determinarNota(i);     
            
        }     
        return "Control de Notas correcto";   
        
    }   
    public String determinarNota(int indice) {     
        int noAprobado = notas[indice];     
        String alumno = alumnos[indice];     
        String resultado = "El alumno " + alumno + " no aprueba con " + noAprobado +" de nota";     
        return resultado;   
        
    }   
    public static void main(String[] args) 
    {     
        prueba examenes = new prueba();     
        System.out.println(examenes.controlDeNotas());   
    }   
}
