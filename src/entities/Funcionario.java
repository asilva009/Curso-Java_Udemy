package entities;

public class Funcionario {
	
	public String nome;
	public double salario;
	public double imposto;
	
	public double salarioLiquido() {
		return salario - imposto;
	}
	
	public void aumentoSalario(double porcentagem) {
		salario *= 1 + porcentagem/100.0;
	}
	
	public String toString() {
		return nome
			+ ", $ "
			+ String.format("%.2f%n", salarioLiquido());
				
	}
}
