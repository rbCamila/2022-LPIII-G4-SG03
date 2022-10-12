/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

public class CuentaBanco {
    private String titular;
    private double cantidad;

    public CuentaBanco(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }
    public CuentaBanco(String titular,double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "CuentaBanco{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    public void ingresar(double cantidad) {
        if(cantidad >= 0){
            this.cantidad = this.cantidad + cantidad;
            System.out.println("su saldo es "+this.cantidad);
                      
        }
    }
    
    public void retirar(double cantidad) {
        this.cantidad = this.cantidad - cantidad;
        if(this.cantidad < 0){
            this.cantidad = 0;
            System.out.println("su saldo es "+this.cantidad);}
        else
            System.out.println("su saldo es "+this.cantidad);
            
    }  
}
