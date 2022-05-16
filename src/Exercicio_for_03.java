import java.util.Locale;
import java.util.Scanner;

public class Exercicio_for_03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
				
		for (int i = 0; i < N; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			double mp = (n1*2 + n2*3 + n3*5)/10.0;
			System.out.printf("%.1f%n",mp);
		}
		
		sc.close();

	}

}
