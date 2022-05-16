package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class AlunoApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		System.out.print("Nota1: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota3: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f%n",aluno.notaFinal());
		System.out.println(aluno.status());		
		
		sc.close();

	}

}
