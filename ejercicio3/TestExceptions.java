package ejercicio3;

public class TestExceptions {
	
	public static void main(String[] args) throws Exception{
		boolean flag = true;
		do {
			try {
				procesar();
			}
			catch (ExcepcionVocal | ExcepcionNumero | ExcepcionBlanco e) {
				System.out.println(e.getMessage());
			}
			catch (ExcepcionSalida e) {
				System.out.println(e.getMessage());
				flag = false;
			}
		} while (flag);
	}
	
	public static void procesar() throws Exception {
		LeerEntrada sc = new LeerEntrada(System.in);
		char caracter;
		System.out.print("Ingrese un caracter: ");
		caracter = sc.getChar();
		caracter = Character.toLowerCase(caracter);
		if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
			throw new ExcepcionVocal("Se ingreso una vocal");
		}
		if (caracter == '1' || caracter == '2' || caracter == '3' || caracter == '4' || caracter == '5' 
                        || caracter == '6' || caracter == '7' || caracter == '8'|| caracter == '9' || caracter == '0') {
			throw new ExcepcionNumero("Se ingreso un numero");
		}
		if (caracter == ' ') {
			throw new ExcepcionBlanco("No se ingreso ningun caracter");
		}
		if (caracter == 's') {
			throw new ExcepcionSalida("Salida");
		}
	}	
}
