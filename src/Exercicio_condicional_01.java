import java.util.Scanner;

public class Exercicio_condicional_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 valores inteiros:");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (B%A == 0 || A%B == 0) {
			System.out.println("São Múltiplos");
		}
		else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();

	}

}
