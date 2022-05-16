import java.util.Locale;
import java.util.Scanner;

public class Exercicio_condicional_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double imposto = 0;
		
		System.out.println("Digite o salário:");
		double salary = sc.nextDouble();
		
		if (salary <= 2000.00) {
			imposto = 0;
		}
		else if ( salary <= 3000.00) {
			imposto = (salary-2000)*8/100;
		}
		else if (salary <= 4500.00) {
			imposto = 80 + (salary - 3000)*18/100;
		}
		else {
			imposto = 350 + (salary - 4500)*28/100;
		}
		
		if (imposto == 0) {
			System.out.println("Isento");
		}
		else {
		System.out.printf("R$ %.2f", imposto);
		}
		
		sc.close();

	}

}
