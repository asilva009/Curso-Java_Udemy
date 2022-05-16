import java.util.Locale;
import java.util.Scanner;

public class Exercicio_sequencial_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 3 valores:");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double areaTri = A*C/2.0;
		double areaCir = 3.14159 * Math.pow(C, 2);
		double areaTrap = (A+B)*C/2.0;
		double areaQua= Math.pow(B, 2);
		double areaRet = A*B;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTri);
		System.out.printf("CIRCULO: %.3f%n", areaCir);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrap);
		System.out.printf("QUADRADO: %.3f%n", areaQua);
		System.out.printf("RETANGULO: %.3f%n", areaRet);	
		
		
		sc.close();

	}

}
