
package actividad.seccion06;

public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    
    public EmpleadoAsalariado(String nombre,String apellido,String nss,double salario) {
        super(nombre,apellido,nss);
        setSalarioSemanal(salario);
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }
    
    @Override
    public double obtenerMontoPago() {
    	return getSalarioSemanal();
    }
    
    @Override
    public String toString() {
	return super.toString() + "\nsalario semanal: $" + salarioSemanal;
    }
}
