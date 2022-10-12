package ejercicioAscensor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AplicacionAscensor {
    public static void main(String[] args) {
   
        Scanner write = new Scanner(System.in);
        int cantidadPisos = 0;
        int opcion;
        int numeroPuertas;
        String direccion = "";
        
        int person;
        int destinationFloor;

        boolean condicion = true;
        boolean salir = false;
        
        System.out.println("--------Bienvenido--------");
        
        do {
        	try {
        	System.out.println("Ingrese la cantidad de pisos del Edificio: ");
        	cantidadPisos = write.nextInt();
        	}
        	catch (InputMismatchException inputMismatchE) {
        		System.out.printf("\nExcepcion : %s\n", inputMismatchE);
        		write.nextLine();
				System.out.println("Debe introducir un numero entero y mayor a 2. Intente de nuevo ...");
        	}
        } while (cantidadPisos < 2);
        /*
        if (cantidadPisos < 10)
        	numeroPuertas = 1;
        if (cantidadPisos > 10 && cantidadPisos < 100)
        	numeroPuertas = 5;
        else
        	numeroPuertas = 10;
        */
        
        numeroPuertas = cantidadPisos * 10;
        do {
        	try {
        		System.out.println("Ingrese la direccion del Edificio: ");
        		write.nextLine();
        		direccion = write.nextLine();
        		condicion = false;
        	}
        	catch (InputMismatchException inputMismatchE) {
        		System.out.printf("\nExcepcion : %s\n", inputMismatchE);
        		write.nextLine();
				System.out.println("Debe introducir una cadena de caracteres. Intente de nuevo ...");
        	}
        }while (condicion);
        
        Edificio edificio = new Edificio(cantidadPisos, direccion, numeroPuertas);	// Creacion del ascensor con un determinado numero de pisos
        
        System.out.println(edificio + "\n");
        
        do{
            //Mensajes del menu
            System.out.println("--------Ascensor--------");
            System.out.println("    1) Subir    ");
            System.out.println("    2) Bajar    ");
            System.out.println("    3) Salir    ");
            System.out.println("Elije una opcion: ");
            opcion = write.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese número de personas: ");
                        person = write.nextInt();

                        System.out.println("Escriba el piso al que se dirige: ");
                        destinationFloor = write.nextInt();
                        
                        edificio.getAscensor().subir(person, destinationFloor);
                        break;

                    case 2:
                        System.out.println("Ingrese número de personas: ");
                        person = write.nextInt();

                        System.out.println("Escriba el piso al que se dirige: ");
                        destinationFloor = write.nextInt();

                        edificio.getAscensor().bajar(person, destinationFloor);

                        break;

                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo numeros entre 1 y 3");
                }
            }while (!salir);
                System.out.println("FIN");
    }
   }