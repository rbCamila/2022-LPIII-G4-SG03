/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Archivos;

/**
 *
 * @author Camila
 * 
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        String cadena;
        
        try (PrintWriter salida = new PrintWriter ("c:/ficheros/datos.txt")) {
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN: ");
            cadena = sc.nextLine();
            
            while (!cadena.equalsIgnoreCase("FIN")){
                salida.println(cadena);
                cadena = sc.nextLine();
             
            }
         
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            
        }
        
    }
    
}
