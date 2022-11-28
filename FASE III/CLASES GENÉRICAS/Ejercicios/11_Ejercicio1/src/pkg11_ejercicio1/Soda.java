package pkg11_ejercicio1;
public class Soda extends Biscuits{
    private String marca;

    public Soda(String marca, String procedencia, int id, String description, float price) {
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
        return "Soda [Marca=" + marca + " precio = "+getPrice()+"]";
    }
}
