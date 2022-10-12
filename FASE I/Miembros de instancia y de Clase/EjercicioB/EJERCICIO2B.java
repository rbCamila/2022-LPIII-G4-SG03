package ejercicio2b;
import java.util.*;
public class EJERCICIO2B {

    public static void main(String[] args) {
        
        Fecha f = new Fecha();
        f.leer();
        System.out.println(f.toString());
        Fecha f1 = new Fecha(5,6,2009);
        System.out.println(f1.toString());
        System.out.println(">>  dias entre las 2 fechas<< ");
        System.out.println(f1.diasEntre(f));
        System.out.println(">> dia de la semana <<");
        System.out.println(f.diaSemana()+"---"+f.larga());
        if(Fecha.igualQue(f, f1)==true)
            System.out.println("las fechas son iguales");
        else
            System.out.println("las fechas no son iguales");
        
        if(Fecha.mayorQue(f, f1)==true)
            System.out.println(f.toString()+" es mayor que "+f1.toString());
        else
            System.out.println(f1.toString()+" es mayor que "+f.toString());
        if(Fecha.menorQue(f, f1)==true)
            System.out.println(f.toString()+" es menor que "+f1.toString());
        else
            System.out.println(f1.toString()+" es menor que "+f1.toString());
        if(f.bisiesto()==true)
            System.out.println(f.toString()+" es un año bisiesto ");
        else
            System.out.println(f.toString()+" no es un año bisiesto ");
        if(f1.bisiesto()==true)
            System.out.println(f1.toString()+" es un año bisiesto ");
        else
            System.out.println(f1.toString()+" no es un año bisiesto ");
        f1.siguiente();
        System.out.println(">> el dia siguiente es <<");
        System.out.println(f1.toString());
        f.anterior();
        System.out.println(">> el dia anterior es <<");
        System.out.println(f.toString());
        System.out.println(">> dias transcurridos <<");
        System.out.println(f1.diasTranscurridos()+" dias");
        
        System.out.println(f1.toString());
        System.out.println(" fecha futura ");
        f1.fechaFutura(12);
        System.out.println(f1.toString());
        System.out.println(f1.corta());
        System.out.println(f.corta());
        System.out.println(" fecha transcurrida ");
        f1.fechaTras(6);
        System.out.println(f1.toString());
        System.out.println(" la copia ");
        System.out.println(f1.copia());        
    }    
}
