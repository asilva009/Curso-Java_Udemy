import java.util.Locale;
import java.util.Scanner;

public class Exercicio_sequencial_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Funcionário");
		System.out.println();
		System.out.println("Número:");
		int num = sc.nextInt();
		System.out.println("Horas trabalhadas: ");
		double horas = sc.nextDouble();
		System.out.println("Valor da hora: ");
		double valor = sc.nextDouble();
		
		double salario = horas * valor;
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();

	}

}
