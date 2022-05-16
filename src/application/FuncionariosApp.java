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
		
		System.out.print("Quantos funcionários serão registrados? ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.println();
			System.out.println("Funcionário #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			
			Funcionarios func = new Funcionarios(id, nome, salario);
			
			list.add(func);
					
		}
		
		System.out.println();
		System.out.print("Entre com o Id do funcionário que terá aumento: ");
		int idMais = sc.nextInt();
		Integer pos = position(list, idMais);
		if (pos == null) {
			System.out.println("Id não existe!");
		}
		else {
			System.out.print("Entre com a porcentagem de aumento: ");
			double porcentagem = sc.nextDouble();
			list.get(pos).aumentoSalario(porcentagem);
		}	
		
		sc.close();
		
		System.out.println();
		System.out.println("Lista de funcionários:");
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


