
package actividad4_secicion5;

public class EmpleadoProduccion extends Asalariado{
    private String turno;
    private double salarioprod;
    public EmpleadoProduccion (String nombre, long dni, int diasVacaciones,double salario, String turno){
        super(nombre,dni,diasVacaciones,salario);      
        this.turno = turno;
    }
    public double nomica () {
        double a,b;
        a=getSalario();
        b =getSalario()*0.15;
        this.salarioprod= a+b;
        return this.salarioprod;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setSalarioprod(double salarioprod) {
        this.salarioprod = salarioprod;
    }

    public String getTurno() {
        return turno;
    }

    public double getSalarioprod() {
        return salarioprod;
    }
    @Override
    public String toString() {
        return "Empleado de Produccion" +
                ", \ndni            : " + getDni()+ 
                "  \nnombre         : " + getNombre() +                 
                ", \ndiasVacasiones : " + getDiasVacasiones() + " dias"+
                "     Turno  : "+turno+
                ", \nsalario        : " + this.nomica();
    }    
    
}