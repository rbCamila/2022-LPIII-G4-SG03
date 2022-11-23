package pkg11_actividad03;
public class Main {
    public static void main(String[] args) throws Exception {
        Bag<Integer> bolsaInteger = new Bag<Integer>(3);
        Bag<String> bolsaString = new Bag<String>(4);
        Persona persona1 = new Persona("Mario");
        Persona persona2 = new Persona("Julian");
        Bag<Persona> bolsaPersona = new Bag<Persona>(2);
                
        bolsaInteger.add(1);
        bolsaInteger.add(2);
        bolsaInteger.add(3);
        bolsaInteger.getObjects();
        System.out.println(bolsaInteger);
        bolsaInteger.remove(4);
        System.out.println(bolsaInteger.getIxdex(2));
        System.out.println(bolsaInteger);        
        System.out.println("-------------------------------------------------");
        
        bolsaString.add("elmer");
        bolsaString.add("Camila");
        bolsaString.add("Paul");
        bolsaString.add("Ricardo");
        bolsaString.getObjects();
        System.out.println(bolsaString);
        bolsaString.remove("Camila");
        System.out.println(bolsaString.getIxdex("elmer"));
        System.out.println(bolsaString);        
        System.out.println("-------------------------------------------------");
        
        bolsaPersona.add(persona1);
        bolsaPersona.add(persona2);
        bolsaPersona.getObjects();
        System.out.println(bolsaPersona);
        bolsaPersona.remove(persona2);
        System.out.println(bolsaPersona.getIxdex(persona1));
        System.out.println(bolsaPersona);        
        System.out.println("-------------------------------------------------");        
    }    
}
