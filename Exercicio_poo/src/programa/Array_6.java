package programa;

import java.util.Scanner;

public class Array_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Variaveis globais
		double media = 0;
		double acc = 0;
		
		//Recebe o tamanho do vetor
		System.out.println("Digite o tamanho do vetor");
		int tamanho_vetor = sc.nextInt();
		
		// Cria o vetor e recebe seus elementos
		System.out.println("Digite os valores do vetor:");
		double[] vetor = new double[tamanho_vetor];
		
		for(int i=0; i < vetor.length; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		//Faz a media aritmetica dos elementos do vetor
		for (int i=0; i < vetor.length;i++) {
			acc = acc+vetor[i];
		}
		media = acc/ tamanho_vetor;
		
		// Exibe a media aritmetica do vetor
		System.out.println("Media dos valores do vetor:"+ media);
		
		// Exibe os elementos do vetor que estão abaixo da media
		System.out.println("Elementos abaixo da media: ");
		for (int i =0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.println(+vetor[i]);
			} 
		}
		sc.close();
	}
}
