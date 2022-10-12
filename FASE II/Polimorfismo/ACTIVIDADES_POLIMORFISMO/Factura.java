
package actividad.seccion06;

public class Factura implements PorPagar{
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String pieza, String descripcion, int cuenta, double precio) {
        this.numeroPieza = pieza;
        this.descripcionPieza = descripcion;
        setCantidad(cuenta);
        setPrecioPorArticulo(precio);
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }
    
    
    
    
    public double obtenerMontoPago()  {
        return getCantidad()*getPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return  "Factura:" + "\nnumero de Pieza=" + numeroPieza + 
                " \ndescripcionPieza=" + descripcionPieza + " \ncantidad=" + cantidad + "  \nprecioPorArticulo=" + precioPorArticulo + '}';
    }
    
    
}

