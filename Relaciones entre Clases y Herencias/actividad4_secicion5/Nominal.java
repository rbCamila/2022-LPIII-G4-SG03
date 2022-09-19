
package actividad4_secicion5;

public abstract class Nominal {
    private String nombre;
    abstract public double nomica();
    public Nominal (String nombreNomina ){
        this.nombre = nombreNomina;
    }
    final public boolean mayorQue (Nominal otra) {
        return this.nomica()>otra.nomica();
    }
    final public String toString(){
        return this.nombre + " con sueldo " + this.nomica();
    }
}
    
