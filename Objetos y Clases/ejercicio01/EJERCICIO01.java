package ejercicio01;
import java.util.Scanner;
public class EJERCICIO01 {    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                
        String titular;
        char rpta;
        double cantidad;
        int opc;
        System.out.println("Ingrese el nombre del titular de la cuenta: ");
        titular = entrada.next();  
        do{
            System.out.println("¿desea ingresar la cantidad incial de la cuenta?(S/N) : ");
            rpta = entrada.next().charAt(0);
            if (rpta=='s' || rpta=='S'){
                System.out.println("Ingrese la cantidad inicial a la cuenta: ");    
                cantidad= entrada.nextDouble();
                CuentaBanco p1 = new CuentaBanco(titular,cantidad);
                System.out.println("Titular es: "+p1.getTitular());
                System.out.println("El saldo es: "+p1.getCantidad());
                System.out.println("       MENU:    ");
                System.out.println("1 <- Ingresar dinero: ");
                System.out.println("2 <- Retirar dinero: ");
                System.out.println("3 <- Mostrar saldo actual");
                System.out.println("Ingrese opcion a realizar : ");
                opc=entrada.nextInt();
                switch(opc){
                    case 1:
                        System.out.println("INGRESAR CANTIDAD: ");
                        cantidad = entrada.nextDouble();
                        p1.ingresar(cantidad);break;
                    case 2: 
                        System.out.println("INGRESAR CANTIDAD: ");
                        cantidad = entrada.nextDouble();
                        p1.retirar(cantidad);break;
                    case 3: 
                        System.out.println("MOSTRANDO SALDO ACTUAL: ");
                        System.out.println(p1.getCantidad());break;
                }}
        }while((rpta!='s' && rpta!='S')&&(rpta!='n' && rpta!='N'));
        if (rpta=='n' || rpta=='N'){
            CuentaBanco p2 = new CuentaBanco(titular);
            System.out.println("Titular es: "+p2.getTitular());
            System.out.println("El saldo es: "+p2.getCantidad());

            System.out.println("salio: ");
            System.out.println("       MENU:    ");
            System.out.println("1 <- Ingresar dinero: ");
            System.out.println("2 <- Retirar dinero: ");
            System.out.println("3 <- Mostrar saldo actual");
            System.out.println("Ingrese opcion a realizar : ");
            opc=entrada.nextInt();
            switch(opc){
                case 1:
                    System.out.println("INGRESAR CANTIDAD: ");
                    cantidad = entrada.nextDouble();
                    p2.ingresar(cantidad);break;
                case 2: 
                    System.out.println("INGRESAR CANTIDAD: ");
                    cantidad = entrada.nextDouble();
                    p2.retirar(cantidad);break;
                case 3: 
                    System.out.println("MOSTRANDO SALDO ACTUAL: ");
                    System.out.println(p2.getCantidad());break;
            }
        }
    } 
}
