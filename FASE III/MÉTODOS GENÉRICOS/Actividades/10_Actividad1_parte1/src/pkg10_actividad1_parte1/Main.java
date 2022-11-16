package pkg10_actividad1_parte1;
public class Main {
    public static void main(String[] args) {        
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'C', 'O', 'M', 'E','N', 'Z', 'A', 'R'};
        Float[] floatArray = {0.33f, 5.98f, 34.2f};
        Boolean[] booleanArray = {true, false, true, true, false};

        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);
        System.out.printf("%nArray floatArray contiene:%n");
        imprimirArray(floatArray);
        System.out.printf("%nArray booleanArray contiene:%n");
        imprimirArray(booleanArray);
        
    }    
    public static <T> void imprimirArray(T[] inputArray) {
        for(T elemento : inputArray)
            System.out.printf("%s ",elemento);

        System.out.println();
    }    
}
