/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Archivos;

/**
 *
 * @author Camila
 */


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Alumno a;
        Fecha f;
        
        try {
            fos = new FileOutputStream("/ficheros/alumnos.txt");
            salida = new ObjectOutputStream(fos);
            f = new Fecha(5,9,2011);
            a = new Alumno("12345678A","Lucas Gonzales",20,f);
            salida.writeObject(a);
            f = new Fecha(7,9,2011);
            a = new Alumno("98245245B","Juan Jimenez",19,f);
            salida.writeObject(a);
            f = new Fecha(8,9,2011);
            a = new Alumno("75452652C","Maria Zapata",22,f);
            salida.writeObject(a);            
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null)
                    fos.close();
                if(salida != null)
                    salida.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
}
