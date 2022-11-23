package pkg11_actividad04;

public class Biscuits extends Goodies{
    private String procedencia;

    public Biscuits(String procedencia, int id, String description, float price) {
        super(id, description, price);
        this.procedencia = procedencia;
    }	
	
    public String getProcedencia() {
	return procedencia;
    }

    public void setProcedencia(String procedencia) {
	this.procedencia = procedencia;
    }

    @Override
    public String toString() {
	return "Biscuits [procedencia=" + procedencia + " precio = "+getPrice()+"]";
    }
}
