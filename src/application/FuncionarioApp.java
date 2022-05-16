package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class FuncionarioApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		System.out.print("Salario: ");
		func.salario = sc.nextDouble();
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		System.out.println();
		System.out.println("Funcionário: " + func);
		System.out.println();
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double porcentagem = sc.nextDouble();
		func.aumentoSalario(porcentagem);
		System.out.println();
		System.out.println("Dados atualizados: " + func);
		
		
		sc.close();

	}

}
