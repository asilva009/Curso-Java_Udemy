import java.util.Scanner;

public class Exercicio_for_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro n�o negativo:");
		int N = sc.nextInt();
		
		while (N < 0) {
			System.out.println("Inv�lido, digite novamente:");
			N = sc.nextInt();
		}
		
		int fat = 1;
		
		for (int i = 1; i <= N; i++) {
			fat *= i;
		}
		
		System.out.println(N + "!" + " = " + fat);
		
		
		sc.close();

	}

}
