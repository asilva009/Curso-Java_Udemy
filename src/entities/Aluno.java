package entities;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String status() {
		if(notaFinal() > 60) {
			return "APROVADO";
		}
		else {
			System.out.println("REPROVADO");
			double pf = 60 - notaFinal();
			return String.format("FALTAM %.2f",pf) + " PONTOS";
		}
	}
		
}
