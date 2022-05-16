package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ConversorDolar;

public class ConversorDolarApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Qual o valor do d�lar? ");
		double valor = sc.nextDouble();
		System.out.println("Quantos d�lares ser�o comprados? ");
		double qtd = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em Reais = %.2f", ConversorDolar.conversor(valor, qtd));
		
		sc.close();

	}

}
