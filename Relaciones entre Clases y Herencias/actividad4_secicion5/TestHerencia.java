
package actividad4_secicion5;

public class TestHerencia {

    public static void main(String []args) {
      Asalariado empleado1 = new Asalariado ("Camila Rodriges",73521424,10,3500.0);
      EmpleadoProduccion empleado2 =new EmpleadoProduccion("Elmer Hanccoccallo",71052611,5,3500.0,"Tarde");
      EmpleadoDistribucion empleado3 =new EmpleadoDistribucion("Lestlie Talavera",72052142,20,3500.0,"Centro");
      
      
      System.out.println(empleado1.toString());
      System.out.println("-------------------------------------------------");
      System.out.println(empleado2.toString());
      System.out.println("-------------------------------------------------");
      System.out.println(empleado3.toString());
      System.out.println("-------------------------------------------------");
      
      
  }    
}