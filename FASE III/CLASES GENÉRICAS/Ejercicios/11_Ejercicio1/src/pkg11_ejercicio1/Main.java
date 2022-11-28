package pkg11_ejercicio1; 
public class Main {
    public static void main(String[] args)throws Exception{   
        CandyBags<Goodies> bolsaGoodies = new CandyBags<Goodies>(6);        
        Chocolates granular = new Chocolates("quillabamba",12, "granos", 22.3f);
        Soda field = new Soda("Field","Estados Unidos", 35, "hechas de bicarbonato de sodio", 1.8f);
        Sweet margarita = new Sweet("Margarita","Francia", 15, "hechas de avenas y pasas", 2.3f);
        Biscuits Oreo = new Biscuits("Nueva York",10, "cacao magro con arina de trigo", 5.6f);
        try{
            bolsaGoodies.add(granular);
            bolsaGoodies.add(field);
            bolsaGoodies.add(margarita);
            bolsaGoodies.add(Oreo);
            System.out.println(bolsaGoodies);
            Goodies barato = bolsaGoodies.cheapest();
            System.out.println(barato);
            CandyBags<Goodies> bolsa = bolsaGoodies.mostExpensive(1);
            System.out.println(bolsa);
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}
