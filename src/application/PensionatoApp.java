package application;

import java.util.Scanner;

import entities.Pensionato;

public class PensionatoApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Pensionato[] vect = new Pensionato[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
				
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int num = sc.nextInt();
			vect[num] = new Pensionato(nome, email);
			
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
		

	}

}
