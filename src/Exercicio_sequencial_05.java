import java.util.Locale;
import java.util.Scanner;

public class Exercicio_sequencial_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PEÇA 1");
		System.out.println("Código:");
		int code1 = sc.nextInt();
		System.out.println("Quantidade: ");
		int qtd1 = sc.nextInt();
		System.out.println("Valor: ");
		double valor1 = sc.nextDouble();
		System.out.println("");
		System.out.println("PEÇA 2");
		System.out.println("Código:");
		int code2 = sc.nextInt();
		System.out.println("Quantidade: ");
		int qtd2 = sc.nextInt();
		System.out.println("Valor: ");
		double valor2 = sc.nextDouble();
		
		double total1 = qtd1*valor1;
		double total2 = qtd2*valor2;
		double total = total1 + total2;
		
		System.out.printf("Total Peça %d = %.2f%n", code1, total1);
		System.out.printf("Total Peça %d = %.2f%n", code2, total2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		sc.close();

	}

}
