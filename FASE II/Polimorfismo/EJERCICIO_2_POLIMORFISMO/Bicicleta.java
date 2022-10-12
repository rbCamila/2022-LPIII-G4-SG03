
package EJERCICIO_2_POLIMORFISMO;

public class Bicicleta  implements ImpactoEcologico{
    private final double FactorDeEmision = 0.05;
    private int fabricacion;
    private int tiempoUso;

    public Bicicleta(int fabricacion, int tiempoUso) {
        setFabricacion(fabricacion);
        setTiempoUso(tiempoUso);
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public int getTiempoUso() {
        return tiempoUso;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    public void setTiempoUso(int tiempoUso) {
        this.tiempoUso = tiempoUso;
    }
    
    public double DatosActividad(){
        double datosActividad;
        datosActividad = getFabricacion()+getTiempoUso();
        return datosActividad;
    }

    @Override
    public String toString() {
        if (this.fabricacion==229){
            return "Bicicleta: " + "  de carbono"+
                    "\nfabricacion : " + fabricacion + " kg de CO2"+
                    "\ntiempoUso   : " + tiempoUso + " kg de CO2";
        }
        return "Bicicleta: " + "  normal i/o comvencional"+
                    "\nfabricacion : " + fabricacion + " kg de CO2"+
                    "\ntiempoUso   : " + tiempoUso + " kg de CO2";
    }
     
    public double obtenerImpactoEcologico()  {
        double impactoEcologico;        
        impactoEcologico = DatosActividad()*FactorDeEmision;
        return impactoEcologico;
    }
}
