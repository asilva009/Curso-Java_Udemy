import java.util.Locale;
import java.util.Scanner;

public class Exercicio_while_01 {

		public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 valores:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("PRIMEIRO");
			}
			else if (x > 0 && y < 0) {
				System.out.println("QUARTO");
			}
			else if (x < 0 && y > 0) {
				System.out.println("SEGUNDO");
			}
			else {
				System.out.println("TERCEIRO");
			}
			System.out.println("Digite 2 valores:");
			 x = sc.nextDouble();
			 y = sc.nextDouble();
		}
		
		sc.close();

	}
}	


