/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO_REFUERZO;
import java.util.Scanner;
/**
 *
 * @author ACER
 */


public class AplicacionAscensor {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
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
        	System.out.print("Ingrese la cantidad de pisos del ascensor: ");
        	cantidadPisos = write.nextInt();
        	System.out.println();
        } while (cantidadPisos < 2);
            numeroPuertas = cantidadPisos * 10;
        do{
            System.out.println("Ingrese la direccion del Edificio: ");
            write.nextLine();
            direccion = write.nextLine();
            condicion = false;
        }while (condicion);
            Edificio edificio = new Edificio(cantidadPisos, direccion, numeroPuertas);	// Creacion del ascensor con un determinado numero de pisos
            System.out.println(edificio + "\n");
     
        
        //Ascensor ascensor = new Ascensor(cantidadPisos);	// Creacion del ascensor con un determinado numero de pisos
        
        System.out.println("Ascensor creado exitosamente");
        
        do{
            //Mensajes del menu
            System.out.println("--------Ascensor--------");
            System.out.println("    1) Subir    ");
            System.out.println("    2) Bajar    ");
            System.out.println("    3) Salir    ");
            System.out.println("Elije una opcion");
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


        /*private static Ascensor ascensor = null;

        private static Scanner teclado = new Scanner(System.in);

        public static void main(String[] args) {

            while (ascensor == null) {
                System.out.print("Indique cuál es el piso más alto del edificio: ");
                int finalFloor = Integer.parseInt(teclado.nextLine());
                if (finalFloor < 2) {
                    System.out.println("Valor inaceptable. Edificio debe tener mínimo dos pisos");
                } else {
                    ascensor = new Ascensor(finalFloor);
                }
            }

            //Tenemos ascensor, abrimos menu
            int opcion = 0;
            while (opcion != 2) {
                System.out.println("\nPiso Actual: " + ascensor.getActualFloor());
                System.out.println("[1] - Subir en el ascensor");
                System.out.println("[2] - Bajar en el ascensor");
                System.out.println("[3] - Salir del programa");
                System.out.print("Escoja opción: ");
                while (opion != 0) {
                System.out.println("Elija entre los valores 1 y 2");
                opcion = Integer.parseInt(teclado.nextLine());
                switch (opcion) {
                    case 1:
                        Subir();
                        break;
                    case 2:
                        Bajar();
                        break;
                    case 3:
                        System.out.println("\nFIN DE PROGRAMA");
                        break;
                    default:
                        System.out.println("Elija entre los valores 1 y 2");
                }
            }

        }

    }

                System.out.print("\n¿Cuántas personas suben al ascensor?: ");
                int Person = Integer.parseInt(teclado.nextLine());
                System.out.print("¿Piso destino?: ");
                int destinationFloor = Integer.parseInt(teclado.nextLine());
                ascensor.Desplazamiento(Person, destinationFloor);
            //} catch (NumberFormatException ex) {
            //    System.out.println("Error. Solo se admiten números enteros.");
            //} catch (Exception e) { //Aquí capturamos las excepciones que lanza el Ascensor
              //  System.out.println(e.getMessage());*/
