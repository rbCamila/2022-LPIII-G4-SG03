
package actividad_seccion5;

public class Cuenta {
    private String numero;
    private double saldo;
    private char tipoCliente;

    public Cuenta(String numero, double saldo,char tipoCliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.tipoCliente = tipoCliente;
    }
    public Cuenta(String numero, char tipoCliente){
        this(numero, 50,tipoCliente);
    }
    public Cuenta(String numero){
        this(numero,50,'C');
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public void retirar(double cantidad){
        double total;
        total = getSaldo() - cantidad;
        setSaldo(total);
    }
    
    public void depositar(double cantidad){
        double total;
        total = getSaldo() + cantidad;
        setSaldo(total);
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", saldo=" + saldo + ", tipoCliente=" + tipoCliente + '}';
    }

    
    
}
