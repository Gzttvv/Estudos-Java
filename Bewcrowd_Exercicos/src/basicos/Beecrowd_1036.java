package basicos;

import java.util.Scanner;

import entities.Baskhara;

public class Beecrowd_1036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Baskhara equa1 = new Baskhara();
		
		System.out.println("Digite o valor de A");
		equa1.a = sc.nextDouble();
		System.out.println("Digite o valor de B");
		equa1.b = sc.nextDouble();
		System.out.println("Digite o valor de C");
		equa1.c = sc.nextDouble();
		System.out.println("Valor de Delta: "+equa1.delta());
		equa1.raizes();
		if (equa1.delta() < 0) {
			System.out.println("");
		}
		else System.out.printf("resultado R1: %5f e R2: %.5f ",equa1.r1,equa1.r2);
		
		
		sc.close();

	}

}
