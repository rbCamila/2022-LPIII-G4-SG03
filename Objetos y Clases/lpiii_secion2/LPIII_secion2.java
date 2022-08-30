/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lpiii_secion2;
import java.util.Scanner;

public class LPIII_secion2 {
    
    public static void main(String[] args) {        
        Scanner entrada = new Scanner(System.in);
        int edad;
        double peso,temperatura;
        //ejercicio parte "a"
        Perro Fido = new Perro("chihuahua","marron");
        Perro Pelusa = new Perro("pequines","blanco");       
        System.out.println(Fido.toString());
        System.out.println(Pelusa.toString());        
        Fido.increEdad(2);
        Pelusa.increEdad(5);
        System.out.println(Fido.toString());
        System.out.println(Pelusa.toString());        
        //ejercicio parte "c"
        System.out.println("Ingrese el nuevo peso para el perro: ");
        peso=entrada.nextDouble();                
        System.out.println("Ingrese la nueva edad para el perro: ");
        edad=entrada.nextInt();
        System.out.println("Ingrese la nueva temperatura para el perro: ");
        temperatura=entrada.nextDouble();
        System.out.println("DIAGNOSTICO: "+Diagnostico.aptoVacunaB(peso,edad,temperatura));
        System.out.println("DIAGNOSTICO: "+Diagnostico.aptoVacunaA(Pelusa));
       
    }    
}
