package basicos;

import java.util.Scanner;

import entities.Media;

public class Beecrowd_1117 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in); 
		
		
		
		Media nota = new Media();
		
		System.out.println("Digite a primeira nota");
		nota.setN1(sc.nextInt());
		
		// validar a nota 1
		for ( int falso = nota.Validacao(); falso == 0;falso = nota.Validacao()) {
			System.out.println("Nota invalida");
			nota.setN1(sc.nextInt());
		}
		
		System.out.println("Digite a Segunda nota");
		nota.setN2(sc.nextInt());
		
		// validar a nota 2
		for ( int falso = nota.Validacao(); falso == 0;falso = nota.Validacao()) {
			System.out.println("Nota invalida");
			nota.setN2(sc.nextInt());
		}
		
		nota.media = (nota.getN1() + nota.getN2()) / 2;
		System.out.println("Media Final: "+nota.media);
		
		
			
		sc.close();

	}

}
