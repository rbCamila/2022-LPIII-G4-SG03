package pkg10_actividad1_parte2;
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
        
        System.out.printf("\nMinimo de >> %d, %d, %d y %d <<es: %d%n%n",
                4, 5, 2, 3, minimo(4,5,2,3));
        System.out.printf("Minimo de >> %.1f, %.1f, %.1f y %.1f <<es: %.1f%n%n",
                6.6, 7.7, 8.8,5.5, minimo(5.5,6.6,7.7,8.8));
        System.out.printf("Minimo de >> %s, %s, %s y %s <<es:  %s%n%n",
                "pera", "zanahoria", "uva","manzana", minimo("pera","zanahoria","uva","manzana"));
    }
    
    public static <T> void imprimirArray(T[] inputArray) {
        for(T elemento : inputArray)
            System.out.printf("%s ",elemento);
        System.out.println();
    }
    
    public static <T extends Comparable<T>> T minimo (T x, T y, T z,T m){
        T min = x;
        if(y.compareTo(x) < 0)
            if(y.compareTo(m)<0)
                if(y.compareTo(z) < 0)
                    min = y;
        if(z.compareTo(x) < 0)
            if(z.compareTo(y) < 0)
                if(z.compareTo(m) < 0)
                    min = z;
        if(m.compareTo(y) < 0)
            if(m.compareTo(z) < 0)
                if(m.compareTo(x) < 0)
                    min = m;
        return min;
    }
}