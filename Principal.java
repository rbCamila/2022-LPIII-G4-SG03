import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int vida, rp;
		boolean fl = false;
		vida = 0;
		Scanner sc = new Scanner(System.in);
		do {
			vida++;
			System.out.println("Vida:"+ vida +"\t�Cu�l es el n�mero secreto? ");
			rp = sc.nextInt();
			if(rp == 1234)
				fl = true;
		} while(vida < 3 && !fl);
		if(fl == true)
			System.out.println("Adivinaste!!!! Se hizo acreedor de un viaje a Francia.");
		else
			System.out.println("ups, perdiste...");
	}
}