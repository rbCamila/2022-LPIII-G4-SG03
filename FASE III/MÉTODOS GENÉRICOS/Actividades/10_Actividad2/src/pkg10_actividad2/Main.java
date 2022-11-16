
package pkg10_actividad2;
public class Main {
    public static void main(String[] args) throws Exception{
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'C', 'O', 'M', 'E','N', 'Z', 'A', 'R'};
        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray, 1, 4);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray, 1, 8);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray, 1,4);
    }
    public static <T> void imprimirArray(T[] inputArray, Integer limiteInferior, Integer limiteSuperior) throws LimiteInvalidoException {
        try{
            for(int i = limiteInferior; i <= limiteSuperior; i++)
                System.out.printf("%s ",inputArray[i]);
            System.out.println();
        }catch (Exception e) {
            throw new LimiteInvalidoException(" Se salio del limite ");
        }
    }
}
