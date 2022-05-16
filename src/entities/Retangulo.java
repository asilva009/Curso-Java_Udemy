package entities;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return 2.0 * largura + 2.0 * altura;
	}
	
	public double diagonal() {
		return Math.sqrt(altura*altura + largura*largura);
	}
}
