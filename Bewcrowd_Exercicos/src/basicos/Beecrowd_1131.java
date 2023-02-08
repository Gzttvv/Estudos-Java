package basicos;

import java.util.Scanner;

import entities.Grenal;

public class Beecrowd_1131 {
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner (System.in);
		
		Grenal grenal = new Grenal();
		
		System.out.println("==== Inciar programa - digite 1 ====");
		int x = sc.nextInt();
		
		if (x == 1) {
			
			for (int i = 1 ; i == x;) {
				
				System.out.println("Digite os gols do Grenal");
				System.out.print("Gols do Inter: ");
				grenal.setGolInter(sc.nextInt());
				
				System.out.print("Gols do Gremio: ");
				grenal.setGolGremio(sc.nextInt());
				grenal.vit(grenal.getGolInter(), grenal.getGolGremio());
				grenal.res();
				
				System.out.println("Novo Grenal?");
				System.out.println("1 - Sim, 2 - Não");
		
				x = sc.nextInt();
				
			}
		}
		else System.out.println("==== FIM ====");
		
		
		grenal.maisVit();
		
		System.out.println("===== FIM =====");
//		System.out.println("Digite os gols do Grenal");
//		System.out.print("Gols do Inter: ");
//		grenal.setGolInter(sc.nextInt());
//		
//		System.out.print("Gols do Gremio: ");
//		grenal.setGolGremio(sc.nextInt());
//		grenal.vit(grenal.getGolInter(), grenal.getGolGremio());
//		grenal.res();
		sc.close();
		
	} 

}