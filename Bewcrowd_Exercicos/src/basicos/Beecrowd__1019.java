package basicos;
import java.io.IOException;
import java.util.Scanner;


public class Beecrowd__1019 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		
		
		int s = sc.nextInt();
		
//		Duration h =  Duration.ofSeconds(s);
//		
//		int horas = h.toHoursPart();
//		int minutos = h.toMinutesPart();
//		int segundos = h.toSecondsPart();
//		
//		System.out.println(horas+ ":" +minutos+ ":" +segundos);
//		
		
		int horas,minutos,segundos;
		
		horas = s/3600;
		minutos = (s%3600)/60;
		segundos = (s%3600)%60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);

		
		sc.close();
 
    }
 
}
