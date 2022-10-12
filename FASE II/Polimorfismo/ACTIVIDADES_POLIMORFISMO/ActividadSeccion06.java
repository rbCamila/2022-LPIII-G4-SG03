
package actividad.seccion06;
import java.util.*;

public class ActividadSeccion06 {

    public static void main(String[] args) {
        PorPagar[] objetosPorPagar= new PorPagar[6];
        
        objetosPorPagar[0]=new Factura("01234","asiento",2,375.00);
        objetosPorPagar[1]=new Factura("56789","llanta",5,74.00);
        objetosPorPagar[2]=new EmpleadoAsalariado("jose","paucar","52-52-35",800.00);
        objetosPorPagar[3]=new EmpleadoAsalariado("juan","llasa","12-12-13",1200.00);
        objetosPorPagar[4]=new Prestamo(12,1200.00);
        objetosPorPagar[5]=new Prestamo(25,1200.00);
        
        System.out.println("Facturas y empleados procesados en forma polimorfica");
        
        for(PorPagar porPagarActual : objetosPorPagar)
        {
            System.out.printf("%s,\n%s:$%,.2f\n\n",
                    porPagarActual.toString(),
                    "pago vencido", porPagarActual.obtenerMontoPago());
        }  
    }
}
