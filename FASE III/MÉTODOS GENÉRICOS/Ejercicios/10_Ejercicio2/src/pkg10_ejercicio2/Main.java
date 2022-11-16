package pkg10_ejercicio2;
public class Main { 
    public static void main(String[] args) throws Exception {
        Integer[] intArray = {15, 8, 6, 4, 9}; 
        Double[] doubleArray = {2.5, 6.4, 7.1, 2.8, 10.6}; 
        Character[] charArray = {'P', 'E', 'R', 'U'};  

        System.out.println("Antes del cambio de posiciones: "); 
        imprimirArray(intArray); 
        PosiIntercamb(intArray, 1, 4); 
        System.out.println("Despues del cambio de posiciones: "); 
        imprimirArray(intArray); 
        System.out.println(); 
 
        System.out.println("Antes del cambio de posiciones: "); 
        imprimirArray(doubleArray); 
        PosiIntercamb(doubleArray, 0, 4); 
        System.out.println("Despues del cambio de posiciones: "); 
        imprimirArray(doubleArray); 
        System.out.println(); 

        System.out.println("Antes del cambio de posiciones: "); 
        imprimirArray(charArray); 
        PosiIntercamb(charArray, 0, 2); 
        System.out.println("Despues del cambio de posiciones: "); 
        imprimirArray(charArray);    
        System.out.println(); 
    } 

    public static <T> void imprimirArray(T[] inputArray) { 
        for (T elemento : inputArray) { 
            System.out.printf("%s ", elemento); 
        } 
        System.out.println(); 
    } 

    public static <T> void PosiIntercamb(T[] array, int pos1, int pos2) { 
        T temp; 
        temp = array[pos1]; 
        array[pos1] = array[pos2]; 
        array[pos2] = temp; 
    } 
}