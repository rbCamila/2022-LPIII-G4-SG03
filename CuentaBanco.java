/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpiii_g04_2;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class CuentaBanco { //clase CuentaBanco

    //Atributos String Double
    private String titular;
    private double cantidad;

    //constructores 
    public CuentaBanco(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public CuentaBanco() {
        this.titular = "Persona1";
        this.cantidad = 200;
    }

    //métodos get set 
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "CuentaBanco{" + "Titular : " + titular + " tiene la cantidad de " + cantidad + "soles"+ '}';
    }

    public static Double ingresar (CuentaBanco c1, double cantidad) {
        c1.getCantidad();
        if (cantidad < 0){
            System.out.println("Cantidad no valida");
        }
        return cantidad;
    }

    public static Double retirar (CuentaBanco c1, double cantidad) {
        c1.getCantidad();
        if (cantidad - cantidad < 0) {
            cantidad = 0;

        } else {
            cantidad -= cantidad;
        }
        return cantidad;
    }
    
    public String titular(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    
    public Double cantidad(){
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
    
    public char CuentaBancochar(){
        Scanner in = new Scanner(System.in);
        return in.next().charAt(0);    }
}
