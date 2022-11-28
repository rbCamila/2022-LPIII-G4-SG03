package pkg11_ejercicio02;

public class Main {

    public static <V> void main (String[] args) throws ObjectNoExist {
        Dictionary<String, Integer> dicciona = new Dictionary<String, Integer>();
        
        dicciona.add("Elmer", 1);
        dicciona.add("Camila", 2);
        dicciona.add("Josue", 3);
        dicciona.add("Mario", 4);
        dicciona.add("Paolo", 5);
        System.out.println(dicciona);
        dicciona.delete("Paolo");
        System.out.println();
        System.out.println(dicciona);
        System.out.println();
        System.out.println("Al evaluar la key es: "+dicciona.getValue("Elmer"));
        System.out.println();        
    }
}
