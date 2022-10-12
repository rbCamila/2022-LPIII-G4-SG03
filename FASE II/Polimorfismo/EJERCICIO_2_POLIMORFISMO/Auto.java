
package EJERCICIO_2_POLIMORFISMO;

public class Auto implements ImpactoEcologico {
    private final double FactorDeEmision = 0.3;
    private double gasolina;
    private double kilometraje;

    public Auto(double gasolina, double kilometraje) {
        setGasolina(gasolina);
        setKilometraje( kilometraje);
    }    

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getGasolina() {
        return gasolina;
    }

    public double getKilometraje() {
        return kilometraje;
    }
    public double DatosActividad(){
        double datosActividad;
        datosActividad = getKilometraje()/getGasolina();
        return datosActividad;
    }

    @Override
    public String toString() {
        return "Auto:" + 
                "\ngasolina    : " + gasolina + " Litros"+
                "\nkilometraje : " + kilometraje +" Kilometros";
    }
    
    
    public double obtenerImpactoEcologico()  {
        double impactoEcologico;        
        impactoEcologico = DatosActividad()*FactorDeEmision;
        return impactoEcologico;
    }
}
