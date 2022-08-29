/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpiii_g04_3;

/**
 *
 * @author ACER
 */
public class PerfilMedico {
    
    private String priNombre;
    private String apellido;
    private int día;
    private int mes;
    private int año;
    public char sexo;
    private double altura;
    private double peso;
    private int añoActual;
    private double edad;
    public double FCM;
    public double IMC;
    
    public PerfilMedico(String priNombre, String apellido, int día, int mes, int año, double altura, double peso) {
        this.priNombre = priNombre;
        this.apellido = apellido;
        this.día = 25;
        this.mes = 1;
        this.año = 2000;
        this.altura = 0.0;
        this.peso = 0.0;
        this.añoActual = 2022;
        this.edad = 0;
        this.FCM = 70;
        this.IMC = 18.5;
    }
    
    public PerfilMedico() {
        this.priNombre = "Tatiana";
        this.apellido = "Oviedo";
        this.día = 10;
        this.mes = 9;
        this.año = 2006;
        this.altura = 1.64;
        this.peso = 50.90;
        this.añoActual = 2022;
        this.edad = 18;
        this.FCM = 70;
        this.IMC = 18.5;
    }
    
    public String getpriNombre() {
        return priNombre;
    }
    public void setpriNombre(String priNombre) {
        this.priNombre = priNombre;
    }
    
    public String getapellido() {
        return apellido;
    }
    
    public void setapellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getdía() {
        return día;
    }
    public void setdia(int día) {
        this.día = día;
    }
    
    public int getmes() {
        return mes;
    }
    
    public void setmes(int mes) {
        this.mes = mes;
    }
    
    public int getaño(){
        return año;
    }
    
    public void setaño(int año){
        this.año = año;
    }
    
    public int getañoActual(){
        return añoActual;
    }
    
    public void setañoActual(int añoActual){
        this.añoActual = añoActual;
    }
    
    public double getedad(){
        return edad;
    }
    
    public void setedad(double edad){
        this.edad = edad;
    }
    
    public double getaltura(){
        return altura;
    }
    
    public void setaltura(double altura){
        this.altura = altura;
    }
    
    public double getpeso(){
        return peso;
    }
    
    public void setpeso(double peso){
        this.peso = peso;
    }
    
    
    public static Double CalEdad (PerfilMedico p1, double edad, int año, int añoActual) {
        p1.getañoActual();
        p1.getaño();
        p1.getedad();
        
        edad = añoActual - año;
        return edad;
    }
    
    public static Double CalFCM (PerfilMedico p1, double edad, double FCM) {
        p1.getedad();
        
        FCM = 200 - 0.7 * edad;
        
        return FCM;
    }
    
    public static Double CalIMC (PerfilMedico p1, double peso, double IMC, double altura) {
        p1.getedad();
        p1.getaltura();
        p1.getpeso();
        
        IMC = peso / altura;
        
        return IMC;
    }
}
