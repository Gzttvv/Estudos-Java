package basicos;
import java.util.Locale;
import java.util.Scanner;
public class Beecrowd_1018 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int acumulador,notas;
		
		int a = sc.nextInt();
		
		System.out.println(a);
		 notas = a / 100;
		 acumulador = a%100;
		 System.out.println(notas+" nota(s) de R$ 100,00");
		 
		 notas = acumulador/50;
		 acumulador = acumulador%50;
		 System.out.println(notas+" nota(s) de R$ 50,00");
		 
		 notas = acumulador/20;
		 acumulador = acumulador%20;
		 System.out.println(notas+" nota(s) de R$ 20,00");
		 
		 notas = acumulador/10;
		 acumulador = acumulador%10;
		 System.out.println(notas+" nota(s) de R$ 10,00");
		 
		 notas = acumulador/5;
		 acumulador = acumulador%5;
		 System.out.println(notas+" nota(s) de R$ 5,00");
		 
		 notas = acumulador/2;
		 acumulador = acumulador%2;
		 System.out.println(notas+" nota(s) de R$ 2,00");
		 
		 notas = acumulador/1;
		 acumulador = acumulador%1;
		 System.out.println(notas+" nota(s) de R$ 1,00");
		 
		
		
		sc.close();
	}
}

	
		
		
		
	

