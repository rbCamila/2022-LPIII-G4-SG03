package pkg11_actividad01;
public class Main {

    public static void main(String[] args) {
        Persona x = new Persona("Elmer","Umacollo","995753485");
        Goodies y = new Goodies(15,"Verde",58.6f);
        Procedencia z = new Procedencia("Cusco","Espinar");
        Estudiante m = new Estudiante("Ing.Sistemas",z,"Elmer","Umacollo","995753485");        
        
        
        String[] arrayPersona = {"Juan","Jacobo Hunter","997245315"};
        System.out.println("\fMostrar nuestro arrayPersona\f");
        for (int i = 0; i < arrayPersona.length; i++) {            
            System.out.println(arrayPersona[i]);
        }
        Verificadora<String> verPersona = new Verificadora<String>(arrayPersona);
        System.out.println(">> Verificacion por nombre:");
        boolean msg =verPersona.contiene(x.getNombres());
        System.out.println("El "+x.getNombres()+" es "+msg);
        System.out.println();
        
        Object[] arrayGoodies = {15,"Rojo",356.25f};
        System.out.println("\fMostrar nuestro arrayGoodies\f");
        for (int i = 0; i < arrayGoodies.length; i++) {            
            System.out.println(arrayGoodies[i]);
        }
        Verificadora<Object> verGoodies = new Verificadora<Object>(arrayGoodies);
        System.out.println(">>Verificacion por id:");
        boolean msg1 = verGoodies.contiene(y.getId());
        System.out.println("El "+y.getId()+" es "+msg1);
        System.out.println();
        
        String[] arrayEstudiante = {"Ing.Mecanico", "Arequipa", "Yanahuara", "Juan","Jacobo Hunter", "984548621"};
        System.out.println("\fMostrar nuestro arrayEstudiante\f");
        for (int i = 0; i < arrayEstudiante.length; i++) {            
            System.out.println(arrayEstudiante[i]);
        }
        Verificadora<String> verEstudiante = new Verificadora<String>(arrayEstudiante);
        System.out.println(">> Verificacion por nombre y su procedencia:");
        boolean msg2 = verEstudiante.contiene(m.getNombres()+m.getP().getDepartamento()+m.getP().getProvincia());
        System.out.println("El "+m.getNombres()+" "+m.getP().getDepartamento()+" "+m.getP().getProvincia()+" es "+msg2);
        System.out.println();
    }    
}
