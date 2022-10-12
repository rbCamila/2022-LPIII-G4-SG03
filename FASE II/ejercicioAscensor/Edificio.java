package ejercicioAscensor;

public class Edificio {
	private int cantidadPisos;
	private String direccion;
	private int numeroPuertas;
	private Ascensor ascensor;
	
	public Edificio(int cantidadPisos, String direccion, int numeroPuertas) {
		this.cantidadPisos = cantidadPisos;
		this.direccion = direccion;
		this.numeroPuertas = numeroPuertas;
		this.ascensor = new Ascensor(this.cantidadPisos);
	}

	public int getCantidadPisos() {
		return this.cantidadPisos;
	}

	public void setCantidadPisos(int cantidadPisos) {
		this.cantidadPisos = cantidadPisos;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroPuertas() {
		return this.numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	public Ascensor getAscensor() {
		return this.ascensor;
	}
	
	@Override
	public String toString() {
		String s = String.format("Edificio\nCantidad de pisos: %d\nDireccion: %s\nNumero de puertas: %d\n%s", this.cantidadPisos,
				this.direccion, this.numeroPuertas, this.ascensor);
		return s;
	}
	
}
