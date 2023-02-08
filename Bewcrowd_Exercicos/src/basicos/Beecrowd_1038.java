package basicos;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double n1,n2,n3,n4,mediaP;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		
		mediaP = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
		
		System.out.printf("Media: %.1f%n",mediaP);
		
		if (mediaP >= 7 ) {
			System.out.println("Aluno aprovado.");
		}
		else if (mediaP < 5 ) {
			System.out.println("Aluno reprovado.");
		}
		else System.out.println("Aluno em exame.");
		
		sc.close();

	}

}
