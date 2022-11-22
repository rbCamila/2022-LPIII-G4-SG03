
package pkg10_ejercicio1;
public class Main {
    public static void main(String[] args) {
        String[] Cadena={"Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho"};
        
        System.out.printf("Array de cadenas contiene:\n");
        imprimirArray(Cadena);
    }   
    
    public static String imprimirArray(String[] cadena){
        int cont=0;
        for (String elemento : cadena) {
            cont++;
            System.out.printf("%s\t", elemento);
            if (cont % 4 == 0)
                System.out.printf("\n");
        }
        System.out.println("\n");
    return "";
    }
}
