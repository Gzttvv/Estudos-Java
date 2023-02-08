package programa;

import java.util.Scanner;
import util.CurrentyConverter;
public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cotação do dolar: ");
		double cotDolar = sc.nextDouble();
		System.out.println("Quantos dolares: ");
		double quntDolar = sc.nextDouble();
		double a = CurrentyConverter.dolarReal(cotDolar, quntDolar);
		double b = CurrentyConverter.Iof(cotDolar, quntDolar);
		System.out.printf("valor a pagar:%.2f ",a+b);
		
	
		
		sc.close();
	}

}
