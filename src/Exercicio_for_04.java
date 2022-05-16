import java.util.Locale;
import java.util.Scanner;

public class Exercicio_for_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		
		for (int i = 0; i < N; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			if (y == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				double div = x/y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();

	}

}
