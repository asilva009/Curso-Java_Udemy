import java.util.Scanner;

public class Exercicio_condicional_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dj = 0;
		
		System.out.println("Digite as horas de inicio e fim do jogo:");
		int hi = sc.nextInt();
		int hf = sc.nextInt();
		
		if(hi < hf) {
			dj = hf - hi;
		}
		else {
			dj = 24 - hi + hf;
		}
		
		System.out.println("O JODO DUROU " + dj + "HORA(S)");
		
		sc.close();

	}

}
