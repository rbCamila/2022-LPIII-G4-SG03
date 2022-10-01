
package actividad.seccion06;

public class Prestamo implements PorPagar{
    private int numeroDeCuotas;
    private double montoDeCuotas;

    public Prestamo(int numero, double monto) {
        setNumeroDeCuotas(numero);
        setMontoDeCuotas(monto);
    }

    public void setNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public void setMontoDeCuotas(double montoDeCuotas) {
        this.montoDeCuotas = montoDeCuotas;
    }

    public int getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public double getMontoDeCuotas() {
        return montoDeCuotas;
    }
    
    public double obtenerMontoPago() {
        return getNumeroDeCuotas()*getMontoDeCuotas();
    }

    @Override
    public String toString() {
        return "Prestamo " + " \nnumeroDeCuotas=" + numeroDeCuotas + " \nmontoDeCuotas=" + montoDeCuotas;
    }
    
    
    
    
    
}
