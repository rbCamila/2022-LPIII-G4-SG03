package pkg11_actividad02;
public class Main {

    public static void main(String[] args) {
        Persona x = new Persona("Elmer");
        OrderedPair<Integer,Integer> pair1 = new OrderedPair<Integer, Integer>(5,6);
        OrderedPair<Integer, String> pair2 = new OrderedPair<Integer, String>(9,"Saludo");
        OrderedPair<String, Persona> pair3 = new OrderedPair<String, Persona>("Despedida",x);
        
        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
    }    
}
