/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpiii_g04;

/**
 *
 * @author ACER
 */

//Clase diagnostico (b)

public class Diagnostico {
    public static String AptoVacunaA(Perro p1, int temp, int edad, double peso) {
        p1.getTemp();
        p1.getEdad();
        p1.getPeso();
        
        if((p1.getTemp() >=37 && p1.getTemp() <= 40) && p1.getPeso() > 5 && p1.getEdad()>1){
            return "está sano";
        }
        else {
            return "no está sano";
        }
    }
    
    public static String AptoVacunaB (int temperatura, int edadd, double pesoo){
        if((temperatura >= 37 && temperatura <= 40) && pesoo >= 5 && edadd >= 1){
            return "Está sano";
        }
        else{
            return "no está sano";
        }
    }
}
