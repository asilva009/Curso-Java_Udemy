package entities;

public class ConversorDolar {
	
	public static final double IOF = 0.06;
	
	
	public static double conversor(double valor, double qtd) {
		return (valor + valor * IOF) * qtd;
		}	
}
