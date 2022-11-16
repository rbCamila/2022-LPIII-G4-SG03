package pkg10_ejercicio3;
public class Main {

    public static void main(String[] args) {
        System.out.println(">>Comparando diferentes tipos de Datos<<");
        String a,b;
        int c,d;
        double e,f;
        char g,h;
        a="PruebaGenerica";b= "PruebaGenerica";
        c=15;d=16;
        e=18.9;f=18.9;
        g='Y';h='J';
        System.out.printf("STRINGS: ");
        System.out.println(isEqualTo(a,b)); 

        System.out.printf("ENTEROS: ");
        System.out.println(isEqualTo(c,d));

        System.out.printf("DOUBLES: ");
        System.out.println(isEqualTo(e,f));

        System.out.printf("CHARS: ");
        System.out.println(isEqualTo(g,h));
    }

    public static <T> boolean isEqualTo(T x, T y) { 
        return x.equals(y);
    }
}