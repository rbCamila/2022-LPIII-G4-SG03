
package actividad4_secicion5;

public  class Asalariado {
    private String nombre;
    private long dni;
    private int diasVacasiones;
    private double salario;

    public Asalariado(String nombre, long dni, int diasVacasiones,double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacasiones = diasVacasiones;
        this.salario = salario;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setDiasVacasiones(int diasVacasiones) {
        this.diasVacasiones = diasVacasiones;
    }

    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public int getDiasVacasiones() {
        return diasVacasiones;
    }

    public double getSalario() {
        return salario;
    }
    

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado Asalariado" +
                ", \ndni            : " + dni + 
                "  \nnombre         : " + nombre +                 
                ", \ndiasVacasiones : " + diasVacasiones + " dias"+
                ", \nsalario        : " + salario;
    }
    
}
