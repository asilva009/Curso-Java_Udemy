package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class FuncionariosApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.print("Quantos funcion�rios ser�o registrados? ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.println();
			System.out.println("Funcion�rio #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Sal�rio: ");
			Double salario = sc.nextDouble();
			
			Funcionarios func = new Funcionarios(id, nome, salario);
			
			list.add(func);
					
		}
		
		System.out.println();
		System.out.print("Entre com o Id do funcion�rio que ter� aumento: ");
		int idMais = sc.nextInt();
		Integer pos = position(list, idMais);
		if (pos == null) {
			System.out.println("Id n�o existe!");
		}
		else {
			System.out.print("Entre com a porcentagem de aumento: ");
			double porcentagem = sc.nextDouble();
			list.get(pos).aumentoSalario(porcentagem);
		}	
		
		sc.close();
		
		System.out.println();
		System.out.println("Lista de funcion�rios:");
		for(Funcionarios func: list) {
			System.out.println(func);
		}
	}
	
	public static Integer position(List<Funcionarios> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}	

}


