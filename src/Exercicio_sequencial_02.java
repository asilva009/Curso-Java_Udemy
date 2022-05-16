import java.util.Locale;
import java.util.Scanner;

public class Exercicio_sequencial_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio");
		double raio = sc.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2);
		System.out.printf("A = %.4f", area);		
		
		sc.close();
	}

}
