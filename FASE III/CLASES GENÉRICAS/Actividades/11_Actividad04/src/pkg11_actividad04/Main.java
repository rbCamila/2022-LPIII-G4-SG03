package pkg11_actividad04;
public class Main {
    public static void main(String[] args) throws Exception{
        Bag<Goodies> bolsaGoodies = new Bag<Goodies>(5);        
        Chocolates granular = new Chocolates("quillabamba",12, "granos", 25.8f);
        Soda field = new Soda("Field","Estados Unidos", 35, "hechas de bicarbonato de sodio", 1.8f);
        Sweet margarita = new Sweet("Margarita","Francia", 15, "hechas de avenas y pasas", 2.3f);
        Biscuits Oreo = new Biscuits("Nueva York",20, "cacao magro con arina de trigo", 5.6f);
        
        bolsaGoodies.add(granular);
        bolsaGoodies.add(field);
        bolsaGoodies.add(margarita);
        bolsaGoodies.add(Oreo);
        
        System.out.println(bolsaGoodies);         
    }    
}
