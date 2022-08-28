/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lpiii_g04_2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class AplicaciónCuentaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CuentaBanco c1 = new CuentaBanco();
        
        Scanner write = new Scanner(System.in);

        String titularr;
        double cantidad;
        char opcion; 
        
        System.out.println("HOLA");
        System.out.println("Ingrese su nombre");
        titularr = write.nextLine();

        System.out.println("Menú");
        System.out.println("A. Ingresar ");
        System.out.println("B. Retirar");
        System.out.println("C. Motrar saldo actual");
        

        System.out.println("Ingresar opcion ");
        opcion = write.next().charAt(0);


        switch (opcion) {
            case 'A':
                
                System.out.println("Ingresar cantidad s/.");
                cantidad = write.nextDouble();
                
                System.out.println(CuentaBanco.ingresar(c1,cantidad));
                break;

            case 'B':
              
                
                System.out.println("Ingresar cantidad a retirar s/.");
                cantidad = write.nextDouble();
                
                
                System.out.println(CuentaBanco.retirar(c1,cantidad));
                break;
                
            case 'C':
                
                System.out.println(c1.toString());

        }

    }

}
