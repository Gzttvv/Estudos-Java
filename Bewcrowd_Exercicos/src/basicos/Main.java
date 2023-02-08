package basicos;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

	
	/**
	 * IMPORTANT: 
	 *      O nome da classe deve ser "Main" para que a sua solução execute
	 *      Class name must be "Main" for your solution to execute
	 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
	 */
	public class Main {
	 
	    public static void main(String[] args) throws IOException {
	 
	    	Locale.setDefault(Locale.US);
	    	Scanner sc = new Scanner(System.in);
	    	
	    	int notas;
	    	double acc,moedas;
	    	
	    	double a = sc.nextDouble();
	    	
	    	System.out.println("NOTAS:");
	    	
	    	
	    		
	    		notas = (int) a / 100;
	    		acc = a%100;
	    		System.out.println(notas+" nota(s) de R$ 100.00");
	    		
	    		notas = (int) acc/50;
	    		acc = acc%50;
	    		System.out.println(notas+" nota(s) de R$ 50.00");
	    		
	    		notas = (int) acc/20;
	    		acc = acc%20;
	    		System.out.println(notas+" nota(s) de R$ 20.00");
	    		
	    		notas = (int) acc/10;
	    		acc = acc%10;
	    		System.out.println(notas+" nota(s) de R$ 10.00");
	    		
	    		notas = (int) acc/5;
	    		acc = acc%5;
	    		System.out.println(notas+" nota(s) de R$ 5.00");
	    		
	    		notas = (int) acc/2;
	    		acc = acc%2;
	    		System.out.println(notas+" nota(s) de R$ 2.00");
	    		
	    		System.out.println("MOEDAS: ");
	    		
	    		moedas = (int)acc/1;
	    		acc= acc%1;
	    		System.out.printf("%.0f moeda(s) de R$ 1.00\n",moedas);
	    		
	    		moedas = acc/0.50;
	    		acc= acc%0.50;
	    		System.out.printf("%.0f moeda(s) de R$ 0.50\n",moedas);
	    		
	    		moedas = acc/0.25;
	    		acc= acc%0.25;
	    		System.out.printf("%.0f moeda(s) de R$ 0.25\n",moedas);
	    		
	    		moedas = acc/0.10;
	    		acc= acc%0.10;
	    		System.out.printf("%.0f moeda(s) de R$ 0.10\n",moedas);
	    		
	    		moedas = acc/0.05;
	    		acc= acc%0.05;
	    		System.out.printf("%.0f moeda(s) de R$ 0.05\n",moedas);
	    		
	    		moedas = acc/0.01;
	    		acc= acc%0.01;
	    		System.out.printf("%.0f moeda(s) de R$ 0.01\n",moedas);
	    		
	    		
	    		
	    	
	    	
	    	
	    	sc.close();
	    		
	}
	    
}