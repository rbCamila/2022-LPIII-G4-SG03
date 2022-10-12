
package actividad3_seccion07;

import java.util.*;

public class Actividad3_seccion07 {

    public static void main(String[] args) {
        try{
            metodo1();
        }
        catch(Exception excepcion){
                System.out.println("La excepcion se manejo en main");
        }
        metodo2();    
    }
    public static void metodo1() throws Exception {
        try{
            System.out.println("Metodo1");
            throw new Exception();
        }
        catch(Exception excepcion){
            System.out.println("La excepcion se manejo en el metodo1");
            throw excepcion;
        }
        finally{
            System.out.println("Se ejecuto finally en metodo1");
        }
    }
    public static void metodo2() {
        try{
            System.out.println("Metodo2");
        }
        catch(Exception excepcion){
            System.out.println(excepcion);            
        }
        finally{
            System.out.println("Se ejecuto finally en metodo2");
        }
        System.out.println("Fin del metodo2");
    }
    
}
