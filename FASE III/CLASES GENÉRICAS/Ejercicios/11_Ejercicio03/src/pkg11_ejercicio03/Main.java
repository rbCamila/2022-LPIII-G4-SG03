package pkg11_ejercicio03;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws ObjectNoExist {
        Dictionary<Integer,String> dic = new Dictionary<Integer,String>();
        Scanner ingresartecla = new Scanner (System.in);

        boolean entrar = true;

        while(entrar){
            boolean ingresar = false;
            int opc = 0;
            System.out.println("---------------Menu----------------");
            System.out.println("    1. Ingresar Contacto      ");
            System.out.println("    2. Borrar Contacto        ");
            System.out.println("    3. Mostrar Datos          ");
            System.out.println("    4. Mostrar todos los contactos  ");
            System.out.println("    5. Salir                  ");

            while (!ingresar){
                System.out.print("Ingrese el numero entre las opciones mostradas: ");
                opc = ingresartecla.nextInt();
                if(opc >= 1 && opc <= 5)
                    ingresar = true;
            }
            switch(opc){
                case 1:
                    System.out.print("Ingrese el DNI: ");
                    int dni = ingresartecla.nextInt();
                    System.out.print("Ingrese los Datos: ");
                    String datos = ingresartecla.next();
                    dic.add(dni, datos);
                    
                    break;
                case 2:
                    System.out.print("Ingrese el DNI a borrar: ");
                    dni = ingresartecla.nextInt();
                    boolean resp = dic.delete(dni);
                    if(!resp){
                        System.out.println("No se encuentra o ingreso mal");
                    }
                    else
                        System.out.println("Eliminacion Correcta");
                    break;
                case 3:
                    System.out.print("Ingrese el DNI a mostrar: ");
                    dni = ingresartecla.nextInt();
                    System.out.println(dic.getValue(dni));
                    break;
                case 4:
                    System.out.println(dic);
                    break;
                case 5:
                    entrar = false;
                    break;
            }
        }
    }
}
