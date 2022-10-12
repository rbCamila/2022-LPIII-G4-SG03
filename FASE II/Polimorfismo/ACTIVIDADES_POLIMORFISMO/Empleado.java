
package actividad.seccion06;

public abstract class Empleado implements PorPagar{
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    public Empleado(String nombre, String apellido, String nss) {
        this.primerNombre = nombre;
        this.apellidoPaterno = apellido;
        this.numeroSeguroSocial = nss;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    @Override
    public String toString() {
        return "Empleado" + " \nprimerNombre= " + primerNombre + "\n apellidoPaterno= " + apellidoPaterno + " \nnumeroSeguroSocial= " + numeroSeguroSocial;
    }
    
    
}
