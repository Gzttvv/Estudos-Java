package programa;

import java.util.Scanner;
import entites.Retangulo;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a altura");
		retangulo.Height = sc.nextDouble();
		System.out.println("Digite a largura");
		retangulo.Width = sc.nextDouble();
		System.out.printf("Área do retangulo: %.2f",retangulo.area());
		System.out.println();
		System.out.printf("Perimetro do retangulo: %.2f",retangulo.perimetro());
		System.out.println();
		System.out.printf("Perimetro da diagonal: %.2f ",retangulo.diagonal());
		
		sc.close();

	}

}
