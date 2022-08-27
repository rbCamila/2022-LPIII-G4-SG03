/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lpiii_g04;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class LPIII_G04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Perro p1 = new Perro();
        Perro p2 = new Perro ("buldog", "amarillo");
        
        System.out.println(p2.toString());
        
        p1.dormir();
        p1.increEdad(4);
        
        System.out.println(p1.toString());
        
        //Objetos Fido y Pelusa, incrementa edad (a)
        
        Perro Fido = new Perro ("Chihuahua", "marron");
        Perro Pelusa = new Perro ("Pequines", "blanco");
        
        Fido.increEdad(2);
        System.out.println(Fido.toString());

        Pelusa.increEdad(5);
        System.out.println(Pelusa.toString());
        
        
        
        
        //usuario pueda modificar la temperatura, la edad y el peso del perro (c)
        
        Scanner write = new Scanner(System.in);
        
        int temperatura;
        double pesoo;
        int edadd;
        
        System.out.println("Ingresar Peso ");
        pesoo = write.nextDouble();
        
        System.out.println("Ingresar Edad");
        edadd = write.nextInt();
        
        System.out.println("Ingresar Temperatura ");
        temperatura = write.nextInt();
        
        
        System.out.println("DIAGNOSTICO : " + Diagnostico.AptoVacunaB(temperatura, edadd, pesoo));  
    }   
}


/*
CASOS DE PRUEBA  

Ingresar Peso 
4
Ingresar Edad
6
Ingresar Temperatura 
39
DIAGNOSTICO : Está sano


Ingresar Peso 
3
Ingresar Edad
2
Ingresar Temperatura 
41
DIAGNOSTICO : no está sano
*/