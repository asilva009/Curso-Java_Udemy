package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CadastroConta;

public class CadastroContaApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CadastroConta cadastro;
		
		System.out.print("Número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Depósito inicial (y/n)? ");
		char resposta = sc.next().charAt(0);
		if(resposta == 'y') {
			System.out.print("Depósito inicial: ");
			double depIn = sc.nextDouble();
			cadastro = new CadastroConta(numero, nome, depIn);
		}
		else {
			cadastro = new CadastroConta(numero, nome);
		}	
		
			
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(cadastro);
		
		System.out.print("Entre com o valor do depósito: ");
		double valorDep = sc.nextDouble();
		cadastro.deposito(valorDep);
		System.out.println("Dados atualizados:");
		System.out.println(cadastro);
		
		System.out.print("Entre com o valor de saque: ");
		double valorSaq = sc.nextDouble();
		cadastro.saque(valorSaq);
		System.out.println("Dados atualizados:");
		System.out.println(cadastro);
		
		sc.close();

	}

}
