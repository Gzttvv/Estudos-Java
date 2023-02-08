package programa;

import java.util.Scanner;

public class Array_10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		
		// variaveis globais 
		double menor_alt,maior_alt,accM,accF,acc,mediaAlturaF;
		int qunt_pessoas,posMenor,posMaior;
		String sexos;
		
		
		// Quantidade de pessoas
		System.out.println("Digite a quantidade de pessoas: ");
		qunt_pessoas = sc.nextInt();
		
		// Cria os arrays
		String[] sexo = new String[qunt_pessoas];
		double[] altura = new double[qunt_pessoas];
		
		// Recebe os dados Sexo e altura
		for (int i=0; i< sexo.length; i++ ) {
			System.out.print("Digite a altura da "+(i+1)+" pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Digite o Sexo da "+(i+1)+" pessoa: ");
			sexo[i] = sc.next();
			System.out.println("===============================");
		}
		
		//Menor altura 
		menor_alt =0;
		posMenor = 0;
		
		for (int i=0; i < altura.length;i++) {
			if (menor_alt > altura[i]) {
				menor_alt = altura[i];
				posMenor = i;
			}
		}
		
		//Maior altura
		maior_alt = 0;
		posMaior = 0;
		for (int i=0; i < altura.length;i++) {
			if (maior_alt < altura[i]) {
				maior_alt = altura[i];
				posMaior = i;
			}
		}
		
		// MEDIA ALTURA MULHERES
		acc = 0;
		accF = 0;
		for (int i=0; i < sexo.length;i++) {
			sexos = "F";
			if (sexos == sexo[i]) {
				acc = acc + altura[i];
				accF++;
			}
		}
		mediaAlturaF = acc/accF;
		
		// Quantidade de Homens
		accM = 0;
		for (int i=0; i < sexo.length;i++) {
			sexos = "M";
			if (sexos == sexo[i]) {
				accM++;
			}
		}
		
		System.out.println("Menor Altura: "+altura[posMenor]);
		System.out.println("Maior Altura: "+altura[posMaior]);
		System.out.println("Media de altura mulheres : "+mediaAlturaF);
		System.out.println("Numero de Homens: "+accM);
	}
}
