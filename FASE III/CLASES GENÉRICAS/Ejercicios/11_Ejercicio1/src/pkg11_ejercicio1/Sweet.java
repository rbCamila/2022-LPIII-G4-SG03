package pkg11_ejercicio1;
public class Sweet extends Biscuits{
    private String marca;
	
    public Sweet(String marca, String procedencia, int id, String description, float price) {
        super(procedencia, id, description, price);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Sweet [Marca=" + marca + " precio = "+getPrice()+"]";
    }
}
