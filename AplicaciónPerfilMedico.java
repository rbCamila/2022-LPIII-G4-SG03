/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lpiii_g04_3;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class AplicaciónPerfilMedico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PerfilMedico p1 = new PerfilMedico();
        
        Scanner write = new Scanner(System.in);

        String primerNombre;
        String apellido;
        char sexo;
        int día, mes, año;
        double edad = 0;
        int añoActual = 2022;
        double peso;
        double altura;
        double IMC = 0;
        double FCM = 0;
   
        
        System.out.println("HOLA ingrese sus datos");
        System.out.println("Primer nombre : ");
        primerNombre = write.nextLine();

        System.out.println("Apellido  : ");
        apellido = write.nextLine();
        
        System.out.println("Ingresar sexo F/M : ");
        sexo = write.next().charAt(0);
        
        System.out.println("Fecha de nacimiento ");
        System.out.println("Día : ");
        día = write.nextInt();
        
        System.out.println("Mes : ");
        mes = write.nextInt();
        
        System.out.println("Año : ");
        año = write.nextInt();
        
        System.out.println("Ingresar peso(kg) : ");
        peso = write.nextDouble();
        
        System.out.println("Ingresar altura(cm) : ");
        altura = write.nextDouble();
        
        System.out.println(" PERFIL MÉDICO ");
        System.out.println(" Primer nombre    : " + primerNombre );
        System.out.println(" Apellido         : " + apellido );
        System.out.println(" Sexo (F/M)       : " + sexo );
        System.out.println(" Fecha necimiento : " + día + " - " + mes + " - "+ año );
        System.out.println(" Altura           : " + altura + " cm " );
        System.out.println(" Peso             : " + peso + " kg " );
        
        System.out.println(" Edad             : " + PerfilMedico.CalEdad(p1, edad, año, añoActual)+ " años." );
        System.out.println(" IMC             : " + PerfilMedico.CalIMC(p1, peso, IMC, altura)+ " masa." );
        System.out.println(" IMC             : " + PerfilMedico.CalFCM(p1, edad, FCM)+ " ppm." );
        
    }
    
}
