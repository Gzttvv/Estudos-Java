package basicos;

import java.util.Scanner;

import entities.Tabuada;

public class Bewcrowd_1078 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		int x = 1;
		
		for (int i = 0; i != x;) {
		
			Tabuada tab = new Tabuada ();
			System.out.println("Insira o numero que deseja ver a Tabuada: ");
			tab.n1 = sc.nextInt();
			tab.Tabu();
			System.out.println("");
			System.out.println("Deseja continuar?");
			System.out.println("");
			System.out.println( "Digite qualquer numero");
			System.out.println("");
			System.out.println("Ou digite 0 para encerrar");
			x = sc.nextInt();
		}
		
		System.out.println("===== FIM =====");
		
		
		
		
		
		
		
		sc.close();
		
	}

}
