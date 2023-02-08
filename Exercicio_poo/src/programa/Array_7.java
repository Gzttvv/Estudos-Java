 package programa;

import java.util.Scanner;

public class Array_7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		//Globais 
		double media = 0;
		double acc = 0;
		int verificador = 0;
		int quntPar =0;
		
		//recebe o tamanho do vetor e o cria
		System.out.println("Digite o tamanho do vetor");
		int tamanho_vetor = sc.nextInt();
		double[] vetor = new double[tamanho_vetor];
		
		// recebe os elementos do vetor
		for(int i=0; i < vetor.length;i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		// Indentifica os pares 
		for(int i=0; i < vetor.length;i++) {
			if (vetor[i]%2 == 0) {
				acc = acc + vetor[i];
				quntPar++;
			}
		}
		
		// verificar se todos são impares
		for(int i=0; i < vetor.length;i++) {
			if(vetor[i]%2 !=0 ) {
				verificador = 0; // impar
			}
			else verificador =1; //par
		}
		if (verificador == 0) {
			System.out.println("Nenhum numero par");
		}
		else media = acc / quntPar;
		System.out.println("Media dos pares: "+media);
	
		
		
		
		sc.close();
	}
}
