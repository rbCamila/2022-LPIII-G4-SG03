package pkg11_actividad04;
public class Chocolates extends Goodies{
    private String procedencia;

    public Chocolates(String procedencia, int id, String description, float price) {
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
        return "Chocolate: " + "procedencia=" + procedencia + " precio = "+getPrice()+'}';
    }    
}
