import java.util.Scanner;

public class Exercicio_while_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o combustível:");
		System.out.println("1 - Álcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - FIM");
		int cod = sc.nextInt();
		
		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		
		while(cod != 4) {
		
		while (cod < 1 || cod > 4) {
			System.out.println("Código inválido, digite novamente");
			cod = sc.nextInt();
		}
		
		
			if (cod == 1) {
				alcool ++;
			}
			if (cod == 2) {
				gasolina ++;
			}
			if (cod == 3) {
				diesel ++;
			}
			cod = sc.nextInt();
		}
				
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);	
		
		
		sc.close();
			

	}
}

