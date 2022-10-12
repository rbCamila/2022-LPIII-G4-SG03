
package actividad4_secicion5;

public class EmpleadoDistribucion extends Asalariado{
    private String region;
    private double salariodist;
    public EmpleadoDistribucion (String nombre,long dni,int diasVacaciones,double salario, String region){
        super(nombre,dni,diasVacaciones,salario);
        this.region = region;
    }
    public double nomica () {
        double a,b;
        a=getSalario();
        b =getSalario()*0.1;
        this.salariodist= a+b;
        return this.salariodist;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getSalariodist() {
        return salariodist;
    }

    public void setSalariodist(double salariodist) {
        this.salariodist = salariodist;
    }

    public String getRegion() {
        return region;
    }
    @Override
    public String toString() {
        return "Empleado de Distribucion" +
                ", \ndni            : " + getDni()+ 
                "  \nnombre         : " + getNombre() +                 
                ", \ndiasVacasiones : " + getDiasVacasiones() + " dias"+
                "     Zona  : "+region+
                ", \nsalario        : " + this.nomica();
    } 
}

