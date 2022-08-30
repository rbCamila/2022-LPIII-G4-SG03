package ejercicio02;
import java.util.*;
public class EJERCICIO02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido;
        char sexo='g';
        int dia=32, mes=13, anio=0;
        double peso=800.0, altura=301.0;

        System.out.println("Ingrese su primer nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su primer apellido: ");
        apellido = entrada.nextLine();
        
        while(sexo!='m' && sexo!='f')
        {
            System.out.println("Ingrese su sexo (m/f): ");
            sexo = entrada.next().charAt(0);            
        }
        
        while(dia>31 || dia<1)
        {
            System.out.println("Ingrese su dia de nacimiento en número: ");
            dia = entrada.nextInt();
        }
        
        while(mes>12 || mes<1)
        {
            System.out.println("Ingrese su mes de nacimiento en número: ");
            mes = entrada.nextInt();
        }
        while(anio<1900 || anio>2022)
        
        {
            System.out.println("Ingrese su año de nacimiento en número: ");
            anio = entrada.nextInt();
        }
        
        while(peso>300.0 || peso<5.0)
        {
            System.out.println("Ingrese su peso en kilogramos: ");
            peso = entrada.nextDouble();
        }
        
        while(altura>300.0 || altura<30.0)
        {
            System.out.println("Ingrese su altura en centimetros: ");
            altura = entrada.nextDouble();
        }
        
        PerfilMedico perfil1 = new PerfilMedico(nombre, apellido, sexo, altura, peso, dia, mes, anio);
        System.out.println("    >> Datos del Paciente <<");
        System.out.println(perfil1.toString());
        System.out.println("    >> Diagnostico <<");
        System.out.println("   Edad: "+perfil1.calcularEdad()+" años");
        System.out.println("   IMC: "+perfil1.calcularIMC()+" (Indice de masa corporal)");
        System.out.println("   FCM: "+perfil1.calcularFrecuenciaCardiacaMaxima()+" (frecuencia cardiaca maxima)");
    
    }
    
}
