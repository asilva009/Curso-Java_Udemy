import java.util.Locale;
import java.util.Scanner;

public class Exercicio_condicional_03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		
		System.out.println("Digite o código e a quantidade do item desejado:");
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		
		if (cod == 1) {
			total = qtd * 4.0;
		}
		else if (cod == 2) {
			total = qtd * 4.5;
		}
		else if (cod == 3) {
			total = qtd * 5.0;
		}
		else if (cod == 4) {
			total = qtd * 2.0;
		}
		else {
			total = qtd * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();

	}

}
