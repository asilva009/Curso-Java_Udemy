package entities;

public class CadastroConta {
	
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public CadastroConta(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}
	
	public CadastroConta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getsaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		 saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.00;
	}

	
	public String toString() {
		return "Numero da Conta "
				+ numeroConta
				+ ", Nome do Titular: "
				+ nomeTitular
				+ String.format(", Saldo: $ %.2f%n", saldo);
	}	
	
}
