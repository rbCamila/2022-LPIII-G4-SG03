package ejercicio02;
import java.time.LocalDate;
public class PerfilMedico {
    private String nombre;
    private String apellido;
    private char sexo;
    private double altura;
    private double peso;
    private int dia;
    private int mes;
    private int anio;

    public PerfilMedico(String nombre, String apellido, char sexo, double altura, double peso, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNaci_dia(int dia) {
        this.dia = dia;
    }

    public void setNaci_mes(int mes) {
        this.mes = mes;
    }

    public void setNaci_anio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getNaci_dia() {
        return dia;
    }

    public int getNaci_mes() {
        return mes;
    }

    public int getNaci_anio() {
        return anio;
    }    
    
    public int calcularEdad()
    {
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - anio;
        return edad;
    }
    public double calcularIMC()
    {
        double imc = 0.0;
        imc = this.peso/this.altura;
        return imc;
    }
    public double calcularFrecuenciaCardiacaMaxima()
    {
        double frecuencia=0;
        frecuencia = 208-0.7*calcularEdad();
        return frecuencia;
    }

    @Override
    public String toString() {
        if(sexo=='m')
            return "     PerfilMedico{" + "\nnombre=" + nombre + ",\napellido=" + apellido + 
                    ",\nsexo= Masculino(" + sexo + "),\naltura=" + altura + ",\npeso=" 
                    + peso + ",\ndia del nacimiento= " + dia + ",\nmes del nacimiento=" 
                    + mes + ",\nanio del nacimiento=" + anio + '}';
        else
            return "     PerfilMedico{" + "\nnombre=" + nombre + ",\napellido=" + apellido + 
                    ",\nsexo= Femenino(" + sexo + "),\naltura=" + altura + ",\npeso=" +
                    peso + ",\ndia del nacimiento=" + dia + ",\nmes del nacimiento=" + 
                    mes + ",\nanio del nacimiento=" + anio + '}';
    }
    
}
