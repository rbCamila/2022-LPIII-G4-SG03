
package actividad_seccion5;


public class Actividad_seccion5 {

    public static void main(String[] args) {
        Persona people1 = new Persona(2534,"Juan","Gonzales");
        Persona people2 = new Persona(9520,"Romario","Chullo",2500.00,'E');
        
                
        System.out.printf("Primera Persona sin determinar tipo: \n");
        System.out.println(people1.toString());
        System.out.printf("------------------------------------\n\n");


        System.out.printf("Segunda Persona determinando tipo: \n");
        System.out.println(people2.toString());
        System.out.printf("------------------------------------\n\n");
        
        people1.getCuenta().depositar(100);
        people2.getCuenta().retirar(200);        
        System.out.printf("saldo de la primera persona despues de depositar 100$: \n");
        System.out.println(people1.getCuenta().getSaldo());
        System.out.printf("saldo de la segunda persona despues de retirar 200$: \n");        
        System.out.println(people2.getCuenta().getSaldo());
    }
}
 
