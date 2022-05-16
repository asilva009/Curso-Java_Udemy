package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;


public class DataApp {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));//para retornar a data no formato UTC
		
		Date y1 = sdf1.parse("25/06/2018 15:40:02");
		Date y2 = sdf2.parse("25/06/2018 15:40:02");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		Date x1 = new Date(); //cria a data no horário atual
		Date x2 = new Date(System.currentTimeMillis());//converte o instante do sistema converte para milisegundos
		                                               //e cria a data com esse valor(retorna o mesmo que new Date()
		Date x3 = new Date(0L); //0L = 0 milisegundos, portanto deveria imprimir a data inicial que o Java armazena
		                        //-> 01/01/1970 00:00:00, porém como estamos em SP(3h a menos)...
		// 1s = 1000 ms
		Date x4 = new Date(1000L * 60L * 60L * 5);
		
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("-------------------------------------");
		System.out.println(y1);
		System.out.println(y2);
		System.out.println("-------------------------------------");
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("-------------------------------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("-------------------------------------");
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("-------------------------------------");
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("-------------------------------------");
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("-------------------------------------");
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("-------------------------------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
	}
}