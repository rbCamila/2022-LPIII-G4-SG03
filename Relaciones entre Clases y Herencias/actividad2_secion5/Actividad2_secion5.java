
package actividad2_secion5;

public class Actividad2_secion5 {

    public static void main(String[] args) {
        Automovil people1=new Automovil("5BX-865",5,"TOYOTA","Agya");
        Motor m1=new Motor(4, 4400);
        people1.setMotor(m1);

        Automovil people2=new Automovil("GT1-457",4,"TOYOTA","Corolla");

        System.out.println(people1.toString());
        System.out.println("-------------------------------------");
        System.out.println(people2.toString());
        System.out.println("-------------------------------------");
        System.out.println(m1.toString());
        }
    }
    
