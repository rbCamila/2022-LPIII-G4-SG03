
package actividad_seccion5;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    static int C = 999;
    static int B = 4999;
    static int E = 7999; 
    public Persona(int id, String nombre, String apellido) {
        C++; 
        String numero;
        numero = "C" + C; 
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new Cuenta(numero);
    }
    public Persona(int id, String nombre, String apellido,double saldo,char tipoCliente) {        
        char opc = tipoCliente;
        String numero = "C";
        switch(opc){
            case 'C':
                C++;
                numero = "C" + C; 
                break;
            case 'B':
                B++;
                numero = "B" + B; 
                break;
            case 'E':
                E++;
                numero = "E" + E; 
                break;
        }
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new Cuenta(numero,saldo,tipoCliente);
    } 
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    @Override
    public String toString() {
        return  "Cliente : " + id + 
                "\nTipo    : " + getCuenta().getTipoCliente() + 
                "\nNombres : " + nombre + ' ' + apellido + 
                "\nNo. Cuenta : " + getCuenta().getNumero()+ "    Saldo : "+  getCuenta().getSaldo() + ' ';
    }
    
}
