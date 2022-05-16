import java.util.Scanner;

public class Exercicio_sequencial_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 valores inteiros:");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int diferenca = A*B - C*D;
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();

	}

}
