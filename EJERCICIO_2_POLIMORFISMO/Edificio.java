
package EJERCICIO_2_POLIMORFISMO;

public class Edificio implements ImpactoEcologico {
    private final double FactorDeEmision = 0.5;
    private final double podercalorifico = 13.97;
    private double usodecalefaccion;
 
    private int tiempoensendido;

    public Edificio(double calefaccion, int ensendido) {
        setUsodecalefaccion(calefaccion);
        setTiempoensendido(ensendido);
    }

    public void setUsodecalefaccion(double usodecalefaccion) {
        this.usodecalefaccion = usodecalefaccion;
    }

    public void setTiempoensendido(int tiempoensendido) {
        this.tiempoensendido = tiempoensendido;
    }

    public double getUsodecalefaccion() {
        return usodecalefaccion;
    }

    public int getTiempoensendido() {
        return tiempoensendido;
    }
    public double DatosActividad(){
        double datosActividad;
        datosActividad = (getUsodecalefaccion()/podercalorifico)*getTiempoensendido();
        return datosActividad;
    }

    @Override
    public String toString() {
        return "Edificio:" + 
                "\nusando calefaccion a        : " + usodecalefaccion +" Kilovatios"+
                "\ntiempo de uso               : " + tiempoensendido+" horas"+
                "\nuso total de la calefaccion : "+DatosActividad()+"  m3 de gas";
                
    }    
    
    public double obtenerImpactoEcologico(){
        double impactoEcologico;        
        impactoEcologico = DatosActividad()*FactorDeEmision;
        return impactoEcologico;
    }
}
